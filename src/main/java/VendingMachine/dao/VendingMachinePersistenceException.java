package VendingMachine.dao;

import java.io.FileNotFoundException;

public class VendingMachinePersistenceException extends Exception {
    public VendingMachinePersistenceException (String message) {
        super(message);
    }
    public VendingMachinePersistenceException(String message, Throwable cause) {
        super(message, cause);
    }
}
