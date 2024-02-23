package JDBCPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentJDBCDelete {
    public static void main(String args[]) {
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_data", "root", "Tanuja123");
            String sql ="delete from student where id=?";

            PreparedStatement ps =con.prepareStatement(sql);
            ps.setInt(1,7);

            ps.executeUpdate();
            System.out.println("Deletion is done.");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
