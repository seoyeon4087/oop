package serviceImpl;

import builder.UserBuilder;
import model.UserDTO;
import service.UserService;
import service.UtilService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {
    private static UserService instance = new UserServiceImpl();
    Map<String, UserDTO> users;

    private UserServiceImpl() {
        this.users = new HashMap<>();
    }

    public static UserService getInstance() {
        return instance;
    }

    @Override
    public String addUsers() {
        Map<String, UserDTO> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();

        for (int i = 0; i < 5; i++) {
            String username = util.createRandomUsername();
            map.put(username,
                    new UserBuilder()
                            .username(username)
                            .password("1")
                            .confirmPassword("1")
                            .name(util.createRandomName())
                            .build());
        }
        users = map;
        return users.size() + "개 더미값 추가";

    }

    @Override
    public String join(UserDTO user) {
        users.put(user.getUsername(), user);
        return "회원가입 성공";
    }

    @Override
    public String login(UserDTO user) {
        String msg = "";
        UserDTO userInMap = users.get(user.getUsername());
        if (userInMap == null) {
            msg = "아이디가 일치하지 않습니다.";
        } else if (userInMap.getPassword().equals(user.getPassword())){
            msg = "로그인 성공";
        } else {
            msg = "비밀번호가 일치하지 않습니다.";
        }
        return msg;
    }

    @Override
    public UserDTO findUserById(String username) {
        return null;
    }

    @Override
    public String updatePassword(UserDTO user) {
        return null;
    }

    @Override
    public String deleteUser(String username) {
        return null;
    }

    @Override
    public List<UserDTO> getUserList() {
        return null;
    }

    @Override
    public List<UserDTO> findUsersByName(String name) {
        return null;
    }

    @Override
    public List<UserDTO> findUsersByJob(String job) {
        return null;
    }

    @Override
    public String countUsers() {
        return users.size()+"";
    }

    @Override
    public Map<String, UserDTO> getUserMap() {
        return users;
    }
}
