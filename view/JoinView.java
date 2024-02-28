package view;

import builder.UserBuilder;
import model.UserDTO;

import java.util.Scanner;

public class JoinView {
    public static void main(Scanner sc) {

        System.out.println("ID ,비밀번호, 비밀번호 확인, " +
                "이름, 주민번호, 전화번호, " +
                "주소, 직업을 입력해주세요");

        UserDTO user = new UserBuilder()
                .username(sc.next())
                .password(sc.next())
                .confirmPassword(sc.next())
                .name(sc.next())
                .regNumber(sc.next())
                .phoneNumber(sc.next())
                .address(sc.next())
                .job(sc.next())
                .build()
                ;

        System.out.println(user.toString());
    }
}
