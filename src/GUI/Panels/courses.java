/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Panels;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Period;
import javax.swing.table.DefaultTableModel;
import pl_project.course;
import pl_project.instructor;
import pl_project.student;
/**
 *
 * @author Ahmed Nasser
 */
public class courses extends javax.swing.JPanel {

    /**
     * Creates new form courses
     */
    int id;
    public courses(int id) {
        this.id=id;
        initComponents();
    }
    public void notes() {
         try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=pl_project";
            String username = "admin";
            String password = "admin";
            java.sql.Connection c = DriverManager.getConnection(url, username, password);
            java.sql.Statement stmt = c.createStatement();
            String sql ="select * from course where instructor_id="+this.id;
            ResultSet s = stmt.executeQuery(sql);
           
            String name="";
            LocalDate ndate;
            LocalDate edate;
            LocalDate sdate;
            String note1="";
            String k1="";
            String note2="";
            String k2="";
            while(s.next())
            {
                name=s.getString("cou_name");
                ndate=LocalDate.now();
                edate=LocalDate.parse(s.getString("end_course_date"));
                Period p = Period.between(ndate, edate);
                
                if(p.getYears()==0 && Math.abs(p.getMonths())<=3)
                {
                    k1="course "+name+" is abote to end it Remains "+Math.abs(p.getMonths())+" months and "+Math.abs(p.getDays())+"days \n";
                     note1+=k1;
                } 
                sdate=LocalDate.parse(s.getString("start_course_date"));
                p = Period.between(ndate, sdate);
                
                if(p.getYears()==0 && Math.abs(p.getMonths())<=3)
                {
                    k2="course "+name+" is abote to start it Remains "+Math.abs(p.getMonths())+" months and "+Math.abs(p.getDays())+"days \n";
                     note2+=k2;
                }  
            }
            jTextArea1.setText(note1);
            jTextArea2.setText(note2);
            System.out.print(note1);
            System.out.print(note2);
            c.close();
        }
        catch(SQLException e)
        {
            System.out.print(e);
        }
    }
    public void print_Co () {
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=pl_project";
            String user = "admin";
            String pass = "admin";
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            String sql = "select*from course join instructor on inst_id=instructor_id where inst_id=" + this.id;
            ResultSet s = stmt.executeQuery(sql);
            DefaultTableModel model1 = (DefaultTableModel) c_info.getModel();
            Object[] data = new Object[8];
            model1.setRowCount(0);
            while (s.next()) {
                data[0] = s.getInt("cuo_id");
                data[1] = s.getString("cou_name");
                data[2] = s.getString("parent_course_name");
                data[3] = s.getInt("course_price");
                data[4] = s.getString("start_course_date");
                data[5] = s.getString("end_course_date");
                data[6] = s.getInt("room");
                data[7] = s.getInt("instructor_id");
                model1.addRow(data);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        c_info = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        c_info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "Course Name", "Parent Course Name", "Course Price", "Course Start Date", "Course End Date", "Course Room", "Instructor ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(c_info);

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("notes");

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(336, 336, 336)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                                    .addComponent(jScrollPane4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        print_Co();
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable c_info;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
