package FactoryPattern;

import FactoryPattern.phone.*;

import java.awt.*;
/* In Factory Design Pattern we create a FactoryClass where we created all the different
type of Objects through a getInstance method by passing a String/Integer etc  */


public class FactoryMain {
    public static void main(String [] args){
        OperatingSystemFactory op = new OperatingSystemFactory();
          OS obj = op.getInstance("gsdgsdg");
          obj.spec();

    }
}
