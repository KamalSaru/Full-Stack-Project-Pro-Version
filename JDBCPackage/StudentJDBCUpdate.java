package JDBCPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentJDBCUpdate {
    public static void main(String args[]) {
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_data", "root", "Tanuja123");
            String sql = "UPDATE `college_data`.`student` SET phone = 443125456 WHERE (`id` = '6');";

            PreparedStatement ps =con.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Update is done.");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
