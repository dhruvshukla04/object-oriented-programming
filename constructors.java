//     1. Book Class (Constructors)
//    public class Book {
//        String title;
//        String author;
//        double price;
//
//        public Book() {
//            this.title = "Unknown";
//            this.author = "Anonymous";
//            this.price = 0.0;
//        }
//
//        public Book(String title, String author, double price) {
//            this.title = title;
//            this.author = author;
//            this.price = price;
//        }
//
//        public void display() {
//            System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
//        }
//
//        public static void main(String[] args) {
//            Book defaultBook = new Book();
//            Book customBook = new Book("The Hobbit", "J.R.R. Tolkien", 14.99);
//            defaultBook.display();
//            customBook.display();
//        }
//    }

//
//        2. Circle Class
//public class Circle {
//    private double radius;
//
//    public Circle() {
//        this(1.0); // Chains to the parameterized constructor below
//    }
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    public double getArea() {
//        return Math.PI * radius * radius;
//    }
//
//    public static void main(String[] args) {
//        Circle c1 = new Circle();
//        Circle c2 = new Circle(5.0);
//        System.out.printf("Area of c1 (default radius): %.2f\n", c1.getArea());
//        System.out.printf("Area of c2 (radius 5.0): %.2f\n", c2.getArea());
//    }
//}
//
//
//        3. Person Class
//public class Person {
//    String name;
//    int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public Person(Person other) {
//        this.name = other.name;
//        this.age = other.age;
//    }
//
//    public void display() {
//        System.out.println("Name: " + name + ", Age: " + age);
//    }
//
//    public static void main(String[] args) {
//        Person person1 = new Person("Alice", 30);
//        Person person2 = new Person(person1);
//        System.out.print("Original: ");
//        person1.display();
//        System.out.print("Copied:   ");
//        person2.display();
//    }
//}
//
//
//         4. Hotel Booking System
//public class HotelBooking {
//    String guestName;
//    String roomType;
//    int nights;
//
//    public HotelBooking() {
//        this("N/A", "Standard", 1);
//    }
//
//    public HotelBooking(String guestName, String roomType, int nights) {
//        this.guestName = guestName;
//        this.roomType = roomType;
//        this.nights = nights;
//    }
//
//    public HotelBooking(HotelBooking other) {
//        this.guestName = other.guestName;
//        this.roomType = other.roomType;
//        this.nights = other.nights;
//    }
//
//    public void display() {
//        System.out.println("Booking for " + guestName + " | Room: " + roomType + " | Nights: " + nights);
//    }
//
//    public static void main(String[] args) {
//        HotelBooking b1 = new HotelBooking();
//        HotelBooking b2 = new HotelBooking("Bob", "Deluxe", 5);
//        HotelBooking b3 = new HotelBooking(b2);
//        b1.display();
//        b2.display();
//        b3.display();
//    }
//}
//
//
//         5. Library Book System
//public class Book {
//    String title;
//    boolean isAvailable;
//
//    public Book(String title) {
//        this.title = title;
//        this.isAvailable = true;
//    }
//
//    public void borrowBook() {
//        if (isAvailable) {
//            this.isAvailable = false;
//            System.out.println("Successfully borrowed '" + title + "'.");
//        } else {
//            System.out.println("Sorry, '" + title + "' is currently unavailable.");
//        }
//    }
//
//    public void display() {
//        System.out.println("Title: " + title + " | Available: " + isAvailable);
//    }
//
//    public static void main(String[] args) {
//        Book myBook = new Book("1984");
//        myBook.display();
//        myBook.borrowBook();
//        myBook.display();
//        myBook.borrowBook();
//    }
//}
//
//
//        6. Car Rental System
//public class CarRental {
//    String customerName;
//    String carModel;
//    int rentalDays;
//    double dailyRate;
//
//    public CarRental(String customerName, String carModel, int rentalDays) {
//        this.customerName = customerName;
//        this.carModel = carModel;
//        this.rentalDays = rentalDays;
//        this.dailyRate = carModel.equalsIgnoreCase("SUV") ? 50.0 : 40.0;
//    }
//
//    public double calculateTotalCost() {
//        return rentalDays * dailyRate;
//    }
//
//    public void displayRentalDetails() {
//        System.out.printf("Customer: %s | Car: %s | Days: %d | Total Cost: $%.2f\n",
//                customerName, carModel, rentalDays, calculateTotalCost());
//    }
//
//    public static void main(String[] args) {
//        CarRental rental = new CarRental("Charlie", "SUV", 7);
//        rental.displayRentalDetails();
//    }
//}
//
//
//         1. Product Inventory
//public class Product {
//    String productName;
//    double price;
//    static int totalProducts = 0;
//
//    public Product(String productName, double price) {
//        this.productName = productName;
//        this.price = price;
//        totalProducts++;
//    }
//
//    public void displayProductDetails() {
//        System.out.println("Product: " + this.productName + ", Price: $" + this.price);
//    }
//
//    public static void displayTotalProducts() {
//        System.out.println("Total products created: " + totalProducts);
//    }
//
//    public static void main(String[] args) {
//        Product.displayTotalProducts(); // Call class method before creating objects
//        Product p1 = new Product("Laptop", 1200.50);
//        Product p2 = new Product("Mouse", 25.00);
//        p1.displayProductDetails();
//        p2.displayProductDetails();
//        Product.displayTotalProducts();
//    }
//}
//
//
//         2. Online Course Management
//public class Course {
//    String courseName;
//    static String instituteName = "ABC School";
//
//    public Course(String courseName) {
//        this.courseName = courseName;
//    }
//
//    public void displayCourseDetails() {
//        System.out.println("Course: " + courseName + " | Institute: " + instituteName);
//    }
//
//    public static void updateInstituteName(String newName) {
//        instituteName = newName;
//    }
//
//    public static void main(String[] args) {
//        Course c1 = new Course("Java Programming");
//        Course c2 = new Course("Python ");
//        c1.displayCourseDetails();
//        c2.displayCourseDetails();
//
//        System.out.println("\n--- Institute name updated ---");
//        Course.updateInstituteName("Chitkara");
//
//        c1.displayCourseDetails();
//        c2.displayCourseDetails();
//    }
//}
//
//
//       3. Vehicle Registration
//public class Vehicle {
//    String ownerName;
//    String vehicleType;
//    static double registrationFee = 150.00;
//
//    public Vehicle(String ownerName, String vehicleType) {
//        this.ownerName = ownerName;
//        this.vehicleType = vehicleType;
//    }
//
//    public void displayVehicleDetails() {
//        System.out.println("Owner: " + ownerName + " | Type: " + vehicleType + " | Fee: $" + registrationFee);
//    }
//
//    public static void updateRegistrationFee(double newFee) {
//        registrationFee = newFee;
//    }
//
//    public static void main(String[] args) {
//        Vehicle v1 = new Vehicle("David", "Motorcycle");
//        Vehicle v2 = new Vehicle("Eva", "Car");
//        v1.displayVehicleDetails();
//        v2.displayVehicleDetails();
//
//        System.out.println("\n--- Registration fee updated ---");
//        Vehicle.updateRegistrationFee(200.00);
//
//        v1.displayVehicleDetails();
//        v2.displayVehicleDetails();
//    }
//}
//
//
//       1. University Management System
//class Student {
//    public int rollNumber;
//    protected String name;
//    private double CGPA;
//
//    public Student(int r, String n, double c) {
//        this.rollNumber = r;
//        this.name = n;
//        this.CGPA = c;
//    }
//
//    public double getCGPA() { return this.CGPA; }
//    public void setCGPA(double c) { this.CGPA = c; }
//}
//
//class PostgraduateStudent extends Student {
//    public PostgraduateStudent(int r, String n, double c) {
//        super(r, n, c);
//    }
//
//    public void showStudentName() {
//        System.out.println("Postgraduate Student Name: " + name);
//    }
//}
//
//public class UniversityDemo {
//    public static void main(String[] args) {
//        Student student = new Student(101, "Frank", 8.5);
//        student.setCGPA(8.7);
//        System.out.println("Student CGPA: " + student.getCGPA());
//
//        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Grace", 9.1);
//        pgStudent.showStudentName();
//    }
//}
//
//
//         2. Book Library System
//class Book {
//    protected String title;
//    private String author;
//
//    public Book(String i, String t, String a) {
//        this.ISBN = i;
//        this.title = t;
//        this.author = a;
//    }
//
//    public String getAuthor() { return author; }
//    public void setAuthor(String a) { this.author = a; }
//}
//
//class EBook extends Book {
//    public EBook(String i, String t, String a) {
//        super(i, t, a);
//    }
//
//    public void displayEBook() {
//        System.out.println(title);
//    }
//}
//
//public class LibraryDemo {
//    public static void main(String[] args) {
//        EBook ebook = new EBook("978-0321765723", "The Lord of the Rings", "J.R.R. Tolkien");
//        ebook.displayEBook();
//        System.out.println("Author (via getter): " + ebook.getAuthor());
//    }
//}
//
//
//        3. Bank Account Management
//class BankAccount {
//    public String accountNumber;
//    protected String accountHolder;
//    private double balance;
//
//    public BankAccount(String num, String holder, double bal) {
//        this.accountNumber = num;
//        this.accountHolder = holder;
//        this.balance = bal;
//    }
//
//    public double getBalance() { return balance; }
//    public void deposit(double amount) {
//        if (amount > 0) balance += amount;
//    }
//}
//
//class SavingsAccount extends BankAccount {
//    public SavingsAccount(String num, String holder, double bal) {
//        super(num, holder, bal);
//    }
//
//    public void displayAccountHolder() {
//        // 'accountHolder' is protected and accessible in a subclass
//        System.out.println("Account Holder: " + accountHolder);
//    }
//}
//
//public class BankDemo {
//    public static void main(String[] args) {
//        SavingsAccount myAccount = new SavingsAccount("SA12345", "Heidi", 1000);
//        myAccount.displayAccountHolder();
//        myAccount.deposit(500);
//        // myAccount.balance = 5000; // ERROR: 'balance' is private
//        System.out.println("Current Balance: $" + myAccount.getBalance());
//    }
//}
//
//
//         4. Employee Records
//class Employee {
//    public String employeeID;
//    protected String department;
//    private double salary;
//
//    public Employee(String id, String dept, double sal) {
//        this.employeeID = id;
//        this.department = dept;
//        this.salary = sal;
//    }
//
//    public double getSalary() { return salary; }
//    public void updateSalary(double newSal) {
//        if (newSal > this.salary) this.salary = newSal;
//    }
//}
//
//class Manager extends Employee {
//    public Manager(String id, String dept, double sal) {
//        super(id, dept, sal);
//    }
//
//    public void displayManagerDetails() {
//        // 'employeeID' (public) and 'department' (protected) are accessible
//        System.out.println("Manager ID: " + employeeID + " | Dept: " + department);
//    }
//}
//
//public class HRDemo {
//    public static void main(String[] args) {
//        Manager manager = new Manager("MGR001", "Technology", 90000);
//        manager.displayManagerDetails();
//        System.out.println("Initial Salary: $" + manager.getSalary());
//        manager.updateSalary(95000);
//        System.out.println("Updated Salary: $" + manager.getSalary());
//    }
//}
