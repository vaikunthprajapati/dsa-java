// ============================================================
// TOPIC: Methods in a Class
// Covers: Defining methods, calling methods on objects,
//         methods with parameters, return types, multiple objects.
// ============================================================


// Method with hardcoded instance variables
class RectangleHardcoded {
    int length = 10;
    int width = 56;

    public int areaRectangle() {
        int area = length * width;
        return area;
    }

    public static void main(String[] args) {
        RectangleHardcoded obj = new RectangleHardcoded();
        int result = obj.areaRectangle();
        System.out.println("Area is : " + result);

        int result1 = obj.areaRectangle();
        System.out.println("Area is : " + result1);
    }
}


// Method with parameters (flexible, reusable)
class RectangleWithParams {
    public int areaRectangle(int length, int width) {
        int area = length * width;
        return area;
    }

    public static void main(String[] args) {
        RectangleWithParams obj = new RectangleWithParams();
        int result = obj.areaRectangle(56, 34);
        System.out.println("Area is : " + result);

        int result1 = obj.areaRectangle(10, 57);
        System.out.println("Area is : " + result1);
    }
}


// Setting fields via object reference, then calling method
class RectangleViaReference {
    public int length;
    public int width;

    public int areaRectangle() {
        int area = length * width;
        return area;
    }

    public static void main(String[] args) {
        RectangleViaReference obj = new RectangleViaReference();
        obj.length = 67;
        obj.width = 45;
        int result = obj.areaRectangle();
        System.out.println("Area is : " + result);
    }
}


// Multiple objects calling the same method
class RectangleMultipleObjects {
    public int areaRectangle(int length, int width) {
        int area = length * width;
        return area;
    }

    public static void main(String[] args) {
        RectangleMultipleObjects obj = new RectangleMultipleObjects();
        int result = obj.areaRectangle(56, 34);
        System.out.println("Area is : " + result);

        int result1 = obj.areaRectangle(10, 57);
        System.out.println("Area is : " + result1);

        RectangleMultipleObjects obj1 = new RectangleMultipleObjects();
        int result2 = obj1.areaRectangle(567, 354);
        System.out.println("Area is : " + result2);
    }
}
