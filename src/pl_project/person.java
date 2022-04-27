package pl_project;

import java.sql.*;

public class person {
    private String name;
    private int id;
    private int password;
    private String user_name;

    public person() {
    }

    public person(String name, int id, int password, String user_name) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.user_name = user_name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getPassword() {
        return password;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", password=" + password +
                ", user_name='" + user_name + '\'' +
                '}';
    }
    void print_corse_info(int id)
    {
        
        try{
            String url = "jdbc:sqlserver://localhost:1433;databaseName=pl_project";
            String username = "admin";
            String password = "admin";
            Connection c = DriverManager.getConnection(url, username, password);
            Statement stmt = c.createStatement();
            
            String sql="select*from course where course.cuo_id="+id;
            ResultSet s=stmt.executeQuery(sql);
            System.out.println("course info:");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("course name\tparent course name\tstart course date\tend_course_date\t\tinstructor name\t\tcourse_id\tcorse room\t ");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
            while(s.next())
            {
                int course_id=s.getInt("cuo_id");
                String course_name=s.getString("cou_name");
                String parent_course_name=s.getString("parent_course_name");
                String start_course_date=s.getString("start_course_date");
                String end_course_date=s.getString("end_course_date");
                int course_price=s.getInt("course_price");
                int room_number=s.getInt("room");
                
                int instructor_id=s.getInt("instructor_id");
                String sql1="select inst_name from instructor where inst_id="+instructor_id;
                String in_id="";
                ResultSet s2=stmt.executeQuery(sql1);
                while(s2.next()){
                    in_id=s2.getString("inst_name");
                
                }
                
                System.out.printf("%-15s%-25s%-24s%-25s%-21s\t %d\t\t %d\n",course_name,parent_course_name,start_course_date,end_course_date ,in_id,course_id,room_number);
            }

            c.close();
        } 
         catch(SQLException e)
        {
            System.out.print(e);
        }
    }
}

