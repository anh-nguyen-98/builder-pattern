package product;

/**
 * This is the interface for a House object.
 *
 * @Author NGUYEN HOANG NAM ANH
 */
public interface IHouse {
    String getStructure();

    void setStructure(String structure);

    String getRoof();

    void setRoof(String roof);

    String getFloor();

    void setFloor(String floor);

    String getColor();

    void setColor(String color);

    int getNumWindows() ;

    void setNumWindows(int numWindows);

    int getNumBathroom();

    void setNumBathroom(int numBathroom);

    int getNumBedroom();

    void setNumBedroom(int numBedroom);

    int getNumLivingroom();

    void setNumLivingroom(int numLivingroom);

    boolean isHasGarden();

    void setHasGarden(boolean hasGarden);

    boolean isHasSwimmingPool() ;

    void setHasSwimmingPool(boolean hasSwimmingPool);
}
