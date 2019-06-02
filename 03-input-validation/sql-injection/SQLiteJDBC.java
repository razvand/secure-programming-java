import java.sql.*;

public class SQLiteJDBC {
    private static boolean checkPrivilege(Connection c, String username, String password) {
        try {
            String sqlString = "select * from users where username='" + username + "' and password='" + password + "'";
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery(sqlString);
            if (rs.next())
                return true;
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return false;
    }

    public static void main(String args[]) {
        if (args.length != 2) {
            System.err.println("Pass username and password as arguments.");
            System.exit(-1);
        }
        Connection c = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:students.db");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(-1);
        }

        boolean check = checkPrivilege(c, args[0], args[1]);
        if (check)
            System.out.println("Access granted.");
        else
            System.out.println("Access denied.");
    }
}
