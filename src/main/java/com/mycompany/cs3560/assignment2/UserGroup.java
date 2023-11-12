package com.mycompany.cs3560.assignment2;

import java.util.ArrayList;

import com.mycompany.cs3560.assignment2.DesignPatterns.CompositePattern.Component;

public class UserGroup implements Component{
    private String userGroupID="";
    private ArrayList<Object> holder = new ArrayList<Object>();


    //Composite Pattern
    @Override
    public void displayContent() {
        for (int i = 0; i < holder.size(); i++) {
            Object obj = holder.get(i);

            if(obj.getClass().getName().equals("User")){
                User tempUser = (User)obj;
                tempUser.displayContent(); 
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

}
