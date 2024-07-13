import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PBO2 {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/PBO2";
        String usernmae ="root";
        String password="";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(url,usernmae,password);
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from perpustakaan");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) +" "+ resultSet.getString(2) + " " + resultSet.getInt(3) + " " + resultSet.getString(4));

            }
            connection.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
