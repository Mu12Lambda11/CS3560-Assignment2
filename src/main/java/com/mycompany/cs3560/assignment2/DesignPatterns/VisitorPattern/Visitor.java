package com.mycompany.cs3560.assignment2.DesignPatterns.VisitorPattern;

import com.mycompany.cs3560.assignment2.User;
import com.mycompany.cs3560.assignment2.UserGroup;
import com.mycompany.cs3560.assignment2.UserView;

public interface Visitor {
    public void visit(User user);
    public void visit(UserGroup group);
    public void visit(UserView userview);
}
