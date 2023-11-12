package com.mycompany.cs3560.assignment2;

import java.util.ArrayList;
import java.util.Hashtable;

import com.mycompany.cs3560.assignment2.DesignPatterns.CompositePattern.Component;

public class User implements Component {
    private String userID ="";
    private ArrayList<String> userFollowers= new ArrayList<String>();
    private ArrayList<String> userFollowing = new ArrayList<String>();
    private ArrayList<String> userNews = new ArrayList<String>();

    //Constructor Patterns
    User(String givenID){
        userID=givenID;
    }

    //Observer Pattern methods

    //subject method to make a post
    public void makePost(String post){
        userNews.add(post);
        for(String ID: userFollowers){
            updateFeed(ID, post);
        }
        
    }

    //Observer method to observe followed posts
    public void updateFeed(String ID, String post){
        Hashtable<String,User> allUsers= AdminControlPanel.getAllUsers();
        ArrayList<String> followerNews = allUsers.get(ID).getUserNews();
        followerNews.add(post);
        allUsers.get(ID).setUserNews(followerNews);
        
    }
    //Subject method to follow another user
    public void follow(String givenID, User givenUser, User requestingUser){
        if(!userFollowing.contains(givenID)){
            userFollowing.add(givenID);
        }
        givenUser.updateFollowers(givenID, requestingUser);
    }
    //Observer response method to being followed
    public void updateFollowers(String givenID, User givenUser){
        if(!userFollowers.contains(givenID)){
            userFollowers.add(givenID);
        }
    }

    //Composite Pattern
    @Override
    public void displayContent() {
        System.out.println("UserID:"+userID);
    } 

    //All the getters and setters.
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    

    public ArrayList getUserNews() {
        return userNews;
    }

    public void setUserNews(ArrayList userNews) {
        this.userNews = userNews;
    }
    


}
