package com.mycompany.cs3560.assignment2.DesignPatterns.VisitorPattern;

import com.mycompany.cs3560.assignment2.User;
import com.mycompany.cs3560.assignment2.UserGroup;

public interface Visitor {
    public void visitUser(User user);
    public void visitGroup(UserGroup group);
}
