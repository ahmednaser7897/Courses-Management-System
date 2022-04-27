package pl_project;
import java.sql.*;
public class instructor extends person {

    public instructor() {
    }

    public instructor(String name, int id, int password, String user_name) {
        super(name, id, password, user_name);
    }
    void show_your_student() {
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=pl_project";
            String username = "admin";
            String password = "admin";
            Connection c = DriverManager.getConnection(url, username, password);
            Statement stmt = c.createStatement();

            String sql1="select inst_id from instructor where inst_userName='"+this.getUser_name()+"'";
            ResultSet ss=stmt.executeQuery(sql1);
            int id=0;
            if(ss.next())
                id=ss.getInt("inst_id");

            String sql = "select * from student join std_reg_cou on std_reg_cou.student_id=student.std_id join course on std_reg_cou.course_id= course.cuo_id where course.instructor_id="+id;
            ResultSet s = stmt.executeQuery(sql);
            System.out.println("your student :");
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("student name\tstudent id\t cource name\t course id \t grade");
            System.out.println("----------------------------------------------------------------------------");
            while (s.next()) {
                String user = s.getString("std_name");
                String c_name = s.getString("cou_name");
                int s_id=s.getInt("std_id");
                int c_id=s.getInt("cuo_id");
                int g=s.getInt("cource_grade");

                System.out.printf("%-12s\t%d\t\t%-10s\t %d\t\t %d",user,s_id,c_name,c_id,g);
                System.out.printf("\n");
            }
            c.close();
        }
        catch(SQLException e)
        {
            System.out.print(e);
        }
    }
    void update_std_grade(int std_id,int course_id,int new_grade) {
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=pl_project";
            String username = "admin";
            String password = "admin";
            Connection c = DriverManager.getConnection(url, username, password);
            Statement stmt = c.createStatement();
          
            if(new_grade<=100&&new_grade>=0)
            {
                 String sql ="update std_reg_cou set cource_grade="+new_grade+"  where std_reg_cou.course_id="+course_id+" and std_reg_cou.student_id="+std_id;
                stmt.execute(sql);
                System.out.println("Grade has been successfully modified");
                
            }
            else
                 System.out.println("invalid grade");
            c.close();     
        }
        catch(SQLException e)
        {
            System.out.print(e);
        }
    }
    
}
