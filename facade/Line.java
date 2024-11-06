package facade;

/**
 * Class for managing a line, implementing the LineInterface.
 * Allows creating a line and adjusting its opacity.
 */
public class Line implements LineInterface {
    private double opacity; // The current opacity level of the line

    /**
     * Creates a line with a specified name and opacity level.
     *
     * @param name The name of the line.
     * @param opacity The initial opacity level (range from 0 to 1).
     */
    @Override
    public void create(String name, double opacity) {
        this.opacity = setOpacity(opacity);
        System.out.println("Line created: " + name + " | Opacity: " + this.opacity);
    }

    /**
     * Sets the opacity level of the line, clamped between 0 and 1.
     *
     * @param opacity The desired opacity level.
     * @return The adjusted opacity level, clamped to be within range.
     */
    @Override
    public double setOpacity(double opacity) {
        this.opacity = Math.max(0.0, Math.min(1.0, opacity));
        System.out.println("Line opacity set to: " + this.opacity);
        return this.opacity;
    }

    /**
     * Hides the line by setting its opacity to fully transparent (0.0).
     */
    public void hide() {
        setOpacity(0.0);
        System.out.println("Line hidden.");
    }
}
