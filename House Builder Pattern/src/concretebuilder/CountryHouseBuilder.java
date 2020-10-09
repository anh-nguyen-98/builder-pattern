package concretebuilder;

import builder.IHouseBuilder;
import product.House;

/**
 * This class provides implementations to build a Country House.
 *
 * @Author NGUYEN HOANG NAM ANH
 */
public class CountryHouseBuilder implements IHouseBuilder {
    private House house;

    public CountryHouseBuilder() { this.house = new House(); }
    public void buildStructure() {
        this.house.setStructure("Wood Blocks");
    }

    public void buildRoof()
    {
        this.house.setRoof("Tile");
    }

    public void buildFloor()
    {
        this.house.setFloor("Wood");
    }


    public void buildColor() { this.house.setColor("Brown");
    }


    public void buildWindows() {
        this.house.setNumWindows(4);
    }



    public void buildBathroom() {
        this.house.setNumBathroom(1);
    }


    public void buildBedroom() { this.house.setNumBedroom(3); }


    public void buildLivingroom() {
        this.house.setNumLivingroom(1);
    }


    public void buildGarden() {
        this.house.setHasGarden(true);
    }


    public void buildSwimmingPool() {
        this.house.setHasSwimmingPool(false);
    }

    public  House getHouse(){
        return this.house;
    }

}
