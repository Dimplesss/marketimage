/**
 * 
 */
package marketimage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
 
public class sqltest {
    public static void main(String[] args) {
        String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost:3306?useSSL=false&serverTimezone=Asia/Shanghai";
        String DB_USERNAME = "root";
        String DB_PASSWORD = "1234";
         
        try {
            Class.forName(DB_DRIVER);
            Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Statement statement = connection.createStatement();
            statement.execute("USE `sys`");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM `staff`");
            while(resultSet.next()) {
                System.out.println(resultSet.getString("tel"));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

