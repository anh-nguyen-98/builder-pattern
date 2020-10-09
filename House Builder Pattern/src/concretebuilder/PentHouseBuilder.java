package concretebuilder;

import builder.IHouseBuilder;
import product.House;

/**
 * This class provides implementations to build a Penthouse.
 *
 * @Author NGUYEN HOANG NAM ANH
 */
public class PentHouseBuilder implements IHouseBuilder {
    private House house;
    public PentHouseBuilder(){ this.house = new House(); }

    public void buildStructure() {
        this.house.setStructure("Concrete Block");
    }

    public void buildRoof() {
        this.house.setRoof("Glass");
    }

    public void buildFloor() {
        this.house.setFloor("Wood");
    }

    public void buildColor() {
        this.house.setColor("White");
    }

    public void buildWindows() {
        this.house.setNumWindows(10);
    }

    public void buildBathroom() { this.house.setNumBathroom(10); }

    public void buildBedroom() {
        this.house.setNumBedroom(10);
    }


    public void buildLivingroom() {
        this.house.setNumLivingroom(2);
    }


    public void buildGarden() {
        this.house.setHasGarden(false);
    }

    public void buildSwimmingPool() {
        this.house.setHasSwimmingPool(true);
    }

    public House getHouse() {
        return house;
    }
}
