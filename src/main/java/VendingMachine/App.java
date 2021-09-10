package VendingMachine;

import VendingMachine.controller.VendingMachineController;
import VendingMachine.dao.*;
import VendingMachine.service.VendingMachineServiceLayer;
import VendingMachine.service.VendingMachineServiceLayerImpl;
import VendingMachine.ui.UserIO;
import VendingMachine.ui.UserIOConsoleImpl;
import VendingMachine.ui.VendingMachineView;

public class App {
    public static void main(String[] args) throws VendingMachinePersistenceException {
        UserIO io = new UserIOConsoleImpl();
        VendingMachineView view = new VendingMachineView(io);
        VendingMachineAuditDao auditDao = new VendingMachineAuditDaoFileImpl();
        VendingMachineDao dao = new VendingMachineDaoFileImpl();
        VendingMachineServiceLayer service = new VendingMachineServiceLayerImpl(auditDao, dao);

        VendingMachineController controller = new VendingMachineController(view, service);

        controller.run();
    }
}
