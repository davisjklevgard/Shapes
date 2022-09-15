import javax.swing.*;

public class Sphere extends Shape{

    // Variable
    float radius = 0;

    // Shape Methods

    @Override
    public float surfaceArea() {
        return (float)(4*Math.PI*(radius * radius));
    }

    @Override
    public float volume() {
        return (float) ((4/3)*Math.PI*(radius * radius * radius));
    }

    @Override
    public void render() {
        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Radius: " + getRadius() + "\n"
                + "Volume: " + volume() + "\n"
                + "Surface Area: " + surfaceArea() + "\n");
    }

    // Getter and Setter
    public float getRadius() {
        return radius;
    }

    private void setRadius(float radius) {
        this.radius = radius;
    }

    // Created Constructor

    public Sphere(float radius) {
        this.radius = radius;
    }
}
