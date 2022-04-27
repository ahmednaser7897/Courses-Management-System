package pl_project;
import java.sql.*;
import java.util.*;
public class student extends person {

    public student() {

    }

    public student(String name, int id, int password, String user_name) {
        super(name, id, password, user_name);
    }
    public static int showGrades(int x, course c[], instructor i[], int grade[]) {
        int count = 0;
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=pl_project";
            String user = "admin";
            String pass = "admin";
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            String sql1 = "select * from std_reg_cou where student_id = " + x;
            ResultSet result1 = stmt.executeQuery(sql1);
            while (result1.next()) {
                c[count] = new course();
                i[count] = new instructor();
                c[count].setCourse_id(result1.getInt("course_id"));
                grade[count] = result1.getInt("cource_grade");
                count++;
            }
            String sql2, sql3;
            for(int j = 0; j < count; j++) {
                sql2 = "select cou_name,instructor_id from course where cuo_id = " + c[j].getCourse_id();
                ResultSet result2 = stmt.executeQuery(sql2);
                while (result2.next()) {
                    c[j].setCourse_name(result2.getString("cou_name"));
                    i[j].setId(result2.getInt("instructor_id"));
                }
                sql3 = "select inst_name from instructor where inst_id = "+ i[j].getId();
                ResultSet result3 = stmt.executeQuery(sql3);
                while (result3.next()) {
                    i[j].setName(result3.getString("inst_name"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return count;
    }
}
