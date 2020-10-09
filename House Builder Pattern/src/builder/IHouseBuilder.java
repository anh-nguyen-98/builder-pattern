package builder;

import product.IHouse;

/**
 * This interface class defines all of the construction steps to build a House.
 * The steps are common to all types of House.
 * Each step is generally abstract as the actual functionality of the builder is carried out in the concrete subclasses.
 * The getHouse method is used to return the final House product.
 *
 * @Author NGUYEN HOANG NAM ANH
 */
public interface IHouseBuilder {

    void buildStructure();

    void buildRoof();

    void buildFloor();

    void buildColor();

    void buildWindows();

    void buildBathroom();

    void buildBedroom();


    void buildLivingroom();


    void buildGarden();

    void buildSwimmingPool();

    IHouse getHouse();
}
