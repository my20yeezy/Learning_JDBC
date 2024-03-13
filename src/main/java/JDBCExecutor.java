
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExecutor {
    public static void main(String[] args) {
        DatabaseConnectionManager dcm = new DatabaseConnectionManager("localhost", "hplussport",
                "postgres", "password");
        try {
            Connection connection = dcm.getConnection();
            CustomerDAO customerDAO = new CustomerDAO(connection);
            Customer customer = new Customer();
            customer.setFirstName("Aktan_new");
            customer.setLastName("Mukanov");
            customer.setEmail("yerniyaz@mail.kz");
            customer.setPhone("7-777-777-7777");
            customer.setAddress("777 Uly dala av");
            customer.setCity("Astana");
            customer.setState("Astana");
            customer.setZipcode("010000");
            //testing git
            customerDAO.create(customer);

//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT COUNT(*) FROM CUSTOMER");
//            while (resultSet.next()) {
//                System.out.println(resultSet.getInt(1));
//            }
        } catch(SQLException e) {
            e.printStackTrace();
        }

    }
}
