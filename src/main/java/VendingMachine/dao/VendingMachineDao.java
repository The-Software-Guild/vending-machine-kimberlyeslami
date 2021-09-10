package VendingMachine.dao;

import VendingMachine.dto.Item;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface VendingMachineDao {
    /**
     * Removes from the Vending Machine the item associated with the given name.
     * Returns the item object that is being removed or null if
     * there is no item associated with the given name
     *
     * @param name name of item to be removed
     * @return item object that was removed or null if no student
     * was associated with the given item name
     */

    void removeOneItemFromInventory(String name) throws VendingMachinePersistenceException;


    List<Item> getAllItems() throws VendingMachinePersistenceException ;


    //List<String> getListOfItemNamesInStock()throws VendingMachinePersistenceException;

    int getItemInventory(String name) throws VendingMachinePersistenceException;

    Item getItem(String name)throws VendingMachinePersistenceException;

    Map<String, BigDecimal> getMapOfItemNamesInStockWithCosts()throws VendingMachinePersistenceException;


}
