package com.mycompany.cs3560.assignment2;

import com.mycompany.cs3560.assignment2.DesignPatterns.Singleton;

public class AdminControlDriver extends Singleton{
    private int totalUsers=0;
    private int totalGroups=0;
    private int totalPosts=0;
    private float posPercentage=0;

    //All the getters and setters
    public int getTotalUsers() {
        return totalUsers;
    }
    public void setTotalUsers(int totalUsers) {
        this.totalUsers = totalUsers;
    }
    public int getTotalGroups() {
        return totalGroups;
    }
    public void setTotalGroups(int totalGroups) {
        this.totalGroups = totalGroups;
    }
    public int getTotalPosts() {
        return totalPosts;
    }
    public void setTotalPosts(int totalPosts) {
        this.totalPosts = totalPosts;
    }
    public float getPosPercentage() {
        return posPercentage;
    }
    public void setPosPercentage(float posPercentage) {
        this.posPercentage = posPercentage;
    }
}
