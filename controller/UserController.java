package controller;

import builder.UserBuilder;
import model.UserDTO;
import service.UserService;
import serviceImpl.UserServiceImpl;

import java.util.Map;
import java.util.Scanner;

public class UserController{
    UserService user;

    public UserController() {
        this.user = UserServiceImpl.getInstance();
    }

    public String addUsers() {
        String msg = user.addUsers();
        return msg;
    }
    public String countUsers(){
        System.out.println("회원수");
        return user.countUsers();
    }

    public String login(Scanner sc) {
        System.out.println("로그인할 ID" +
                "비밀번호" +
                "를 입력해주세요");
        return user.login(new UserBuilder()
                .username(sc.next())
                .password(sc.next())
                .build());
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
        return user.join(new UserBuilder()
                .username(sc.next())
                .password(sc.next())
                .confirmPassword(sc.next())
                .name(sc.next())
                .address(sc.next())
                .job(sc.next())
                .build());
    }

    public Map<String, UserDTO> getUserMap() {
        System.out.println("전체 목록 출력");
        return user.getUserMap();
    }

}