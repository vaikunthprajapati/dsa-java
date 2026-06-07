// Demonstrating local, instance, and static variable types in Java
public class Variables {
    // Instance Variable
    int y = 90;

    // static Variable
    static String str1 = "Sejal";

    public static void main(String[] args) {
        // local Variable
        int x = 10;
        System.out.println(x);

        // local Variable
        String str = "Amit";
        System.out.println(str);

        Variables obj = new Variables();
        System.out.println(obj.y);

        System.out.println(Variables.str1);
    }
}
