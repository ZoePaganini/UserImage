/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spdvi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author Alumne
 */
public class GUIUserForm extends javax.swing.JFrame {
    ArrayList<User> users = new ArrayList<User>();
    final static String fileName = "src/datosUser.csv";
    /**
     * Creates new form GUIUserForm
     */
    public GUIUserForm() {
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

        btnGroupGender = new javax.swing.ButtonGroup();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblBirthDate = new javax.swing.JLabel();
        txtBirthDate = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        chkAlive = new javax.swing.JCheckBox();
        btnInput = new javax.swing.JButton();
        scrInfo = new javax.swing.JScrollPane();
        txaInfo = new javax.swing.JTextArea();
        radMale = new javax.swing.JRadioButton();
        radFemale = new javax.swing.JRadioButton();
        btnLoad = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnShowEncuesta = new javax.swing.JButton();
        btnGetSelectedItem = new javax.swing.JButton();
        lblList = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listUsers = new javax.swing.JList<>();
        btnLoadIntoList = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Form");

        lblFirstName.setText("First Name:");

        txtFirstName.setToolTipText("Please, write your first name.");

        lblLastName.setText("Last Name:");

        txtLastName.setToolTipText("Please, write your last name.");

        lblBirthDate.setText("BirthDate (yyyy-MM-dd)");

        txtBirthDate.setToolTipText("Write your birthdate with the format (yyy-MM-dd)");
        txtBirthDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBirthDateActionPerformed(evt);
            }
        });

        lblGender.setText("Gender");

        lblId.setText("ID");

        chkAlive.setText("is Alive");

        btnInput.setText("Input");
        btnInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputActionPerformed(evt);
            }
        });

        txaInfo.setColumns(20);
        txaInfo.setRows(5);
        scrInfo.setViewportView(txaInfo);

        btnGroupGender.add(radMale);
        radMale.setSelected(true);
        radMale.setText("Male");

        btnGroupGender.add(radFemale);
        radFemale.setText("Female");

        btnLoad.setText("Load");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnShowEncuesta.setText("Encuesta");
        btnShowEncuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowEncuestaActionPerformed(evt);
            }
        });

        btnGetSelectedItem.setText("Get Selected Item");
        btnGetSelectedItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetSelectedItemActionPerformed(evt);
            }
        });

        lblList.setText("h");

        listUsers.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listUsers);

        btnLoadIntoList.setText("Load");
        btnLoadIntoList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadIntoListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnShowEncuesta)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(lblId)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFirstName)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBirthDate)
                            .addComponent(btnInput, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGender)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radMale, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblLastName)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(chkAlive, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(scrInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnGetSelectedItem)
                        .addGap(88, 88, 88)
                        .addComponent(lblList)
                        .addGap(70, 70, 70))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoadIntoList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblId)
                        .addGap(3, 3, 3)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFirstName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLastName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBirthDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblGender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radMale)
                            .addComponent(radFemale))))
                .addGap(18, 18, 18)
                .addComponent(chkAlive)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInput)
                    .addComponent(btnLoad)
                    .addComponent(btnSave)
                    .addComponent(btnLoadIntoList))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(scrInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShowEncuesta)
                    .addComponent(btnGetSelectedItem)
                    .addComponent(lblList))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputActionPerformed
        //Input
        try {
        LocalDate birthDate = LocalDate.parse(txtBirthDate.getText());
        String gender = "Male";
        if (radFemale.isSelected()) gender = "Female";
        User user = new User(Integer.parseInt(txtID.getText()), txtFirstName.getText(), txtLastName.getText(), birthDate, gender, chkAlive.isSelected());
        
        users.add(user);
        
        txaInfo.append(user.toString());
        } catch (Exception ex) {
           EncuestaDialog encuesta = new EncuestaDialog(this, true);
           encuesta.getLblMessage().setText(ex.getMessage());
           encuesta.setVisible(true);
        }      
    }//GEN-LAST:event_btnInputActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        //Load
        try {
            users.clear();
            BufferedReader load = new BufferedReader(new FileReader(fileName));
            String currentLine = load.readLine();
            while (currentLine != null) {
                String [] fields = currentLine.split(",");
                User user = new User(Integer.parseInt(fields[0]), fields[2], fields[1], LocalDate.parse(fields[3]), fields[4],
                        fields[5].equals("Alive") ? true : false);
                users.add(user);
                currentLine = load.readLine();
            }
            load.close();
        } catch (FileNotFoundException fnfe) {
            System.err.println("Something went wrong");
            
        } catch (IOException ex) {
            Logger.getLogger(GUIUserForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (User u: users) {
            txaInfo.append(u.toString());
        }
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // Save
        GuardarFichero guardar = new GuardarFichero(this, true);
        guardar.setVisible(true);
        if (guardar.save == true) {
        try {
            BufferedWriter save = new BufferedWriter(new FileWriter(fileName));
            //save.write(txaInfo.getText());
            for (User usuario : users)
            {
                save.write(usuario.toCSV());
            }
            save.close();
        } catch (IOException e) {
            System.err.println("Something went wrong.");
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtBirthDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBirthDateActionPerformed
      
    }//GEN-LAST:event_txtBirthDateActionPerformed

    private void btnShowEncuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowEncuestaActionPerformed
        EncuestaDialog encuesta = new EncuestaDialog(this, true);
        encuesta.setVisible(true);
        encuesta.getLblMessage().setText("Amame");
    }//GEN-LAST:event_btnShowEncuestaActionPerformed

    private void btnGetSelectedItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetSelectedItemActionPerformed
        lblList.setText(listUsers.getSelectedValue());
    }//GEN-LAST:event_btnGetSelectedItemActionPerformed

    private void btnLoadIntoListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadIntoListActionPerformed
        try {
            users.clear();
            BufferedReader load = new BufferedReader(new FileReader(fileName));
            String currentLine = load.readLine();
            while (currentLine != null) {
                String [] fields = currentLine.split(",");
                User user = new User(Integer.parseInt(fields[0]), fields[2], fields[1], LocalDate.parse(fields[3]), fields[4],
                        fields[5].equals("Alive") ? true : false);
                users.add(user);
                currentLine = load.readLine();
            }
            load.close();
        } catch (FileNotFoundException fnfe) {
            System.err.println("Something went wrong");
            
        } catch (IOException ex) {
            Logger.getLogger(GUIUserForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DefaultListModel usersListModel = new DefaultListModel();
        
        for (User u: users) {
            usersListModel.addElement(u.toString());
        }
        
        listUsers.setModel(usersListModel);
    }//GEN-LAST:event_btnLoadIntoListActionPerformed

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
            java.util.logging.Logger.getLogger(GUIUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGetSelectedItem;
    private javax.swing.ButtonGroup btnGroupGender;
    private javax.swing.JButton btnInput;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnLoadIntoList;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnShowEncuesta;
    private javax.swing.JCheckBox chkAlive;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBirthDate;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblList;
    private javax.swing.JList<String> listUsers;
    private javax.swing.JRadioButton radFemale;
    private javax.swing.JRadioButton radMale;
    private javax.swing.JScrollPane scrInfo;
    private javax.swing.JTextArea txaInfo;
    private javax.swing.JTextField txtBirthDate;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLastName;
    // End of variables declaration//GEN-END:variables
}
