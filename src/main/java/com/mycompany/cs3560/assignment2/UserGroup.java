package com.mycompany.cs3560.assignment2;

import java.util.ArrayList;
import java.util.Random;

public class UserGroup {
    private String userGroupID="";
    private ArrayList<Object> holder = new ArrayList<Object>();


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
