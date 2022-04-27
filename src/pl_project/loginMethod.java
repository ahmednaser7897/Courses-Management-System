

package pl_project;

import java.sql.*;
import java.util.*;
public class loginMethod {
    public static int login(String username, String password, loginType logintype, person p) {
        Scanner input = new Scanner(System.in);
        try {
            int passWord = Integer.parseInt(password);
            String url = "jdbc:sqlserver://localhost:1433;databaseName=pl_project";
            String user = "admin";
            String pass = "admin";
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            String sql = "select * from student where std_userName = '" + username + "' and std_pass = " + password;
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                p.setUser_name(result.getString("std_userName"));
                p.setPassword(result.getInt("std_pass"));
                p.setName(result.getString("std_name"));
                p.setId(result.getInt("std_id"));
                if (username.equals(p.getUser_name()) && passWord == p.getPassword()) {
                    logintype.setLogged(true);
                    logintype.setStudentLogged(true);
                    System.out.println("Welcome Student: " + p.getName());
                }
            }
            if (logintype.isLogged() == false) {
                String sql2 = "select * from adminn where admin_userName = '" + username + "' and admin_pass = " + password;
                ResultSet result2 = stmt.executeQuery(sql2);
                while (result2.next()) {
                    p.setUser_name(result2.getString("admin_userName"));
                    p.setName(result2.getString("admin_name"));
                    p.setPassword(result2.getInt("admin_pass"));
                    p.setId(result2.getInt("admin_id"));
                    if (username.equals(p.getUser_name()) && passWord == p.getPassword()) {
                        logintype.setLogged(true);
                        logintype.setAdminLogged(true);
                        System.out.println("Welcome Admin: " + p.getName());
                    }
                }
            }
            if (logintype.isLogged() == false) {
                String sql3 = "select * from instructor where inst_userName = '" + username + "' and inst_pass = " + password;
                ResultSet result3 = stmt.executeQuery(sql3);
                while (result3.next()) {
                    p.setUser_name(result3.getString("inst_userName"));
                    p.setPassword(result3.getInt("inst_pass"));
                    p.setName(result3.getString("inst_name"));
                    p.setId(result3.getInt("inst_id"));
                    if (username.equals(p.getUser_name()) && passWord == p.getPassword()) {
                        logintype.setLogged(true);
                        logintype.setInstLogged(true);
                        System.out.println("Welcome Instructor: " + p.getName());
                    }
                }
            }
            if(logintype.isLogged() == false) {
                System.out.println("Wrong UserName or Password");
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return p.getId();
    }
}
