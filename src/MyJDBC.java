import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyJDBC {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/databasePizza", "root", "Ly123123");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from drink");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("dri_id"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
