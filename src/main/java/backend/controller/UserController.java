package backend.controller;

import backend.service.IUserService;
import backend.service.UserService;
import entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UserController implements IUserController {
    private IUserService service = new UserService();

    @Override
    public List<User> findAll() throws SQLException, IOException {
        return service.findAll();
    }

    @Override
    public User findByEmailAndPassword(String email, String password) throws SQLException, IOException {
        return service.findByEmailAndPassword(email, password);
    }

    @Override
    public User findById(int id) throws SQLException, IOException {
        return service.findById(id);
    }

    @Override
    public int create(User user) throws SQLException, IOException {
        return service.create(user);
    }

    @Override
    public int update(User user) throws SQLException, IOException {
        return service.update(user);
    }

    @Override
    public int deleteById(int id) throws SQLException, IOException {
        return service.deleteById(id);
    }
}
