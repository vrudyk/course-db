import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.ClientsDAO;
import com.solvd.dao.interfaces.IClientsDAO;
import com.solvd.model.ClientModel;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ClientModelTest extends AbstractDAO {
    private static final Logger LOGGER = Logger.getLogger(ClientModelTest.class);
    private IClientsDAO entityDAO;
    private Class<IClientsDAO> DAOClass = IClientsDAO.class;
    private ClientModel clientModel;

    @Test
    public void testGetAllClients() {
        ClientsDAO clientsDAO = new ClientsDAO();
        List<ClientModel> clientModels = clientsDAO.getAllClients();
        Assert.assertFalse(clientModels.isEmpty(), "Table should not be empty");
        LOGGER.info("Table" + clientModels);
    }

    @Test
    public void testUpdateClients() {
        ClientsDAO clientsDAO = new ClientsDAO();
        ClientModel clientModel = new ClientModel();
        clientModel.setId(1);
        clientModel.setfName("Dan");
        clientModel.setlName("Danover");
        clientModel.setPhone("380959221212");
        clientsDAO.updateClient(clientModel);

        List<ClientModel> clientModels = clientsDAO.getAllClients();
        Assert.assertFalse(clientModels.contains(clientModel), "Table is present");
    }

    @Test
    public void testAddClient() {
        ClientsDAO clientsDAO = new ClientsDAO();
        ClientModel clientModel = new ClientModel();
        clientModel.setfName("Irina");
        clientModel.setlName("Ribka");
        clientModel.setPhone("380509128376");
        clientsDAO.addClients(clientModel);
        boolean isClientTablePresent = clientsDAO.getAllClients().contains(clientModel);
        Assert.assertFalse(isClientTablePresent, "New ClientTable isn't present");
    }
}
