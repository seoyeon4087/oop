package service;

import model.UserDTO;

import java.util.List;
import java.util.Map;

public interface AuthService {

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

    UserDTO findUser(String username);

    Map<String, UserDTO> getUserMap();

    String count();
}
//메소드 공통점
//타입 + 메소드 이름 + 파라미터