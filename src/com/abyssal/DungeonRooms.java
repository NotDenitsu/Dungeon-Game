package com.abyssal;

public class DungeonRooms {

    public static String room1[][] = {{MapObjects.wall,MapObjects.wall,MapObjects.wall,MapObjects.wall,MapObjects.wall},
                                      {MapObjects.wall,MapObjects.space,MapObjects.space,MapObjects.space,MapObjects.wall},
                                      {MapObjects.wall,MapObjects.money,MapObjects.space,MapObjects.space,MapObjects.wall},
                                      {MapObjects.door,MapObjects.space,MapObjects.space,MapObjects.space,MapObjects.wall},
                                      {MapObjects.wall,MapObjects.wall,MapObjects.wall,MapObjects.wall,MapObjects.wall}};

    public static String room2[][] = {{MapObjects.wall,MapObjects.wall,MapObjects.space,MapObjects.wall,MapObjects.wall},
                                      {MapObjects.wall,MapObjects.space,MapObjects.space,MapObjects.space,MapObjects.wall},
                                      {MapObjects.wall,MapObjects.space,MapObjects.space,MapObjects.space,MapObjects.wall},
                                      {MapObjects.wall,MapObjects.key,MapObjects.space,MapObjects.space,MapObjects.wall},
                                      {MapObjects.wall,MapObjects.wall,MapObjects.wall,MapObjects.wall,MapObjects.wall}};

    public static String room3[][] = {{MapObjects.wall,MapObjects.wall,MapObjects.wall,MapObjects.wall,MapObjects.wall},
                                      {MapObjects.wall,MapObjects.space,MapObjects.space,MapObjects.money,MapObjects.wall},
                                      {MapObjects.wall,MapObjects.money,MapObjects.space,MapObjects.space,MapObjects.wall},
                                      {MapObjects.wall,MapObjects.space,MapObjects.money,MapObjects.space,MapObjects.wall},
                                      {MapObjects.wall,MapObjects.wall,MapObjects.wall,MapObjects.door,MapObjects.wall}};

}
