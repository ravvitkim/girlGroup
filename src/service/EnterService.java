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
    private List<Entertainment> entertainments = new ArrayList<>();
    private List<GirlGroup> groups = new ArrayList<>();

    public Connection conn = DBconn.getConnection();
    public PreparedStatement psmt = null;
    public ResultSet rs = null;
    public String sql = null;

    public List<Entertainment> getAllEntertainment() {
        System.out.println("[EnterService.getAllEntertainment]");
        try {
            sql = "SELECT e_id, name FROM entertainment";
            psmt = conn.prepareStatement(sql);
            rs = psmt.executeQuery();

            // 순회하면서 리스트에 담기
            while (rs.next()) {
                Entertainment entertainment = new Entertainment();
                entertainment.setE_id(rs.getInt("e_id"));
                entertainment.setName(rs.getString("name"));
                entertainments.add(entertainment);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return entertainments;
    }

    public List<GirlGroup> getGroups(int enterId) {
        System.out.println("[EnterService.getGroups]");
        try {
            sql = "SELECT g_id, name, debut FROM girl_group WHERE enter_id = ?";
            psmt = conn.prepareStatement(sql);
            psmt.setInt(1, enterId);
            rs = psmt.executeQuery();

            while (rs.next()) {
                GirlGroup girlGroup = new GirlGroup();
                girlGroup.setG_id(rs.getInt("g_id"));
                girlGroup.setName(rs.getString("name"));
                girlGroup.setDebut(rs.getDate("debut").toLocalDate());
                groups.add(girlGroup);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return groups;
    }
}

