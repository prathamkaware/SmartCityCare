package db;



import java.sql.*;


public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/smartcity";
    private static final String USER = "root";
    private static final String PASSWORD = "PK2121"; 

    public Connection conn;
    public Statement s;

    public  DBConnection() {

        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcity", "root","PK2121" );
            s = conn.createStatement();
            System.out.println("Connected to Database");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ResultSet executeQuery(String sql) {
        try {
            return s.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int executeUpdate(String sql) {
        try {
            return s.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;

       

    }

    public static void main(String[] args) {
        new DBConnection();
        
    }
}
