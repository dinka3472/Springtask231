package web.sevice;

import web.entities.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public User getUser(int id);

    public void deleteUser(int id);

    public void saveUser(User user);

    public void updateUser(User user);
}
