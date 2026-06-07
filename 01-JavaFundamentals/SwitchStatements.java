// Basic switch: print day name from day number
public class SwitchStatements {
    public static void main(String[] args) {
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a Valid day ");
                break;
        }
    }
}

// Switch with fall-through: number of days in a month
class SwitchStatements2 {
    public static void main(String[] args) {
        int month = 1;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 Days");
                break;
            case 2:
                System.out.println("28 Days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 Days");
                break;
            default:
                System.out.println("Enter Valid Month");
                break;
        }
    }
}

// Calculator using switch on char operator with divide-by-zero guard
class SwitchStatements3 {
    public static void main(String[] args) {
        double x = 10, y = 0;
        char operator = '/';
        switch (operator) {
            case '+':
                System.out.println("The addition is :" + (x + y));
                break;
            case '-':
                System.out.println("The Substraction is :" + (x - y));
                break;
            case '*':
                System.out.println("The Multiplication is :" + (x * y));
                break;
            case '/':
                if (y != 0) {
                    System.out.println("The Division is :" + (x / y));
                } else {
                    System.out.println("the y can not be zero");
                }
                break;
            default:
                System.out.println("The opeartor is invalid");
                break;
        }
    }
}

// Switch on String role for access control (case-sensitive match demo)
class SwitchStatements4 {
    public static void main(String[] args) {
        String role = "Admin";
        switch (role) {
            case "admin":
                System.out.println("Welcome to admin");
                break;
            case "user":
                System.out.println("Welcome to admin");
                break;
            case "guest":
                System.out.println("Welcome to guest");
                break;
            case "superAdmin":
                System.out.println("Welcome to superAdmin");
                break;
            default:
                System.out.println("You are not allowed to enter the system");
                break;
        }
    }
}

// Nested switch: department and year combination (CS, IT, Mechanical, Electronics)
class SwitchStatements5 {
    public static void main(String[] args) {
        int department = 3;
        int year = 5;
        switch (department) {
            case 1:
                switch (year) {
                    case 1:
                        System.out.println("Computer scirnce 1st year");
                        break;
                    case 2:
                        System.out.println("Computer science 2nd year");
                        break;
                    case 3:
                        System.out.println("Computer science 3rd year");
                        break;
                    case 4:
                        System.out.println("Computer science 4th year");
                        break;
                    default:
                        System.out.println("Enter Valid year in Computer science");
                        break;
                }
                break;
            case 2:
                switch (year) {
                    case 1:
                        System.out.println("IT 1st year");
                        break;
                    case 2:
                        System.out.println("IT 2nd year");
                        break;
                    case 3:
                        System.out.println("IT 3rd year");
                        break;
                    case 4:
                        System.out.println("IT 4th year");
                        break;
                    default:
                        System.out.println("Enter Valid year in IT");
                        break;
                }
                break;
            case 3:
                switch (year) {
                    case 1:
                        System.out.println("Mechanical 1st year");
                        break;
                    case 2:
                        System.out.println("Mechanical 2nd year");
                        break;
                    case 3:
                        System.out.println("Mechanical 3rd year");
                        break;
                    case 4:
                        System.out.println("Mechanical 4th year");
                        break;
                    default:
                        System.out.println("Enter Valid year in Mechanical");
                        break;
                }
                break;
            case 4:
                switch (year) {
                    case 1:
                        System.out.println("Electronics 1st year");
                        break;
                    case 2:
                        System.out.println("Electronics 2nd year");
                        break;
                    case 3:
                        System.out.println("Electronics 3rd year");
                        break;
                    case 4:
                        System.out.println("Electronics 4th year");
                        break;
                    default:
                        System.out.println("Enter Valid year in Electronics");
                        break;
                }
                break;
            default:
                break;
        }
    }
}
