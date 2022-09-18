package FacadePattern;

import java.sql.Driver;
import java.time.Clock;

public class FireFox {
    public static Driver getFireFoxDriver(){
        return null;
    }
    public static void generateHTMLReport(String test , Driver driver ){
        System.out.println("Generating HTML Report for Firefox Driver ");
    }
    public static void generateJUnitReport(String test , Driver driver ){
        System.out.println("Generating JUNIT Report for Firefox Driver ");
    }
}
