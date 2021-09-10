package VendingMachine.service;

import VendingMachine.dao.VendingMachinePersistenceException;
import VendingMachine.dto.Item;

import java.math.BigDecimal;
import java.util.Map;

public interface VendingMachineServiceLayer {

    void checkIfEnoughMoney(Item item, BigDecimal inputMoney)throws
            InsufficientFundsException;

    void removeOneItemFromInventory(String name) throws
            NoItemInventoryException,
            VendingMachinePersistenceException;

    Map<String, BigDecimal> getItemsInStockWithCosts () throws
            VendingMachinePersistenceException;

    Item getItem(String name, BigDecimal inputMoney) throws
            InsufficientFundsException,
            NoItemInventoryException,
            VendingMachinePersistenceException;

    Map<BigDecimal, BigDecimal> getChangePerCoin(Item item, BigDecimal money);

}
