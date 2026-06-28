// ============================================================
// TOPIC: Encapsulation — Getters & Setters
// Covers: private fields, public getter methods, public setter
//         methods with validation, real-world BankAccount example.
// ============================================================


// Encapsulation with getter/setter — Employee example
class Employee {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
    }
}

class EmployeeMain {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.setName("Vaikunth");
        System.out.println(obj.getName());

        obj.setAge(20);
        System.out.println(obj.getAge());
    }
}


//Getter Setter Method — BankAccount example
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid +deposit ,enter money more than 0 rupees");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Naukri karne ki jarurat h");
        }
    }
}

class BankMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);
        System.out.println("Balance: " + account.getBalance());
        account.deposit(2000);
        System.out.println("After deposit: " + account.getBalance());
        account.withdraw(1000);
        System.out.println("After withdrawal: " + account.getBalance());
        account.withdraw(100000);
    }
}
