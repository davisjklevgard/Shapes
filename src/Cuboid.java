import javax.swing.*;

public class Cuboid extends Shape{

    // Variables
    float width = 0;
    float height = 0;
    float depth = 0;

    // Methods for Formulas
    @Override
    public float surfaceArea() {
        return (2*depth*width)+(2*depth*height)+(2*height*width);
    }

    @Override
    public float volume() {
        return (width*height*depth);
    }

    public void render() {
        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Depth: " + getDepth() + "\n"
                + "Height: " + getHeight() + "\n"
                + "Width: " + getWidth() + "\n"
                + "Volume: " + volume() + "\n"
                + "Surface Area: " + surfaceArea() + "\n");
    }

    // Getters and Setters
    public float getWidth() {
        return width;
    }

    private void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    private void setHeight(float height) {
        this.height = height;
    }

    public float getDepth() {
        return depth;
    }

    private void setDepth(float depth) {
        this.depth = depth;
    }

    // Created Constructor
    public Cuboid(float width, float height, float depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}
