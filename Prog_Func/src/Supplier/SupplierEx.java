package Supplier;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierEx {
    public static String createAccount(Employee e, Supplier<String> errorMsg) {
        if (e.getEmail() == null) {
            return errorMsg.get();
        }
        return "Account created successfully.";
    }
}
