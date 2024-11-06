package facade;

/**
 * Interface for managing lines, defining methods for creating and setting line opacity.
 */
public interface LineInterface {

    /**
     * Creates a line with the specified name and opacity.
     *
     * @param name The name of the line.
     * @param opacity The opacity level of the line (range from 0 to 1).
     */
    void create(String name, double opacity);

    /**
     * Sets the opacity level of the line.
     *
     * @param opacity The opacity level (range from 0 to 1).
     * @return The updated opacity level of the line.
     */
    double setOpacity(double opacity);
}
