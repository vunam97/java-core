package backend.controller;

import backend.service.UserService;
import entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UserController implements IUserController {
    UserService userService = new UserService();

    @Override
    public List<User> findAllByProjectId(int project_id) throws SQLException, IOException {
        return userService.findAllByProjectId(project_id);
    }
    @Override
    public List<User> findEmployeeByProjectId(int project_id) throws SQLException, IOException {
        return userService.findEmployeeByProjectId(project_id);
    }

    @Override
    public List<User> findAllManager() throws SQLException, IOException {
        return userService.findAllManager();
    }

    @Override
    public User findByEmailAndPassword(String email, String password) throws SQLException, IOException {
        return userService.findByEmailAndPassword(email, password);
    }

    @Override
    public int create(User user) throws SQLException, IOException {
        return userService.create(user);
    }
}
