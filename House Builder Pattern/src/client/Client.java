package client;

import concretebuilder.CountryHouseBuilder;
import builder.IHouseBuilder;
import concretebuilder.PentHouseBuilder;
import director.Director;
import product.House;

/**
 * This class provides Client code to have a house built.
 * It associates one builder object with the director, via parameters of the director’s constructor.
 * Then the director uses that builder object for all further construction.
 *
 * @Author NGUYEN HOANG NAM ANH
 */
public class Client {
    public static void main (String[]  args){
        IHouseBuilder pentHouseBuilder = new PentHouseBuilder();

        Director director = new Director(pentHouseBuilder);

        director.buildHouse();

        House house = director.getHouse();

        System.out.println("The house has been built, with these features:");
        System.out.println("\t- Structure: " + house.getStructure());
        System.out.println("\t- Color: " + house.getColor());
        System.out.println("\t- Roof: made from " + house.getRoof());
        System.out.println("\t- Floor: made from " + house.getFloor());
        System.out.println("\t- Number of windows: " + house.getNumWindows());
        System.out.println("\t- Number of bathrooms: " + house.getNumBathroom());
        System.out.println("\t- Number of bedrooms: " + house.getNumBedroom());
        System.out.println("\t- Number of living rooms: " + house.getNumLivingroom());
        System.out.print("\t- Garden: ");
        if (house.isHasGarden()){
            System.out.print("included");
        } else {System.out.print("N/A");}
        System.out.println();
        System.out.print("\t- Swimming Pool: ");
        if (house.isHasSwimmingPool()){
            System.out.print("included");
        } else {System.out.print("N/A");}

    }
}
