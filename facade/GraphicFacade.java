package facade;

/**
 * Facade class to simplify the management of graphical elements such as lines and images.
 * Provides methods to control the visibility and creation of these elements.
 */
public class GraphicFacade {
    private final Line line; // Line instance for line management
    private final Image image; // Image instance for image management

    /**
     * Constructor initializes instances of Line and Image.
     */
    public GraphicFacade() {
        line = new Line();
        image = new Image();
    }

    /**
     * Sets the visibility of the graphical elements.
     *
     * @param vis true to make elements visible, false to hide them.
     */
    public void show(boolean vis) {
        String state = vis ? "visible" : "hidden";
        System.out.println("Setting subsystem visibility to " + state);

        if (vis) {
            createAndShowLines();
            image.create("Center Image", 0.0); // Fully visible image
        } else {
            hideLines();
            image.setTransparency(1.0); // Fully hidden image
        }
    }

    /**
     * Creates and displays lines with full opacity.
     */
    private void createAndShowLines() {
        line.create("Top Line", 1.0);
        line.create("Bottom Line", 1.0);
        line.create("Left Line", 1.0);
        line.create("Right Line", 1.0);
    }

    /**
     * Hides all lines by setting their opacity to zero.
     */
    private void hideLines() {
        System.out.println("Hiding lines...");
        line.setOpacity(0.0);
    }

    /**
     * Creates a single line with full opacity and specified name.
     *
     * @param name The name of the line.
     */
    public void createLine(String name) {
        line.create(name, 1.0);
        System.out.println("Line '" + name + "' created and shown.");
    }

    /**
     * Simulates the removal of a line by outputting a message.
     *
     * @param name The name of the line to be removed.
     */
    public void removeLine(String name) {
        System.out.println("Removing line: " + name);
    }

    /**
     * Creates an image with full visibility and specified name.
     *
     * @param name The name of the image.
     */
    public void createImage(String name) {
        image.create(name, 0.0);
        System.out.println("Image '" + name + "' created and shown.");
    }

    /**
     * Simulates the removal of an image by outputting a message and hiding it.
     *
     * @param name The name of the image to be removed.
     */
    public void removeImage(String name) {
        System.out.println("Removing image: " + name);
        image.setTransparency(1.0);
    }
}
