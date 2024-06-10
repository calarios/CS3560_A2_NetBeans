/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package testing;

//IMPORTANT THINGS TO IMPORT
import javax.swing.*;
import javax.swing.tree.*;
import java.util.*;

/**
 *
 * @author Carlos
 */

//ADMIN CONTROL GUI CLASS
public class adminControlGUI extends javax.swing.JFrame
{
    //IMPORTANT VARIABLES, SELF EXPLANATORY VARIABLES
    private final Map<String, User> users;
    private final Map<String, UserGroup> groups;
    private int userIDCounter;
    private int groupIDCounter;

    //CONSTRUCTOR
    public adminControlGUI()
    {
        //IMPORTANT FOR ADMIN CONTROL GUI    
        users = new HashMap<>();
        groups = new HashMap<>();
        userIDCounter = 1;
        groupIDCounter = 1;
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

        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        showUserTotal = new javax.swing.JButton();
        showGroupTotal = new javax.swing.JButton();
        showMessagesTotal = new javax.swing.JButton();
        showPositivePercentage = new javax.swing.JButton();
        openUserView = new javax.swing.JButton();
        addUser = new javax.swing.JButton();
        addGroup = new javax.swing.JButton();
        UserIDLabel = new javax.swing.JLabel();
        GroupIDLabel = new javax.swing.JLabel();
        userIDTextField = new javax.swing.JTextField();
        groupIDTextField = new javax.swing.JTextField();
        treeViewScroll = new javax.swing.JScrollPane();
        treeViewJ = new javax.swing.JTree();
        TITLE = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        showUserTotal.setText("Show User Total");
        showUserTotal.addActionListener(this::showUserTotalActionPerformed);
        showUserTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showUserTotalActionPerformed(evt);
            }
        });

        showGroupTotal.setText("Show Group Total");
        showGroupTotal.addActionListener(this::showGroupTotalActionPerformed);
        showGroupTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showGroupTotalActionPerformed(evt);
            }
        });

        showMessagesTotal.setText("Show Messages Total");
        showMessagesTotal.addActionListener(this::showMessagesTotalActionPerformed);
        showMessagesTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMessagesTotalActionPerformed(evt);
            }
        });

        showPositivePercentage.setText("Show Positive Percentage");
        showPositivePercentage.addActionListener(this::showPositivePercentageActionPerformed);
        showPositivePercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPositivePercentageActionPerformed(evt);
            }
        });

        openUserView.setText("Open User View");
        openUserView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openUserViewActionPerformed(evt);
            }
        });

        addUser.setText("Add User");
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });

        addGroup.setText("Add Group");
        addGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGroupActionPerformed(evt);
            }
        });
        addGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGroupActionPerformed(evt);
            }
        });

        UserIDLabel.setText("User ID:");

        GroupIDLabel.setText("Group ID:");

        userIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIDTextFieldActionPerformed(evt);
            }
        });

        // Create the root node and initialize the JTree
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Root");
        DefaultTreeModel treeModel = new DefaultTreeModel(rootNode);
        treeViewJ = new javax.swing.JTree(treeModel);
        treeViewScroll.setViewportView(treeViewJ);
        treeViewJ.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                treeViewJHierarchyChanged(evt);
            }
        });
        treeViewJ.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                treeViewJAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                treeViewJAncestorRemoved(evt);
            }
        });
        // Added listeners for treeViewJ
        treeViewJ.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                treeViewJHierarchyChanged(evt);
            }
        });
        treeViewJ.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                treeViewJAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {}
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                treeViewJAncestorRemoved(evt);
            }
        });
        treeViewScroll.setViewportView(treeViewJ);

        TITLE.setText("Admin Control Graphical User Interface");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TITLE, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(treeViewScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(openUserView)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(showMessagesTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(showUserTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(showPositivePercentage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(showGroupTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(UserIDLabel)
                                    .addComponent(GroupIDLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userIDTextField)
                                    .addComponent(groupIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(addUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addGroup))))
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TITLE, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addUser)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(UserIDLabel)
                                        .addComponent(userIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(addGroup)
                                    .addComponent(groupIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(GroupIDLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(openUserView)
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(showUserTotal)
                            .addComponent(showGroupTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(showMessagesTotal)
                            .addComponent(showPositivePercentage)))
                    .addComponent(treeViewScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userIDTextFieldActionPerformed

    private void treeViewJHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_treeViewJHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_treeViewJHierarchyChanged

    private void treeViewJAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_treeViewJAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_treeViewJAncestorAdded

    
    //IMPORTANT FOR OPENING USER VIEW GUI IN OPEN USER VIEW BUTTON
    private void openUserViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openUserViewActionPerformed
        // TODO add your handling code here:
        
        //NEED TO SELECT USER IN THE TREE SO THAT OPEN USER VIEW BUTTON CAN DO ITS TASK
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) treeViewJ.getLastSelectedPathComponent();
        if (selectedNode == null) {
            JOptionPane.showMessageDialog(this, "Please select a user to open", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //SELECTED NODE
        String nodeText = selectedNode.toString();
        String[] parts = nodeText.split(" ");
        String userID = parts[1];

        //MAKING SURE THAT IT'S USER ID
        User user = null;
        for (User u : users.values()) {
            if (u.getId().equals(userID)) {
                user = u;
                break;
            }
        }

        //PASSED TO USER VIEW GUI, OR ELSE, ERROR MESSAGE
        if (user != null) {
            UserViewGUI userViewGUI = new UserViewGUI(user.getName(), user.getId(), this);
            userViewGUI.setVisible(true);
            user.setUserViewGUI(userViewGUI);
        } else {
            JOptionPane.showMessageDialog(this, "User View not available for this user", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_openUserViewActionPerformed

    private void treeViewJAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_treeViewJAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_treeViewJAncestorRemoved

    private void addGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGroupActionPerformed
        // TODO add your handling code here:
        
        //GET TEXT FROM TEXTFIELD
        String groupName = groupIDTextField.getText();
        
        //MAKING SURE TEXTFIELD IS NOT EMPTY
        if (groupName.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Group ID cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //MODEL OF TREE TO ADD COMPONENT
        DefaultTreeModel model = (DefaultTreeModel) treeViewJ.getModel();
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) treeViewJ.getLastSelectedPathComponent();

        //SELECT NODE
        if (selectedNode == null)
        {
            JOptionPane.showMessageDialog(this, "Please select a node to add the group to", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //ADDS GROUP
        UserGroup newGroup = new UserGroup("Group " + groupIDCounter++, groupName);
        groups.put(newGroup.getId(), newGroup);
        
        DefaultMutableTreeNode newGroupNode = new DefaultMutableTreeNode(newGroup.getId() + " - " + newGroup.getName());
        selectedNode.add(newGroupNode);
        model.reload();
    }//GEN-LAST:event_addGroupActionPerformed

    private void showUserTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showUserTotalActionPerformed
        // TODO add your handling code here:
        // POPUP FOR THE TOTAL NUMBER OF USERS
        JOptionPane.showMessageDialog(this, "Total User Count: " + users.size(), "User Total", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_showUserTotalActionPerformed

    private void showGroupTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showGroupTotalActionPerformed
        // TODO add your handling code here:
        // POPUP FOR THE TOTAL NUMBER OF GROUPS
        JOptionPane.showMessageDialog(this, "Total Group Count: " + groups.size(), "Group Total", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_showGroupTotalActionPerformed

    private void showMessagesTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMessagesTotalActionPerformed
        // TODO add your handling code here:
        // TOTAL AMOUNT OF MESSAGES FOR EACH USER
        int totalMessages = 0;
        for (User user : users.values()) 
        {
            totalMessages += user.getPosts().size();
        }
        JOptionPane.showMessageDialog(this, "Total Messages Count: " + totalMessages, "Messages Total", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_showMessagesTotalActionPerformed

    private void showPositivePercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPositivePercentageActionPerformed
        // TODO add your handling code here:
        // CALCULATE POSITIVE MESSAGES
        int totalMessages = 0;
        int positiveMessages = 0;
        for (User user : users.values()) 
        {
            for (String post : user.getPosts()) 
            {
                totalMessages++;
                if (isPositive(post))
                {
                    positiveMessages++;
                }
            }
        }

        //CALCULATION OF POSITIVE PERCENTAGE
        if(totalMessages == 0)
        {
            totalMessages = 1;
        }
        double positivePercentage = (double) positiveMessages / totalMessages * 100;
        JOptionPane.showMessageDialog(this, String.format("Positive Message Percentage: %.2f%%", positivePercentage), "Positive Percentage", JOptionPane.INFORMATION_MESSAGE);
                
    }//GEN-LAST:event_showPositivePercentageActionPerformed

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
        // TODO add your handling code here:
        
        //ADD USER TO TREE
        String userName = userIDTextField.getText();
        if (userName.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "User ID cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //TREE
        DefaultTreeModel model = (DefaultTreeModel) treeViewJ.getModel();
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) treeViewJ.getLastSelectedPathComponent();
        
        //CHECK IF NODE IS NOT SELECTED
        if (selectedNode == null) 
        {
            JOptionPane.showMessageDialog(this, "Please select a node to add the user to", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //ADD USER TO TREE, USER ID IS WITHIN A COUNTER
        User newUser = new User(String.valueOf(userIDCounter++), userName);
        users.put(newUser.getId(), newUser);
        
        //ADD USER
        DefaultMutableTreeNode newUserNode = new DefaultMutableTreeNode("ID: " + newUser.getId() + " - " + newUser.getName());
        selectedNode.add(newUserNode);
        model.reload();
    }//GEN-LAST:event_addUserActionPerformed

    //SEE IF MESSAGE IS POSITIVE
    private boolean isPositive(String message)
    {
        // KEYWORDS
        String[] positiveKeywords = {"good", "great", "excellent"};
        
        // BOOLEAN CHECK
        for (String keyword : positiveKeywords) 
        {
            if (message.toLowerCase().contains(keyword)) 
            {
                return true;
            }
        }
        return false;
    }

    // METHOD TO CONNECT TO USERVIEW GUI
    protected User getUserById(String userId)
    {
        return users.get(userId);
    }

    //MAIN
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(() -> 
        {
            new adminControlGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GroupIDLabel;
    private javax.swing.JLabel TITLE;
    private javax.swing.JLabel UserIDLabel;
    private javax.swing.JButton addGroup;
    private javax.swing.JButton addUser;
    private javax.swing.JTextField groupIDTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTree jTree1;
    private javax.swing.JButton openUserView;
    private javax.swing.JButton showGroupTotal;
    private javax.swing.JButton showMessagesTotal;
    private javax.swing.JButton showPositivePercentage;
    private javax.swing.JButton showUserTotal;
    private javax.swing.JTree treeViewJ;
    private javax.swing.JScrollPane treeViewScroll;
    private javax.swing.JTextField userIDTextField;
    // End of variables declaration//GEN-END:variables

    //USER CLASS
    class User {
        
        //IMPORTANT VARIABLES
        private final String id;
        private final String name;
        private UserViewGUI userViewGUI;
        private final List<User> following;
        private final List<String> posts;
        private final List<User> followers;
        
        //CONSTRUCTOR FOR USER
        public User(String id, String name)
        {
            this.id = id;
            this.name = name;
            this.following = new ArrayList<>();
            this.posts = new ArrayList<>();
            this.followers = new ArrayList<>(); // Initialize followers list
        }
        
        //GET ID
        public String getId()
        {
            return id;
        }
        
        //GET NAME
        public String getName() 
        {
            return name;
        }
        
        //USER VIEW GUI
        public UserViewGUI getUserViewGUI() 
        {
            return userViewGUI;
        }

        //SET USER VIEW GUI
        public void setUserViewGUI(UserViewGUI userViewGUI) 
        {
            this.userViewGUI = userViewGUI;
        }
        
        //FOLLOW USER
        public void followUser(User user) 
        {
            if (!following.contains(user)) 
            {            
                following.add(user);            
                user.addFollower(this); // Add the current user as a follower
            }
        }
        
        //ADD POST
        public void addPost(String post) 
        {
            posts.add(post);
            notifyFollowers(post); // Notify followers of the new post
        }

        //GET POSTS OF CERTAIN USERS
        public List<String> getPosts() 
        {
            return posts;
        }

        //GET FOLLOWING OF USERS
        public List<User> getFollowing() 
        {
            return following;
        }

        //GET FOLLOWERS
        public List<User> getFollowers() 
        {
            return followers;
        }

        //ADD FOLLOWER
        private void addFollower(User user) 
        {
            //SO LONG AS FOLLOWER DOESN'T ALREADY CONTAIN A USER
            if (!followers.contains(user)) 
            {
                followers.add(user);
            }
        }

        //NOTIFY FOLLOWERS FOR NEWS FEED OF USER VIEW GUI
        private void notifyFollowers(String post) 
        {
            for (User follower : followers) 
            {
                if (follower.getUserViewGUI() != null) 
                {
                    follower.getUserViewGUI().addToNewsFeed(this.name + ": " + post);
                }
            }
        }
    }
    
    //USER GROUP CLASS
    class UserGroup
    {
        //IMPORTANT VARIABLES FOR THE GROUP
        private final String id;
        private final String name;

        //CONSTRUCTOR FOR THE GROUP
        public UserGroup(String id, String name) 
        {
            this.id = id;
            this.name = name;
        }

        //GET ID
        public String getId() 
        {
            return id;
        }

        //GET NAME
        public String getName() 
        {
            return name;
        }
    }
}