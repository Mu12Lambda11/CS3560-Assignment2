package com.mycompany.cs3560.assignment2;

import java.util.ArrayList;

public class User {
    private String userID ="";
    private ArrayList userFollowers = new ArrayList<String>();
    private ArrayList userFollowing = new ArrayList<String>();
    private ArrayList userNews = new ArrayList<String>();

    public void makePost(){

    }

    public void follow(String givenID){
        
    }

    //All the getters and setters.
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public ArrayList getUserFollowers() {
        return userFollowers;
    }

    public void setUserFollowers(ArrayList userFollowers) {
        this.userFollowers = userFollowers;
    }

    public ArrayList getUserFollowing() {
        return userFollowing;
    }

    public void setUserFollowing(ArrayList userFollowing) {
        this.userFollowing = userFollowing;
    }

    public ArrayList getUserNews() {
        return userNews;
    }

    public void setUserNews(ArrayList userNews) {
        this.userNews = userNews;
    }
    


}
