package pl_project;
import java.sql.*;
public class course {


    private int course_id;
    private int  instructor_id;
    private String  course_name;
    private int room_number ;
    private int course_price ;
    private String parent_course_name;
    private int  parent_course_price;
    private String start_course_date;
    private String end_course_date;
    private String  days_of_course;

    public course() {
    }

    public course(int course_id, int instructor_id, String course_name, int room_number, int course_price, String parent_course_name, int parent_course_price, String start_course_date, String end_course_date, String days_of_course) {
        this.course_id = course_id;
        this.instructor_id = instructor_id;
        this.course_name = course_name;
        this.room_number = room_number;
        this.course_price = course_price;
        this.parent_course_name = parent_course_name;
        this.parent_course_price = parent_course_price;
        this.start_course_date = start_course_date;
        this.end_course_date = end_course_date;
        this.days_of_course = days_of_course;
    }
    public void print_corse_info(int id, course co)
    {
        this.course_id=id;
        try{
            String url = "jdbc:sqlserver://localhost:1433;databaseName=pl_project";
            String username = "admin";
            String password = "admin";
            Connection c = DriverManager.getConnection(url, username, password);
            Statement stmt = c.createStatement();
            
            String sql="select*from course where course.cuo_id="+course_id;
            ResultSet s=stmt.executeQuery(sql);
            System.out.println("course info:");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("course name\tparent course name\tstart course date\tend_course_date\t\tinstructor name\t\tcourse_id\tcourse room\t ");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
            while(s.next())
            {
                co.setCourse_id(s.getInt("cuo_id"));
                co.setCourse_name(s.getString("cou_name"));
                co.setParent_course_name(s.getString("parent_course_name"));
                co.setStart_course_date(s.getString("start_course_date"));
                co.setEnd_course_date(s.getString("end_course_date"));
                co.setCourse_price(s.getInt("course_price"));
                co.setRoom_number(s.getInt("room"));
                co.setInstructor_id(s.getInt("instructor_id"));
            }
            String sql1 = "select inst_name from instructor where inst_id=" + co.getInstructor_id();
            String in_name = "";
            ResultSet s2 = stmt.executeQuery(sql1);
            while (s2.next()) {
                in_name = s2.getString("inst_name");

            }

            System.out.printf("%-15s%-25s%-24s%-25s%-21s\t %d\t\t %d\n", co.getCourse_name(), co.getParent_course_name(), co.getStart_course_date(), co.getEnd_course_date(), in_name, co.getCourse_id(), co.getRoom_number());
            c.close();
        }
        catch(SQLException e)
        {
            System.out.print(e);
        }
    }


    public int getCourse_id() {
        return course_id;
    }

    public int getInstructor_id() {
        return instructor_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public int getRoom_number() {
        return room_number;
    }

    public int getCourse_price() {
        return course_price;
    }

    public String getParent_course_name() {
        return parent_course_name;
    }

    public int getParent_course_price() {
        return parent_course_price;
    }

    public String getStart_course_date() {
        return start_course_date;
    }

    public String getEnd_course_date() {
        return end_course_date;
    }

    public String getDays_of_course() {
        return days_of_course;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public void setInstructor_id(int instructor_id) {
        this.instructor_id = instructor_id;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }

    public void setCourse_price(int course_price) {
        this.course_price = course_price;
    }

    public void setParent_course_name(String parent_course_name) {
        this.parent_course_name = parent_course_name;
    }

    public void setParent_course_price(int parent_course_price) {
        this.parent_course_price = parent_course_price;
    }

    public void setStart_course_date(String start_course_date) {
        this.start_course_date = start_course_date;
    }

    public void setEnd_course_date(String end_course_date) {
        this.end_course_date = end_course_date;
    }

    public void setDays_of_course(String days_of_course) {
        this.days_of_course = days_of_course;
    }
}
