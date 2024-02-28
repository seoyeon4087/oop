package service;

import model.UserDTO;

import java.util.List;
import java.util.Map;

public interface UserService {
    String addUsers();

    String join(UserDTO user);

    String login(UserDTO user);

    UserDTO findUserById(String username);

    String updatePassword(UserDTO user);

    String deleteUser(String username);

    List<UserDTO> getUserList();

    List<UserDTO> findUsersByName(String name);

    List<UserDTO> findUsersByJob(String job);
    
    String countUsers();

    Map<String, UserDTO> getUserMap();
}