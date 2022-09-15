public class ShapesTest {

    public static void main(String[] args) {

        // Variables for when the program asks for input from user
        double cyRadius;
        double cyHeight;

        double cuRadius;
        double cuHeight;

        double sRadius;
        double sHeight;


        Cylinder cylinder1 = new Cylinder(3, 5);
        cylinder1.render();

        Cuboid cube1 = new Cuboid(5,5,5);
        cube1.render();

        Sphere sphere1 = new Sphere(9);
        sphere1.render();


    }
}
