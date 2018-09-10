package lab1.lab1starter;/* Created: Bob Roos, 3 October 2013
Edited: Anastasia Kurdia, 11 January 2016
This program models the work of an octopus in the kitchen 
and tests the work of Octopus and Utensil class functions
*/
 

public class Lab0
{
    public static void main(String[] args)
    {
        // Variable dictionary:
        Octopus ocky;           // an octopus
        Utensil spat;           // a kitchen utensil

        spat = new Utensil("spatula"); // create a spatula
        spat.setColor("green");        // set spatula properties--color...
        spat.setCost(10.59);// ... and price

        ocky = new Octopus("Ocky", 8);    // create and name the octopus
        //ocky.setAge(10);               // set the octopus's age...
        ocky.setWeight(100);           // ... weight,...
        ocky.setUtensil(spat);         // ... and favorite utensil.

        Octopus bobby;
        Utensil spoon;
        spoon= new Utensil ("spoon");
        spoon.setColor("Yellow");
        spoon.setCost(5.67);

        bobby = new Octopus ("Bobby", 25);
        bobby.setWeight(58);
        bobby.setUtensil(spoon);


        System.out.println("Testing 'get' methods:");
        System.out.println(ocky.getName() + " weighs " +ocky.getWeight()
            + " pounds\n" + "and is " + ocky.getAge()
            + " years old. His favorite utensil is a "
            + ocky.getUtensil());

        System.out.println(ocky.getName() + "'s " + ocky.getUtensil() + " costs $"
            + ocky.getUtensil().getCost());
        System.out.println("Utensil's color: " + spat.getColor());

        // Use methods to change some values:

        ocky.setAge(20);
        ocky.setWeight(125);
        spat.setCost(15.99);
        spat.setColor("blue");

        System.out.println("\nTesting 'set' methods:");
        System.out.println(ocky.getName() + "'s new age: " + ocky.getAge());
        System.out.println(ocky.getName() + "'s new weight: " + ocky.getWeight());
        System.out.println("Utensil's new cost: $" + spat.getCost());
        System.out.println("Utensil's new color: " + spat.getColor());


        System.out.println("\n" + bobby.getName() + " weighs " +bobby.getWeight()
                + " pounds\n" + "and is " + bobby.getAge()
                + " years old. His favorite utensil is a "
                + bobby.getUtensil());

        System.out.println(bobby.getName() + "'s " + bobby.getUtensil() + " costs $"
                + bobby.getUtensil().getCost());
        System.out.println("Utensil's color: " + spoon.getColor());


    }

}
