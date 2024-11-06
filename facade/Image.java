package facade;

/**
 * Class for managing an image, implementing the ImageInterface.
 * Allows creating an image and adjusting its transparency.
 */
public class Image implements ImageInterface {
    private double transparency; // The current transparency level of the image

    /**
     * Creates an image with a specified name and transparency level.
     *
     * @param name The name of the image.
     * @param transparency The initial transparency level (range from 0 to 1).
     */
    @Override
    public void create(String name, double transparency) {
        this.transparency = setTransparency(transparency);
        System.out.println("Image created: " + name + " | Transparency: " + this.transparency);
    }

    /**
     * Sets the transparency level of the image, clamped between 0 and 1.
     *
     * @param transparency The desired transparency level.
     * @return The adjusted transparency level, clamped to be within range.
     */
    @Override
    public double setTransparency(double transparency) {
        this.transparency = Math.max(0.0, Math.min(1.0, transparency));
        System.out.println("Image transparency set to: " + this.transparency);
        return this.transparency;
    }

    /**
     * Hides the image by setting its transparency to fully transparent (1.0).
     */
    public void hide() {
        setTransparency(1.0);
        System.out.println("Image hidden.");
    }
}
