package builder;

import product.House;

/**
 * This interface class defines all of the construction steps to build a House.
 * The steps are common to all types of House.
 * Each step is generally abstract as the actual functionality of the builder is carried out in the concrete subclasses.
 * The getHouse method is used to return the final House product.
 *
 * @Author NGUYEN HOANG NAM ANH
 */
public interface IHouseBuilder {

    public void buildStructure();

    public void buildRoof();

    public void buildFloor();

    public void buildColor();

    public void buildWindows();

    public void buildBathroom();

    public void buildBedroom();


    public void buildLivingroom();


    public void buildGarden();

    public void buildSwimmingPool();

    public House getHouse();
}
