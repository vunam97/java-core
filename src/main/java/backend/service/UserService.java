package backend.service;

import backend.repository.UserRepository;
import entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UserService implements IUserService {
    UserRepository userRepository = new UserRepository();

    @Override
    public List<User> findAllByProjectId(int project_id) throws SQLException, IOException {
        return userRepository.findAllByProjectId(project_id);
    }

    @Override
    public List<User> findEmployeeByProjectId(int project_id) throws SQLException, IOException {
        return userRepository.findEmployeeByProjectId(project_id);
    }

    @Override
    public List<User> findAllManager() throws SQLException, IOException {
        return userRepository.findAllManager();
    }

    @Override
    public User findByEmailAndPassword(String email, String password) throws SQLException, IOException {
        return userRepository.findByEmailAndPassword(email, password);
    }

    @Override
    public int create(User user) throws SQLException, IOException {
        return userRepository.create(user);
    }
}
