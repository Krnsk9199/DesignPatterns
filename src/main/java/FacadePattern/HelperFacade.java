package FacadePattern;

import java.sql.Driver;

public class HelperFacade {
    public static void generateReports(String explorer, String report, String test) {
        Driver driver = null;
        switch (explorer) {
            case  "firefox" :
                driver = FireFox.getFireFoxDriver();
                switch (report){
                    case "html":
                        FireFox.generateHTMLReport(test,driver);
                        break;
                    case "junit":
                        FireFox.generateJUnitReport(test,driver);
                }
                break;
            case "chrome":
                driver = GoogleChrome.getGoogleChromeDriver();
                switch (report){
                    case "html":
                        GoogleChrome.generateHTMLReport(test,driver);
                        break;
                    case "junit":
                        GoogleChrome.generateJUnitReport(test,driver);
                }
                break;

        }
    }
}
