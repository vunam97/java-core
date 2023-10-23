package backend.repository;

import entity.User;
import utils.JDBCUtil;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {
    @Override
    public List<User> findAllByProjectId(int project_id) throws SQLException, IOException {
        String sql = "SELECT * FROM users WHERE project_id = ?";
        try (
                Connection connection = JDBCUtil.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql);
        ) {
            pStmt.setInt(1, project_id);
            try (ResultSet rs = pStmt.executeQuery()) {
                List<User> users = new ArrayList<>();
                while (rs.next()) {
                    User user = new User();

                    user.setId(rs.getInt("id"));
                    user.setFullName(rs.getString("full_name"));
                    user.setEmail(rs.getString("email"));
                    user.setRole(rs.getString("role"));

                    users.add(user);
                }
                return users;
            }
        }
    }

    @Override
    public List<User> findEmployeeByProjectId(int project_id) throws SQLException, IOException {
        String sql = "SELECT * FROM users WHERE project_id = ? AND role = 'EMPLOYEE'";
        try (
                Connection connection = JDBCUtil.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql);
        ) {
            pStmt.setInt(1, project_id);
            try (ResultSet rs = pStmt.executeQuery()) {
                List<User> users = new ArrayList<>();
                while (rs.next()) {
                    User user = new User();

                    user.setId(rs.getInt("id"));
                    user.setFullName(rs.getString("full_name"));
                    user.setEmail(rs.getString("email"));
                    user.setRole(rs.getString("role"));

                    users.add(user);
                }
                return users;
            }
        }
    }

    @Override
    public List<User> findAllManager() throws SQLException, IOException {
        String sql = "SELECT * FROM users WHERE role = 'MANAGER'";
        try (
                Connection connection = JDBCUtil.getConnection();
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                ) {
            List<User> users = new ArrayList<>();
            while (rs.next()){
                User user = new User();

                user.setId(rs.getInt("id"));
                user.setFullName(rs.getString("full_name"));
                user.setEmail(rs.getString("email"));
                user.setRole(rs.getString("role"));
                user.setProject_id(rs.getInt("project_id"));

                users.add(user);
            }
            return users;
        }
    }

    @Override
    public User findByEmailAndPassword(String email, String password) throws SQLException, IOException {
        String sql = "SELECT * FROM users WHERE email = ? AND password = ?";

        try (
                Connection connection = JDBCUtil.getConnection();
                PreparedStatement pSmt = connection.prepareStatement(sql);
        ) {
            pSmt.setString(1, email);
            pSmt.setString(2, password);

            try (ResultSet rs = pSmt.executeQuery()) {
                if (rs.next()){
                    User user = new User();

                    user.setId(rs.getInt("id"));
                    user.setFullName(rs.getString("full_name"));
                    user.setEmail(rs.getString("email"));
                    user.setPassword(rs.getString("password"));
                    user.setRole(rs.getString("role"));


                    return user;
                }
                return null;
            }
        }
    }

    @Override
    public int create(User user) throws SQLException, IOException {
        String sql = "INSERT INTO users (full_name, email, password) VALUES(? ,?, ?)";

        try (
                Connection connection = JDBCUtil.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql);
        ) {
            pStmt.setString(1, user.getFullName());
            pStmt.setString(2, user.getEmail());
            pStmt.setString(3, user.getPassword());

            return pStmt.executeUpdate();
        }
    }
}
