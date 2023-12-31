package com.mycompany.cs3560.assignment2;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import com.mycompany.cs3560.assignment2.DesignPatterns.VisitorPattern.Visitor;

public class AdminControlPanel extends javax.swing.JFrame implements Visitor {
    //data variables
    private static ArrayList<String> allMsgs = new ArrayList<String>();

    //variables for holding total users
    private static Hashtable<String, User> allUsers = new Hashtable<>();
    private static Hashtable<User,UserView> allUserViews = new Hashtable<>();
    private static Hashtable<String, UserGroup> allGroups = new Hashtable<>();

    //variables for recent users and groups
    private User recentUser = null;

    //validation variable
    private boolean areIDsValid=true;

    //tree variables
    UserGroup root=null;
    DefaultMutableTreeNode rootNode=null;
    DefaultTreeModel model = null;

    //singleton
    protected static AdminControlPanel instance = null;

    public static AdminControlPanel getInstance(){
        if(instance==null){
            instance = new AdminControlPanel();
        }
        return instance;
    }

    /**
     * Creates new form AdminControlPanel
     */
    public AdminControlPanel() {
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

        userTotalDialog = new javax.swing.JDialog();
        userTotalText = new javax.swing.JTextField();
        groupTotalDialog = new javax.swing.JDialog();
        groupTotalText = new javax.swing.JTextField();
        msgTotalDialog = new javax.swing.JDialog();
        msgTotalText = new javax.swing.JTextField();
        posPercentDialog = new javax.swing.JDialog();
        posPercentText = new javax.swing.JTextField();
        activeUserDialog = new javax.swing.JDialog();
        activeUserText= new javax.swing.JTextField();
        verifyIDsDialog = new javax.swing.JDialog();
        verifyIDsText = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        userGroupTree = new javax.swing.JTree();

        //initilaize the root usergroup as the root node in jtree
        root = new UserGroup("Root");
        allGroups.put(root.getUserGroupID(), root);
        rootNode = new DefaultMutableTreeNode(root.getUserGroupID()+"(G)");
        userGroupTree= new JTree(rootNode);

        //tree model to reload info when new nodes are added
        model = (DefaultTreeModel)userGroupTree.getModel();

        userViewBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTextArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        groupTextArea = new javax.swing.JTextArea();
        userTotalBtn = new javax.swing.JButton();
        groupTotalBtn = new javax.swing.JButton();
        msgTotalBtn = new javax.swing.JButton();
        posPercentBtn = new javax.swing.JButton();
        addUserBtn = new javax.swing.JButton();
        addGroupBtn = new javax.swing.JButton();
        activeUserBtn = new javax.swing.JButton();
        verifyIDsBtn = new javax.swing.JButton();

        userTotalDialog.setTitle("User Total");

        userTotalText.setEditable(false);
        userTotalText.setText("User Total: "+ allUsers.size());


        javax.swing.GroupLayout userTotalDialogLayout = new javax.swing.GroupLayout(userTotalDialog.getContentPane());
        userTotalDialog.getContentPane().setLayout(userTotalDialogLayout);
        userTotalDialogLayout.setHorizontalGroup(
            userTotalDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userTotalDialogLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(userTotalText, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        userTotalDialogLayout.setVerticalGroup(
            userTotalDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userTotalDialogLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(userTotalText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        userTotalDialog.pack();

        groupTotalDialog.setTitle("Group Total");

        groupTotalText.setEditable(false);
        groupTotalText.setText("Group Total: "+ allGroups.size());

        javax.swing.GroupLayout groupTotalDialogLayout = new javax.swing.GroupLayout(groupTotalDialog.getContentPane());
        groupTotalDialog.getContentPane().setLayout(groupTotalDialogLayout);
        groupTotalDialogLayout.setHorizontalGroup(
            groupTotalDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupTotalDialogLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(groupTotalText, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        groupTotalDialogLayout.setVerticalGroup(
            groupTotalDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupTotalDialogLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(groupTotalText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        groupTotalDialog.pack();

        msgTotalDialog.setTitle("Message Total");

        msgTotalText.setEditable(false);
        msgTotalText.setText("Message Total: ");


        javax.swing.GroupLayout msgTotalDialogLayout = new javax.swing.GroupLayout(msgTotalDialog.getContentPane());
        msgTotalDialog.getContentPane().setLayout(msgTotalDialogLayout);
        msgTotalDialogLayout.setHorizontalGroup(
            msgTotalDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(msgTotalDialogLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(msgTotalText, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        msgTotalDialogLayout.setVerticalGroup(
            msgTotalDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(msgTotalDialogLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(msgTotalText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        msgTotalDialog.pack();

        posPercentDialog.setTitle("Positive Msg Percent");

        posPercentText.setEditable(false);
        posPercentText.setText("Positive Percent: ");


        javax.swing.GroupLayout posPercentDialogLayout = new javax.swing.GroupLayout(posPercentDialog.getContentPane());
        posPercentDialog.getContentPane().setLayout(posPercentDialogLayout);
        posPercentDialogLayout.setHorizontalGroup(
            posPercentDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(posPercentDialogLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(posPercentText, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        posPercentDialogLayout.setVerticalGroup(
            posPercentDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(posPercentDialogLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(posPercentText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        posPercentDialog.pack();
        
        activeUserDialog.setTitle("Recent Users and Groups");

        activeUserText.setEditable(false);
        activeUserText.setText("Please create a new user and group");

        javax.swing.GroupLayout activeUserDialogLayout = new javax.swing.GroupLayout(activeUserDialog.getContentPane());
        activeUserDialog.getContentPane().setLayout(activeUserDialogLayout);
        activeUserDialogLayout.setHorizontalGroup(
            activeUserDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(activeUserDialogLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(activeUserText, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        activeUserDialogLayout.setVerticalGroup(
            activeUserDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(activeUserDialogLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(activeUserText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        activeUserDialog.pack();

        verifyIDsDialog.setTitle("Verify IDs");

        verifyIDsText.setEditable(false);
        verifyIDsText.setText("IDs are unverified");

        javax.swing.GroupLayout verifyIDsDialogLayout = new javax.swing.GroupLayout(verifyIDsDialog.getContentPane());
        verifyIDsDialog.getContentPane().setLayout(verifyIDsDialogLayout);
        verifyIDsDialogLayout.setHorizontalGroup(
            verifyIDsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verifyIDsDialogLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(verifyIDsText, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        verifyIDsDialogLayout.setVerticalGroup(
            verifyIDsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verifyIDsDialogLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(verifyIDsText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        verifyIDsDialog.pack();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        userGroupTree.setBackground(new java.awt.Color(102, 204, 255));
        jScrollPane5.setViewportView(userGroupTree);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
        );

        userViewBtn.setBackground(new java.awt.Color(51, 102, 255));
        userViewBtn.setText("Open User View");
        userViewBtn.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                userViewBtnActionPerformed(evt);
            }
        });

        userTextArea.setBackground(new java.awt.Color(153, 204, 255));
        userTextArea.setColumns(20);
        userTextArea.setRows(5);
        userTextArea.setText("UserID");
        jScrollPane1.setViewportView(userTextArea);

        groupTextArea.setBackground(new java.awt.Color(153, 204, 255));
        groupTextArea.setColumns(20);
        groupTextArea.setRows(5);
        groupTextArea.setText("GroupID");
        jScrollPane3.setViewportView(groupTextArea);

        userTotalBtn.setBackground(new java.awt.Color(51, 102, 255));
        userTotalBtn.setText("Show User Total");
        userTotalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTotalBtnActionPerformed(evt);
            }
        });

        groupTotalBtn.setBackground(new java.awt.Color(51, 102, 255));
        groupTotalBtn.setText("Show Group Total");
        groupTotalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupTotalBtnActionPerformed(evt);
            }
        });

        msgTotalBtn.setBackground(new java.awt.Color(51, 102, 255));
        msgTotalBtn.setText("<html>Show Messages Total</html>");
        msgTotalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msgTotalBtnActionPerformed(evt);
            }
        });

        posPercentBtn.setBackground(new java.awt.Color(51, 102, 255));
        posPercentBtn.setText("<html> Show Positive Percentage </html>");
        posPercentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posPercentBtnActionPerformed(evt);
            }
        });

        addUserBtn.setBackground(new java.awt.Color(153, 204, 255));
        addUserBtn.setText("Add User");
        addUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserBtnActionPerformed(evt);
            }
        });

        addGroupBtn.setBackground(new java.awt.Color(153, 204, 255));
        addGroupBtn.setText("Add Group");
        addGroupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGroupBtnActionPerformed(evt);
            }
        });

        activeUserBtn.setBackground(new java.awt.Color(51, 102, 255));
        activeUserBtn.setText("<html> Show Last Active User </html>");
        activeUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activeUserBtnActionPerformed(evt);
            }
        });

        verifyIDsBtn.setBackground(new java.awt.Color(51, 102, 255));
        verifyIDsBtn.setText("<html> Validate IDs </html>");
        verifyIDsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyIDsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(addUserBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(userViewBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(addGroupBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(activeUserBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(userTotalBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(groupTotalBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(verifyIDsBtn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(msgTotalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(posPercentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addUserBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(addGroupBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userViewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(activeUserBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(verifyIDsBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(groupTotalBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(userTotalBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(msgTotalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(posPercentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void activeUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activeUserBtnActionPerformed

        checkRecentUser();
        activeUserDialog.setVisible(true);
        activeUserText.setText("Last Updated User: " + getRecentUser().getUserID());
    }//GEN-LAST:event_activeUserBtnActionPerformed

    private void addUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserBtnActionPerformed
        makeUser();
    }//GEN-LAST:event_addUserBtnActionPerformed

    private void addGroupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGroupBtnActionPerformed
        makeGroup();
    }//GEN-LAST:event_addGroupBtnActionPerformed

    private void userTotalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTotalBtnActionPerformed
        userTotalDialog.setVisible(true);
        userTotalText.setText("User Total: "+ allUsers.size());
    }//GEN-LAST:event_userTotalBtnActionPerformed

    private void groupTotalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupTotalBtnActionPerformed
        groupTotalDialog.setVisible(true);
        groupTotalText.setText("Group Total: "+ allGroups.size());
    }//GEN-LAST:event_groupTotalBtnActionPerformed

    private void msgTotalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msgTotalBtnActionPerformed
        msgTotalDialog.setVisible(true);
        msgTotalText.setText("Total Messages: " +allMsgs.size());
    }//GEN-LAST:event_msgTotalBtnActionPerformed

    private void posPercentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posPercentBtnActionPerformed
        posPercentDialog.setVisible(true);
        posPercentText.setText("Positive Percent: " + positivePercentageCheck());
    }//GEN-LAST:event_posPercentBtnActionPerformed

    private void userViewBtnActionPerformed(java.awt.event.ActionEvent evt){
        openUser();
    }
    private void verifyIDsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyIDsBtnActionPerformed
        verifyIDs();
    }//GEN-LAST:event_verifyIDsBtnActionPerformed


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
            java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminControlPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activeUserBtn;
    private javax.swing.JDialog activeUserDialog;
    private javax.swing.JTextField activeUserText;
    private javax.swing.JButton addGroupBtn;
    private javax.swing.JButton addUserBtn;
    private javax.swing.JTextArea groupTextArea;
    private javax.swing.JButton groupTotalBtn;
    private javax.swing.JDialog groupTotalDialog;
    private javax.swing.JTextField groupTotalText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField posPercentText;
    private javax.swing.JButton msgTotalBtn;
    private javax.swing.JDialog msgTotalDialog;
    private javax.swing.JTextField msgTotalText;
    private javax.swing.JButton posPercentBtn;
    private javax.swing.JDialog posPercentDialog;
    private javax.swing.JTree userGroupTree;
    private javax.swing.JTextArea userTextArea;
    private javax.swing.JButton userTotalBtn;
    private javax.swing.JDialog userTotalDialog;
    private javax.swing.JTextField userTotalText;
    private javax.swing.JButton userViewBtn;
    private javax.swing.JButton verifyIDsBtn;
    private javax.swing.JDialog verifyIDsDialog;
    private javax.swing.JTextField verifyIDsText;


    // End of variables declaration//GEN-END:variables

    private void makeUser(){
        String tempID = userTextArea.getText();
        if(!allUsers.containsKey(tempID)){
            User user = new User(tempID);
            //set creation time
            user.setCreationTime(LocalTime.now());
            //Test to see if userID is valid
            if(tempID.contains(" ")){
                areIDsValid=false;
            }
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) userGroupTree.getSelectionPath().getLastPathComponent();
            DefaultMutableTreeNode userNode = new DefaultMutableTreeNode(user.getUserID());
            //Users can only be added to groups
            if(selectedNode.getUserObject().toString().contains("(G)")){
                selectedNode.add(userNode);
                model.reload(rootNode);
                user.accept(this);;
            }
        }
    }
    private void makeGroup(){
        String tempID = groupTextArea.getText();
        if(!allGroups.containsKey(tempID)){
            UserGroup group = new UserGroup(tempID);
            //set creation time
            group.setCreationTime(System.currentTimeMillis());
            //Test to see if userID is valid
            if(tempID.contains(" ")){
                areIDsValid=false;
            }
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) userGroupTree.getSelectionPath().getLastPathComponent();
            DefaultMutableTreeNode groupNode = new DefaultMutableTreeNode(group.getUserGroupID()+"(G)");
            selectedNode.add(groupNode);
            model.reload(rootNode);
            group.accept(this);
        }
    }

    private void openUser(){
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) userGroupTree.getSelectionPath().getLastPathComponent();
        String userString = selectedNode.getUserObject().toString();
        User tempUser = accessUser(userString);
        UserView tempUserView = new UserView(tempUser);
        tempUserView.setVisible(true);
        tempUserView.accept(this);;
    }

    public static void gatherMessage(String givenMsg){
        allMsgs.add(givenMsg);
    }

    private float positivePercentageCheck(){
        int positiveCounter=0;
        for(String msg: allMsgs){
            if(msg.toLowerCase().contains("cool")
            ||msg.toLowerCase().contains("nice")
            ||msg.toLowerCase().contains("good")
            ||msg.toLowerCase().contains("great")){
                positiveCounter++;
            }
        }

        return (positiveCounter*100) / (allMsgs.size());
    }

    private void checkRecentUser() {
        Collection<User> tempAllUsers = allUsers.values();
        LocalTime tempLong = LocalTime.of(0,0,0);
        for (User user : tempAllUsers) {
            if(tempLong.isBefore(user.getLastUpdateTime())){
                tempLong=user.getLastUpdateTime();
                setRecentUser(user);
            }
        }
    }

    private void verifyIDs() {
        verifyIDsDialog.setVisible(true);
        if(areIDsValid){
            verifyIDsText.setText("ID's are all valid");
        }else{
            verifyIDsText.setText("An ID is invalid");
        }
        
    }

    //Methods to access values in the hashtables
    public static User accessUser(String givenID){
        User tempUser = null;
        if(allUsers.containsKey(givenID)){
            tempUser = allUsers.get(givenID);
        }
        return tempUser;
    }

    public static UserGroup accessGroup(String givenID){
        UserGroup tempGroup=null;
        if(allGroups.containsKey(givenID)){
            tempGroup=allGroups.get(givenID);
        }
        return tempGroup;
    }

    public static UserView accessUserView(User givenUser){
        UserView tempUserView=null;
        if(allUserViews.containsKey(givenUser)){
            tempUserView=allUserViews.get(givenUser);
        }
        return tempUserView;
    }
    
    //All the getters and setters
    public int getTotalUsers() {
        return allUsers.size();
    }
    public int getTotalGroups() {
        return allGroups.size();
    }
    public User getRecentUser() {
        return recentUser;
    }
    public void setRecentUser(User recentUser) {
        this.recentUser = recentUser;
    }

    //Visitor Pattern Methods
    @Override
    public void visit(User user) {
        allUsers.put(user.getUserID(),user);
    }

    @Override
    public void visit(UserGroup group) {
        allGroups.put(group.getUserGroupID(), group);
    }

    @Override
    public void visit(UserView userView) {
        allUserViews.put(userView.getMyUser(), userView);
    }

}
