package com.mycompany.cs3560.assignment2;

public class Driver {
    public static void main(String[] args) {
        AdminControlPanel admin = new AdminControlPanel();
        UserView user = new UserView();
        admin.setVisible(true);
        user.setVisible(true);
    }
}
