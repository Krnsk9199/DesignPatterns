package TemplateMethodPattern;

import java.util.Arrays;

public class ItalianHoagie extends Hoagie{

    String [] meatUsed = {"Salami", "Pepperoni", "Capicola Ham"};
    String [] cheeseUsed = {"Provolone"};
    String [] veggieUsed = {"Lettuce", "Tomatoes", "Onions","Sweet Peppers"};
    String [] CondimentsUsed = {"Oil", "Vinegar"};
    @Override
    void addMeat() {
        System.out.println("Adding the Meat : ");
        for(String meat:meatUsed){
            System.out.print(meat+" ");
        }

    }

    @Override
    void addCheese() {

        System.out.println("Adding the Cheese : ");
        for(String cheese:cheeseUsed){
            System.out.print(cheese+" ");
        }

    }

    @Override
    void addVegetables() {
        System.out.println("Adding the Veggies : ");
        for(String veggie:veggieUsed){
            System.out.print(veggie+" ");
        }


    }

    @Override
    void addCondiments() {

        System.out.println("Adding the condiments : ");
        for(String condiment: CondimentsUsed){
            System.out.print(condiment+" ");
        }
    }
}
