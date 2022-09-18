package FacadePattern;



/* Structural Design Pattern : They improve the structure of java code . */
/* When should we use Facade Pattern ?? Facade Pattern is used when : A simple interface is required to access
a complex system.
 */

public class FacadeMain {
    public static void main(String [] args){
        String test = "CheckElementPresent";
        HelperFacade.generateReports("firefox", "html", test);
        HelperFacade.generateReports("firefox", "junit", test);
        HelperFacade.generateReports("chrome", "html", test);
        HelperFacade.generateReports("chrome", "junit", test);

    }
}
