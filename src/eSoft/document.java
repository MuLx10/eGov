/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eSoft;

import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class document extends javax.swing.JFrame {

    /**
     * Creates new form document
     */
    public document() {
        initComponents();getContentPane().setBackground(new Color(200,5,100));  setLocation(200,50);setIcon();fetch();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        last = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        first = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        PAN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        sex = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        Aadhaar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tb = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        type = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Documents");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eSoft/returned.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name");

        last.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last name");

        first.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        id.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PAN Number");

        PAN.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        PAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PANActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Age");

        Address.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        age.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        date.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        date.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                dateComponentAdded(evt);
            }
        });
        date.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                dateMouseMoved(evt);
            }
        });
        date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dateMousePressed(evt);
            }
        });

        sex.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Choose not to disclose" }));

        jLabel11.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Aaadhar ID");

        Aadhaar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Entry ID");

        Tb.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        Tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First", "Last", "Sex", "Age", "PAN", "Aaadhar", "Date"
            }
        ));
        Tb.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tb);

        jButton1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Date");

        search.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        jButton5.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Caste Certificate", "Domicile Certificate", "Income  Certificate" }));

        jLabel14.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Type");

        jLabel15.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Sex");

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel12)
                                                .addComponent(jLabel14)
                                                .addComponent(jLabel15)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(19, 19, 19)))
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel7)
                                        .addGap(49, 49, 49)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(PAN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                        .addComponent(Aadhaar, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(id)
                                        .addGap(8, 8, 8))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel6)
                                .addGap(97, 97, 97)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(age)
                                    .addComponent(sex, 0, 203, Short.MAX_VALUE)
                                    .addComponent(last)
                                    .addComponent(first)
                                    .addComponent(type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(first, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(last, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(PAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Aadhaar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel model=(DefaultTableModel) Tb.getModel();
        if(Tb.getSelectedRow()==-1){
            if(Tb.getRowCount()==0){
                JOptionPane.showMessageDialog(null,"Table is Empty");
            }
            else{
                JOptionPane.showMessageDialog(null,"Please You must Select an id");
            }

        }
 int i= JOptionPane.showConfirmDialog(null,"Do you really want to delete this document ","Delete",JOptionPane.YES_NO_OPTION);
 if(i==0){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","");
            String a="DELETE FROM document where ID='"+first.getText()+"'";
            PreparedStatement ps=conn.prepareStatement(a);

            int z= ps.executeUpdate();
            if(z>0){
              
              
                JOptionPane.showMessageDialog(null,"Successfully Deleted");
                model.removeRow(Tb.getSelectedRow());
              id.setText("");  
first.setText("");PAN.setText("");
Aadhaar.setText("");Address.setText("");last.setText("");date.setText("");
            
         
        }
        

 }catch(Exception ex){
            Logger.getLogger(eSoft.class.getName()).log(Level.SEVERE, null, ex);
 }  }
 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
id.setText("");  
first.setText("");PAN.setText("");
Aadhaar.setText("");Address.setText("");last.setText("");age.setText("");date.setText("");

// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      DefaultTableModel model=(DefaultTableModel) Tb.getModel();
        if(!id.getText().trim().equals("")&&!first.getText().trim().equals("")&&!last.getText().trim().equals("")){
            model.addRow(new Object[]{id.getText(),first.getText(),last.getText(),PAN.getText(),Aadhaar.getText(),Address.getText(),age.getText(),sex.getSelectedItem(),date.getText()});

            try{



                Class.forName("com.mysql.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","");
                PreparedStatement ps=conn.prepareStatement("INSERT INTO document (ID,First,Last,Sex,Age,PAN,AID,Add,Date)values(?,?,?,?,?,?,?,?,?)");

                ps.setString(1,id.getText());
                ps.setString(2,first.getText());
                  ps.setString(3,last.getText());
                             ps.setString(5,PAN.getText());      ps.setString(6,Aadhaar.getText());      ps.setString(7,Address.getText());    
                   ps.setString(9,age.getText());          ps.setString(11,sex.getSelectedItem().toString());
                ps.setString(12,date.getText());
              
                
                int i=ps.executeUpdate();
    
                if(i>0){
                    JOptionPane.showMessageDialog(null,"Successfully saved  ");
                   id.setText("");  
first.setText("");PAN.setText("");
Aadhaar.setText("");Address.setText("");last.setText("");age.setText("");date.setText("");
          
                 
                    ps.close();
                }else{
                    JOptionPane.showMessageDialog(null," Not saved ");

                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Please fill all fields first ");
        }

    fetch();

    }                                   
    public void fetch(){
        try{
            Connection conn=null;
PreparedStatement ps=null;
ResultSet rs=null;
Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","");
            String g="SELECT * FROM document ";
            ps=conn.prepareStatement(g);
            rs=ps.executeQuery();
            Tb.setModel(DbUtils.resultSetToTableModel(rs));
       
        }catch(Exception e){
        Logger.getLogger(complain.class.getName()).log(Level.SEVERE, null, e); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(id.getText().trim().equals("")&&first.getText().trim().equals("")&&last.getText().trim().equals("")){
         JOptionPane.showMessageDialog(null,"Please fill all fields first");
    }else{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","");
            String a="update document set ID=?,First=?,Last=?,Sex=?,Age=?,PAN=?,AID=?,Add=?,Date=? ";
            PreparedStatement ps=conn.prepareStatement(a);
            ps.setString(0,id.getText());
                ps.setString(1,first.getText());
                  ps.setString(2,last.getText());
                  ps.setString(3,sex.getSelectedItem().toString());
                    ps.setString(5,PAN.getText());      
                    ps.setString(6,Aadhaar.getText());     
                    ps.setString(7,Address.getText());    
                   ps.setString(4,age.getText());           
                ps.setString(8,date.getText());
              
    
          
            

            int rw=ps.executeUpdate();
            if(rw>0){
                JOptionPane.showMessageDialog(null,"Changes are saved");

            }
            else{
                JOptionPane.showMessageDialog(null,"Changes are not saved");

            }
        }
        catch(Exception e){
            Logger.getLogger(eSoft.class.getName()).log(Level.SEVERE, null, e);
        }
        DefaultTableModel model=(DefaultTableModel) Tb.getModel();
        model.setValueAt(id.getText(),Tb.getSelectedRow(),0);
         model.setValueAt(first.getText(),Tb.getSelectedRow(),1);
          model.setValueAt(last.getText(),Tb.getSelectedRow(),2);
        
             model.setValueAt(PAN.getText(),Tb.getSelectedRow(),5);
          model.setValueAt(Aadhaar.getText(),Tb.getSelectedRow(),6);
           model.setValueAt(Address.getText(),Tb.getSelectedRow(),7);
          
               model.setValueAt(age.getText(),Tb.getSelectedRow(),4);
     
          model.setValueAt(sex.getSelectedItem(),Tb.getSelectedRow(),3);
               model.setValueAt(date.getText(),Tb.getSelectedRow(),8);
        Tb.setDefaultEditor(Object.class, null);}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       if(search.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Please fill search field first ");
}else{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","");
            PreparedStatement ps=null;
            ResultSet rs=null;
            ps=conn.prepareStatement("Select *FROM document where First=?");
            ps.setString(1, search.getText());
            rs=ps.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"This entry Exists " );

            }
            else{
                JOptionPane.showMessageDialog(null,"This entry Don't Exists");
            }}
            catch(Exception e){
                Logger.getLogger(eSoft.class.getName()).log(Level.SEVERE, null, e);
            } 
}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void TbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbMouseClicked
        DefaultTableModel model=(DefaultTableModel) Tb.getModel();
        id.setText(model.getValueAt(Tb.getSelectedRow(),0).toString());
           first.setText(model.getValueAt(Tb.getSelectedRow(),1).toString());
              last.setText(model.getValueAt(Tb.getSelectedRow(),2).toString());
          
            PAN.setText(model.getValueAt(Tb.getSelectedRow(),4).toString());  Aadhaar.setText(model.getValueAt(Tb.getSelectedRow(),5).toString());  Address.setText(model.getValueAt(Tb.getSelectedRow(),6).toString());
               age.setText(model.getValueAt(Tb.getSelectedRow(),8).toString()); 
              sex.setSelectedItem(model.getValueAt(Tb.getSelectedRow(),10).toString());
        date.setText(model.getValueAt(Tb.getSelectedRow(),11).toString());   
    }//GEN-LAST:event_TbMouseClicked

    private void dateComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_dateComponentAdded
        // TODO add your handling code here:
        date.setText("Today");
    }//GEN-LAST:event_dateComponentAdded

    private void PANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PANActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PANActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstActionPerformed

    private void dateMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMouseMoved
        // TODO add your handling code here:
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date_temp = new Date();
        date.setText(dateFormat.format(date_temp));
    }//GEN-LAST:event_dateMouseMoved

    private void dateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMousePressed
        // TODO add your handling code here:
        //date.setText("today1");
    }//GEN-LAST:event_dateMousePressed

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
            java.util.logging.Logger.getLogger(document.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(document.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(document.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(document.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new document().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Aadhaar;
    private javax.swing.JTextField Address;
    private javax.swing.JTextField PAN;
    private javax.swing.JTable Tb;
    private javax.swing.JTextField age;
    private javax.swing.JTextField date;
    private javax.swing.JTextField first;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField last;
    private javax.swing.JTextField search;
    private javax.swing.JComboBox<String> sex;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("book.png")));
    }}