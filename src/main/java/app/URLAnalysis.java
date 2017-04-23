package app;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class URLAnalysis {

    public static String getDomainName(String url) throws URISyntaxException {
        URI uri = new URI(url);
        String domain = uri.getHost();
        return domain.startsWith("www.") ? domain.substring(4) : domain;
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
}
