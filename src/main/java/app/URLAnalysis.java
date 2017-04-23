package app;

import java.io.IOException;
import java.net.*;

public class URLAnalysis {

    public static String getDomainName(String url) throws URISyntaxException {
        URI uri = new URI(url);

        String domain = uri.getHost();
        return domain.startsWith("www.") ? domain.substring(4) : domain;
    }

    public static String getProtocol(String url){
        URI uri = null;
        try {
            uri = new URI(url);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return uri.getScheme();
    }

    public static String getPath(String url) throws URISyntaxException {
        URI uri = new URI(url);
        return uri.getPath();
    }

    public static boolean isValidUrl(String inputUrl){
        try {
            URI url = new URI(inputUrl);
            url.toURL();
            return true;
        } catch (URISyntaxException e) {
            return false;
        }
        catch (MalformedURLException e) {
            return false;
        }
    }

    public static boolean isAvailable(String inputUrl){
        try {
            /*
            OptionA: slow performance
             */
            URL url = new URL(inputUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            if(connection.getResponseCode() == 200){
                return true;
            }
            else{
                return false;
            }
            /*
            OptionB: fast performance, but does not deal with redirection. Would be worthwhile to implement threading
             */
            //return InetAddress.getByName(inputUrl).isReachable(2000);

        } catch (IOException e) {
            return false;
        }
    }
}
