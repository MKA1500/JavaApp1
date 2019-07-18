package com.mka;

import java.awt.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        byte myAge = 30;
        int viewsCount = 1_100_022_234;
        long bigViewsCount = 5_100_022_234L;
        float price = 10.99F;
        char letter = 'A';
        boolean isOk = false;

        Date now = new Date();
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point2.x = 2;
        String message = "Hello World" + "!";

        System.out.println(point1);
        System.out.println(viewsCount);
        System.out.println(now);
        System.out.println(message.endsWith("!"));
        System.out.println(message.startsWith("!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("o"));
        System.out.println(message.replace("o", "y"));
    }
}
