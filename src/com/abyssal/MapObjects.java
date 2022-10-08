package com.abyssal;

public class MapObjects {

    public final static String RedColor = "\033[0;31m";
    public final static String GreenColor = "\033[0;32m";
    public final static String BlueColor = "\033[0;34m";
    public final static String YellowColor = "\033[0;33m";
    public final static String DefaultColor = "\033[0m";
    public final static String PurpleColor = "\033[0;35m";

    public final static String wall = BlueColor  +  " # " + DefaultColor;
    public final static String player = RedColor +  " @ " + DefaultColor;
    public final static String money = GreenColor + " $ " + DefaultColor;
    public final static String door = PurpleColor + " % " + DefaultColor;
    public final static String key = YellowColor +  " ± " + DefaultColor;
    public final static String space = "   ";

}
