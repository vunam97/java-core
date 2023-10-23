package backend.service;

import backend.repository.IUserRepository;
import backend.repository.UserRepository;
import entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UserService implements IUserService {
    private IUserRepository repository = new UserRepository();

    @Override
    public List<User> findAll() throws SQLException, IOException {
        return repository.findAll();
    }

    @Override
    public User findById(int id) throws SQLException, IOException {
        return repository.findById(id);
    }

    @Override
    public User findByEmailAndPassword(String email, String password) throws SQLException, IOException {
        return repository.findByEmailAndPassword(email, password);
    }

    @Override
    public int create(User user) throws SQLException, IOException {
        return repository.create(user);
    }

    @Override
    public int update(User user) throws SQLException, IOException {
        return repository.update(user);
    }

    @Override
    public int deleteById(int id) throws SQLException, IOException {
        return repository.deleteById(id);
    }
}
