package facade;

/**
 * Interface for managing images, defining methods for creating
 * and modifying image transparency.
 */
public interface ImageInterface {

    /**
     * Creates an image with a specified name and transparency.
     *
     * @param name The name of the image.
     * @param transparency The transparency level of the image (range from 0 to 1).
     */
    void create(String name, double transparency);

    /**
     * Sets the transparency of the image.
     *
     * @param transparency The transparency level (range from 0 to 1).
     * @return The updated transparency level of the image.
     */
    double setTransparency(double transparency);
}
