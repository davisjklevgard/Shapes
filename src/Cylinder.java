import javax.swing.*;

public class Cylinder extends Shape{

    float radius = 0;
    float height = 0;

    @Override
    public float surfaceArea() {
        return (float)(2*Math.PI*radius*height + 2*Math.PI*(radius * radius));
    }

    @Override
    public float volume() {
        return (float) (Math.PI*(radius * radius)*height);
    }

    @Override
    public void render() {
        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Radius: " + getRadius() + "\n"
                + "Height: " + getHeight() + "\n"
                + "Volume: " + volume() + "\n"
                + "Surface Area: " + surfaceArea() + "\n");
    }

    public float getRadius() {
        return radius;
    }

    private void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    private void setHeight(float height) {
        this.height = height;
    }

    public Cylinder () {

    }
    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }
}
