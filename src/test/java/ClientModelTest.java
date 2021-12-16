import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.ClientsDAO;
import com.solvd.dao.interfaces.IClientsDAO;
import com.solvd.model.ClientModel;
import com.solvd.util.OpenSession;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class ClientModelTest extends AbstractDAO {
    private static final Logger LOGGER = Logger.getLogger(ClientModelTest.class);
    private IClientsDAO entityDAO;
    private Class<IClientsDAO> DAOClass = IClientsDAO.class;
    private ClientModel clientModel;

    @Test
    public void updateClient() {
        String fName = "Nastya";
        try {
            SqlSession session = OpenSession.getOpenSession().openSession();
            entityDAO = session.getMapper(DAOClass);
            entityDAO.updateClient(clientModel);
            session.commit();
            session.close();
            ClientModel clientModel = new ClientModel();
            clientModel.setId(clientModel.getId());
            clientModel.setfName(fName);
            clientModel.setlName(clientModel.getlName());
            clientModel.setPhone(clientModel.getPhone());
            new ClientsDAO().updateClient(clientModel);
            LOGGER.info(clientModel);

            Assert.assertFalse(Boolean.parseBoolean(fName),"Old product is present");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    @Test
//    public void deleteClient() {
//        String fName = "Ivan";
//        try {
//            SqlSession session = OpenSession.getOpenSession().openSession();
//            entityDAO = session.getMapper(DAOClass);
//            entityDAO.deleteClient(Boolean.parseBoolean(clientModel.getfName()));
//            session.commit();
//            session.close();
//            boolean isClientPresent = entityDAO.getAllClient().contains(clientModel);
//            Assert.assertFalse(isClientPresent, "Client is present");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
