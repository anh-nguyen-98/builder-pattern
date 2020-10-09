package product;

/**
 * This class represents a House, which is a complex product.
 *
 * @Author NGUYEN HOANG NAM ANH
 */
public class House {

    private String structure;
    private String roof;
    private String floor;
    private String color;
    private int numWindows;
    private int numBathroom;
    private int numBedroom;
    private int numLivingroom;
    private boolean hasGarden;
    private boolean hasSwimmingPool;

    public House(){}

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumWindows() {
        return numWindows;
    }

    public void setNumWindows(int numWindows) {
        this.numWindows = numWindows;
    }

    public int getNumBathroom() {
        return numBathroom;
    }

    public void setNumBathroom(int numBathroom) {
        this.numBathroom = numBathroom;
    }

    public int getNumBedroom() {
        return numBedroom;
    }

    public void setNumBedroom(int numBedroom) {
        this.numBedroom = numBedroom;
    }

    public int getNumLivingroom() {
        return numLivingroom;
    }

    public void setNumLivingroom(int numLivingroom) {
        this.numLivingroom = numLivingroom;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public boolean isHasSwimmingPool() {
        return hasSwimmingPool;
    }

    public void setHasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
    }
}
