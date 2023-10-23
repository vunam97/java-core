package backend.repository;

import entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
    List<User> findAllByProjectId(int project_id) throws SQLException, IOException;

    List<User> findEmployeeByProjectId(int project_id) throws SQLException, IOException;

    List<User> findAllManager() throws SQLException, IOException;

    User findByEmailAndPassword(String email, String password) throws SQLException, IOException;

    int create(User user) throws SQLException, IOException;
}
