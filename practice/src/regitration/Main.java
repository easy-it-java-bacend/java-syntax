package regitration;

import java.util.Scanner;

public class Main {

    static Scanner scan; // null
    static User[] userData;
    static int size;

    public static void main(String[] args) {
        run();
    }

    static void run() {
        init();
        while (true) {
            System.out.print("Operation: ");
            String operation = scan.nextLine(); // register
            switch (operation) {
                case "register":
                    readData();
                    break;

                case "print":
                    print();
                    break;

                case "exit":
                    return;
            }
        }
    }

    static void init() {
        // Инициализация глобальных переменных
        scan = new Scanner(System.in);
        userData = new User[10]; // {firstName, lastName, null, null, null}
    }

    static void readData() {
        System.out.print("First name: ");
        userData[size] = new User();
        userData[size].setFirstName(processData(scan.nextLine(), "[a-zA-Z]+",
                "First name must contains only letter of both registers"));

        System.out.print("Last name: ");
        userData[size].setLastName(processData(scan.nextLine(), "[a-zA-Z]+",
                "Last name must contains only letter of both registers"));

        System.out.print("Email: ");
        userData[size].setEmail(processData(scan.nextLine(), "[a-zA-Z0-9_]+\\@[a-z]+\\.[a-z]{3}",
                "Invalid email: example_mail@gmail.com"));//j$hn_do#@gmail.com

        System.out.print("Date of birth: "); // 16-02-2000
        userData[size].setPhoneNumber(processData(scan.nextLine(), "\\d{2}(-|.)\\d{2}(-|.)\\d{4}",
                "Invalid date: date format dd-MM-yyyy"));

        System.out.print("Phone number: ");
        userData[size].setDob(processData(scan.nextLine().replaceAll("\\s+", ""), "\\+*\\d{12}",
                "Invalid phone number"));

        size++;
    }

    static String processData(String data, String regex, String errorMessage) {
        while (!data.matches(regex)) {
            System.out.println(errorMessage);
            System.out.print("Try again: ");
            data = scan.nextLine();
        }
        return data;
    }

    static void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(userData[i].getFirstName());
            System.out.println(userData[i].getLastName());
            System.out.println(userData[i].getEmail());
            System.out.println(userData[i].getPhoneNumber());
            System.out.println(userData[i].getDob());
        }
    }
}