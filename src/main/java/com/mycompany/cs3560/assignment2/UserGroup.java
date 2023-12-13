package com.mycompany.cs3560.assignment2;

import java.util.ArrayList;

import com.mycompany.cs3560.assignment2.DesignPatterns.CompositePattern.Component;
import com.mycompany.cs3560.assignment2.DesignPatterns.VisitorPattern.Visitor;
import com.mycompany.cs3560.assignment2.DesignPatterns.VisitorPattern.VisitorClient;

public class UserGroup implements Component, VisitorClient{
    private String userGroupID="";
    private ArrayList<Object> holder = new ArrayList<Object>();
    private Long creationTime = 999L;

    //Constructor
    UserGroup(String givenID){
        userGroupID=givenID;
    }

    //Composite Pattern
    @Override
    public void displayContent() {
        for (int i = 0; i < holder.size(); i++) {
            Object obj = holder.get(i);

            if(obj.getClass().getName().equals("User")){
                User tempUser = (User)obj;
                tempUser.displayContent(); 
            }

            if(obj.getClass().getName().equals("UserGroup")){
                UserGroup tempGroup = (UserGroup)obj;
                System.out.println("Group: "+ tempGroup.getUserGroupID());
            }
        }
    }

    public void addUser(User givenUser){
        if(!holder.contains(givenUser)){
            holder.add(givenUser);
        }
    }

    public void addGroup(UserGroup userGroup){
        if(!holder.contains(userGroup)){
            holder.add(userGroup);
        }
    }
    
    
    //Getters and Setters
    public ArrayList<Object> getHolder() {
        return holder;
    }

    public String getUserGroupID() {
        return userGroupID;
    }
    
    public void setUserGroupID(String userGroupID) {
        this.userGroupID = userGroupID;
    }
    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }
    public Long getCreationTime() {
        return creationTime;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
