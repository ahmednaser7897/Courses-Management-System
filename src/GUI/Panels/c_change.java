/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Panels;
import java.sql.*;
import java.time.LocalDate;
/**
 *
 * @author Ahmed Nasser
 */
public class c_change extends javax.swing.JPanel {

    /**
     * Creates new form c_change
     */
    public c_change() {
        initComponents();
    }
    void tra()
    {
        name.setText("");
        i_id.setText("");
        c_id.setText("");
        e_date.setText("");
        y.setText("");
        m.setText("");
        d.setText("");
         p.setText("");
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        d = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        i_id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rangeee = new javax.swing.JLabel();
        e_date = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        p = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        c_id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        y = new javax.swing.JTextField();
        delet = new javax.swing.JButton();
        m = new javax.swing.JTextField();

        jLabel2.setText("Name");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setText("instructor id");

        jLabel6.setText("end date");

        rangeee.setText("course price");

        e_date.setEditable(false);

        jButton2.setText("shearsh by id");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pActionPerformed(evt);
            }
        });

        jLabel4.setText("year");

        jLabel5.setText("Id");

        jLabel7.setText("month");

        c_id.setEditable(false);

        jLabel8.setText("day");

        jButton1.setText("update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yActionPerformed(evt);
            }
        });

        delet.setText("Delete");
        delet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletActionPerformed(evt);
            }
        });

        m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rangeee, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(147, 147, 147)
                                            .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(147, 147, 147)
                                            .addComponent(i_id, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(147, 147, 147)
                                        .addComponent(c_id, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(delet)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(83, 83, 83)
                                            .addComponent(jLabel7)))
                                    .addGap(108, 108, 108)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(e_date, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(105, 105, 105)
                                    .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(151, 151, 151)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(160, 160, 160)
                                .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(c_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(i_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rangeee, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e_date, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(delet)))
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed

    }//GEN-LAST:event_nameActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=pl_project";
            String username = "admin";
            String password = "admin";
            Connection c = DriverManager.getConnection(url, username, password);
            Statement stmt = c.createStatement();
            String sql="select*from course where  cuo_id="+jTextField1.getText();
            ResultSet s=stmt.executeQuery(sql);
           
            LocalDate dd;
            
            if(s.next()){
                name.setText(s.getString("cou_name"));
                i_id.setText( s.getString("instructor_id"));
                c_id.setText(s.getString("cuo_id"));
                p.setText(s.getString("course_price"));
                e_date.setText(s.getString("end_course_date"));
                jLabel1.setText("found");
                dd=LocalDate.parse(e_date.getText());
                y.setText(dd.getYear()+"");
                d.setText(dd.getDayOfMonth()+"");
                m.setText(dd.getMonthValue()+"");
            }
            else {
                this.tra();
                jLabel1.setText("not found");
            }
            c.close();
        }
        catch(SQLException e)
        {
            System.out.println(e);

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName= pl_project";
            String username = "admin";
            String password = "admin";
            Connection c = DriverManager.getConnection(url, username, password);
            Statement stmt = c.createStatement();
            LocalDate date = LocalDate.of(Integer.parseInt(y.getText()),Integer.parseInt(m.getText()),Integer.parseInt(d.getText()));
            
            System.out.println(date);
            String sql="select*from course where  cuo_id="+jTextField1.getText();
            ResultSet s=stmt.executeQuery(sql);
            if(s.next()){
                String sql1 ="update course set cou_name='"+name.getText()+"',instructor_id= "+i_id.getText()+",course_price="+p.getText()+",end_course_date='"+date+"' where cuo_id="+jTextField1.getText();
                stmt.execute(sql1);
                jLabel1.setText("updated");
            }
            else{
                jLabel1.setText("not fpund!");
                this.tra();
            }

            c.close();
        }
        catch(SQLException e)
        {
            System.out.print(e);
            this.tra();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void yActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yActionPerformed

    private void deletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletActionPerformed
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=  pl_project";
            String username = "admin";
            String password = "admin";
            Connection c = DriverManager.getConnection(url, username, password);
            Statement stmt = c.createStatement();
            String sql="select*from course where  cuo_id="+jTextField1.getText();
            ResultSet s=stmt.executeQuery(sql);
            if(s.next()){
                String sql1 ="delete from course where cuo_id="+jTextField1.getText();
                stmt.execute(sql1);
                jLabel1.setText("deleted");
                this.tra();
            }
            else{
                jLabel1.setText("not fpund..!");
                this.tra();
            }
            c.close();
        }
        catch(SQLException e)
        {
            System.out.print(e);
        }
    }//GEN-LAST:event_deletActionPerformed

    private void mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mActionPerformed

    private void pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField c_id;
    private javax.swing.JTextField d;
    private javax.swing.JButton delet;
    private javax.swing.JTextField e_date;
    private javax.swing.JTextField i_id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField m;
    private javax.swing.JTextField name;
    private javax.swing.JTextField p;
    private javax.swing.JLabel rangeee;
    private javax.swing.JTextField y;
    // End of variables declaration//GEN-END:variables
}
