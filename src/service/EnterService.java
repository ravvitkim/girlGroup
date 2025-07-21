package service;

import db.DBconn;
import dto.GirlDto;
import girlGroup.Entertainment;
import girlGroup.GirlGroup;

import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EnterService {
    public List<Entertainment> entertainments = new ArrayList<>();
    private List<GirlGroup> groups = new ArrayList<>();

    public List<Entertainment> getAllEntertainment() {
        System.out.println("[EnterService.getAllEntertainment]");
        return null;
    }

    public List<GirlGroup> getGroups(int enterid) {
        System.out.println("[EnterService.getGroups]");
        return null;
    }
}

