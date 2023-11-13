
package com.mycompany.cs3560.assignment2;

import java.util.ArrayList;

import javax.swing.DefaultListModel;

import com.mycompany.cs3560.assignment2.DesignPatterns.VisitorPattern.VisitorClient;
import com.mycompany.cs3560.assignment2.DesignPatterns.VisitorPattern.Visitor;

public class UserView extends javax.swing.JFrame implements VisitorClient {

    //Variable to hold the user
    User myUser=null;

    //ListModels
    DefaultListModel<String> followModel= new DefaultListModel<String>();
    DefaultListModel<String> newsModel= new DefaultListModel<String>();

    /**
     * Creates new form AdminControlPanel
     */
    public UserView(User givenUser) {
        myUser=givenUser;

        updateFollowList();
        updateNewsList();

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

        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userIDField = new javax.swing.JTextArea();
        followUserBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        followList = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tweetField = new javax.swing.JTextArea();
        postTweetBtn = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        newsFeed = new javax.swing.JList<>();
        jTextField1 = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField2.setText("jTextField2");

    
        setTitle(myUser.getUserID()+"'s window");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        userIDField.setBackground(new java.awt.Color(102, 102, 102));
        userIDField.setColumns(20);
        userIDField.setRows(5);
        userIDField.setText("UserID");
        jScrollPane1.setViewportView(userIDField);

        followUserBtn.setBackground(new java.awt.Color(51, 102, 255));
        followUserBtn.setText("Follow User");
        followUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                followUserBtnActionPerformed(evt);
            }
        });

        followList.setBackground(new java.awt.Color(102, 102, 102));
        followList.setModel(followModel);
        
        jScrollPane2.setViewportView(followList);

        tweetField.setBackground(new java.awt.Color(102, 102, 102));
        tweetField.setColumns(20);
        tweetField.setRows(5);
        tweetField.setText("Tweet Message");
        jScrollPane3.setViewportView(tweetField);

        postTweetBtn.setBackground(new java.awt.Color(51, 102, 255));
        postTweetBtn.setText("Post Tweet");
        postTweetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postTweetBtnActionPerformed(evt);
            }
        });

        newsFeed.setBackground(new java.awt.Color(102, 102, 102));
        newsFeed.setModel(newsModel);
        jScrollPane4.setViewportView(newsFeed);

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(followUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(postTweetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(followUserBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(postTweetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void followUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_followUserBtnActionPerformed
        followUser();
    }//GEN-LAST:event_followUserBtnActionPerformed

    private void postTweetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postTweetBtnActionPerformed
        postTweet();
    }//GEN-LAST:event_postTweetBtnActionPerformed

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
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserView(new User("sample")).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> followList;
    private javax.swing.JButton followUserBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JList<String> newsFeed;
    private javax.swing.JButton postTweetBtn;
    private javax.swing.JTextArea tweetField;
    private javax.swing.JTextArea userIDField;
    // End of variables declaration//GEN-END:variables

    //Method to follow another user
    private void followUser(){
        String tempID = userIDField.getText();
        User tempUser = AdminControlPanel.accessUser(tempID);
        if(tempUser!=null){
            myUser.follow(tempID, tempUser, myUser);
            
        }else{
            System.out.println("no known user with that ID exists");
        }
        updateFollowList();
        updateOthers();    
    }

    //Method to make a post from the user
    private void postTweet(){
        String postContent = tweetField.getText();
        myUser.makePost(postContent);
        updateNewsList();
        updateOthers();
    }

    //Method to update the contents of the follow list
    public void updateFollowList(){
        //empty out the model
        followModel.clear();

        //refill the model to match the user's following list
        ArrayList<String> tempArrayList=myUser.getUserFollowing();
        for(String s: tempArrayList){
        followModel.addElement(s);
        }
        
        //followList will be null before init
        //if(followList!=null)
        //followList.revalidate();
    }

    //Method to update the contents of the news list
    public void updateNewsList(){
        //empty out the model
        newsModel.clear();

        //refill the model to match the user's news feed
        ArrayList<String> tempArrayList=myUser.getUserFollowing();
        tempArrayList=myUser.getUserNews();
        for(String s: tempArrayList){
        newsModel.addElement(s);
        }
        
        
        //newsFeed will be null before init
        //if(newsFeed!=null)
        //newsFeed.revalidate();
    }

    //Method to update any follower's UI automatically
    private void updateOthers(){
        ArrayList<String> followerList = myUser.getUserFollowers();
        for(String ID: followerList){
            User tempUser = AdminControlPanel.accessUser(ID);
            UserView tempUserView = AdminControlPanel.accessUserView(tempUser);
            tempUserView.updateFollowList();
            tempUserView.updateNewsList();
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public User getMyUser() {
        return myUser;
    }
}
