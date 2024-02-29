package controller;

import builder.UserBuilder;
import model.UserDTO;
import service.UserService;
import serviceImpl.UserServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserController{
    UserService userService;

    public UserController() {
        this.userService = UserServiceImpl.getInstance();
    }

    public static List<UserDTO> findUsersByName(Scanner sc) {
        System.out.println("이름으로 검색");
        return userService.findUsersByName(sc.next());
    }

    public String join(Scanner sc) {
        System.out.println("ID, " +
                "비밀번호, " +
                "비밀번호 확인, " +
                "이름, " +
                "주민번호, " +
                "전화번호, " +
                "주소, " +
                "직업을 입력해주세요");
        return userService.join(new UserBuilder()
                .username(sc.next())
                .password(sc.next())
                .confirmPassword(sc.next())
                .name(sc.next())
                .address(sc.next())
                .job(sc.next())
                .build());
    }
    public String login(Scanner sc) {
        System.out.println("로그인할 ID" +
                "비밀번호" +
                "를 입력해주세요");
        return userService.login(new UserBuilder()
                .username(sc.next())
                .password(sc.next())
                .build());
    }
    public String findUserById(Scanner sc) {
        System.out.println("아이디를 바꾸시려면 이름과 전화번호를 입력해주세요");
        return userService.login(new UserBuilder()
                .name(sc.next())
                .phoneNumber(sc.next())
                .build());
    }

    public String updatePassword(Scanner sc) {
        System.out.println("비밀번호 변경하실 " +
                "아이디 " +
                "를 입력해주세요");
        return userService.updatePassword(new UserBuilder()
                .username(sc.next())
                .build());
    }

    public String addUsers() {
        String msg = userService.addUsers();
        return msg;
    }
    public String countUsers(){
        System.out.println("회원수");
        return userService.countUsers();
    }

    public Map<String, UserDTO> getUserMap() {
        System.out.println("전체 목록 출력");
        return userService.getUserMap();
    }
}