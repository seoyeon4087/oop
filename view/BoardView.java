package view;

import builder.BoardBuilder;
import model.BoardDTO;
import service.UtilService;
import serviceImpl.UtilServiceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardView {
    public static void main() {
        List<BoardDTO> articles = new ArrayList<>();
        UtilService util = UtilServiceImpl.getInstance();

        for(int i = 0; i<5; i++){
            articles.add(new BoardBuilder()
                    .title(util.createRandomTitle())
                    .content(util.createRandomContent())
                    .writer(util.createRandomName())
                    .build());
        }


        for(BoardDTO i : articles){
            System.out.println(i.toString());
        }

        articles.forEach(i -> {
            System.out.println(i.toString());
        });

    }
}