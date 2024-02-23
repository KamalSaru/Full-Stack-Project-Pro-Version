package JDBCPackage;

import java.sql.*;

public class StudentJDBCInsert {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_data", "root", "Tanuja123");
            String sql ="insert into student (id, name, age, phone) values (?,?,?,?)";

            PreparedStatement ps =con.prepareStatement(sql);
            ps.setInt(1,3);
            ps.setString(2, "Daniel");
            ps.setInt(3, 33);
            ps.setInt(4, 44312345);

            ps.executeUpdate();
            System.out.println("Insertion is done.");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
