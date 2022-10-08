package com.abyssal;

import java.util.Scanner;

public class Main {

    public static String map[][] = new String[17][17];
    public static String cmd;
    public static int posX = 6, posY = 7;
    public static boolean game = true;
    public static boolean hasKey = false;
    public static int score = 0;

    public static void main(String[] args) {

        generateMap();
        generateRoom(DungeonRooms.room3, 0, 0);
        generateRoom(DungeonRooms.room1, 12, 0);
        generateRoom(DungeonRooms.room2,0,12);
        while(game){
            drawMap();
            if(score == 4){
                game = false;
                System.out.println("Congratulations! Your final score is: " + score);
            }
        }


    }

    public static void generateMap(){
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                if(y > 0 && y < (map.length - 1) && x > 0 && x < (map[y].length - 1)){
                    map[y][x] = MapObjects.space;

                }else {
                    map[y][x] = MapObjects.wall;
                }
            }
        }
    }

    public static void drawMap(){
            for (int y = 0; y < map.length; y++) {
                for (int x = 0; x < map[y].length; x++) {


                    if(x == posX && y == posY) {
                        map[y][x] = MapObjects.player;
                    }

                    System.out.print(map[y][x]);
                }
                System.out.println();
            }

            System.out.println("Your Score is: " + score);
            Scanner input = new Scanner(System.in);
            cmd = input.nextLine();

        switch (cmd.toLowerCase()) {
            case "right" -> {
                movePlayer(1, 0);
                checkCollision(1, 0);
            }
            case "left" -> {
                movePlayer(-1, 0);
                checkCollision(-1, 0);
            }
            case "up" -> {
                movePlayer(0, -1);
                checkCollision(0, -1);
            }
            case "down" -> {
                movePlayer(0, 1);
                checkCollision(0, 1);
            }
        }




    }

    public static void generateRoom(String room[][], int posX, int posY) {
        for (int y = 0; y < room.length; y++) {
            for (int x = 0; x < room[y].length; x++) {
                if (x < room[0].length && y < room.length) {
                    map[y + posY][x + posX] = room[y][x];

                    //Check if overlapping room walls(with the map border) have holes. if so fill them
                    if (y + posY == 0 || y + posY == map.length - 1 || x + posX == 0 || x + posX == map[y].length - 1) {
                        map[y + posY][x + posX] = MapObjects.wall;
                    }

                }

            }
        }
    }

    public static void movePlayer(int x, int y){
        map[posY][posX] = MapObjects.space;
        if(!(map[posY + y][posX + x].equals(MapObjects.wall) || map[posY + y][posX + x].equals(MapObjects.door) && !hasKey)){
            posX += x;
            posY += y;
        }
    }

    public static void checkCollision(int x, int y) {
            if (map[posY][posX].equals(MapObjects.money)) {
                score += 1;
            } else if (map[posY][posX].equals(MapObjects.key)) {
                hasKey = true;
                System.out.println("You got a KEY!");
            } else if (map[posY + y][posX + x].equals(MapObjects.door) && !hasKey) {
                System.out.println("The door is LOCKED!");
            } else if (map[posY + y][posX + x].equals(MapObjects.door) && hasKey) {
                System.out.println("You have UNLOCKED the door!");
            }

    }

}

