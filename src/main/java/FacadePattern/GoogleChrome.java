package FacadePattern;

import java.sql.Driver;

public class GoogleChrome {

    public static Driver getGoogleChromeDriver(){
        return null;
    }
    public static void generateHTMLReport(String test , Driver driver ){
        System.out.println("Generating HTML Report for Google Chrome Driver ");
    }
    public static void generateJUnitReport(String test , Driver driver ){
        System.out.println("Generating JUNIT Report for Google Chrome Driver ");
    }
}
