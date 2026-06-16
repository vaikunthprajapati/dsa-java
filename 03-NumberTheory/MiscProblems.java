// Decimal to Binary conversion using repeated division by 2 and string prepend
public class MiscProblems {
    public static void main(String[] args) {
        int decimal = 8;
        int temp = decimal;
        String binaryNumber = "";
        while (temp != 0) {
            int remainder = temp % 2;
            binaryNumber = remainder + binaryNumber;
            temp = temp / 2;
        }
        System.out.println("Binary Number is: " + binaryNumber);
    }
}

// Decimal to Octal conversion using repeated division by 8 and string prepend
class MiscProblems2 {
    public static void main(String[] args) {
        int decimal = 65;
        int temp = decimal;
        String octalNumber = "";
        while (temp != 0) {
            int remainder = temp % 8;
            octalNumber = remainder + octalNumber;
            temp = temp / 8;
        }
        System.out.println("Octal Number is: " + octalNumber);
    }
}

// Binary to Decimal conversion: multiply each bit by 2^position and sum
class MiscProblems3 {
    public static void main(String[] args) {
        int binary = 1101;
        int temp = binary;
        int decimal = 0;
        int power = 0;
        while (temp != 0) {
            int digit = temp % 10;
            decimal += digit * Math.pow(2, power);
            power++;
            temp /= 10;
        }
        System.out.println("The Decimal Number is :" + decimal);
    }
}

// Octal to Decimal conversion: multiply each digit by 8^position and sum
class MiscProblems4 {
    public static void main(String[] args) {
        int octal = 123;
        int temp = octal;
        int decimal = 0;
        int power = 0;
        while (temp != 0) {
            int digit = temp % 10;
            decimal += digit * Math.pow(8, power);
            power++;
            temp /= 10;
        }
        System.out.println("The Decimal Number is :" + decimal);
    }
}

// Check if a number is a valid binary (contains only 0s and 1s)
class MiscProblems5 {
    public static void main(String[] args) {
        int num = 101;
        int temp = num;
        boolean isFound = true;

        while (temp != 0) {
            int digit = temp % 10;
            if (digit != 0 && digit != 1) {
                isFound = false;
                break;
            }
            temp /= 10;
        }
        if (isFound) {
            System.out.println("binary");
        } else {
            System.out.println("not binary");
        }
    }
}
