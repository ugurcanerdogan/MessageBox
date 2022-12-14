package frames;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import entities.Message;
import entities.User;
import utils.CryptoHelper;
import utils.FileReadHelper;
import utils.HashHelper;

import javax.swing.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
public class frmAccesspage extends javax.swing.JFrame {
    ArrayList<User> userList;
    ArrayList<Message> messageList;
    String[] usernamesArray;
    CryptoHelper cryptoHelper;
    String userDataFilePath = "src\\users.data";
    String messageDataFilePath = "src\\messages.data";
    /**
     * Creates new form frmAccesspage
     */
    public frmAccesspage() {
        initComponents();
        userList = FileReadHelper.createUserList(userDataFilePath);
        messageList = FileReadHelper.createMessageList(messageDataFilePath, userList);
        usernamesArray = FileReadHelper.createUsernamesArray(userList);
        try {
            cryptoHelper = new CryptoHelper("hardcodedKey");
        } catch (Exception e) {
            throw new RuntimeException(e);
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

        lblMsgCodename = new javax.swing.JLabel();
        lblMsgPassword = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblUserPassword = new javax.swing.JLabel();
        txtFieldMsgCodename = new javax.swing.JTextField();
        txtFieldUsername = new javax.swing.JTextField();
        cboxShowUserPassword = new javax.swing.JCheckBox();
        btnView = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        passwordMessagepswd = new javax.swing.JPasswordField();
        passwordUserpswd = new javax.swing.JPasswordField();
        lblMsgInfo = new javax.swing.JLabel();
        lblUserInfo = new javax.swing.JLabel();
        cboxShowMsgPassword = new javax.swing.JCheckBox();
        sep = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Access Message");

        lblMsgCodename.setText("Message Codename (ID)");

        lblMsgPassword.setText("Message Password");

        lblUsername.setText("Username");

        lblUserPassword.setText("User Password");

        cboxShowUserPassword.setText("Show User Password");
        cboxShowUserPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxShowUserPasswordActionPerformed(evt);
            }
        });

        btnView.setBackground(new java.awt.Color(102, 204, 0));
        btnView.setText("View the message");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 51, 0));
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(0, 204, 204));
        btnHome.setText("HOME");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        lblMsgInfo.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        lblMsgInfo.setText("Message Info");

        lblUserInfo.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        lblUserInfo.setText("User Info");

        cboxShowMsgPassword.setText("Show Message Password");
        cboxShowMsgPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxShowMsgPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cboxShowUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxShowMsgPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordUserpswd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMsgInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblMsgPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblMsgCodename, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(9, 9, 9)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordMessagepswd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFieldMsgCodename, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(lblUserInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sep, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnHome)
                        .addGap(35, 35, 35)
                        .addComponent(btnReset)
                        .addGap(35, 35, 35)
                        .addComponent(btnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(lblMsgInfo)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMsgCodename)
                    .addComponent(txtFieldMsgCodename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMsgPassword)
                    .addComponent(passwordMessagepswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(cboxShowMsgPassword)
                .addGap(10, 10, 10)
                .addComponent(sep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lblUserInfo)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserPassword)
                    .addComponent(passwordUserpswd))
                .addGap(15, 15, 15)
                .addComponent(cboxShowUserPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnView)
                    .addComponent(btnHome))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        frmHomepage frmHomepage = new frmHomepage();
        frmHomepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void cboxShowUserPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxShowUserPasswordActionPerformed
        // TODO add your handling code here:
        if (cboxShowUserPassword.isSelected()) {
            passwordUserpswd.setEchoChar((char)0); //password = JPasswordField
        } else {
            passwordUserpswd.setEchoChar('*');
        }
    }//GEN-LAST:event_cboxShowUserPasswordActionPerformed

    private void cboxShowMsgPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxShowMsgPasswordActionPerformed
        if (cboxShowMsgPassword.isSelected()) {
            passwordMessagepswd.setEchoChar((char)0); //password = JPasswordField
        } else {
            passwordMessagepswd.setEchoChar('*');
        }
    }//GEN-LAST:event_cboxShowMsgPasswordActionPerformed

    private boolean checkUserAuth(String username, String password){
        User userToCheck = null;
        for(User user: userList){
            if (user.getUsername().equals(username)){
                userToCheck=user;
            }
        }
        String hashedPassword = HashHelper.getMd5(password);
        return userToCheck != null && hashedPassword.equals(userToCheck.getPassword());
    }

    private void showMessageOnFrame(String message){
        frmShowMessagepage frmMessagepage = new frmShowMessagepage();
        frmMessagepage.setTxtAreaMessage(message);
        frmMessagepage.setVisible(true);
        this.dispose();
    }

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        String messageId = txtFieldMsgCodename.getText();
        String messagePassword = String.valueOf(passwordMessagepswd.getPassword());
        String username = txtFieldUsername.getText();
        String userPassword = String.valueOf(passwordUserpswd.getPassword());

        if (messageId.equals("") || messagePassword.equals("") || username.equals("") || userPassword.equals("")){
            JOptionPane.showMessageDialog(null,"Fields cannot be empty!","ACCESS ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else{
            boolean messageShowed = false;
            if (checkUserAuth(username,userPassword)) {
                for (Message message : messageList) {
                    if (message.getMessage_id().equals(messageId) && message.getReceiver().getUsername().equals(username)) {
                        if (HashHelper.getMd5(messagePassword).equals(message.getPassword())) {
                            String str1 = cryptoHelper.decrypt(message.getContent());
                            showMessageOnFrame(str1);
                            messageShowed = true;
                            break;
                        }
                    }
                }
                if (!messageShowed) {
                    JOptionPane.showMessageDialog(null,"No message found with this information!","NO MESSAGE", JOptionPane.WARNING_MESSAGE);
                }
            }
            else {
                JOptionPane.showMessageDialog(null,"User nickname or password incorrect!","AUTH ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnViewActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtFieldMsgCodename.setText("");
        txtFieldUsername.setText("");
        
        passwordMessagepswd.setText("");
        passwordUserpswd.setText("");
        
        cboxShowUserPassword.setSelected(false);
        cboxShowMsgPassword.setSelected(false);
        
        passwordUserpswd.setEchoChar('*');
        passwordMessagepswd.setEchoChar('*');
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(frmAccesspage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAccesspage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAccesspage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAccesspage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAccesspage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnView;
    private javax.swing.JCheckBox cboxShowMsgPassword;
    private javax.swing.JCheckBox cboxShowUserPassword;
    private javax.swing.JLabel lblMsgCodename;
    private javax.swing.JLabel lblMsgInfo;
    private javax.swing.JLabel lblMsgPassword;
    private javax.swing.JLabel lblUserInfo;
    private javax.swing.JLabel lblUserPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField passwordMessagepswd;
    private javax.swing.JPasswordField passwordUserpswd;
    private javax.swing.JSeparator sep;
    private javax.swing.JTextField txtFieldMsgCodename;
    private javax.swing.JTextField txtFieldUsername;
    // End of variables declaration//GEN-END:variables
}
