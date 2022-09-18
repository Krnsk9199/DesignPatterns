package TemplateMethodPattern;

/** Template Design Pattern contains mainly two things . 1. Abstract Class 2.Concrete Classes **/
/** Abstract class contains template method which is final . All operations used in the method
 *  are abstract , so their implementation is deferred to subclasses.  **/

/**The Template method is used for the following reasons :
 * 1. Let subclasses  implement varying behaviour
 * 2. Control at what point subclasses is allowed 3. Avoid the duplication of the code
 * **/

public class TemplateMain {
    public static  void main (String [] args){

        Hoagie h1 = new ItalianHoagie();
        h1.makeSandwich();
        Hoagie h2 = new VeggieHoagie();
        h2.makeSandwich();
    }

}
