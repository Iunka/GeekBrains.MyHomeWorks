package Lesson_3;

import java.util.Random;
import java.util.Scanner;

public class Lesson_3_TicToc {

    //
    private static int fieldSizeX;
    private static int fieldSizeY;
    private static char[][] field;

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    private static final char human_dot = 'X';
    private static final char ai_dot = 'O';
    private static final char empty_dot = '_';

    //init field
    private static void initMap(){
        fieldSizeX = 5;
        fieldSizeY = 5;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++){
            for (int x = 0; x < fieldSizeX; x++){
                field[y][x] = empty_dot;
            }
        }
    }
    //print field
    private static void printMap(){
        System.out.println("-------");
        for (int y = 0; y < fieldSizeY; y++){
            System.out.print("|");
            for (int x = 0; x < fieldSizeX; x++){
                System.out.print(field[y][x] + "|");
            }
        }
    }

}
