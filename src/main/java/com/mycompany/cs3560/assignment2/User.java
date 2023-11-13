package com.mycompany.cs3560.assignment2;

import java.util.ArrayList;

import com.mycompany.cs3560.assignment2.DesignPatterns.CompositePattern.Component;
import com.mycompany.cs3560.assignment2.DesignPatterns.VisitorPattern.Visitor;
import com.mycompany.cs3560.assignment2.DesignPatterns.VisitorPattern.VisitorClient;

public class User implements Component, VisitorClient {
    private String userID ="";
    private ArrayList<String> userFollowers= new ArrayList<String>();
    private ArrayList<String> userFollowing = new ArrayList<String>();
    private ArrayList<String> userNews = new ArrayList<String>();

    //Constructor 
    User(String givenID){
        userID=givenID;
    }

    //Observer Pattern methods

    //subject method to make a post
    public void makePost(String post){
        post= userID+": "+post;
        userNews.add(post);
        for(String ID: userFollowers){
            updateFeed(ID, post);
        }
        AdminControlPanel.gatherMessage(post);
    }

    //Observer method to observe followed posts
    public void updateFeed(String ID, String post){
        ArrayList<String> followerNews = AdminControlPanel.accessUser(ID).getUserNews();
        followerNews.add(post);
        AdminControlPanel.accessUser(ID).setUserNews(followerNews);
        
    }
    //Subject method to follow another user
    public void follow(String givenID, User givenUser, User requestingUser){
        if(!userFollowing.contains(givenID)&&givenUser!=null){
            userFollowing.add(givenID);
        }
        givenUser.updateFollowers(requestingUser.getUserID(), requestingUser);
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

    public ArrayList<String> getUserFollowing() {
        return userFollowing;
    }

    public ArrayList<String> getUserFollowers() {
        return userFollowers;
    }

    public ArrayList<String> getUserNews() {
        return userNews;
    }

    public void setUserNews(ArrayList<String> userNews) {
        this.userNews = userNews;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    


}
