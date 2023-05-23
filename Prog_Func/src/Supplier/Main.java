package Supplier;

import static Supplier.SupplierEx.createAccount;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", null);
        String result = createAccount(employee, () -> "Error: Email is required to create an account.");
        System.out.println(result);
    }
}
