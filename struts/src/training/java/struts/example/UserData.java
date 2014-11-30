package struts.example;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.HashMap;
import org.apache.struts.action.ActionForm;

public class UserData extends ActionForm {

    private Map<String, String> authors;
    //private String author;

    public UserData() {
        authors = new HashMap<String, String>();
    }

    public Map<String, String> getAuthors() {
        ResultSet rs = null;
        PreparedStatement pst = null;
        Connection con = getConnection();
        String stm = "SELECT * FROM authors";
        Map<String, String> records = new HashMap<String, String>();
        try {
            pst = con.prepareStatement(stm);
            pst.execute();
            rs = pst.getResultSet();
            while (rs.next()) {
                records.put("" + rs.getInt(1), rs.getString(2));
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

        }
        return records;
    }

    public void setAuthors(Map<String, String> authors) {
        this.authors = authors;
    }

    public Connection getConnection() {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "user1";
        String password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, user, password);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {

        }
        return con;
    }
}