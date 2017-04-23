package resources;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class TestHtmlDocuments {

    public static Document commonHtmlDocument = Jsoup.parse(
            "<html lang=\"en\">\n" +
                    "<body class=\"body\"><form accept-charset=\"UTF-8\" action=\"/session\" method=\"post\">\n" +
                    "<div style=\"margin:0;padding:0;display:inline\">\n" +
                    "<input name=\"utf8\" value=\"✓\" type=\"hidden\">\n" +
                    "<input name=\"authenticity_token\" value=\"I4RVe0vidyMVUO7JBfCR0guh5WWENua1JEDGLkvOBDlh2nOLrGalk03WLgcMpgFgYzo7a5D+uD/3ZtFdpNofBw==\" type=\"hidden\">\n" +
                    "</div>\n" +
                    "<div class=\"auth-form-header p-0\"><h1>Sign in to GitHub</h1></div>\n" +
                    "<div id=\"js-flash-container\"></div>\n" +
                    "<div class=\"auth-form-body mt-3\">\n" +
                    "<label for=\"login_field\">Username or email address</label>\n" +
                    "<input autocapitalize=\"off\" autocorrect=\"off\" autofocus=\"autofocus\" class=\"form-control input-block\" id=\"login_field\" name=\"login\" tabindex=\"1\" type=\"text\">\n" +
                    "<label for=\"password\">Password <a href=\"/password_reset\" class=\"label-link\">Forgot password?</a></label>\n" +
                    "<input class=\"form-control form-control input-block\" id=\"password\" name=\"password\" tabindex=\"2\" type=\"password\">\n" +
                    "<input class=\"btn btn-primary btn-block\" data-disable-with=\"Signing in…\" name=\"commit\" tabindex=\"3\" value=\"Sign in\" type=\"submit\">\n" +
                    "</div>\n" +
                    "</form>\n" +
                    "</body></html>");

    public static Document germanHtmlDocument = Jsoup.parse(
            "<form class=\"ms-form\" method=\"post\" target=\"_top\" action=\"/meinspiegel/login.html\">\n" +
                    "<input name=\"backUrl\" value=\"\" type=\"hidden\">\n" +
                    "<div class=\"row\">\n" +
                    "<label for=\"f.loginName\">Benutzername oder E-Mail-Adresse</label>\n" +
                    "<input id=\"f.loginName\" name=\"f.loginName\" value=\"\" type=\"text\">\n" +
                    "</div>\n" +
                    "<div class=\"row\">\n" +
                    "<label for=\"f.password\">Passwort</label>\n" +
                    "<input id=\"f.password\" name=\"f.password\" value=\"\" type=\"password\">\n" +
                    "<span class=\"small-info right\"><a target=\"_top\" href=\"/meinspiegel/newpassword.html\">Sie haben Ihr Passwort vergessen?</a></span>\n" +
                    "</div>\n" +
                    "<div class=\"row autologin\">\n" +
                    "<input class=\"checkbox-fa\" id=\"f.returnAutologin\" name=\"f.returnAutologin\" type=\"checkbox\">\n" +
                    "<label for=\"f.returnAutologin\">Automatisches Login</label>\n" +
                    "<span class=\"small-info\"><a href=\"/meinspiegel/artikel/a-703605.html\" target=\"_blank\">Was macht diese Funktion?</a></span>\n" +
                    "</div>\n" +
                    "<div class=\"row\">\n" +
                    "<input class=\"form-button\" value=\"Anmelden\" type=\"submit\">\n" +
                    "</div>\n" +
                    "</form>");

    public static Document uncommonDocument = Jsoup.parse(
            "<form method=\"post\" action=\"https://www.reddit.com/post/login\" id=\"login_login-main\" class=\"login-form login-form-side\">\n" +
                    "<input name=\"op\" value=\"login-main\" type=\"hidden\"><input name=\"user\" placeholder=\"username\" maxlength=\"20\" tabindex=\"1\" type=\"text\"><input name=\"passwd\" placeholder=\"password\" tabindex=\"1\" type=\"password\">\n" +
                    "<div class=\"g-recaptcha\" data-sitekey=\"6LeTnxkTAAAAAN9QEuDZRpn90WwKk_R1TRW_g-JC\"></div>\n" +
                    "<div class=\"status\"></div>\n" +
                    "<div id=\"remember-me\"><input name=\"rem\" id=\"rem-login-main\" tabindex=\"1\" type=\"checkbox\"><label for=\"rem-login-main\">remember me</label><a class=\"recover-password\" href=\"/password\">reset password</a></div>\n" +
                    "<div class=\"submit\"><span class=\"throbber\"></span><button class=\"btn\" type=\"submit\" tabindex=\"1\">login</button></div>\n" +
                    "<div class=\"clear\"></div>\n" +
                    "</form>");

    public static Document noLoginFormDocument = Jsoup.parse(
            " <form action=\"/action_page.php\">\n" +
                    "  First name:<br>\n" +
                    "  <input type=\"text\" name=\"firstname\" value=\"Mickey\"><br>\n" +
                    "  Last name:<br>\n" +
                    "  <input type=\"text\" name=\"lastname\" value=\"Mouse\"><br><br>\n" +
                    "  <input type=\"submit\" value=\"Submit\">\n" +
                    "</form> ");

    public static Document fullHTMLDocumentNoLogin = Jsoup.parse(
            "\n" +
                    "\n" +
                    "<html lang=\"en\">\n" +
                    "   <head>\n" +
                    "      <meta content=\"text/html; charset=utf-8\" http-equiv=\"Content-Type\">\n" +
                    "      <meta name=\"Googlebot-News\" content=\"noindex\">\n" +
                    "      <title>The Register: Sci/Tech News for the World    </title>\n" +
                    "      <noscript>\n" +
                    "         <style type=\"text/css\">#index_page .headline_row.hidden {display: block} </style>\n" +
                    "      </noscript>\n" +
                    "      <link rel=\"canonical\" href=\"https://www.theregister.co.uk/\">\n" +
                    "      <link rel=\"alternate\" media=\"only screen and (max-width: 640px)\" href=\"https://m.theregister.co.uk/\">\n" +
                    "      <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Arimo:400%7CArimo:700\">\n" +
                    "      <link rel=\"stylesheet\" type=\"text/css\" href=\"/css_picker/moz/29c1a14f839a9470a65f42c4c29206746d5ee270/design.css\">\n" +
                    "      <style>\n" +
                    "         #sec-none a,\n" +
                    "         #sub-sec-none a {\n" +
                    "         font-weight: bold;\n" +
                    "         }\n" +
                    "      </style>\n" +
                    "      <link rel=\"alternate\" type=\"application/atom+xml\" href=\"/headlines.atom\" title=\"The Register: whole site\">\n" +
                    "      <script src=\"//www.google-analytics.com/analytics.js\" async=\"\"></script><script src=\"/design_picker/3581f2634b3f3482aae2b22e0b5e1cb5f122ddcd/javascript/_.js\"></script>\n" +
                    "      <script>\n" +
                    "         if (Math.floor(Math.random()*100)<90) var Reg__adct = 's-sync';\n" +
                    "         else var Reg__adct = 's-async'; \n" +
                    "         if ($.cookie('test_ct') == 's-sync') var Reg__adct = 's-sync';\n" +
                    "         if ($.cookie('test_ct') == 's-async') var Reg__adct = 's-async'; \n" +
                    "         if (window.Reg__adct == 's-async') {\n" +
                    "           var googletag = googletag || {};\n" +
                    "           googletag.cmd = googletag.cmd || [];\n" +
                    "           (function() {\n" +
                    "             var gads = document.createElement(\"script\");\n" +
                    "             gads.async = true;\n" +
                    "             gads.type = \"text/javascript\";\n" +
                    "             gads.src = \"//www.googletagservices.com/tag/js/gpt.js\";\n" +
                    "             var node = document.getElementsByTagName(\"script\")[0];\n" +
                    "             node.parentNode.insertBefore(gads, node);\n" +
                    "           })();\n" +
                    "         } else {\n" +
                    "           document.write('<scr' + 'ipt src=\"//www.googletagservices.com/tag/js/gpt.js\"></scr' + 'ipt>');\n" +
                    "         }\n" +
                    "      </script><script src=\"//www.googletagservices.com/tag/js/gpt.js\"></script>\n" +
                    "      <script src=\"https://nir.regmedia.co.uk/?g=c&amp;g=sa&amp;s=c/front.front\"></script>\n" +
                    "      <script>\n" +
                    "         if (window.Reg__adct == 's-async') {\n" +
                    "           googletag.cmd.push(function() {\n" +
                    "             init_gpt('reg_homepage/front');\n" +
                    "           });\n" +
                    "         } else {\n" +
                    "           init_gpt('reg_homepage/front');\n" +
                    "         }\n" +
                    "      </script>\n" +
                    "      <link rel=\"SHORTCUT ICON\" type=\"image/x-icon\" href=\"/favicon.ico\">\n" +
                    "      <link rel=\"search\" href=\"https://search.theregister.co.uk/\">\n" +
                    "      <link rel=\"search\" type=\"application/opensearchdescription+xml\" title=\"El Reg Search\" href=\"/Design/page/search.osd\">\n" +
                    "      <link rel=\"apple-touch-icon\" href=\"/Design/graphics/icons/vulture_black_60_trans.png\">\n" +
                    "      <script src=\"https://s.dpmsrv.com/dpm_812ed4562d3211363a7b813aa9cd2cf042b63bb2.min.js\" async=\"\" type=\"text/javascript\"></script>\n" +
                    "   </head>\n" +
                    "   <body data-pagetype=\"Index\">\n" +
                    "      <div id=\"RegCCO\">\n" +
                    "         The Register uses cookies. <a href=\"/Profile/cookies/\" target=\"_blank\">Find out more</a>. \n" +
                    "         <form action=\"/EUCookieMonster/nom\" method=\"POST\"><input value=\"Close\" name=\"eucookie\" id=\"eucookiedismiss\" type=\"submit\"></form>\n" +
                    "      </div>\n" +
                    "      <div id=\"page\">\n" +
                    "         <div style=\"z-index: 999999; margin-bottom: 15px;\" id=\"topbar\" class=\"alt_colour dcl\">\n" +
                    "            <div class=\"login\"><a href=\"https://account.theregister.co.uk/login/?&amp;r=http%3A//www.theregister.co.uk/\">Log in</a> <a href=\"https://account.theregister.co.uk/register/?product=theregister_newsletter&amp;r=http%3A//www.theregister.co.uk/\" class=\"more\">Sign up</a> <a href=\"https://forums.theregister.co.uk/\" class=\"more\">Forums</a></div>\n" +
                    "            <ul>\n" +
                    "               <li><a href=\"http://www.mcubed.london/\" target=\"_blank\" title=\"Minds Mastering Machines - The ML and AI Conference\">M³</a></li>\n" +
                    "               <li><a href=\"http://www.continuouslifecycle.london\" target=\"_blank\" title=\"Continuous Lifecycle London 2017\">CLL</a></li>\n" +
                    "               <li><a href=\"https://whitepapers.theregister.co.uk/events/list\" title=\"Webcasts and Events from The Register\">Events</a></li>\n" +
                    "               <li><a href=\"https://whitepapers.theregister.co.uk/\" title=\"Whitepapers and tech resources from The Register\">Whitepapers</a></li>\n" +
                    "               <li><a href=\"http://www.nextplatform.com/\" title=\"High-end computing in-depth\">The Next Platform</a></li>\n" +
                    "            </ul>\n" +
                    "         </div>\n" +
                    "         <div style=\"position: absolute; top: 36.5667px; display: none;\" id=\"ad-oop-spot\" class=\"adu\">\n" +
                    "            <script>\n" +
                    "               show_gpt('ad-oop-spot');\n" +
                    "            </script>\n" +
                    "         </div>\n" +
                    "         <div zq3ryvs=\"\" style=\"padding: 0px 15px 1em; background-color: transparent; position: static; top: auto; width: 0px; z-index: auto; display: none;\" id=\"ad-ldr-spot\" class=\"adu\" hidden=\"\">\n" +
                    "            <script>\n" +
                    "               show_gpt('ad-ldr-spot');\n" +
                    "            </script>\n" +
                    "            <noscript>\n" +
                    "               <a href=\"https://pubads.g.doubleclick.net/gampad/jump?iu=/6978/reg_homepage/front&amp;sz=728x90%7C970x90%7C970x250&amp;tile=2&amp;c=22WPyIQ8CoyKcAAIZTz0YAAAAp&amp;t=ct%3Dns%26unitnum%3D2%26unitname%3Dwww_top_leader%26pos%3Dtop%26test%3D0\" target=\"_blank\">\n" +
                    "               <img src=\"https://pubads.g.doubleclick.net/gampad/ad?iu=/6978/reg_homepage/front&amp;sz=728x90%7C970x90%7C970x250&amp;tile=2&amp;c=22WPyIQ8CoyKcAAIZTz0YAAAAp&amp;t=ct%3Dns%26unitnum%3D2%26unitname%3Dwww_top_leader%26pos%3Dtop%26test%3D0\" alt=\"\">\n" +
                    "               </a>\n" +
                    "            </noscript>\n" +
                    "         </div>\n" +
                    "         <div class=\"\" style=\"margin-top: 0px;\" id=\"masthead\">\n" +
                    "            <a href=\"https://www.theregister.co.uk/\" id=\"logo\">\n" +
                    "            <img src=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icons/reg_logo.svg\" alt=\"The Register® — Biting the hand that feeds IT\" height=\"63\" width=\"330\">\n" +
                    "            </a>\n" +
                    "            <div id=\"follow_btns_top\">\n" +
                    "               <a class=\"tweet_link\" href=\"https://twitter.com/intent/user?screen_name=theregister\" title=\"Follow us on twitter\" target=\"_blank\">\n" +
                    "               <img alt=\"Twitter\" src=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icon/twitter.png\" srcset=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icon/twitter.svg\" height=\"18\" width=\"18\">\n" +
                    "               </a>\n" +
                    "               <a href=\"https://www.facebook.com/VultureCentral\" title=\"Like us on Facebook\" target=\"_blank\" class=\"fbook\">\n" +
                    "               <img alt=\"Facebook\" src=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icon/facebook.png\" srcset=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icon/facebook.svg\" height=\"18\" width=\"18\">\n" +
                    "               </a>\n" +
                    "               <a href=\"https://google.com/+theregister\" title=\"Follow us on Google+\" target=\"_blank\" class=\"gplus\">\n" +
                    "               <img alt=\"G+\" src=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icon/google_plus.png\" srcset=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icon/google_plus.svg\" height=\"18\" width=\"18\">\n" +
                    "               </a>\n" +
                    "               <a href=\"https://www.linkedin.com/company/the-register\" title=\"Follow us on LinkedIn\" target=\"_blank\" class=\"linkin\">\n" +
                    "               <img alt=\"LinkedIn\" src=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icon/linkedin.png\" srcset=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icon/linkedin.svg\" height=\"18\" width=\"18\">\n" +
                    "               </a>\n" +
                    "            </div>\n" +
                    "         </div>\n" +
                    "         <div id=\"site_nav\" class=\"static\">\n" +
                    "            <nav id=\"top_nav\" class=\"dcl\">\n" +
                    "               <a href=\"https://www.theregister.co.uk/\" class=\"nav_vulture\" data-name=\"Home\">\n" +
                    "               <img alt=\"Home\" src=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icon/vulture.png\" srcset=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icon/vulture.svg\" class=\"black_vulture\" height=\"17\" width=\"21\">\n" +
                    "               <img alt=\"Home\" src=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icon/vulture_white.png\" srcset=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icon/vulture_white.svg\" class=\"white_vulture\" height=\"17\" width=\"21\">\n" +
                    "               </a>\n" +
                    "               <a href=\"/data_centre/\" id=\"sec-data-centre\" data-nav=\".data_cent_nav\" data-name=\"Data_centre\">\n" +
                    "               Data Centre\n" +
                    "               </a>\n" +
                    "               <a href=\"/software/\" id=\"sec-software\" data-nav=\".software_nav\" data-name=\"Software\">\n" +
                    "               Software\n" +
                    "               </a>\n" +
                    "               <a href=\"/security/\" id=\"sec-security\" data-nav=\".sec_nav\" data-name=\"Security\">\n" +
                    "               Security\n" +
                    "               </a>\n" +
                    "               <a href=\"/transformation/\" id=\"sec-transformation\" data-nav=\".trans_nav\" data-name=\"Transformation\">\n" +
                    "               Transformation\n" +
                    "               </a>\n" +
                    "               <a href=\"/devops/\" id=\"sec-devops\" data-nav=\".devops_nav\" data-name=\"DevOps\">\n" +
                    "               DevOps\n" +
                    "               </a>\n" +
                    "               <a href=\"/business/\" id=\"sec-business\" data-nav=\".bus_nav\" data-name=\"Business\">\n" +
                    "               Business\n" +
                    "               </a>\n" +
                    "               <a href=\"/personal_tech/\" id=\"sec-personal_tech\" data-nav=\".pers_nav\" data-name=\"Personal Tech\">\n" +
                    "               Personal Tech\n" +
                    "               </a>\n" +
                    "               <a href=\"/science/\" id=\"sec-science\" data-nav=\".sci_nav\" data-name=\"Science\">\n" +
                    "               Science\n" +
                    "               </a>\n" +
                    "               <a href=\"/emergent_tech/\" id=\"sec-emergent-tech\" data-nav=\".emer_nav\" data-name=\"Emergent Tech\">\n" +
                    "               Emergent Tech\n" +
                    "               </a>\n" +
                    "               <a href=\"/bootnotes/\" id=\"sec-bootnotes\" data-nav=\".bootnotes_nav\" data-name=\"Bootnotes\">\n" +
                    "               Bootnotes\n" +
                    "               </a>\n" +
                    "               <a href=\"https://search.theregister.co.uk/\" class=\"nav_search\" data-name=\"Search\">\n" +
                    "               <img class=\"black_search_icon\" alt=\"search\" src=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icons/search.png\" srcset=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icons/search.svg\" height=\"18\" width=\"18\">\n" +
                    "               </a>\n" +
                    "            </nav>\n" +
                    "            <form id=\"search_form\" action=\"https://search.theregister.co.uk/\" method=\"GET\">\n" +
                    "               <input name=\"q\" id=\"q\" placeholder=\"Search site\" type=\"text\">\n" +
                    "               <img class=\"white_search_icon\" alt=\"search\" src=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icons/search_white.png\" srcset=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icons/search_white.svg\" height=\"18\" width=\"18\">\n" +
                    "            </form>\n" +
                    "            <div id=\"nav_pop\">\n" +
                    "               <div class=\"data_cent_nav\">\n" +
                    "                  <ul class=\"sub_nav alt_colour dcl\">\n" +
                    "                     <li id=\"sub-sec-servers\" data-name=\"Servers\">\n" +
                    "                        <a href=\"/data_centre/servers/\" title=\"Enterprise server news, analysis and opinion\">\n" +
                    "                        Servers\n" +
                    "                        </a>\n" +
                    "                     </li>\n" +
                    "                     <li id=\"sub-sec-hpc\" data-name=\"HPC\">\n" +
                    "                        <a href=\"/data_centre/hpc/\" title=\"High Performance Computing news, analysis and opinion\">\n" +
                    "                        HPC\n" +
                    "                        </a>\n" +
                    "                     </li>\n" +
                    "                     <li id=\"sub-sec-cloud\" data-name=\"Cloud\">\n" +
                    "                        <a href=\"/data_centre/cloud/\" title=\"Cloud news, analysis and opinion\">\n" +
                    "                        Cloud\n" +
                    "                        </a>\n" +
                    "                     </li>\n" +
                    "                     <li id=\"sub-sec-storage\" data-name=\"Storage\">\n" +
                    "                        <a href=\"/data_centre/storage/\" title=\"Enterprise Storage news, analysis and opinion\">\n" +
                    "                        Storage\n" +
                    "                        </a>\n" +
                    "                     </li>\n" +
                    "                     <li id=\"sub-sec-networks\" data-name=\"Networks\">\n" +
                    "                        <a href=\"/data_centre/networks/\" title=\"Networks news, analysis and opinion\">\n" +
                    "                        Networks\n" +
                    "                        </a>\n" +
                    "                     </li>\n" +
                    "                     <li id=\"sub-sec-virtualization\" data-name=\"Virtualisation\">\n" +
                    "                        <a href=\"/data_centre/virtualization/\" title=\"Virtualization news, analysis and opinion\">\n" +
                    "                        Virtualization\n" +
                    "                        </a>\n" +
                    "                     </li>\n" +
                    "                     <li id=\"sub-sec-bofh\" data-name=\"Bofh\">\n" +
                    "                        <a href=\"/data_centre/bofh/\" title=\"BOFH\">\n" +
                    "                        BOFH\n" +
                    "                        </a>\n" +
                    "                     </li>\n" +
                    "                  </ul>\n" +
                    "                  <div class=\"story_row\">\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/21/ibm_softlayer_object_storage_price_cuts/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2016/10/26/shutterstock_bowler_cricket.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>IBM SoftLayer plays hardball in object storage price cuts</h5>\n" +
                    "                     </a>\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/21/dell_sells_spanning/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2017/04/21/getting_out_of_the_cloud.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>Dell backs out of in-cloud backup business by selling Spanning</h5>\n" +
                    "                     </a>\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/21/vodafone_femtocell_brownouts/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2015/06/15/sparks_image_via_shutterstock.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>Exploding femtocells: No need for a full recall, says Vodafone</h5>\n" +
                    "                     </a>\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/21/mad_native_cloud_skill/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2017/04/21/exam_photo_via_shutterstock.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>Cloud students, pay attention! Exam plans promise fresh skills</h5>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"software_nav\">\n" +
                    "                  <div class=\"sub_nav\"></div>\n" +
                    "                  <div class=\"story_row\">\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/22/devuan_1_0_0_released/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2017/04/21/devuan_linux_logo.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5><code>systemd</code>-free Devuan Linux hits version 1.0.0</h5>\n" +
                    "                     </a>\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/21/ubuntu_17_04_gnome_not_unity/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2017/04/20/sad_penguin_photo_via_shutterstock.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>Farewell Unity, you challenged desktop Linux. Oh well, here's Ubuntu 17.04</h5>\n" +
                    "                     </a>\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/21/windows_10_update_schedule/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2017/04/21/windows_10_logo.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>Microsoft promises twice-yearly Windows 10, O365 updates – with just 18 months' support</h5>\n" +
                    "                     </a>\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/20/microsoft_to_do/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2017/04/20/my_microsoft_day_to_do_list_teaser.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>What a To-Do! Microsoft snuffs out Wunderlist</h5>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"sec_nav\">\n" +
                    "                  <div class=\"sub_nav\"></div>\n" +
                    "                  <div class=\"story_row\">\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/21/china_accused_south_korea_hack/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2017/04/21/china_hacking_shutterstock.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>China 'hacked' South Korea to wreck Star Wars missile shield</h5>\n" +
                    "                     </a>\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/21/doctor_whoinspired_proxy_software_plays_nice_to_fool_censors/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2015/10/17/doctor-who-girl-who-died-2.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>Doctor Who-inspired proxy transmogrifies politically sensitive web to avoid gov censorship</h5>\n" +
                    "                     </a>\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/21/linkedin_bluetooth_feature_privacy_concerns/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2016/01/13/shutterstock_who_is_watching.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>LinkedIn U-turns on Bluetooth-enabled 'Tinder for marketers'</h5>\n" +
                    "                     </a>\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/21/cybercrime_pathways/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2016/12/09/hacker_on_laptop.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>Peer pressure, not money, lures youngsters into cybercrime – report</h5>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"trans_nav\">\n" +
                    "                  <div class=\"sub_nav\"></div>\n" +
                    "                  <div class=\"story_row\">\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/20/the_user_as_part_of_the_dev_process/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2016/09/09/broken_cables_photo_via_shutterstock.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>Have we got a new, hip compound IT phrase for you! Enter... UserDev</h5>\n" +
                    "                     </a>\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/20/using_excess_data_centre_capacity/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2015/06/10/servers_and_grass.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>You just sent an on-prem app to the cloud and your data centre has empty racks. What now?</h5>\n" +
                    "                     </a>\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/19/hybrid_infrastructure_reuse_legacy_hardware/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2015/10/27/shutterstock_office_skip.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>How to breathe new life into your legacy kit now you've gone hybrid</h5>\n" +
                    "                     </a>\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/18/protect_your_digital_enterprise_iso_27001_explainer/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2017/02/06/security.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>So, you're 'ISO 27001 accredited', huh? Just saying so doesn't cut it</h5>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"devops_nav\">\n" +
                    "                  <div class=\"sub_nav\"></div>\n" +
                    "                  <div class=\"story_row\">\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/21/docker_renames_open_source_code_moby/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2017/04/21/shutterstock_whale.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>Wait – we can explain, says Moby, er, Docker amid rebrand meltdown</h5>\n" +
                    "                     </a>\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/20/countdown_to_continuous_lifecycle/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2017/01/24/view_qe_ii.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>Less than four weeks till DevOps' finest assemble in London</h5>\n" +
                    "                     </a>\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/18/docker_linuxkit_moby/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2017/04/18/shutterstock_linux_tux.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>Docker emits LinuxKit: You can probably guess what it does</h5>\n" +
                    "                     </a>\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/17/oracle_wercker/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2017/04/17/containerhouses.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>Oracle gets to Wercker, dines on container biz</h5>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"bus_nav\">\n" +
                    "                  <ul class=\"sub_nav alt_colour dcl\">\n" +
                    "                     <li id=\"sub-sec-policy\" data-name=\"Policy\">\n" +
                    "                        <a href=\"/business/policy/\" title=\"Policy News, analysis and opinion\">\n" +
                    "                        Policy\n" +
                    "                        </a>\n" +
                    "                     </li>\n" +
                    "                     <li id=\"sub-sec-channel\" data-name=\"The Channel\">\n" +
                    "                        <a href=\"/business/channel/\" title=\"The Channel news, analysis and opinion\">\n" +
                    "                        The Channel\n" +
                    "                        </a>\n" +
                    "                     </li>\n" +
                    "                  </ul>\n" +
                    "                  <div class=\"story_row\">\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/21/canada_net_neutrality/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2015/07/22/bob_and_doug_mckenzie.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>Canada says yes to net neutrality – and no to Trump advisor, eh?</h5>\n" +
                    "                     </a>\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/21/met_police_gun_owner_data_breach_questions/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2017/04/21/stashedgun.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>Shooting org demands answers from Met Police over gun owner blab</h5>\n" +
                    "                     </a>\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/21/us_surveillance_court_declined_less_than_2_per_cent_of_applications/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2017/02/09/shutterstock_cctv_privacy.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>US surveillance court declined less than 2 per cent of applications</h5>\n" +
                    "                     </a>\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/21/oracle_to_pay_850m_for_moat/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2017/01/27/oracle_airplane_shutterstock_editorial_use_only.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>A quiet market? Nah, Oracle's to pay $850m for ad-tracking Moat</h5>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"pers_nav\">\n" +
                    "                  <div class=\"sub_nav\"></div>\n" +
                    "                  <div class=\"story_row\">\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/22/museum_of_failure_includes_tech/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2015/12/01/fail_87346456756.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>Would you believe it? The Museum of Failure contains quite a few pieces of technology</h5>\n" +
                    "                     </a>\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/21/fcc_greenlights_small_cells/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2015/09/23/radio_signal.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>FCC greenlights small cell free-for-all in the US</h5>\n" +
                    "                     </a>\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/21/windows_10_cloud_specs/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2017/04/21/schoolkids_shutterstock.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>Base specs leak for Windows 10 Cloud – Microsoft's wannabe ChromeOS assassin</h5>\n" +
                    "                     </a>\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/21/reselling_your_mobe/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2017/03/07/obi_wan_droids.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>Not the droids you're looking for – worst handsets to resell</h5>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"sci_nav\">\n" +
                    "                  <ul class=\"sub_nav alt_colour dcl\">\n" +
                    "                     <li id=\"sub-sec-spb\" data-name=\"SPB\">\n" +
                    "                        <a href=\"/science/special_projects_bureau/\">\n" +
                    "                        SPB\n" +
                    "                        </a>\n" +
                    "                     </li>\n" +
                    "                     <li id=\"sub-sec-geek\" data-name=\"Geeks_guide\">\n" +
                    "                        <a href=\"/science/geeks_guide/\">\n" +
                    "                        Geek's Guide\n" +
                    "                        </a>\n" +
                    "                     </li>\n" +
                    "                  </ul>\n" +
                    "                  <div class=\"story_row\">\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/21/new_mh370_analysis_used_actual_777_parts_again_finds_search_was_in_wrong_place/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2017/04/21/mh_370_flaperon_drift_modelling.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>New MH370 analysis <i>again</i> says we looked in the wrong places</h5>\n" +
                    "                     </a>\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/21/china_successfully_launches_its_first_robot_space_truck/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2017/04/21/tianzhou_1_liftoff.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>China successfully launches its first robot space truck</h5>\n" +
                    "                     </a>\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/20/opportunity_rover_moves_to_perseverance_valley/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2016/11/23/shutterstock_mars.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>Opportunity rover gets bored of spot it's explored since 2014</h5>\n" +
                    "                     </a>\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/19/exoplanet_life/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2017/04/19/shutterstock_alien_world.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>PACK YOUR BAGS! Boffins spot Earth-size planet most likeliest yet to harbor alien life</h5>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"emer_nav\">\n" +
                    "                  <ul class=\"sub_nav alt_colour dcl\">\n" +
                    "                     <li id=\"sub-sec-artificial-intelligence\" data-name=\"Artificial Intelligence\">\n" +
                    "                        <a href=\"/emergent_tech/artificial_intelligence/\" title=\"Artificial Intelligence\">\n" +
                    "                        Artificial Intelligence\n" +
                    "                        </a>\n" +
                    "                     </li>\n" +
                    "                     <li id=\"sub-sec-internet-of-things\" data-name=\"Internet of Things\">\n" +
                    "                        <a href=\"/emergent_tech/internet_of_things/\" title=\"Internet of Things\">\n" +
                    "                        Internet of Things\n" +
                    "                        </a>\n" +
                    "                     </li>\n" +
                    "                  </ul>\n" +
                    "                  <div class=\"story_row\">\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/21/microsoft_offers_preview_to_eye_ai_iot_analytics_for_edgelords_of_new_net/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2016/02/01/toothbrush-surveillance.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>Microsoft offers preview to eye AI IoT analytics for edgelords of new net</h5>\n" +
                    "                     </a>\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/21/jamie_bartlett_talks_radicals/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2015/06/05/jamie_bartlett_reg_lecture.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>Think politics is tumultuous now? Wait till the transhumanists join in...</h5>\n" +
                    "                     </a>\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/21/baidu_driverless_car_software/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2017/04/20/baidu_self_driving_car.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>Q. Why is Baidu sharing its secret self-driving sauce? A. To help China corner the market</h5>\n" +
                    "                     </a>\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/21/tesla_settles_aurora/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2017/04/20/elon_musk.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>Tesla's latest car crash: Its 'meritless' lawsuit against ex-Autopilot bod</h5>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"bootnotes_nav\">\n" +
                    "                  <ul class=\"sub_nav alt_colour dcl\">\n" +
                    "                     <li id=\"sub-sec-stob\" data-name=\"Verity_stob\">\n" +
                    "                        <a href=\"/bootnotes/stob/\" title=\"Verity Stob\">\n" +
                    "                        Verity Stob\n" +
                    "                        </a>\n" +
                    "                     </li>\n" +
                    "                  </ul>\n" +
                    "                  <div class=\"story_row\">\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/21/alaska_dentist_hoverboard_tooth_pull/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2017/04/21/morty_mcfly.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>Alaska dentist 'pulled out patient's tooth while riding a hoverboard'</h5>\n" +
                    "                     </a>\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/21/you_cant_buy_one_now_the_flying_car_makes_its_perennial_return/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2015/03/06/jetsons_food_machine.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>(You can't) buy one now! The flying car makes its perennial return</h5>\n" +
                    "                     </a>\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/21/juicero_boss_defends_juice_startup/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2017/04/20/simpsonsjuice.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>Hard-pressed Juicero boss defends $400 IoT juicer after squeezing $120m from investors</h5>\n" +
                    "                     </a>\n" +
                    "                     <a class=\"story_link\" href=\"https://www.theregister.co.uk/2017/04/20/computer_games_to_become_medal_sport_at_asian_games/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2015/02/18/weightlifters.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        <h5>Computer games to become medal sport at Asian Games</h5>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "            </div>\n" +
                    "         </div>\n" +
                    "         <div id=\"top_tease\">\n" +
                    "            <div class=\"story_list\">\n" +
                    "               <h3>Top stories</h3>\n" +
                    "               <a href=\"/2017/04/21/windows_10_update_schedule/\" class=\"story\">\n" +
                    "                  <h3>Microsoft promises twice-yearly Windows 10, O365 updates – with just 18 months' support</h3>\n" +
                    "                  <div class=\"standfirst\">\n" +
                    "                     <span class=\"trailer\">Updated</span>Sysadmin holidays cancelled in March and September, starting in 2020\n" +
                    "                  </div>\n" +
                    "               </a>\n" +
                    "               <a href=\"/2017/04/21/ubuntu_17_04_gnome_not_unity/\" class=\"story\">\n" +
                    "                  <h3>Farewell Unity, you challenged desktop Linux. Oh well, here's Ubuntu 17.04</h3>\n" +
                    "                  <div class=\"standfirst\">\n" +
                    "                     <span class=\"trailer\">Review</span>GNOME all the way, baby\n" +
                    "                  </div>\n" +
                    "               </a>\n" +
                    "               <a href=\"/2017/04/21/windows_hacked_nsa_shadow_brokers/\" class=\"story\">\n" +
                    "                  <h3>Script kiddies pwn 1000s of Windows boxes using leaked NSA hack tools</h3>\n" +
                    "                  <div class=\"standfirst\">\n" +
                    "                     Vulnerable unpatched systems expose exploitable SMB networking to world+dog\n" +
                    "                  </div>\n" +
                    "               </a>\n" +
                    "            </div>\n" +
                    "            <a href=\"/2017/04/21/met_police_gun_owner_data_breach_questions/\" class=\"large_story dcl\">\n" +
                    "               <h1 title=\"What data did marketing agency subcontractor have access to?\">\n" +
                    "                  Shooting org demands answers from Met Police over gun owner blab\n" +
                    "               </h1>\n" +
                    "               <img src=\"https://regmedia.co.uk/2017/04/21/stashedgun.jpg?x=648&amp;y=429&amp;crop=1\" alt=\"\" height=\"429\" width=\"648\">\n" +
                    "            </a>\n" +
                    "         </div>\n" +
                    "         <div id=\"main-col\">\n" +
                    "            <div id=\"index_page\" class=\"headlines\">\n" +
                    "               <div class=\"headline_row\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/personal_tech/\">Personal Tech</a>\n" +
                    "                     <a href=\"/2017/04/22/museum_of_failure_includes_tech/\" class=\"story_link\">\n" +
                    "                        <h4>Would you believe it? The Museum of Failure contains quite a few pieces of technology</h4>\n" +
                    "                        <div class=\"standfirst\">Time to look back on those halcyon days of bad ideas, mindlessly hyped</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">103 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"22 Apr 07:17\" data-epoch=\"1492845425\">1 day</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/software/\">Software</a>\n" +
                    "                     <a href=\"/2017/04/22/devuan_1_0_0_released/\" class=\"story_link\">\n" +
                    "                        <h4><code>systemd</code>-free Devuan Linux hits version 1.0.0</h4>\n" +
                    "                        <div class=\"standfirst\">Unix greybeards issue release candidate and proclaim init freedom</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">117 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"22 Apr 00:52\" data-epoch=\"1492822357\">1 day</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/security/\">Security</a>\n" +
                    "                     <a href=\"/2017/04/21/china_accused_south_korea_hack/\" class=\"story_link\">\n" +
                    "                        <h4>China 'hacked' South Korea to wreck Star Wars missile shield</h4>\n" +
                    "                        <div class=\"standfirst\">FireEye fingers Middle Kingdom infiltration teams</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">23 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 22:31\" data-epoch=\"1492813869\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/personal_tech/\">Personal Tech</a>\n" +
                    "                     <a href=\"/2017/04/21/fcc_greenlights_small_cells/\" class=\"story_link\">\n" +
                    "                        <h4>FCC greenlights small cell free-for-all in the US</h4>\n" +
                    "                        <div class=\"standfirst\">New rules wil lower requirements to build wireless cells</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">12 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 21:57\" data-epoch=\"1492811825\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/bootnotes/\">Bootnotes</a>\n" +
                    "                     <a href=\"/2017/04/21/alaska_dentist_hoverboard_tooth_pull/\" class=\"story_link\">\n" +
                    "                        <h4>Alaska dentist 'pulled out patient's tooth while riding a hoverboard'</h4>\n" +
                    "                        <div class=\"standfirst\">When this thing gets up to 88 miles per hour, you're going to see some serious sh*t</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">24 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 21:25\" data-epoch=\"1492809921\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/security/\">Security</a>\n" +
                    "                     <a href=\"/2017/04/21/doctor_whoinspired_proxy_software_plays_nice_to_fool_censors/\" class=\"story_link\">\n" +
                    "                        <h4>Doctor Who-inspired proxy transmogrifies politically sensitive web to avoid gov censorship</h4>\n" +
                    "                        <div class=\"standfirst\">Slitheen tool smuggles browsers into cyber-Tardis</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">12 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 20:38\" data-epoch=\"1492807083\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"dont_miss_row\">\n" +
                    "                  <div class=\"dont_miss dcl\">\n" +
                    "                     <h2>\n" +
                    "                        <a href=\"/2017/04/21/juicero_boss_defends_juice_startup/\" class=\"story_link\">\n" +
                    "                        <span class=\"trailer\">Don't miss</span>\n" +
                    "                        Hard-pressed Juicero boss defends $400 IoT juicer after squeezing $120m from investors\n" +
                    "                        </a>\n" +
                    "                     </h2>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/devops/\">DevOps</a>\n" +
                    "                     <a href=\"/2017/04/20/countdown_to_continuous_lifecycle/\" class=\"story_link\">\n" +
                    "                        <h4>Less than four weeks till DevOps' finest assemble in London</h4>\n" +
                    "                        <div class=\"standfirst\">        <span class=\"trailer\">Events</span>Vote with your feet and join us in Westminster</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 11:36\" data-epoch=\"1492688170\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/personal_tech/\">Personal Tech</a>\n" +
                    "                     <a href=\"/2017/04/21/windows_10_cloud_specs/\" class=\"story_link\">\n" +
                    "                        <h4>Base specs leak for Windows 10 Cloud – Microsoft's wannabe ChromeOS assassin</h4>\n" +
                    "                        <div class=\"standfirst\">And ahead of mystery launch event in May</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">48 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 19:55\" data-epoch=\"1492804528\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/business/policy/\">Policy</a>\n" +
                    "                     <a href=\"/2017/04/21/canada_net_neutrality/\" class=\"story_link\">\n" +
                    "                        <h4>Canada says yes to net neutrality – and no to Trump advisor, eh?</h4>\n" +
                    "                        <div class=\"standfirst\">Important legal ruling divides North America</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">10 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 18:48\" data-epoch=\"1492800503\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/data_centre/cloud/\">Cloud</a>\n" +
                    "                     <a href=\"/2017/04/21/ibm_softlayer_object_storage_price_cuts/\" class=\"story_link\">\n" +
                    "                        <h4>IBM SoftLayer plays hardball in object storage price cuts</h4>\n" +
                    "                        <div class=\"standfirst\">        <span class=\"trailer\">+Comment</span>Cloud object storage pricing tumbling downhill</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 17:34\" data-epoch=\"1492796065\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row\">\n" +
                    "                  <div class=\"first_headline with_image\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/data_centre/cloud/\">Cloud</a>\n" +
                    "                     <a href=\"/2017/04/21/dell_sells_spanning/\" class=\"story_link\">\n" +
                    "                        <div class=\"story_grid_img\">\n" +
                    "                           <img src=\"https://regmedia.co.uk/2017/04/21/getting_out_of_the_cloud.jpg?x=198&amp;y=131&amp;crop=1\" alt=\"Getting _out_of_the_cloud\" height=\"131\" width=\"198\">\n" +
                    "                        </div>\n" +
                    "                        <h4>Dell backs out of in-cloud backup business by selling Spanning</h4>\n" +
                    "                        <div class=\"standfirst\">Another EMC acquisition let go</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 16:02\" data-epoch=\"1492790528\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline with_image\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/security/\">Security</a>\n" +
                    "                     <a href=\"/2017/04/21/linkedin_bluetooth_feature_privacy_concerns/\" class=\"story_link\">\n" +
                    "                        <div class=\"story_grid_img\">\n" +
                    "                           <img src=\"https://regmedia.co.uk/2016/01/13/shutterstock_who_is_watching.jpg?x=198&amp;y=131&amp;crop=1\" alt=\"Man looks suspiciously over his shoulder while working on laptop. Photo via Shutterstock\" height=\"131\" width=\"198\">\n" +
                    "                        </div>\n" +
                    "                        <h4>LinkedIn U-turns on Bluetooth-enabled 'Tinder for marketers'</h4>\n" +
                    "                        <div class=\"standfirst\">Pop-up requested permission to share data with nearby devices even when app not in use</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">22 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 15:22\" data-epoch=\"1492788128\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline with_image\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/emergent_tech/internet_of_things/\">Internet of Things</a>\n" +
                    "                     <a href=\"/2017/04/21/microsoft_offers_preview_to_eye_ai_iot_analytics_for_edgelords_of_new_net/\" class=\"story_link\">\n" +
                    "                        <div class=\"story_grid_img\">\n" +
                    "                           <img src=\"https://regmedia.co.uk/2016/02/01/toothbrush-surveillance.jpg?x=198&amp;y=131&amp;crop=1\" alt=\"\" height=\"131\" width=\"198\">\n" +
                    "                        </div>\n" +
                    "                        <h4>Microsoft offers preview to eye AI IoT analytics for edgelords of new net</h4>\n" +
                    "                        <div class=\"standfirst\">Azure Stream Analytics to connect your fridge to the cloud for chilled machinations</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 14:43\" data-epoch=\"1492785785\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/business/policy/\">Policy</a>\n" +
                    "                     <a href=\"/2017/04/21/met_police_gun_owner_data_breach_questions/\" class=\"story_link\">\n" +
                    "                        <h4>Shooting org demands answers from Met Police over gun owner blab</h4>\n" +
                    "                        <div class=\"standfirst\">What data did marketing agency subcontractor have access to?</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">52 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 14:07\" data-epoch=\"1492783628\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/business/policy/\">Policy</a>\n" +
                    "                     <a href=\"/2017/04/21/us_surveillance_court_declined_less_than_2_per_cent_of_applications/\" class=\"story_link\">\n" +
                    "                        <h4>US surveillance court declined less than 2 per cent of applications</h4>\n" +
                    "                        <div class=\"standfirst\">2016 figures show only 35 of 1,752 applications were turned down in part or full</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">26 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 13:33\" data-epoch=\"1492781590\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/security/\">Security</a>\n" +
                    "                     <a href=\"/2017/04/21/cybercrime_pathways/\" class=\"story_link\">\n" +
                    "                        <h4>Peer pressure, not money, lures youngsters into cybercrime – report</h4>\n" +
                    "                        <div class=\"standfirst\">Are teenage dreams so hard to beat?</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">21 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 13:01\" data-epoch=\"1492779672\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/data_centre/networks/\">Networks</a>\n" +
                    "                     <a href=\"/2017/04/21/vodafone_femtocell_brownouts/\" class=\"story_link\">\n" +
                    "                        <h4>Exploding femtocells: No need for a full recall, says Vodafone</h4>\n" +
                    "                        <div class=\"standfirst\">Change yours if you're worried, but operator insists issue is limited to earlier models</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">19 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 12:30\" data-epoch=\"1492777813\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/business/\">Business</a>\n" +
                    "                     <a href=\"/2017/04/21/oracle_to_pay_850m_for_moat/\" class=\"story_link\">\n" +
                    "                        <h4>A quiet market? Nah, Oracle's to pay $850m for ad-tracking Moat</h4>\n" +
                    "                        <div class=\"standfirst\">Do you know where your advertisements are going? Big Red does</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 12:00\" data-epoch=\"1492776009\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/emergent_tech/\">Emergent Tech</a>\n" +
                    "                     <a href=\"/2017/04/21/jamie_bartlett_talks_radicals/\" class=\"story_link\">\n" +
                    "                        <h4>Think politics is tumultuous now? Wait till the transhumanists join in...</h4>\n" +
                    "                        <div class=\"standfirst\">        <span class=\"trailer\">Reg Lecture</span>The tech-fulled radicals redesigning society</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 11:30\" data-epoch=\"1492774205\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/business/\">Business</a>\n" +
                    "                     <a href=\"/2017/04/21/wdc_bid_toshiba_memory_business/\" class=\"story_link\">\n" +
                    "                        <h4>WDC flirting with Japan funds to bolster bid for Toshiba's memory biz</h4>\n" +
                    "                        <div class=\"standfirst\">Pursuing extra financial firepower to see off rivals</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 11:00\" data-epoch=\"1492772412\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/data_centre/cloud/\">Cloud</a>\n" +
                    "                     <a href=\"/2017/04/21/mad_native_cloud_skill/\" class=\"story_link\">\n" +
                    "                        <h4>Cloud students, pay attention! Exam plans promise fresh skills</h4>\n" +
                    "                        <div class=\"standfirst\">Going native</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 10:00\" data-epoch=\"1492768811\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/business/policy/\">Policy</a>\n" +
                    "                     <a href=\"/2017/04/21/conviction_by_computer_law_scrapped/\" class=\"story_link\">\n" +
                    "                        <h4>Ministry of Justice scraps 'conviction by computer' law</h4>\n" +
                    "                        <div class=\"standfirst\">Election nixes online court plans – for now</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">17 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 09:30\" data-epoch=\"1492767013\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row\">\n" +
                    "                  <div class=\"first_headline with_image\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/software/\">Software</a>\n" +
                    "                     <a href=\"/2017/04/21/ubuntu_17_04_gnome_not_unity/\" class=\"story_link\">\n" +
                    "                        <div class=\"story_grid_img\">\n" +
                    "                           <img src=\"https://regmedia.co.uk/2017/04/20/sad_penguin_photo_via_shutterstock.jpg?x=198&amp;y=131&amp;crop=1\" alt=\"Sad penguin photo via Shutterstock\" height=\"131\" width=\"198\">\n" +
                    "                        </div>\n" +
                    "                        <h4>Farewell Unity, you challenged desktop Linux. Oh well, here's Ubuntu 17.04</h4>\n" +
                    "                        <div class=\"standfirst\">        <span class=\"trailer\">Review</span>GNOME all the way, baby</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">101 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 09:00\" data-epoch=\"1492765205\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline with_image\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/personal_tech/\">Personal Tech</a>\n" +
                    "                     <a href=\"/2017/04/21/reselling_your_mobe/\" class=\"story_link\">\n" +
                    "                        <div class=\"story_grid_img\">\n" +
                    "                           <img src=\"https://regmedia.co.uk/2017/03/07/obi_wan_droids.jpg?x=198&amp;y=131&amp;crop=1\" alt=\"Obi wan droids\" height=\"131\" width=\"198\">\n" +
                    "                        </div>\n" +
                    "                        <h4>Not the droids you're looking for – worst handsets to resell</h4>\n" +
                    "                        <div class=\"standfirst\">Six months later and you've lost 70 per cent of the RRP</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">58 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 08:30\" data-epoch=\"1492763406\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline with_image\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/bootnotes/\">Bootnotes</a>\n" +
                    "                     <a href=\"/2017/04/21/you_cant_buy_one_now_the_flying_car_makes_its_perennial_return/\" class=\"story_link\">\n" +
                    "                        <div class=\"story_grid_img\">\n" +
                    "                           <img src=\"https://regmedia.co.uk/2015/03/06/jetsons_food_machine.jpg?x=198&amp;y=131&amp;crop=1\" alt=\"The Jetsons Food Machine\" height=\"131\" width=\"198\">\n" +
                    "                        </div>\n" +
                    "                        <h4>(You can't) buy one now! The flying car makes its perennial return</h4>\n" +
                    "                        <div class=\"standfirst\">        <span class=\"trailer\">Something for the Weekend, Sir?</span>There's a steering wheel in my pants. It's driving me nuts</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">64 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 08:01\" data-epoch=\"1492761673\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/business/\">Business</a>\n" +
                    "                     <a href=\"/2017/04/21/on-call/\" class=\"story_link\">\n" +
                    "                        <h4>Drunk user blow-dried laptop after dog lifted its leg over the keyboard</h4>\n" +
                    "                        <div class=\"standfirst\">        <span class=\"trailer\">On-Call</span>Urine a wee spot of dribble, sysadmin says when offered stinking fused mess</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">117 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 07:32\" data-epoch=\"1492759929\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/emergent_tech/artificial_intelligence/\">Artificial Intelligence</a>\n" +
                    "                     <a href=\"/2017/04/21/baidu_driverless_car_software/\" class=\"story_link\">\n" +
                    "                        <h4>Q. Why is Baidu sharing its secret self-driving sauce? A. To help China corner the market</h4>\n" +
                    "                        <div class=\"standfirst\">        <span class=\"trailer\">Analysis</span>Web giant wants to accelerate collaboration amid Western competition</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">10 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 07:03\" data-epoch=\"1492758239\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/security/\">Security</a>\n" +
                    "                     <a href=\"/2017/04/21/windows_hacked_nsa_shadow_brokers/\" class=\"story_link\">\n" +
                    "                        <h4>Script kiddies pwn 1000s of Windows boxes using leaked NSA hack tools</h4>\n" +
                    "                        <div class=\"standfirst\">Vulnerable unpatched systems expose exploitable SMB networking to world+dog</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">51 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 06:38\" data-epoch=\"1492756688\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/devops/\">DevOps</a>\n" +
                    "                     <a href=\"/2017/04/21/docker_renames_open_source_code_moby/\" class=\"story_link\">\n" +
                    "                        <h4>Wait – we can explain, says Moby, er, Docker amid rebrand meltdown</h4>\n" +
                    "                        <div class=\"standfirst\">Now, now, don't be mean about Moby, dicks</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">19 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 06:01\" data-epoch=\"1492754473\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/business/policy/\">Policy</a>\n" +
                    "                     <a href=\"/2017/04/21/celebrity_product_disclosure/\" class=\"story_link\">\n" +
                    "                        <h4>Web celeb product whores told to put on the red light – or else</h4>\n" +
                    "                        <div class=\"standfirst\">And would you believe it? The Kardashians are front and center</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">27 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 05:29\" data-epoch=\"1492752552\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/business/policy/\">Policy</a>\n" +
                    "                     <a href=\"/2017/04/21/arresting_leakers_like_assange_now_a_priority_for_trump_administration/\" class=\"story_link\">\n" +
                    "                        <h4>Cuffing Assange a 'priority' for the USA says attorney-general</h4>\n" +
                    "                        <div class=\"standfirst\">Charges against white-haired-one have reportedly been drafted</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">102 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 05:10\" data-epoch=\"1492751428\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/bootnotes/\">Bootnotes</a>\n" +
                    "                     <a href=\"/2017/04/21/juicero_boss_defends_juice_startup/\" class=\"story_link\">\n" +
                    "                        <h4>Hard-pressed Juicero boss defends $400 IoT juicer after squeezing $120m from investors</h4>\n" +
                    "                        <div class=\"standfirst\">Crushed CEO says critics are comparing apples with oranges</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">74 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 05:02\" data-epoch=\"1492750927\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/science/\">Science</a>\n" +
                    "                     <a href=\"/2017/04/21/new_mh370_analysis_used_actual_777_parts_again_finds_search_was_in_wrong_place/\" class=\"story_link\">\n" +
                    "                        <h4>New MH370 analysis <i>again</i> says we looked in the wrong places</h4>\n" +
                    "                        <div class=\"standfirst\">Drift tests on actual 777 part show plane probably hit ocean north of search area</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">37 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 04:20\" data-epoch=\"1492748407\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/software/\">Software</a>\n" +
                    "                     <a href=\"/2017/04/21/windows_10_update_schedule/\" class=\"story_link\">\n" +
                    "                        <h4>Microsoft promises twice-yearly Windows 10, O365 updates – with just 18 months' support</h4>\n" +
                    "                        <div class=\"standfirst\">        <span class=\"trailer\">Updated</span>Sysadmin holidays cancelled in March and September, starting in 2020</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">96 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 02:36\" data-epoch=\"1492742166\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/science/\">Science</a>\n" +
                    "                     <a href=\"/2017/04/21/china_successfully_launches_its_first_robot_space_truck/\" class=\"story_link\">\n" +
                    "                        <h4>China successfully launches its first robot space truck</h4>\n" +
                    "                        <div class=\"standfirst\">Tianzhou-1 will now refuel the Tiangong-2 orbital lab as China prepares a proper space station</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">11 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 01:20\" data-epoch=\"1492737649\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/emergent_tech/\">Emergent Tech</a>\n" +
                    "                     <a href=\"/2017/04/21/tesla_settles_aurora/\" class=\"story_link\">\n" +
                    "                        <h4>Tesla's latest car crash: Its 'meritless' lawsuit against ex-Autopilot bod</h4>\n" +
                    "                        <div class=\"standfirst\">Musketeers bag $100,000 after hitting the brakes on allegations</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"21 Apr 00:24\" data-epoch=\"1492734253\">2 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/security/\">Security</a>\n" +
                    "                     <a href=\"/2017/04/20/google_must_provide_overseas_gmail_data/\" class=\"story_link\">\n" +
                    "                        <h4>Nuh-uh, Google, you WILL hand over emails stored on foreign servers, says US judge</h4>\n" +
                    "                        <div class=\"standfirst\">If you can access them in California, so can the Feds</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">94 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 22:31\" data-epoch=\"1492727472\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row\">\n" +
                    "                  <div class=\"first_headline with_image\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/business/policy/\">Policy</a>\n" +
                    "                     <a href=\"/2017/04/20/defamation_yelp_review_appeal/\" class=\"story_link\">\n" +
                    "                        <div class=\"story_grid_img\">\n" +
                    "                           <img src=\"https://regmedia.co.uk/2017/04/20/shutterstock_reviews.jpg?x=198&amp;y=131&amp;crop=1\" alt=\"\" height=\"131\" width=\"198\">\n" +
                    "                        </div>\n" +
                    "                        <h4>FYI – There's a legal storm brewing in Cali that threatens to destroy online free speech</h4>\n" +
                    "                        <div class=\"standfirst\">        <span class=\"trailer\">Analysis</span>Row over Yelp review menaces web immunity</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">28 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 21:37\" data-epoch=\"1492724245\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline with_image\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/security/\">Security</a>\n" +
                    "                     <a href=\"/2017/04/20/tanium_hospital_it_demo/\" class=\"story_link\">\n" +
                    "                        <div class=\"story_grid_img\">\n" +
                    "                           <img src=\"https://regmedia.co.uk/2017/04/20/orion_hindawi.jpg?x=198&amp;y=131&amp;crop=1\" alt=\"Orion Hindawi \" height=\"131\" width=\"198\">\n" +
                    "                        </div>\n" +
                    "                        <h4>'We should have done better' – the feeble words of a CEO caught using real hospital IT in infosec product demos</h4>\n" +
                    "                        <div class=\"standfirst\">Understatement of the month: 'Mistakes were made'</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">29 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 20:54\" data-epoch=\"1492721664\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline with_image\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/security/\">Security</a>\n" +
                    "                     <a href=\"/2017/04/20/trumps_cybersecurity_deadline_is_up/\" class=\"story_link\">\n" +
                    "                        <div class=\"story_grid_img\">\n" +
                    "                           <img src=\"https://regmedia.co.uk/2017/04/20/present-computer.jpg?x=198&amp;y=131&amp;crop=1\" alt=\"\" height=\"131\" width=\"198\">\n" +
                    "                        </div>\n" +
                    "                        <h4>Trump's self-imposed cybersecurity deadline is up: What we got?</h4>\n" +
                    "                        <div class=\"standfirst\">        <span class=\"trailer\">Analysis</span>Quick clue: President Snowflake is a compulsive liar</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">49 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 19:42\" data-epoch=\"1492717353\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/personal_tech/\">Personal Tech</a>\n" +
                    "                     <a href=\"/2017/04/20/verizon_q1fy2017_earnings/\" class=\"story_link\">\n" +
                    "                        <h4>For the first time ever, Verizon sheds subs: 300,000 punters walk out</h4>\n" +
                    "                        <div class=\"standfirst\">Don't worry guys, Yahoo<i>!</i> is coming to the rescue</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 19:08\" data-epoch=\"1492715310\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/data_centre/networks/\">Networks</a>\n" +
                    "                     <a href=\"/2017/04/20/ofcom_openreach_telco_infrastructure_access/\" class=\"story_link\">\n" +
                    "                        <h4>Ofcom chisels away at BT Openreach's cold, dead hands</h4>\n" +
                    "                        <div class=\"standfirst\">We WILL make you open up infrastructure access, vows regulator</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">28 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 17:06\" data-epoch=\"1492707966\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/data_centre/\">Data Centre</a>\n" +
                    "                     <a href=\"/2017/04/20/union_fujitsu_job_cutting_protest/\" class=\"story_link\">\n" +
                    "                        <h4>Union elevates Fujitsu job cutting protest to Japanese embassy</h4>\n" +
                    "                        <div class=\"standfirst\">Ambassador, with these 1,800 layoffs, Fuji really is spoiling us</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 16:52\" data-epoch=\"1492707141\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/business/policy/\">Policy</a>\n" +
                    "                     <a href=\"/2017/04/20/google_chrome_adblocker/\" class=\"story_link\">\n" +
                    "                        <h4>Google's 'adblocker' is all about taking back control</h4>\n" +
                    "                        <div class=\"standfirst\">Watch out, whitelist mafia, you might be swimming with the fishes</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">33 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 16:28\" data-epoch=\"1492705692\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/security/\">Security</a>\n" +
                    "                     <a href=\"/2017/04/20/ad_scam_traffic_alchemist/\" class=\"story_link\">\n" +
                    "                        <h4>Online ad scam launders legions of pirates and pervs into 'legit' surfing</h4>\n" +
                    "                        <div class=\"standfirst\">Traffic Alchemist turns base metal into gold</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">19 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 16:00\" data-epoch=\"1492704009\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/emergent_tech/artificial_intelligence/\">Artificial Intelligence</a>\n" +
                    "                     <a href=\"/2017/04/20/aws_lex_love_for_devs/\" class=\"story_link\">\n" +
                    "                        <h4>The pain in your chest? That'll be Big Tech's AI arrow of love</h4>\n" +
                    "                        <div class=\"standfirst\">Welcome to Lex: AWS's AI-as-a-platform-service</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 15:22\" data-epoch=\"1492701724\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/software/\">Software</a>\n" +
                    "                     <a href=\"/2017/04/20/microsoft_to_do/\" class=\"story_link\">\n" +
                    "                        <h4>What a To-Do! Microsoft snuffs out Wunderlist</h4>\n" +
                    "                        <div class=\"standfirst\">Another day. Another strategy...</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">29 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 14:45\" data-epoch=\"1492699506\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/emergent_tech/internet_of_things/\">Internet of Things</a>\n" +
                    "                     <a href=\"/2017/04/20/tesla_class_action_lawsuit_autopilot_updates/\" class=\"story_link\">\n" +
                    "                        <h4>Tesla hit by class action sueball over autopilot software updates</h4>\n" +
                    "                        <div class=\"standfirst\">Claimants say features not included, updates were dangerous</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">23 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 14:08\" data-epoch=\"1492697283\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/security/\">Security</a>\n" +
                    "                     <a href=\"/2017/04/20/mastercard_launches_fingerprint_sensor_to_replace_pins_with_cards/\" class=\"story_link\">\n" +
                    "                        <h4>Mastercard launches card that replaces PIN with fingerprint sensor</h4>\n" +
                    "                        <div class=\"standfirst\">Sweet MFA... but there's no documentation available for users</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">106 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 13:35\" data-epoch=\"1492695309\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/security/\">Security</a>\n" +
                    "                     <a href=\"/2017/04/20/linksys_router_vulns/\" class=\"story_link\">\n" +
                    "                        <h4>Flaws found in Linksys routers that could be used to create a botnet</h4>\n" +
                    "                        <div class=\"standfirst\">Engineers working on firmware updates</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">22 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 13:00\" data-epoch=\"1492693204\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/business/policy/\">Policy</a>\n" +
                    "                     <a href=\"/2017/04/20/eu_plans_for_blockchain_observatory_raise_concerns_says_expert/\" class=\"story_link\">\n" +
                    "                        <h4>EU plans for blockchain 'observatory' raise concerns, says expert</h4>\n" +
                    "                        <div class=\"standfirst\">€500,000 to improve expertise and regulatory capacity</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 12:33\" data-epoch=\"1492691588\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/personal_tech/\">Personal Tech</a>\n" +
                    "                     <a href=\"/2017/04/20/htc_seeks_salvation_in_squeezy_design/\" class=\"story_link\">\n" +
                    "                        <h4>HTC seeks salvation with squeezy design</h4>\n" +
                    "                        <div class=\"standfirst\">OK... that's a new one</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">12 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 12:02\" data-epoch=\"1492689733\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline with_image\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/business/policy/\">Policy</a>\n" +
                    "                     <a href=\"/2017/04/20/donald_trump_surveillance_eu/\" class=\"story_link\">\n" +
                    "                        <div class=\"story_grid_img\">\n" +
                    "                           <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"Trump\" data-delay_url=\"https://regmedia.co.uk/2017/01/26/trump.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        </div>\n" +
                    "                        <h4>Trump's lips sealed on surveillance, complains EU privacy chief</h4>\n" +
                    "                        <div class=\"standfirst\">Concern as to whether new administration will abide by Obama's promises</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">27 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 11:04\" data-epoch=\"1492686246\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline with_image\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/data_centre/storage/\">Storage</a>\n" +
                    "                     <a href=\"/2017/04/20/infinidat_arrays_outperform_pure_and_emc/\" class=\"story_link\">\n" +
                    "                        <div class=\"story_grid_img\">\n" +
                    "                           <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2017/04/20/miley_cyrus_wrecking_ball.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        </div>\n" +
                    "                        <h4>Infinidat puts array to the test, says it 'wrecks' Pure and EMC systems</h4>\n" +
                    "                        <div class=\"standfirst\">Fielding most IOs from memory blasts 'em out of the park</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">26 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 10:35\" data-epoch=\"1492684511\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline with_image\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/security/\">Security</a>\n" +
                    "                     <a href=\"/2017/04/20/ms_edge_vuln_dispute/\" class=\"story_link\">\n" +
                    "                        <div class=\"story_grid_img\">\n" +
                    "                           <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"Image by ART production http://www.shutterstock.com/gallery-3278237p1.html\" data-delay_url=\"https://regmedia.co.uk/2016/09/05/edge_tears_876e5789356.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        </div>\n" +
                    "                        <h4>Microsoft shrugs off report that Edge can expose user identities from JS Fetch requests</h4>\n" +
                    "                        <div class=\"standfirst\">        <span class=\"trailer\">Updated</span>La la la nothing to patch here la la la</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">20 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 10:05\" data-epoch=\"1492682705\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/transformation/\">Transformation</a>\n" +
                    "                     <a href=\"/2017/04/20/the_user_as_part_of_the_dev_process/\" class=\"story_link\">\n" +
                    "                        <h4>Have we got a new, hip compound IT phrase for you! Enter... UserDev</h4>\n" +
                    "                        <div class=\"standfirst\">Yes, the pesky creatures that break your code are often worth listening to</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">35 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 09:33\" data-epoch=\"1492680786\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/data_centre/virtualization/\">Virtualization</a>\n" +
                    "                     <a href=\"/2017/04/20/vmware_end_of_days_for_cisco/\" class=\"story_link\">\n" +
                    "                        <h4>No middle ground, no compromise: VMware blocks Cisco's SDN play</h4>\n" +
                    "                        <div class=\"standfirst\">Not cool, man</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 09:03\" data-epoch=\"1492678993\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/personal_tech/\">Personal Tech</a>\n" +
                    "                     <a href=\"/2017/04/20/apples_silicon_roasts_android_rivals/\" class=\"story_link\">\n" +
                    "                        <h4>Apple's zippy silicon leaves Android rivals choking on dust</h4>\n" +
                    "                        <div class=\"standfirst\">It's all about how you spend that sweet R&amp;D dollar</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">89 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 08:32\" data-epoch=\"1492677137\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/emergent_tech/\">Emergent Tech</a>\n" +
                    "                     <a href=\"/2017/04/20/mod_battlefield_delivery_drone_contract/\" class=\"story_link\">\n" +
                    "                        <h4>Can you make a warzone delivery drone? UK.gov wants to give you cash</h4>\n" +
                    "                        <div class=\"standfirst\">£40k or more for initial contracts up for grabs</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">47 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 08:01\" data-epoch=\"1492675268\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/transformation/\">Transformation</a>\n" +
                    "                     <a href=\"/2017/04/20/using_excess_data_centre_capacity/\" class=\"story_link\">\n" +
                    "                        <h4>You just sent an on-prem app to the cloud and your data centre has empty racks. What now?</h4>\n" +
                    "                        <div class=\"standfirst\">It's too warm to store booze. Renting it out is risky. Slowing things down can do the job</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">16 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 07:32\" data-epoch=\"1492673528\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/data_centre/cloud/\">Cloud</a>\n" +
                    "                     <a href=\"/2017/04/20/aws_mark_hurd_cloud/\" class=\"story_link\">\n" +
                    "                        <h4>AWS v Oracle: Mark Hurd schooled on how to run a public cloud that people actually use</h4>\n" +
                    "                        <div class=\"standfirst\">Amazon VP takes Big Red's co-CEO to task over server boast</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">44 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 06:56\" data-epoch=\"1492671367\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/security/\">Security</a>\n" +
                    "                     <a href=\"/2017/04/20/ambient_light_sensors_can_steal_data_says_security_researcher/\" class=\"story_link\">\n" +
                    "                        <h4>Ambient light sensors can steal data, says security researcher</h4>\n" +
                    "                        <div class=\"standfirst\">Not-so-bright API means web pages can use a W3C idea to pop your phone or laptop</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">18 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 06:31\" data-epoch=\"1492669872\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/personal_tech/\">Personal Tech</a>\n" +
                    "                     <a href=\"/2017/04/20/bose_sued_privacy/\" class=\"story_link\">\n" +
                    "                        <h4>SPY-tunes scandal: Bloke sues Bose after headphones app squeals on his playlist</h4>\n" +
                    "                        <div class=\"standfirst\">Oh no, don't let data slurpers know we love Coldplay</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">78 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 06:01\" data-epoch=\"1492668067\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/science/\">Science</a>\n" +
                    "                     <a href=\"/2017/04/20/opportunity_rover_moves_to_perseverance_valley/\" class=\"story_link\">\n" +
                    "                        <h4>Opportunity rover gets bored of spot it's explored since 2014</h4>\n" +
                    "                        <div class=\"standfirst\">NASA moving to 'Perseverance Valley' where we can see Martian erosion in action</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">29 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 05:29\" data-epoch=\"1492666146\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/emergent_tech/\">Emergent Tech</a>\n" +
                    "                     <a href=\"/2017/04/20/medical_robots_need_autonomy_classifications/\" class=\"story_link\">\n" +
                    "                        <h4>Accept for a second that robot surgeons exist. Who will check they're up to the job – and how?</h4>\n" +
                    "                        <div class=\"standfirst\">Let us level with you...</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">17 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 05:04\" data-epoch=\"1492664653\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/bootnotes/\">Bootnotes</a>\n" +
                    "                     <a href=\"/2017/04/20/computer_games_to_become_medal_sport_at_asian_games/\" class=\"story_link\">\n" +
                    "                        <h4>Computer games to become medal sport at Asian Games</h4>\n" +
                    "                        <div class=\"standfirst\">Olympic Council of Asia will award gold medals for fragging in 2022, helped by Alibaba</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">14 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 02:57\" data-epoch=\"1492657021\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/data_centre/networks/\">Networks</a>\n" +
                    "                     <a href=\"/2017/04/20/riverbed_acquires_xirrus/\" class=\"story_link\">\n" +
                    "                        <h4>Riverbed slurps Xirrus to take SD-WAN all the way to Wi-Fi</h4>\n" +
                    "                        <div class=\"standfirst\">Because internet things should probably talk on secure virtual networks, not punter-grade WiFi</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 01:32\" data-epoch=\"1492651961\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline with_image\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/emergent_tech/\">Emergent Tech</a>\n" +
                    "                     <a href=\"/2017/04/20/facebook_brain_typing/\" class=\"story_link\">\n" +
                    "                        <div class=\"story_grid_img\">\n" +
                    "                           <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"Facebook F8, Day Two\" data-delay_url=\"https://regmedia.co.uk/2017/04/19/facebook_f8_day2.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        </div>\n" +
                    "                        <h4>Zuckerberg's absolutely mental: Brain sensors that read YOUR MIND at 100 words a minute</h4>\n" +
                    "                        <div class=\"standfirst\">        <span class=\"trailer\">F8 2017</span>Billionaire dreamer to see your thoughts 'by 2019'</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">57 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"20 Apr 00:02\" data-epoch=\"1492646526\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline with_image\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/business/\">Business</a>\n" +
                    "                     <a href=\"/2017/04/19/qualcomm_q2fy2017_results/\" class=\"story_link\">\n" +
                    "                        <div class=\"story_grid_img\">\n" +
                    "                           <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2016/12/02/shutterstock_boxer.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        </div>\n" +
                    "                        <h4>Qualcomm takes $1bn BlackBerry bite like a champ, struts away</h4>\n" +
                    "                        <div class=\"standfirst\">Patent royalty check dings profits but nothing Snapdragon biz can't handle</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"19 Apr 23:44\" data-epoch=\"1492645470\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline with_image\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/emergent_tech/artificial_intelligence/\">Artificial Intelligence</a>\n" +
                    "                     <a href=\"/2017/04/19/alphabets_healthcare_verily/\" class=\"story_link\">\n" +
                    "                        <div class=\"story_grid_img\">\n" +
                    "                           <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2016/01/27/doctor.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        </div>\n" +
                    "                        <h4>Google's healthcare cousin to stick 10,000 human guinea pigs under the microscope</h4>\n" +
                    "                        <div class=\"standfirst\">Four-year study will bung patient records in the cloud</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"19 Apr 23:00\" data-epoch=\"1492642825\">3 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/security/\">Security</a>\n" +
                    "                     <a href=\"/2017/04/19/nsa_fbi_spy_on_us_for_our_protection/\" class=\"story_link\">\n" +
                    "                        <h4>We're spying on you for your own protection, says NSA, FBI</h4>\n" +
                    "                        <div class=\"standfirst\">Except we're not, of course, because that would be illegal</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">32 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"19 Apr 21:44\" data-epoch=\"1492638265\">4 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/security/\">Security</a>\n" +
                    "                     <a href=\"/2017/04/19/intercontinental_hotels_group_malware/\" class=\"story_link\">\n" +
                    "                        <h4>If you've stayed at a Holiday Inn you may have lost more than a good night's sleep (like maybe your bank card)</h4>\n" +
                    "                        <div class=\"standfirst\">Massive malware infection slurps customers' privates</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"19 Apr 20:36\" data-epoch=\"1492634185\">4 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/personal_tech/\">Personal Tech</a>\n" +
                    "                     <a href=\"/2017/04/19/microsoft_windows_phone_insignificant/\" class=\"story_link\">\n" +
                    "                        <h4>So few use Windows Phone, Microsoft can't be bothered: Security app is iOS, Android only</h4>\n" +
                    "                        <div class=\"standfirst\">Redmond-powered mobes don't deserve latest sign-in tool</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">73 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"19 Apr 20:00\" data-epoch=\"1492632038\">4 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/emergent_tech/artificial_intelligence/\">Artificial Intelligence</a>\n" +
                    "                     <a href=\"/2017/04/19/chatbots_facebook/\" class=\"story_link\">\n" +
                    "                        <h4>Please don't call them Facebook chatbots, says Facebook's bot boss</h4>\n" +
                    "                        <div class=\"standfirst\">        <span class=\"trailer\">F8 2017</span>That whole conversation-as-a-UI thing was just a big misunderstanding</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">20 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"19 Apr 19:25\" data-epoch=\"1492629931\">4 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/science/\">Science</a>\n" +
                    "                     <a href=\"/2017/04/19/exoplanet_life/\" class=\"story_link\">\n" +
                    "                        <h4>PACK YOUR BAGS! Boffins spot Earth-size planet most likeliest yet to harbor alien life</h4>\n" +
                    "                        <div class=\"standfirst\">Water, check. Low radiation, check. Possible to get to... oh wait, darn</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">53 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"19 Apr 17:01\" data-epoch=\"1492621272\">4 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/data_centre/cloud/\">Cloud</a>\n" +
                    "                     <a href=\"/2017/04/19/businesses_bustling_data_through_cloud_storage_gateways/\" class=\"story_link\">\n" +
                    "                        <h4>Sending data to the cloud is our business and business is GOOD</h4>\n" +
                    "                        <div class=\"standfirst\">Nasuni, Panzura and Avere all set for accelerated growth</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"19 Apr 16:04\" data-epoch=\"1492617850\">4 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/software/\">Software</a>\n" +
                    "                     <a href=\"/2017/04/19/microsoft_first_rdbms_with_builtin_ai/\" class=\"story_link\">\n" +
                    "                        <h4>Microsoft touts SQL Server 2017 as 'first RDBMS with built-in AI'</h4>\n" +
                    "                        <div class=\"standfirst\">Python slithers in next to R</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">21 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"19 Apr 15:00\" data-epoch=\"1492614011\">4 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/business/\">Business</a>\n" +
                    "                     <a href=\"/2017/04/19/nexsan_wins_unity_battle/\" class=\"story_link\">\n" +
                    "                        <h4>Court favours Nexsan over EMC in Unity trademark squabble</h4>\n" +
                    "                        <div class=\"standfirst\">A beautiful David-Goliath tale</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"19 Apr 14:32\" data-epoch=\"1492612345\">4 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/security/\">Security</a>\n" +
                    "                     <a href=\"/2017/04/19/met_police_30000_gun_owner_data_breach/\" class=\"story_link\">\n" +
                    "                        <h4>30,000 London gun owners hit by Met Police 'data breach'</h4>\n" +
                    "                        <div class=\"standfirst\">Who gave marketing agency access to super-sensitive address database?</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">112 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"19 Apr 13:55\" data-epoch=\"1492610110\">4 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/data_centre/storage/\">Storage</a>\n" +
                    "                     <a href=\"/2017/04/19/screech_bm_turns_a_storage_corner/\" class=\"story_link\">\n" +
                    "                        <h4>IBM storage revenues grew? Hahaha, good one. Oh, you're serious</h4>\n" +
                    "                        <div class=\"standfirst\">        <span class=\"trailer\">Analysis</span>Reverses 22 quarters of hardware decline</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"19 Apr 13:24\" data-epoch=\"1492608245\">4 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/security/\">Security</a>\n" +
                    "                     <a href=\"/2017/04/19/uk_gov_breaches_survey/\" class=\"story_link\">\n" +
                    "                        <h4>UK.gov survey shines light on cybersecurity threats to businesses</h4>\n" +
                    "                        <div class=\"standfirst\">Phishing, ransomware remain most pressing concerns</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"19 Apr 12:51\" data-epoch=\"1492606270\">4 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/personal_tech/\">Personal Tech</a>\n" +
                    "                     <a href=\"/2017/04/19/retro_computers_supplier_royalties_dispute/\" class=\"story_link\">\n" +
                    "                        <h4>Game authors demand missing ZX Spectrum reboot royalties</h4>\n" +
                    "                        <div class=\"standfirst\">No cash, slow answers, firm still blames man who quit a year ago</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">50 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"19 Apr 12:20\" data-epoch=\"1492604411\">4 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline with_image\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/data_centre/storage/\">Storage</a>\n" +
                    "                     <a href=\"/2017/04/19/back_up_rpo_0/\" class=\"story_link\">\n" +
                    "                        <div class=\"story_grid_img\">\n" +
                    "                           <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"Burned out van photo via Shutterstock\" data-delay_url=\"https://regmedia.co.uk/2017/04/19/burned_out_van_photo_via_shutterstock.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        </div>\n" +
                    "                        <h4>Data trashed? When RPO 0 isn't enough</h4>\n" +
                    "                        <div class=\"standfirst\">Cast-iron storage policies</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">26 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"19 Apr 11:50\" data-epoch=\"1492602613\">4 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline with_image\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/data_centre/storage/\">Storage</a>\n" +
                    "                     <a href=\"/2017/04/19/nasty_work_tosh_spins_out_a_new_disk_drive/\" class=\"story_link\">\n" +
                    "                        <div class=\"story_grid_img\">\n" +
                    "                           <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"Toshiba_8TB_N300_950\" data-delay_url=\"https://regmedia.co.uk/2017/04/19/toshiba_8tb_n300_950.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        </div>\n" +
                    "                        <h4>Toshiba spins out new NAS disk drive with its fastest transfer rate yet</h4>\n" +
                    "                        <div class=\"standfirst\">Consumer workhorse has the speed and capacity to thrill ya</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"19 Apr 11:10\" data-epoch=\"1492600211\">4 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline with_image\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/security/\">Security</a>\n" +
                    "                     <a href=\"/2017/04/19/speaking_in_tech_episode_257/\" class=\"story_link\">\n" +
                    "                        <div class=\"story_grid_img\">\n" +
                    "                           <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2017/04/19/willy-wonka-meme.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        </div>\n" +
                    "                        <h4>Speaking in Tech: Hacking Microsoft Windows? That's cute</h4>\n" +
                    "                        <div class=\"standfirst\">        <span class=\"trailer\">Podcast</span>Hacker whizz and Veracode co-founder Chris Wysopal joins the crew this week to talk secure software</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"19 Apr 10:35\" data-epoch=\"1492598143\">4 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/bootnotes/\">Bootnotes</a>\n" +
                    "                     <a href=\"/2017/04/19/londons_cyber_cops_charge_footballer_over_online_shenanigans/\" class=\"story_link\">\n" +
                    "                        <h4>Ex-West Ham winger charged twice over cybershenanigans</h4>\n" +
                    "                        <div class=\"standfirst\">22-year-old to appear before magistrates at month's end</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"19 Apr 09:32\" data-epoch=\"1492594330\">4 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/software/\">Software</a>\n" +
                    "                     <a href=\"/2017/04/19/firefox_a_call_to_freedom/\" class=\"story_link\">\n" +
                    "                        <h4>Why Firefox? Because not <i>everybody</i> is a web designer, silly</h4>\n" +
                    "                        <div class=\"standfirst\">        <span class=\"trailer\">Open Source Insider</span>Do we really want Chrome hegemony?</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">140 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"19 Apr 09:06\" data-epoch=\"1492592765\">4 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/business/policy/\">Policy</a>\n" +
                    "                     <a href=\"/2017/04/19/princeton_perceptual_adblocker_moab/\" class=\"story_link\">\n" +
                    "                        <h4>Will the MOAB (Mother Of all AdBlockers) finally kill advertising?</h4>\n" +
                    "                        <div class=\"standfirst\">'Perceptual ad blocker' cannot be defeated, researchers claim</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">172 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"19 Apr 08:35\" data-epoch=\"1492590907\">4 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/transformation/\">Transformation</a>\n" +
                    "                     <a href=\"/2017/04/19/hybrid_infrastructure_reuse_legacy_hardware/\" class=\"story_link\">\n" +
                    "                        <h4>How to breathe new life into your legacy kit now you've gone hybrid</h4>\n" +
                    "                        <div class=\"standfirst\">Hold fire on the euthanasia</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"19 Apr 08:03\" data-epoch=\"1492589004\">4 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/software/\">Software</a>\n" +
                    "                     <a href=\"/2017/04/19/chap_fixes_microsofts_windows_7_and_8_update_block_on_new_cpus/\" class=\"story_link\">\n" +
                    "                        <h4>Chap 'fixes' Microsoft's Windows 7 and 8 update block on new CPUs</h4>\n" +
                    "                        <div class=\"standfirst\">Developer says he's found a way to stop Windows' new CPU check, which means updates flow again</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">102 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"19 Apr 07:28\" data-epoch=\"1492586884\">4 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/bootnotes/\">Bootnotes</a>\n" +
                    "                     <a href=\"/2017/04/19/silicon_valley_ceo_plea_deal/\" class=\"story_link\">\n" +
                    "                        <h4>Silicon Valley tech CEO admits beating software engineer wife, offered just 13 days in the clink</h4>\n" +
                    "                        <div class=\"standfirst\">Despite evidence and previous offense, Abhishek Gattani unlikely to face serious charges</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">101 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"19 Apr 07:02\" data-epoch=\"1492585333\">4 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/security/\">Security</a>\n" +
                    "                     <a href=\"/2017/04/19/hotpoint_hacked/\" class=\"story_link\">\n" +
                    "                        <h4>Fixing your oven can cook your computer</h4>\n" +
                    "                        <div class=\"standfirst\">        <span class=\"trailer\">Updated</span>Appliance vendor Hotpoint's UK service site is serving malware when you seek repairs</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">24 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"19 Apr 06:26\" data-epoch=\"1492583169\">4 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/security/\">Security</a>\n" +
                    "                     <a href=\"/2017/04/19/scam_businesses_post_on_google_maps/\" class=\"story_link\">\n" +
                    "                        <h4>Revealed: Scammers plaster Google Maps with pins to lure punters from honest traders</h4>\n" +
                    "                        <div class=\"standfirst\">Research shows how web mapping service can be abused</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"19 Apr 06:08\" data-epoch=\"1492582084\">4 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/emergent_tech/artificial_intelligence/\">Artificial Intelligence</a>\n" +
                    "                     <a href=\"/2017/04/19/cloud_vision_api_defeated_by_noise/\" class=\"story_link\">\n" +
                    "                        <h4>Google's cloudy image recognition is easily blinded, say boffins</h4>\n" +
                    "                        <div class=\"standfirst\">Hooray for humans! We can pick out images too obscure for Google's AI</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">14 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"19 Apr 05:31\" data-epoch=\"1492579871\">4 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/emergent_tech/artificial_intelligence/\">Artificial Intelligence</a>\n" +
                    "                     <a href=\"/2017/04/19/facebook_caffe2/\" class=\"story_link\">\n" +
                    "                        <h4>Facebook brews Caffe2 AI toolkit so apps can give SnapChat a slap</h4>\n" +
                    "                        <div class=\"standfirst\">        <span class=\"trailer\">F8 2017</span>Need some code to alter pics and whack some stickers and be worth billions?</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"19 Apr 05:01\" data-epoch=\"1492578066\">4 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/data_centre/virtualization/\">Virtualization</a>\n" +
                    "                     <a href=\"/2017/04/19/xen_4_9_rc1_released/\" class=\"story_link\">\n" +
                    "                        <h4>Release the hounds! Xen 4.9's first RC is out and wants testing</h4>\n" +
                    "                        <div class=\"standfirst\">Early June looks like being hypervisor happy time</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"19 Apr 02:58\" data-epoch=\"1492570688\">4 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/data_centre/storage/\">Storage</a>\n" +
                    "                     <a href=\"/2017/04/19/veeam_q1fy2017_results/\" class=\"story_link\">\n" +
                    "                        <h4>Can nothing stop the Veeam tank? We hate to save you a click but: No</h4>\n" +
                    "                        <div class=\"standfirst\">Backup biz notches up another 4,000-new-customer quarter</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">14 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"19 Apr 02:02\" data-epoch=\"1492567332\">4 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline with_image\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/security/\">Security</a>\n" +
                    "                     <a href=\"/2017/04/19/oracle_april_security_patches_nsa/\" class=\"story_link\">\n" +
                    "                        <div class=\"story_grid_img\">\n" +
                    "                           <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"Oracle acrobatics in the cloud\" data-delay_url=\"https://regmedia.co.uk/2017/01/27/oracle_airplane_shutterstock_editorial_use_only.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        </div>\n" +
                    "                        <h4>Oracle patches Solaris 10 hole exploited by NSA spyware tool – and 298 other security bugs</h4>\n" +
                    "                        <div class=\"standfirst\">Mega load of updates lands for tons of Big Red gear</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">13 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"19 Apr 00:39\" data-epoch=\"1492562389\">4 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline with_image\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/business/\">Business</a>\n" +
                    "                     <a href=\"/2017/04/19/ibm_q1_fy2017/\" class=\"story_link\">\n" +
                    "                        <div class=\"story_grid_img\">\n" +
                    "                           <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"results\" data-delay_url=\"https://regmedia.co.uk/2016/07/18/results1.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        </div>\n" +
                    "                        <h4>IBM. Sigh. Revenues. Sigh. Down. Sigh. For the 20th quarter in a row</h4>\n" +
                    "                        <div class=\"standfirst\">Sigh</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">26 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"19 Apr 00:00\" data-epoch=\"1492560013\">4 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline with_image\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/data_centre/hpc/\">HPC</a>\n" +
                    "                     <a href=\"/2017/04/18/intel_loses_its_lustre_bins_ownbrand_hpc_filesystem/\" class=\"story_link\">\n" +
                    "                        <div class=\"story_grid_img\">\n" +
                    "                           <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"Intel's email announcing the death of its lustre distro\" data-delay_url=\"https://regmedia.co.uk/2017/04/18/intel_lustre_email2.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        </div>\n" +
                    "                        <h4>Intel loses its Lustre – Chipzilla bins own-brand HPC file system</h4>\n" +
                    "                        <div class=\"standfirst\">Between killing an OpenStack research team and killing IDF, we see a pattern here</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">15 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 23:35\" data-epoch=\"1492558527\">4 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/security/\">Security</a>\n" +
                    "                     <a href=\"/2017/04/18/homeland_security_screening/\" class=\"story_link\">\n" +
                    "                        <h4>Stop asking people for their passwords, rights warriors yell at US Homeland Security</h4>\n" +
                    "                        <div class=\"standfirst\">File request under: 'Trash can'</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">90 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 22:55\" data-epoch=\"1492556130\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/business/policy/\">Policy</a>\n" +
                    "                     <a href=\"/2017/04/18/trump_shakes_up_h1b_visa_progam/\" class=\"story_link\">\n" +
                    "                        <h4>Trump signs exec order signaling foreign H-1B visa techie crackdown</h4>\n" +
                    "                        <div class=\"standfirst\">        <span class=\"trailer\">Updated</span>Buy American, hire American, unlike me, grins US president</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">38 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 22:08\" data-epoch=\"1492553326\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/emergent_tech/\">Emergent Tech</a>\n" +
                    "                     <a href=\"/2017/04/18/facebook_pitches_camera_for_augmented_reality/\" class=\"story_link\">\n" +
                    "                        <h4>Zuckerberg: Escape from the real world into my goofy make-believe science-fiction fantasy</h4>\n" +
                    "                        <div class=\"standfirst\">        <span class=\"trailer\">F8 2017</span>Facebook boss reckons he'll heal society's ills with pix</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">34 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 21:18\" data-epoch=\"1492550288\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/data_centre/storage/\">Storage</a>\n" +
                    "                     <a href=\"/2017/04/18/bidding_for_toshiba_memory_biz/\" class=\"story_link\">\n" +
                    "                        <h4>Foxconn, Apple, big biz circle Toshiba's memory biz cash cow – rumors</h4>\n" +
                    "                        <div class=\"standfirst\">So far, the highest bid is $27bn, it is claimed</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 20:19\" data-epoch=\"1492546769\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/personal_tech/\">Personal Tech</a>\n" +
                    "                     <a href=\"/2017/04/18/samsungs_shixby_reviewers_unimpressed/\" class=\"story_link\">\n" +
                    "                        <h4>Samsung's Shixby: Reviewers unimpressed with S8 digital assistant</h4>\n" +
                    "                        <div class=\"standfirst\">Voice version won't even ship until spring</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">13 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 19:26\" data-epoch=\"1492543598\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/software/\">Software</a>\n" +
                    "                     <a href=\"/2017/04/18/microsoft_charles_simonyi_intentional_software/\" class=\"story_link\">\n" +
                    "                        <h4>Guess who's back at Microsoft? Excel, Word creator Charles Simonyi</h4>\n" +
                    "                        <div class=\"standfirst\">Windows giant devours Office mastermind and his biz, Intentional Software</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">25 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 18:45\" data-epoch=\"1492541110\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/business/\">Business</a>\n" +
                    "                     <a href=\"/2017/04/18/meyer_sues_yahoo/\" class=\"story_link\">\n" +
                    "                        <h4>MEYER<i>!</i> SUES<i>!</i> YAHOO<i>!</i></h4>\n" +
                    "                        <div class=\"standfirst\">Brouhaha over shoddy website and payments sparks lawsuit</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 18:21\" data-epoch=\"1492539698\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/data_centre/hpc/\">HPC</a>\n" +
                    "                     <a href=\"/2017/04/18/microsoft_rambus_cryogenic_computation_collab/\" class=\"story_link\">\n" +
                    "                        <h4>Microsoft and Rambus will get schwifty in quantum-cum-cryogenic computation collab</h4>\n" +
                    "                        <div class=\"standfirst\">Turn off the heating, it's gonna get −180C in here</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">14 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 16:01\" data-epoch=\"1492531272\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/data_centre/servers/\">Servers</a>\n" +
                    "                     <a href=\"/2017/04/18/dell_servers_getting_toshiba_flash_boost/\" class=\"story_link\">\n" +
                    "                        <h4>Dell servers set to get a flash boost from Toshiba</h4>\n" +
                    "                        <div class=\"standfirst\">Just don't mention the memory business malarky</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 15:25\" data-epoch=\"1492529110\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/devops/\">DevOps</a>\n" +
                    "                     <a href=\"/2017/04/18/docker_linuxkit_moby/\" class=\"story_link\">\n" +
                    "                        <h4>Docker emits LinuxKit: You can probably guess what it does</h4>\n" +
                    "                        <div class=\"standfirst\">It's actually pretty nerdy but in a good way</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 15:00\" data-epoch=\"1492527604\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/security/\">Security</a>\n" +
                    "                     <a href=\"/2017/04/18/ransomware_offers_infection_dashboard/\" class=\"story_link\">\n" +
                    "                        <h4>Profit with just one infection! Crook sells ransomware for $175</h4>\n" +
                    "                        <div class=\"standfirst\">Nifty dashboard shows the bitcoin rolling in</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">16 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 14:47\" data-epoch=\"1492526828\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/business/policy/\">Policy</a>\n" +
                    "                     <a href=\"/2017/04/18/applications_to_work_in_us_drown_after_trumps_american_techies_first_rhetoric/\" class=\"story_link\">\n" +
                    "                        <h4>H-1B applications down after Trump's 'American techies first' rhetoric</h4>\n" +
                    "                        <div class=\"standfirst\">Silicon Valley wants foreigners, POTUS preparing to say no</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">12 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 14:09\" data-epoch=\"1492524548\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline with_image\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/software/\">Software</a>\n" +
                    "                     <a href=\"/2017/04/18/mozilla_kills_aurora/\" class=\"story_link\">\n" +
                    "                        <div class=\"story_grid_img\">\n" +
                    "                           <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"Firefox developer edition\" data-delay_url=\"https://regmedia.co.uk/2015/11/27/firefox_developer_edition2.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        </div>\n" +
                    "                        <h4>Mozilla abandons experimental Aurora Firefox channel</h4>\n" +
                    "                        <div class=\"standfirst\">New builds from Nightly to Beta</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">17 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 13:40\" data-epoch=\"1492522806\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline with_image\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/science/\">Science</a>\n" +
                    "                     <a href=\"/2017/04/18/satellite_collision_hazard_warning/\" class=\"story_link\">\n" +
                    "                        <div class=\"story_grid_img\">\n" +
                    "                           <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"Boeing's concept illustration of a Deep Space Transport at Mars\" data-delay_url=\"https://regmedia.co.uk/2017/04/04/boeing_deep_space_transport_concept.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        </div>\n" +
                    "                        <h4>New satellites could cause catastrophic space junk collisions</h4>\n" +
                    "                        <div class=\"standfirst\">Brit scientist warns of increased hazards from new constellations</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">37 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 13:05\" data-epoch=\"1492520707\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline with_image\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/security/\">Security</a>\n" +
                    "                     <a href=\"/2017/04/18/bcc_security_survey/\" class=\"story_link\">\n" +
                    "                        <div class=\"story_grid_img\">\n" +
                    "                           <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"Data breach\" data-delay_url=\"https://regmedia.co.uk/2016/07/19/data_breach_shutterstock.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        </div>\n" +
                    "                        <h4>Large UK businesses are getting pwned way more than smaller ones</h4>\n" +
                    "                        <div class=\"standfirst\">But are they just better at sniffing out breaches?</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">13 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 12:31\" data-epoch=\"1492518660\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/personal_tech/\">Personal Tech</a>\n" +
                    "                     <a href=\"/2017/04/18/windows_10_mobile_not_dead_after_all/\" class=\"story_link\">\n" +
                    "                        <h4>No, Microsoft is not 'killing Windows 10 Mobile'</h4>\n" +
                    "                        <div class=\"standfirst\">Not yet anyway</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">55 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 12:00\" data-epoch=\"1492516808\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/business/policy/\">Policy</a>\n" +
                    "                     <a href=\"/2017/04/18/snap_general_election_in_june/\" class=\"story_link\">\n" +
                    "                        <h4>Oh snap! UK Prime Minister Theresa May calls June election</h4>\n" +
                    "                        <div class=\"standfirst\">Bid to nix post-Brexit 'uncertainty and instability'</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">201 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 11:22\" data-epoch=\"1492514578\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/data_centre/cloud/\">Cloud</a>\n" +
                    "                     <a href=\"/2017/04/18/barracuda_barrels_steadily_along_no_fireworks_though/\" class=\"story_link\">\n" +
                    "                        <h4>Barracuda looks more like a flatfish in face of renewal period volatility</h4>\n" +
                    "                        <div class=\"standfirst\">Growth slows as subs replace boxes and renewals fluctuate</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 11:05\" data-epoch=\"1492513506\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/transformation/\">Transformation</a>\n" +
                    "                     <a href=\"/2017/04/18/protect_your_digital_enterprise_iso_27001_explainer/\" class=\"story_link\">\n" +
                    "                        <h4>So, you're 'ISO 27001 accredited', huh? Just saying so doesn't cut it</h4>\n" +
                    "                        <div class=\"standfirst\">All the hoops and how to jump through them on your way to information security</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">21 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 10:32\" data-epoch=\"1492511533\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/data_centre/virtualization/\">Virtualization</a>\n" +
                    "                     <a href=\"/2017/04/18/vmware_security_roundup/\" class=\"story_link\">\n" +
                    "                        <h4>vCenter's phone-home 'customer improvement' feature opened remote code execution hole</h4>\n" +
                    "                        <div class=\"standfirst\">VMware's also released first vSphere 6.5 hardening guide</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 10:02\" data-epoch=\"1492509731\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/business/policy/\">Policy</a>\n" +
                    "                     <a href=\"/2017/04/18/debian_revokes_dmitry_bogatovs_keys_in_case_hes_compromised_after_arrest/\" class=\"story_link\">\n" +
                    "                        <h4>Debian bins keys assigned to arrested Russian contributor</h4>\n" +
                    "                        <div class=\"standfirst\">If Dmitry Bogatov's been compromised, Debian needs to protect itself</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">19 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 09:36\" data-epoch=\"1492508171\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/data_centre/networks/\">Networks</a>\n" +
                    "                     <a href=\"/2017/04/18/mars_network_simulator/\" class=\"story_link\">\n" +
                    "                        <h4>NetAdmin challenge: Go to Mars, connect a rover, orbiter and three bases</h4>\n" +
                    "                        <div class=\"standfirst\">Research org releases VM to let you simulate it, plus other interplanetary networks</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 09:02\" data-epoch=\"1492506132\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/business/policy/\">Policy</a>\n" +
                    "                     <a href=\"/2017/04/18/google_settles_russian_antitrust_case/\" class=\"story_link\">\n" +
                    "                        <h4>Naked Androids to rampage across Russia</h4>\n" +
                    "                        <div class=\"standfirst\">Google settles antitrust case and pledges to open its OS to rival search engines and apps</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">18 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 08:28\" data-epoch=\"1492504090\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/science/\">Science</a>\n" +
                    "                     <a href=\"/2017/04/18/physicists_claim_to_create_negative_mass_in_ultracold_superfluid/\" class=\"story_link\">\n" +
                    "                        <h4>Feel guilty for scoffing Easter chocolate? Good news: Scientists have made NEGATIVE mass</h4>\n" +
                    "                        <div class=\"standfirst\">Vanish that flab using lasers to warp laws of physics</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">27 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 08:02\" data-epoch=\"1492502524\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/data_centre/cloud/\">Cloud</a>\n" +
                    "                     <a href=\"/2017/04/18/openstack_talks_down_intel_fears/\" class=\"story_link\">\n" +
                    "                        <h4>OpenStack: Pleeeeease stop panicking, Intel and Rackspace still love us</h4>\n" +
                    "                        <div class=\"standfirst\">Also, er, yeah, Chipzilla pulled the plug on that big project</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 07:08\" data-epoch=\"1492499287\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/security/\">Security</a>\n" +
                    "                     <a href=\"/2017/04/18/homograph_attack_again/\" class=\"story_link\">\n" +
                    "                        <h4>That apple.com link you clicked on? Yeah, it's actually Russian</h4>\n" +
                    "                        <div class=\"standfirst\">Didn't we fix this back in 2005? Apparently not</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">67 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 06:06\" data-epoch=\"1492495573\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/business/policy/\">Policy</a>\n" +
                    "                     <a href=\"/2017/04/18/457_visas_scrapped/\" class=\"story_link\">\n" +
                    "                        <h4>Australia scraps temporary visas for skilled workers</h4>\n" +
                    "                        <div class=\"standfirst\">Revise your plans for a long working holiday – the new visa will be tougher to score</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">23 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 05:01\" data-epoch=\"1492491709\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline with_image\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/data_centre/virtualization/\">Virtualization</a>\n" +
                    "                     <a href=\"/2017/04/18/codesharing_leads_to_widespread_bug_sharing/\" class=\"story_link\">\n" +
                    "                        <div class=\"story_grid_img\">\n" +
                    "                           <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"Shutterstock - Giant bug destroys ciy\" data-delay_url=\"https://regmedia.co.uk/2017/02/21/giant_bug_destroys_city_shutterstock.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        </div>\n" +
                    "                        <h4>Code-sharing leads to widespread bug sharing that black-hats can track</h4>\n" +
                    "                        <div class=\"standfirst\">Researchers find vulns in popular tutorials that have spread far and wide</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">19 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 03:58\" data-epoch=\"1492487889\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline with_image\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/business/policy/\">Policy</a>\n" +
                    "                     <a href=\"/2017/04/18/ebay_threatens_to_block_australians_from_using_offshore_sellers/\" class=\"story_link\">\n" +
                    "                        <div class=\"story_grid_img\">\n" +
                    "                           <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"Australian money at a crime scene\" data-delay_url=\"https://regmedia.co.uk/2016/07/20/australian_money_shutterstock.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        </div>\n" +
                    "                        <h4>eBay threatens to block Australians from using offshore sellers</h4>\n" +
                    "                        <div class=\"standfirst\">Plan to collect local sales tax from all sellers has tat bazaar, Amazon and others fuming</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">46 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 02:45\" data-epoch=\"1492483505\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline with_image\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/science/\">Science</a>\n" +
                    "                     <a href=\"/2017/04/18/nasa_agent_moon_rock_sting/\" class=\"story_link\">\n" +
                    "                        <div class=\"story_grid_img\">\n" +
                    "                           <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2017/04/18/nasa_pub_domain_neil_armstrong_moon.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        </div>\n" +
                    "                        <h4>NASA agent faces heat for 'degrading' moon rock sting during which grandmother wet herself</h4>\n" +
                    "                        <div class=\"standfirst\">Retiree grilled after trying to flog heirlooms to foot medical bills</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">96 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 02:09\" data-epoch=\"1492481352\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/data_centre/storage/\">Storage</a>\n" +
                    "                     <a href=\"/2017/04/18/freenas_downgrades_latest_release_to_tech_preview/\" class=\"story_link\">\n" +
                    "                        <h4>Embarrassing! FreeNAS downgrades latest release to 'tech preview'</h4>\n" +
                    "                        <div class=\"standfirst\">'Nearly half of users' rolled back due to 'general instability', so it's been taken behind the shed ...</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">17 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"18 Apr 01:46\" data-epoch=\"1492479972\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/data_centre/networks/\">Networks</a>\n" +
                    "                     <a href=\"/2017/04/17/obituary_bob_taylor/\" class=\"story_link\">\n" +
                    "                        <h4>RIP Bob Taylor: Internet, desktop PC pioneer powers down at 85</h4>\n" +
                    "                        <div class=\"standfirst\">        <span class=\"trailer\">Obit</span>Ex-NASA manager oversaw tech that grew into today's web, OSes</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">23 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"17 Apr 23:40\" data-epoch=\"1492472439\">5 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/personal_tech/\">Personal Tech</a>\n" +
                    "                     <a href=\"/2017/04/17/1980s_mac_emulator_live/\" class=\"story_link\">\n" +
                    "                        <h4>Mondays suck. So why not spend yours playing with an original Mac and games in your browser</h4>\n" +
                    "                        <div class=\"standfirst\">Welcome (back) to Macintosh!</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">31 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"17 Apr 21:41\" data-epoch=\"1492465269\">6 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/personal_tech/\">Personal Tech</a>\n" +
                    "                     <a href=\"/2017/04/17/sensenbrenner_blunder_after_privacy_criticism/\" class=\"story_link\">\n" +
                    "                        <h4>'Nobody's got to use the internet,' argues idiot congressman in row over ISP privacy rules</h4>\n" +
                    "                        <div class=\"standfirst\">Jim Sensenbrenner long on bluster, short on thought</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">175 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"17 Apr 19:58\" data-epoch=\"1492459108\">6 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/data_centre/\">Data Centre</a>\n" +
                    "                     <a href=\"/2017/04/17/intel_developer_forum_discontinued/\" class=\"story_link\">\n" +
                    "                        <h4>IDF now stands for Intel Ditches Frisco: Chipzilla axes annual tech conf</h4>\n" +
                    "                        <div class=\"standfirst\">Processors are like sausages, uh, you don't need to know how they're made, apparently</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">16 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"17 Apr 19:47\" data-epoch=\"1492458434\">6 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/devops/\">DevOps</a>\n" +
                    "                     <a href=\"/2017/04/17/oracle_wercker/\" class=\"story_link\">\n" +
                    "                        <h4>Oracle gets to Wercker, dines on container biz</h4>\n" +
                    "                        <div class=\"standfirst\">Larry goes Dutch on Docker support</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"17 Apr 18:23\" data-epoch=\"1492453387\">6 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/business/policy/\">Policy</a>\n" +
                    "                     <a href=\"/2017/04/17/what_does_regulating_algorithms_mean_and_how_do_we_even_do_it/\" class=\"story_link\">\n" +
                    "                        <h4>Regulate This! Time to subject algorithms to our laws</h4>\n" +
                    "                        <div class=\"standfirst\">        <span class=\"trailer\">Opinion</span>A <i>Minority Report</i> future awaits</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">108 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"17 Apr 08:00\" data-epoch=\"1492416013\">6 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/emergent_tech/\">Emergent Tech</a>\n" +
                    "                     <a href=\"/2017/04/15/apple_autonomous_vehicle_testing_permit_california/\" class=\"story_link\">\n" +
                    "                        <h4>Apple nabs permit to experiment with self-driving iCars in Cali</h4>\n" +
                    "                        <div class=\"standfirst\">Race to robo ride glory continues to heat up</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">53 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"15 Apr 08:39\" data-epoch=\"1492245553\">8 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/security/\">Security</a>\n" +
                    "                     <a href=\"/2017/04/14/latest_shadow_brokers_data_dump/\" class=\"story_link\">\n" +
                    "                        <h4>Leaked NSA point-and-pwn hack tools menace Win2k to Windows 8</h4>\n" +
                    "                        <div class=\"standfirst\">        <span class=\"trailer\">Updated</span>Microsoft claims it has patched most of the exploited bugs</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">93 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"14 Apr 23:29\" data-epoch=\"1492212561\">8 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/business/policy/\">Policy</a>\n" +
                    "                     <a href=\"/2017/04/14/eff_countersues_patent/\" class=\"story_link\">\n" +
                    "                        <h4>'Tech troll' sues EFF to silence 'Stupid Patent of the Month' blog. Now the EFF sues back</h4>\n" +
                    "                        <div class=\"standfirst\">GEMSA, meet Streisand</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">111 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"14 Apr 20:56\" data-epoch=\"1492203394\">9 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/security/\">Security</a>\n" +
                    "                     <a href=\"/2017/04/14/mysql_security_hole/\" class=\"story_link\">\n" +
                    "                        <h4>All ready for that Easter holiday? Here's a mild MySQL security bug</h4>\n" +
                    "                        <div class=\"standfirst\">Panic over the Riddle flaw – or just update to version 5.7. Your choice. We're not your dad</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"14 Apr 19:54\" data-epoch=\"1492199692\">9 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/emergent_tech/artificial_intelligence/\">Artificial Intelligence</a>\n" +
                    "                     <a href=\"/2017/04/14/ai_racial_gender_biases_like_humans/\" class=\"story_link\">\n" +
                    "                        <h4>Good job, everyone. We're making AI just as tediously racist and sexist as ourselves</h4>\n" +
                    "                        <div class=\"standfirst\">Machines are more like us than once thought</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">51 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"14 Apr 19:30\" data-epoch=\"1492198243\">9 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline with_image\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/personal_tech/\">Personal Tech</a>\n" +
                    "                     <a href=\"/2017/04/14/uber_drink_driving_probe/\" class=\"story_link\">\n" +
                    "                        <div class=\"story_grid_img\">\n" +
                    "                           <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"Uber safety marketing\" data-delay_url=\"https://regmedia.co.uk/2017/02/24/uber_marketing_safe_rides.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        </div>\n" +
                    "                        <h4>Super Cali goes ballistic, Uber drivers are stocious (allegedly!)</h4>\n" +
                    "                        <div class=\"standfirst\">        <span class=\"trailer\">Updated</span>This app maker's policies are something quite atrocious</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">28 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"14 Apr 18:43\" data-epoch=\"1492195405\">9 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline with_image\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/personal_tech/\">Personal Tech</a>\n" +
                    "                     <a href=\"/2017/04/14/ad_blockers_identify_you_to_advertisers/\" class=\"story_link\">\n" +
                    "                        <div class=\"story_grid_img\">\n" +
                    "                           <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"\" data-delay_url=\"https://regmedia.co.uk/2017/04/14/tracker.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        </div>\n" +
                    "                        <h4>Alert: Using a web ad blocker may identify you – to advertisers</h4>\n" +
                    "                        <div class=\"standfirst\">There's no escape muhaha</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">93 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"14 Apr 18:24\" data-epoch=\"1492194266\">9 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline with_image\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/business/\">Business</a>\n" +
                    "                     <a href=\"/2017/04/14/infosys_full_year_fy2017_results/\" class=\"story_link\">\n" +
                    "                        <div class=\"story_grid_img\">\n" +
                    "                           <img src=\"https://regmedia.co.uk/2016/04/14/dl.gif\" alt=\"Bait\" data-delay_url=\"https://regmedia.co.uk/2016/08/25/bait_and_switch_shutterstock.jpg?x=198&amp;y=131&amp;crop=1\" height=\"131\" width=\"198\">\n" +
                    "                        </div>\n" +
                    "                        <h4>Infosys says it'll hand shareholders $2bn</h4>\n" +
                    "                        <div class=\"standfirst\">Its stock price then dipped</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"14 Apr 11:01\" data-epoch=\"1492167677\">9 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/data_centre/storage/\">Storage</a>\n" +
                    "                     <a href=\"/2017/04/14/storage_easter_eggs/\" class=\"story_link\">\n" +
                    "                        <h4>Not even Easter can stop the inexorable march of storage</h4>\n" +
                    "                        <div class=\"standfirst\">Put down the chocolate, catch up on the hottest industry news</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"time_stamp\"><span title=\"14 Apr 10:00\" data-epoch=\"1492164007\">9 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/business/policy/\">Policy</a>\n" +
                    "                     <a href=\"/2017/04/14/facebook_new_laws_not_answer/\" class=\"story_link\">\n" +
                    "                        <h4>Deeming Facebook a 'publisher' of users' posts won't tackle paedo or terrorist content</h4>\n" +
                    "                        <div class=\"standfirst\">        <span class=\"trailer\">Comment</span>Tackle the message, not the message-bearer</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">50 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"14 Apr 09:00\" data-epoch=\"1492160413\">9 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/emergent_tech/\">Emergent Tech</a>\n" +
                    "                     <a href=\"/2017/04/14/switch_on_your_smartphone_camera_and_look_how_fertile_i_am/\" class=\"story_link\">\n" +
                    "                        <h4>Switch on your smartphone camera and look how fertile I am</h4>\n" +
                    "                        <div class=\"standfirst\">        <span class=\"trailer\">Something for the Weekend, Sir?</span>Come as you are (every seed is sacred)</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">44 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"14 Apr 08:00\" data-epoch=\"1492156813\">9 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"headline_row hidden\">\n" +
                    "                  <div class=\"first_headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/security/\">Security</a>\n" +
                    "                     <a href=\"/2017/04/14/sysadmin_crash_former_employers_oracle_db/\" class=\"story_link\">\n" +
                    "                        <h4>Sysadmin 'trashed old bosses' Oracle database with ticking logic bomb'</h4>\n" +
                    "                        <div class=\"standfirst\">Always ensure the office laptop gets returned</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">68 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"14 Apr 07:04\" data-epoch=\"1492153444\">9 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/security/\">Security</a>\n" +
                    "                     <a href=\"/2017/04/14/new_critical_linux_kernel_flaw/\" class=\"story_link\">\n" +
                    "                        <h4>Linux remote root bug menace: Make sure your servers, PCs, gizmos, Android kit are patched</h4>\n" +
                    "                        <div class=\"standfirst\">Ping of pwn: Malicious UDP packets may take over gear</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">30 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"14 Apr 01:25\" data-epoch=\"1492133146\">9 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"headline\">\n" +
                    "                     <a class=\"section_name alt_colour dcl\" href=\"/transformation/\">Transformation</a>\n" +
                    "                     <a href=\"/2017/04/13/microsoft_kills_support_old_windows_on_new_chips/\" class=\"story_link\">\n" +
                    "                        <h4>Microsoft raises pistol, pulls the trigger on Windows 7, 8 updates for new Intel, AMD chips</h4>\n" +
                    "                        <div class=\"standfirst\">Don't want to use Windows 10? Then you don't want any fixes</div>\n" +
                    "                        <div class=\"time_comments\">\n" +
                    "                           <div class=\"comment\">224 Comments</div>\n" +
                    "                           <div class=\"time_stamp\"><span title=\"13 Apr 23:37\" data-epoch=\"1492126645\">9 days</span></div>\n" +
                    "                        </div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <p id=\"nearby-index\" class=\"alt_colour dcl\">\n" +
                    "                  <a href=\"/Archive/2017/04/\">Older stories</a>\n" +
                    "               </p>\n" +
                    "               <script>$(function() { rolling_time() });</script>\n" +
                    "            </div>\n" +
                    "         </div>\n" +
                    "         <div id=\"right-col\">\n" +
                    "            <div id=\"ad-mu1-spot\" class=\"adu\">\n" +
                    "               <script>\n" +
                    "                  show_gpt('ad-mu1-spot');\n" +
                    "               </script>\n" +
                    "               <noscript>\n" +
                    "                  <a href=\"https://pubads.g.doubleclick.net/gampad/jump?iu=/6978/reg_homepage/front&amp;sz=300x250%7C300x600%7C300x1050&amp;tile=3&amp;c=33WPyIQ8CoyKcAAIZTz0YAAAAp&amp;t=ct%3Dns%26unitnum%3D3%26unitname%3Dwww_top_mpu%26pos%3Dtop%26test%3D0\" target=\"_blank\">\n" +
                    "                  <img src=\"https://pubads.g.doubleclick.net/gampad/ad?iu=/6978/reg_homepage/front&amp;sz=300x250%7C300x600%7C300x1050&amp;tile=3&amp;c=33WPyIQ8CoyKcAAIZTz0YAAAAp&amp;t=ct%3Dns%26unitnum%3D3%26unitname%3Dwww_top_mpu%26pos%3Dtop%26test%3D0\" alt=\"\">\n" +
                    "                  </a>\n" +
                    "               </noscript>\n" +
                    "            </div>\n" +
                    "            <iframe src=\"https://dda.regmedia.co.uk/research/mpu.html?20160317\" style=\"border:1px solid #CCC\" height=\"255\" width=\"300\" frameborder=\"0\"></iframe>\n" +
                    "            <div id=\"hot\">\n" +
                    "               <h3>Most read</h3>\n" +
                    "               <ol>\n" +
                    "                  <li>\n" +
                    "                     <a href=\"https://www.theregister.co.uk/2017/04/22/devuan_1_0_0_released/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2017/04/21/devuan_linux_logo.jpg?x=88&amp;y=58&amp;crop=1\" alt=\"Devuan logo\" height=\"58\" width=\"88\">\n" +
                    "                        <h4><code>systemd</code>-free Devuan Linux hits version 1.0.0\n" +
                    "                        </h4>\n" +
                    "                     </a>\n" +
                    "                  </li>\n" +
                    "                  <li>\n" +
                    "                     <a href=\"https://www.theregister.co.uk/2017/04/21/china_accused_south_korea_hack/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2017/04/21/china_hacking_shutterstock.jpg?x=88&amp;y=58&amp;crop=1\" alt=\"china hacking\" height=\"58\" width=\"88\">\n" +
                    "                        <h4>China 'hacked' South Korea to wreck Star Wars missile shield\n" +
                    "                        </h4>\n" +
                    "                     </a>\n" +
                    "                  </li>\n" +
                    "                  <li>\n" +
                    "                     <a href=\"https://www.theregister.co.uk/2017/04/22/museum_of_failure_includes_tech/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2015/12/01/fail_87346456756.jpg?x=88&amp;y=58&amp;crop=1\" alt=\"\" height=\"58\" width=\"88\">\n" +
                    "                        <h4>Would you believe it? The Museum of Failure contains quite a few pieces of technology\n" +
                    "                        </h4>\n" +
                    "                     </a>\n" +
                    "                  </li>\n" +
                    "                  <li>\n" +
                    "                     <a href=\"https://www.theregister.co.uk/2017/04/21/windows_10_cloud_specs/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2017/04/21/schoolkids_shutterstock.jpg?x=88&amp;y=58&amp;crop=1\" alt=\"schoolkids\" height=\"58\" width=\"88\">\n" +
                    "                        <h4>Base specs leak for Windows 10 Cloud – Microsoft's wannabe ChromeOS assassin\n" +
                    "                        </h4>\n" +
                    "                     </a>\n" +
                    "                  </li>\n" +
                    "                  <li>\n" +
                    "                     <a href=\"https://www.theregister.co.uk/2017/04/21/met_police_gun_owner_data_breach_questions/\">\n" +
                    "                        <img src=\"https://regmedia.co.uk/2017/04/21/stashedgun.jpg?x=88&amp;y=58&amp;crop=1\" alt=\"\" height=\"58\" width=\"88\">\n" +
                    "                        <h4>Shooting org demands answers from Met Police over gun owner blab\n" +
                    "                        </h4>\n" +
                    "                     </a>\n" +
                    "                  </li>\n" +
                    "               </ol>\n" +
                    "            </div>\n" +
                    "            <div id=\"ad-btn-spot\" class=\"adu\">\n" +
                    "               <script>\n" +
                    "                  show_gpt('ad-btn-spot');\n" +
                    "               </script>\n" +
                    "               <noscript>\n" +
                    "                  <a href=\"https://pubads.g.doubleclick.net/gampad/jump?iu=/6978/reg_homepage/front&amp;sz=300x100%7C300x250&amp;tile=4&amp;c=44WPyIQ8CoyKcAAIZTz0YAAAAp&amp;t=ct%3Dns%26unitnum%3D4%26unitname%3Dwww_mid_mpu%26pos%3Dmid%26test%3D0\" target=\"_blank\">\n" +
                    "                  <img src=\"https://pubads.g.doubleclick.net/gampad/ad?iu=/6978/reg_homepage/front&amp;sz=300x100%7C300x250&amp;tile=4&amp;c=44WPyIQ8CoyKcAAIZTz0YAAAAp&amp;t=ct%3Dns%26unitnum%3D426unitname%3Dwww_mid_mpu%26pos%3Dmid%26test%3D0\" alt=\"\">\n" +
                    "                  </a>\n" +
                    "               </noscript>\n" +
                    "            </div>\n" +
                    "            <div id=\"ad-mu2-spot\" class=\"adu\">\n" +
                    "               <script>\n" +
                    "                  show_gpt('ad-mu2-spot');\n" +
                    "               </script>\n" +
                    "               <noscript>\n" +
                    "                  <a href=\"https://pubads.g.doubleclick.net/gampad/jump?iu=/6978/reg_homepage/front&amp;sz=300x250&amp;tile=5&amp;c=55WPyIQ8CoyKcAAIZTz0YAAAAp&amp;t=ct%3Dns%26unitnum%3D5%26unitname%3Dwww_btm_mpu%26pos%3Dbtm%26test%3D0\" target=\"_blank\">\n" +
                    "                  <img src=\"https://pubads.g.doubleclick.net/gampad/ad?iu=/6978/reg_homepage/front&amp;sz=300x250&amp;tile=5&amp;c=55WPyIQ8CoyKcAAIZTz0YAAAAp&amp;t=ct%3Dns%26unitnum%3D5%26unitname%3Dwww_btm_mpu%26pos%3Dbtm%26test%3D0\" alt=\"\">\n" +
                    "                  </a>\n" +
                    "               </noscript>\n" +
                    "            </div>\n" +
                    "            <iframe src=\"https://dda.regmedia.co.uk/research/mpu.html?20160317\" style=\"border:1px solid #CCC\" height=\"255\" width=\"300\" frameborder=\"0\"></iframe>\n" +
                    "            <div id=\"spotlight\">\n" +
                    "               <h3>Spotlight</h3>\n" +
                    "               <a href=\"https://www.theregister.co.uk/2017/04/21/mad_native_cloud_skill/\" class=\"story\">\n" +
                    "                  <img src=\"https://regmedia.co.uk/2017/04/21/exam_photo_via_shutterstock.jpg?x=298&amp;y=160&amp;crop=1\" alt=\"Exam photo via Shutterstock\" title=\"Going native\" data-stand_url=\"https://regmedia.co.uk/2017/04/21/exam_photo_via_shutterstock.jpg?x=298&amp;y=160&amp;crop=1\" height=\"160\" width=\"298\">\n" +
                    "                  <h4 class=\"text\">Cloud students, pay attention! Exam plans promise fresh skills</h4>\n" +
                    "               </a>\n" +
                    "               <a href=\"https://www.theregister.co.uk/2017/04/19/back_up_rpo_0/\" class=\"story\">\n" +
                    "                  <img src=\"https://regmedia.co.uk/2017/04/19/burned_out_van_photo_via_shutterstock.jpg?x=298&amp;y=160&amp;crop=1\" alt=\"Burned out van photo via Shutterstock\" title=\"Cast-iron storage policies\" data-stand_url=\"https://regmedia.co.uk/2017/04/19/burned_out_van_photo_via_shutterstock.jpg?x=298&amp;y=160&amp;crop=1\" height=\"160\" width=\"298\">\n" +
                    "                  <h4 class=\"text\">Data trashed? When RPO 0 isn't enough</h4>\n" +
                    "               </a>\n" +
                    "               <a href=\"https://www.theregister.co.uk/2017/04/19/speaking_in_tech_episode_257/\" class=\"story\">\n" +
                    "                  <img src=\"https://regmedia.co.uk/2017/04/19/willy-wonka-meme.jpg?x=298&amp;y=160&amp;crop=1\" alt=\"\" title=\"Podcast: Hacker whizz and Veracode co-founder Chris Wysopal joins the crew this week to talk secure software\" data-stand_url=\"https://regmedia.co.uk/2017/04/19/willy-wonka-meme.jpg?x=298&amp;y=160&amp;crop=1\" height=\"160\" width=\"298\">\n" +
                    "                  <h4 class=\"text\">Speaking in Tech: Hacking Microsoft Windows? That's cute</h4>\n" +
                    "               </a>\n" +
                    "               <a href=\"https://www.theregister.co.uk/2017/04/19/firefox_a_call_to_freedom/\" class=\"story\">\n" +
                    "                  <img src=\"https://regmedia.co.uk/2017/04/18/soliders_marching_photo_via_shutterstock.jpg?x=298&amp;y=160&amp;crop=1\" alt=\"Soliders marching photo via Shutterstock\" title=\"Open Source Insider: Do we really want Chrome hegemony?\" data-stand_url=\"https://regmedia.co.uk/2017/04/18/soliders_marching_photo_via_shutterstock.jpg?x=298&amp;y=160&amp;crop=1\" height=\"160\" width=\"298\">\n" +
                    "                  <h4 class=\"text\">Why Firefox? Because not <i>everybody</i> is a web designer, silly</h4>\n" +
                    "               </a>\n" +
                    "               <a href=\"https://www.theregister.co.uk/2017/04/17/what_does_regulating_algorithms_mean_and_how_do_we_even_do_it/\" class=\"story\">\n" +
                    "                  <img src=\"https://regmedia.co.uk/2017/04/13/west_world_original_poster2.jpg?x=298&amp;y=160&amp;crop=1\" alt=\"West world original poster\" title=\"Opinion: A Minority Report future awaits\" data-stand_url=\"https://regmedia.co.uk/2017/04/13/west_world_original_poster2.jpg?x=298&amp;y=160&amp;crop=1\" height=\"160\" width=\"298\">\n" +
                    "                  <h4 class=\"text\">Regulate This! Time to subject algorithms to our laws</h4>\n" +
                    "               </a>\n" +
                    "               <a href=\"https://www.theregister.co.uk/2017/04/14/facebook_new_laws_not_answer/\" class=\"story\">\n" +
                    "                  <img src=\"https://regmedia.co.uk/2015/11/11/facebook_984756456.jpg?x=298&amp;y=160&amp;crop=1\" alt=\"\" title=\"Comment: Tackle the message, not the message-bearer\" data-stand_url=\"https://regmedia.co.uk/2015/11/11/facebook_984756456.jpg?x=298&amp;y=160&amp;crop=1\" height=\"160\" width=\"298\">\n" +
                    "                  <h4 class=\"text\">Deeming Facebook a 'publisher' of users' posts won't tackle paedo or terrorist content</h4>\n" +
                    "               </a>\n" +
                    "               <a href=\"https://www.theregister.co.uk/2017/04/14/switch_on_your_smartphone_camera_and_look_how_fertile_i_am/\" class=\"story\">\n" +
                    "                  <img src=\"https://regmedia.co.uk/2015/11/25/baby_bottle_teaser.jpg?x=298&amp;y=160&amp;crop=1\" alt=\"\" title=\"Something for the Weekend, Sir?: Come as you are (every seed is sacred)\" data-stand_url=\"https://regmedia.co.uk/2015/11/25/baby_bottle_teaser.jpg?x=298&amp;y=160&amp;crop=1\" height=\"160\" width=\"298\">\n" +
                    "                  <h4 class=\"text\">Switch on your smartphone camera and look how fertile I am</h4>\n" +
                    "               </a>\n" +
                    "               <a href=\"https://www.theregister.co.uk/2017/04/13/graphite_and_open_source_monitoring/\" class=\"story\">\n" +
                    "                  <img src=\"https://regmedia.co.uk/2016/07/27/heartbeat_shutterstock.jpg?x=298&amp;y=160&amp;crop=1\" alt=\"Heartbeat graph\" title=\"But why would you want to?\" data-stand_url=\"https://regmedia.co.uk/2016/07/27/heartbeat_shutterstock.jpg?x=298&amp;y=160&amp;crop=1\" height=\"160\" width=\"298\">\n" +
                    "                  <h4 class=\"text\">Graphite core? There are other ways to monitor your operation's heart</h4>\n" +
                    "               </a>\n" +
                    "            </div>\n" +
                    "         </div>\n" +
                    "         <div id=\"boot\">\n" +
                    "            <div zq3ryvs=\"\" id=\"ad-tlr-spot\" class=\"adu\" hidden=\"\">\n" +
                    "               <script>show_gpt('ad-tlr-spot');</script>\n" +
                    "               <noscript>\n" +
                    "                  <a href=\"https://pubads.g.doubleclick.net/gampad/jump?iu=/6978/reg_homepage/front&amp;sz=728x90%7C970x90&amp;tile=6&amp;c=66WPyIQ8CoyKcAAIZTz0YAAAAp&amp;t=ct%3Dns%26unitnum%3D6%26unitname%3Dwww_btm_leader%26pos%3Dbtm%26test%3D0\" target=\"_blank\">\n" +
                    "                  <img src=\"https://pubads.g.doubleclick.net/gampad/ad?iu=/6978/reg_homepage/front&amp;sz=728x90%7C970x90&amp;tile=6&amp;c=66WPyIQ8CoyKcAAIZTz0YAAAAp&amp;t=ct%3Dns%26unitnum%3D6%26unitname%3Dwww_btm_leader%26pos%3Dbtm%26test%3D0\" alt=\"\">\n" +
                    "                  </a>\n" +
                    "               </noscript>\n" +
                    "            </div>\n" +
                    "         </div>\n" +
                    "         <div id=\"footer\">\n" +
                    "            <div class=\"foot_wrapper\">\n" +
                    "               <div class=\"left_block\">\n" +
                    "                  <div class=\"foot_list alt_colour dcl\">\n" +
                    "                     <h4>About us<img alt=\"\" src=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icon/footer_mob_nav_arrow_black.svg\" class=\"expand_arrow\" width=\"7\"></h4>\n" +
                    "                     <ul>\n" +
                    "                        <li><a href=\"https://www.theregister.co.uk/Profile/about_the_register/\">Who we are</a></li>\n" +
                    "                        <li><a href=\"https://www.theregister.co.uk/about/company/website/\">Under the hood</a></li>\n" +
                    "                        <li><a href=\"https://www.theregister.co.uk/about/company/contact/\">Contact us</a></li>\n" +
                    "                        <li><a target=\"_blank\" href=\"http://situationpublishing.com/ad-specs/\">Advertise with us</a></li>\n" +
                    "                     </ul>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"foot_list more_us alt_colour dcl\">\n" +
                    "                     <h4>More content<img alt=\"\" src=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icon/footer_mob_nav_arrow_black.svg\" class=\"expand_arrow\" width=\"7\"></h4>\n" +
                    "                     <ul>\n" +
                    "                        <li><a href=\"https://www.theregister.co.uk/Week/\">Week’s headlines</a></li>\n" +
                    "                        <li><a href=\"https://www.theregister.co.uk/Popular/\">Top 20 stories</a></li>\n" +
                    "                        <li><a href=\"https://account.theregister.co.uk/alert/?create=1\">Alerts</a></li>\n" +
                    "                        <li><a href=\"https://whitepapers.theregister.co.uk/\">Whitepapers</a></li>\n" +
                    "                     </ul>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"foot_list what_else alt_colour dcl\">\n" +
                    "                     <h4>Situation Publishing<img alt=\"\" src=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icon/footer_mob_nav_arrow_black.svg\" class=\"expand_arrow\" width=\"7\"></h4>\n" +
                    "                     <ul>\n" +
                    "                        <li><a href=\"http://www.nextplatform.com/\">The Next Platform</a></li>\n" +
                    "                        <li><a href=\"http://www.continuouslifecycle.london/\">Continuous Lifecycle London</a></li>\n" +
                    "                        <li><a href=\"http://www.mcubed.london/\">M-cubed</a></li>\n" +
                    "                        <li><a href=\"https://whitepapers.theregister.co.uk/events/list\">Webinars</a></li>\n" +
                    "                     </ul>\n" +
                    "                  </div>\n" +
                    "                  <span class=\"foot_delim\"></span>\n" +
                    "                  <div class=\"reg_foot\">\n" +
                    "                     <a href=\"http://situationpublishing.com/\" id=\"sitpub_logo\">\n" +
                    "                     <img alt=\"Situation Publishing\" src=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icon/sitpub_footer.png\" srcset=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icon/sitpub_footer.svg\" height=\"51\" width=\"132\">\n" +
                    "                     </a>\n" +
                    "                     <p class=\"foot_desc\"><strong>The Register</strong> - Independent news, views and opinion for the tech sector. Part of Situation Publishing</p>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <div class=\"right_block\">\n" +
                    "                  <div class=\"newsletter_signup alt_colour dcl\">\n" +
                    "                     <h4>Sign up to our Newsletters</h4>\n" +
                    "                     <p>Join our daily or weekly newsletters, subscribe to a specific section or set <a href=\"https://account.theregister.co.uk/alert/?create=1\">News alerts</a></p>\n" +
                    "                     <a class=\"subscribe_button\" href=\"https://account.theregister.co.uk/register/?product=thereg_daily_newsletter\">Subscribe<img alt=\"\" src=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icon/footer_mob_nav_arrow_white.svg\" width=\"7\"></a>\n" +
                    "                  </div>\n" +
                    "                  <div class=\"social alt_colour dcl\">\n" +
                    "                     <div id=\"follow_btns\">\n" +
                    "                        <a id=\"follow_us_twitter\" href=\"https://twitter.com/intent/user?screen_name=theregister\" title=\"Follow us on twitter\" target=\"_blank\" class=\"twit\">\n" +
                    "                           <div class=\"circ\">\n" +
                    "                              <img alt=\"Twitter\" src=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icon/twitter.png\" srcset=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icon/twitter.svg\" height=\"18\" width=\"18\">\n" +
                    "                           </div>\n" +
                    "                        </a>\n" +
                    "                        <a href=\"https://www.facebook.com/VultureCentral\" title=\"Like us on Facebook\" target=\"_blank\" class=\"fbook\">\n" +
                    "                           <div class=\"circ\">\n" +
                    "                              <img alt=\"Facebook\" src=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icon/facebook.png\" srcset=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icon/facebook.svg\" height=\"18\" width=\"18\">\n" +
                    "                           </div>\n" +
                    "                        </a>\n" +
                    "                        <a href=\"https://www.linkedin.com/company/the-register\" title=\"Follow us on LinkedIn\" target=\"_blank\" class=\"linkin\">\n" +
                    "                           <div class=\"circ\">\n" +
                    "                              <img alt=\"LinkedIn\" src=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icon/linkedin_white.png\" srcset=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icon/linkedin_white.svg\" height=\"18\" width=\"18\">\n" +
                    "                           </div>\n" +
                    "                        </a>\n" +
                    "                        <a href=\"https://www.theregister.co.uk/Design/page/feeds.html\" title=\"Follow our RSS\" target=\"_blank\" class=\"rss_feed\">\n" +
                    "                           <div class=\"circ\">\n" +
                    "                              <img alt=\"feeds\" src=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icon/rss.png\" srcset=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icon/rss.svg\" height=\"18\" width=\"18\">\n" +
                    "                           </div>\n" +
                    "                        </a>\n" +
                    "                     </div>\n" +
                    "                     <a href=\"https://m.theregister.co.uk\" id=\"mob_site\">\n" +
                    "                        <div class=\"circ\"><img alt=\"Mobile site\" src=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icon/mobile_site.png\" srcset=\"/design_picker/c00f80f04b0eaf0123d821f6c9488fc1cb55fd0a/graphics/icon/mobile_site.svg\" height=\"60\" width=\"120\"></div>\n" +
                    "                     </a>\n" +
                    "                  </div>\n" +
                    "               </div>\n" +
                    "               <noscript><img src=\"/Design/graphics/std/transparent_pixel.png\" alt=\"no-js\"></noscript>\n" +
                    "            </div>\n" +
                    "            <img style=\"position:absolute\" src=\"https://go.theregister.co.uk/k/abt_b\" alt=\"\" height=\"1\" width=\"1\">\n" +
                    "         </div>\n" +
                    "         <div id=\"foot_btm\">\n" +
                    "            <p>Biting the hand that feeds IT © 1998–2017</p>\n" +
                    "            <div class=\"foot_btm_links\">\n" +
                    "               <a href=\"https://www.theregister.co.uk/Profile/cookies/\">Cookies</a>\n" +
                    "               <a href=\"https://www.theregister.co.uk/about/company/privacy/\">Privacy</a>\n" +
                    "               <a href=\"https://www.theregister.co.uk/Profile/terms_and_conditions_of_use/\">Ts&amp;Cs</a>\n" +
                    "            </div>\n" +
                    "         </div>\n" +
                    "         <div id=\"end_scripts\">\n" +
                    "            <script>\n" +
                    "               $(function() {\n" +
                    "                   if ($('#tags.article_unit').length) {\n" +
                    "                       var ab_set = {\n" +
                    "                           view_tracking:  'true',\n" +
                    "                           click_tracking: 'true',\n" +
                    "                           click_target:   '#tags.article_unit a',\n" +
                    "                           group:          'F (full grey boxed)',\n" +
                    "                           name:           'AB: Tags 2015'\n" +
                    "                       };\n" +
                    "                       track_bucket_user(ab_set);\n" +
                    "                   }\n" +
                    "               });\n" +
                    "               \n" +
                    "               $(function() {\n" +
                    "                   if ($('#tags.article_unit').length) {\n" +
                    "                       var ab_set_2 = {\n" +
                    "                           view_tracking:  'true',\n" +
                    "                           click_tracking: 'true',\n" +
                    "                           click_target:   '#crumb_trail a',\n" +
                    "                           group:          'F (full grey boxed)',\n" +
                    "                           name:           'AB: Crumbtrail 2015'\n" +
                    "                       };\n" +
                    "                       track_bucket_user(ab_set_2);\n" +
                    "                   }\n" +
                    "               });\n" +
                    "            </script>        <script>\n" +
                    "               googletag.cmd.push(function() { \n" +
                    "                   var abt1 = '<img style=\"position:absolute\" src=\"https://go.theregister.co.uk/k/abt_';\n" +
                    "                   var abt2 = '\" width=1 height=1 alt=\"\">';\n" +
                    "                   var ch = 0;\n" +
                    "                   $('.adu').each(function(i) {\n" +
                    "                       ch += $(this).height();\n" +
                    "                   });\n" +
                    "                   if (ch == 0 && !ad_free()) {\n" +
                    "                       $(\"#footer\").append($(abt1 + 'b' + abt2));\n" +
                    "                       $('#ad-mu1-spot,#ad-mu2-spot').after('<iframe src=\"https://dda.regmedia.co.uk/research/mpu.html?20160317\" width=300 height=255 frameborder=0 style=\"border:1px solid #CCC\"></iframe>');\n" +
                    "                   }\n" +
                    "                   else {\n" +
                    "                       $(\"#footer\").append($(abt1 + 'a' + abt2));\n" +
                    "                   }\n" +
                    "               });\n" +
                    "            </script>\n" +
                    "            <script>\n" +
                    "               (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){\n" +
                    "               (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\n" +
                    "               m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\n" +
                    "               })(window,document,'script','//www.google-analytics.com/analytics.js','ga');\n" +
                    "               \n" +
                    "               ga('create', 'UA-33330076-1', 'theregister.co.uk', { 'allowLinker': true });\n" +
                    "               ga('require', 'linker');\n" +
                    "               ga('linker:autoLink', ['channelregister.co.uk']);\n" +
                    "               ga('require', 'displayfeatures');\n" +
                    "               ga('set', 'dimension2', (typeof RegArticle != 'undefined') ? RegArticle.author : '');\n" +
                    "               ga('set', 'dimension3', (typeof RegSection != 'undefined') ? RegSection : '');\n" +
                    "               ga('set', 'dimension4', (typeof RegArticle != 'undefined' ? (RegArticle.pf ? 'p' : (RegArticle.cp ? 'c' : 'a')) : 'i'));\n" +
                    "               ga('set', 'dimension5', (typeof RegArticle != 'undefined') ? RegArticle.cat : '');\n" +
                    "               ga('set', 'dimension6', (typeof RegArticle != 'undefined') ? RegArticle.ads : '');\n" +
                    "               ga('send', 'pageview');\n" +
                    "            </script>\n" +
                    "            <script>\n" +
                    "               (function() {\n" +
                    "               var d=document,h=d.getElementsByTagName('head')[0],s=d.createElement('script');\n" +
                    "               s.type='text/javascript';\n" +
                    "               s.async=true;\n" +
                    "               s.src='https://s.dpmsrv.com/dpm_812ed4562d3211363a7b813aa9cd2cf042b63bb2.min.js';\n" +
                    "               h.appendChild(s);\n" +
                    "               })();\n" +
                    "            </script>\n" +
                    "            <script>\n" +
                    "               $(function() { set_bucket_group(199) });\n" +
                    "            </script>\n" +
                    "            <div id=\"fb-root\"></div>\n" +
                    "         </div>\n" +
                    "      </div>\n" +
                    "   </body>\n" +
                    "</html>\n" +
                    "\n");
}