package TemplateMethodPattern;

public class VeggieHoagie extends Hoagie {

    String [] veggieUsed = {"Lettuce", "Tomatoes", "Onions","Sweet Peppers"};
    String [] CondimentsUsed = {"Oil", "Vinegar"};
    @Override
    void addMeat() {}
    @Override
    void addCheese() {}

    boolean customerWantsMeat(){return false;}
    boolean customerWantsCheese(){return false;}

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
