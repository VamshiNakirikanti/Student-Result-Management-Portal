/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package result.management.portal;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author VamshiKrishna
 */
public class TeacherPortal extends javax.swing.JFrame {

    /**
     * Creates new form TeacherPortal
     */
    public TeacherPortal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        DisplayResults = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        AddStudent1 = new javax.swing.JButton();
        AddResult = new javax.swing.JButton();
        DisplayStudents = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        SaveButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DisplayResults.setBackground(new java.awt.Color(102, 153, 255));
        DisplayResults.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        DisplayResults.setText("Display Results");
        DisplayResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayResultsActionPerformed(evt);
            }
        });
        jPanel1.add(DisplayResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 210, 40));

        LogoutButton.setBackground(new java.awt.Color(255, 0, 0));
        LogoutButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(LogoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 430, 90, 40));

        AddStudent1.setBackground(new java.awt.Color(51, 0, 204));
        AddStudent1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        AddStudent1.setForeground(new java.awt.Color(255, 255, 255));
        AddStudent1.setText("Add new Student ");
        AddStudent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStudent1ActionPerformed(evt);
            }
        });
        jPanel1.add(AddStudent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 210, 70));

        AddResult.setBackground(new java.awt.Color(102, 153, 255));
        AddResult.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        AddResult.setText("Add Result");
        AddResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddResultActionPerformed(evt);
            }
        });
        jPanel1.add(AddResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 210, 40));

        DisplayStudents.setBackground(new java.awt.Color(102, 153, 255));
        DisplayStudents.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        DisplayStudents.setText("Registered Students");
        DisplayStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayStudentsActionPerformed(evt);
            }
        });
        jPanel1.add(DisplayStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 210, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/result/management/portal/addStudent.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 90, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 500));

        SaveButton.setBackground(new java.awt.Color(0, 255, 0));
        SaveButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 430, 80, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BTech", "MTech", "Phd" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "ECE", "EEE", "Mech", "Civil", "MME", "BioTech" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Male");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, -1, -1));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Others");
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, -1, -1));

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("RollNumber");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Name of Student");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Course");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Branch");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Gender");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Father Name");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 130, 30));
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 150, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Add Student Details here");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 300, 40));
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 130, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 500, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DisplayResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayResultsActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ResultDisplayPortal().setVisible(true);
    }//GEN-LAST:event_DisplayResultsActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        // TODO add your handling code here:
        String rollNumber = jTextField1.getText();
        String name = jTextField2.getText();
        String course = jComboBox1.getSelectedItem().toString();
        String branch = jComboBox2.getSelectedItem().toString();
        String gender = "";
        if(jRadioButton1.isSelected()) gender = "Male";
        else if(jRadioButton2.isSelected()) gender = "Female";
        else gender = "Others";
        String fatherName = jTextField3.getText();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/srmp","root","Vamshi@123");
            Statement st = conn.createStatement();
            st.executeUpdate("insert into student(rollnumber,name,course,branch,gender,fathername) values('"+rollNumber+"','"+name+"',+'"+course+"','"+branch+"','"+gender+"','"+fatherName+"')");
            JOptionPane.showMessageDialog(null,"Student data saved successfully");
            setVisible(false);
            new TeacherPortal().setVisible(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.toString());
            setVisible(false);
            new TeacherPortal().setVisible(true);
        }
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void AddStudent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStudent1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddStudent1ActionPerformed

    private void AddResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddResultActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ResultUpdatePortal().setVisible(true);
    }//GEN-LAST:event_AddResultActionPerformed

    private void DisplayStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayStudentsActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new StudentDisplayPortal().setVisible(true);
    }//GEN-LAST:event_DisplayStudentsActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new TeacherLogin().setVisible(true);
    }//GEN-LAST:event_LogoutButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TeacherPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherPortal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddResult;
    private javax.swing.JButton AddStudent1;
    private javax.swing.JButton DisplayResults;
    private javax.swing.JButton DisplayStudents;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}