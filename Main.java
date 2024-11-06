import facade.*;

/**
 * Main class demonstrating the usage of the GraphicFacade.
 */
public class Main {

    /**
     * Main method to demonstrate the creation, manipulation, and visibility control of graphical elements.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Instantiate the facade that will handle all operations
        GraphicFacade graphicFacade = new GraphicFacade();

        // Demonstrate showing the graphic system
        System.out.println("Showing Graphic System: ");
        graphicFacade.show(true); // Create and show the graphic elements

        // Create a new line
        System.out.println("\nCreating a New Line: ");
        graphicFacade.createLine("Diagonal Line");

        // Remove an existing line
        System.out.println("\nRemoving a Line: ");
        graphicFacade.removeLine("Diagonal Line");

        // Create a new image
        System.out.println("\nCreating a New Image: ");
        graphicFacade.createImage("Sample Image");

        // Remove an image
        System.out.println("\nRemoving an Image: ");
        graphicFacade.removeImage("Sample Image");

        // Demonstrate hiding the graphic system
        System.out.println("\nHiding Graphic System: ");
        graphicFacade.show(false); // Hide all graphic elements
    }
}
