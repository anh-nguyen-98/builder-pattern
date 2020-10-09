package director;

import builder.IHouseBuilder;
import product.House;

/**
 * This class provides instructions to generate House, the final product object.
 * A Director object is instantiated, including a parameter to specify the ConcreteBuilder object that is
 * to be used to generate the product.
 * The director then calls methods of the ConcreteBuilder in the correct order to generate the product object.
 * On completion of the process, the getProduct method of the builder object can be used to return the product.
 *
 * @Author NGUYEN HOANG NAM ANH
 */
public class Director {
    private IHouseBuilder houseBuilder;
    public Director (IHouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }
    public void buildHouse(){
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoof();
        this.houseBuilder.buildFloor();
        this.houseBuilder.buildColor();
        this.houseBuilder.buildWindows();
        this.houseBuilder.buildBathroom();
        this.houseBuilder.buildBedroom();
        this.houseBuilder.buildLivingroom();
        this.houseBuilder.buildGarden();
        this.houseBuilder.buildSwimmingPool();
    }

    public House getHouse(){
        return this.houseBuilder.getHouse();

    }
}
