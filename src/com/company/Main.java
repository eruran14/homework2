package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        weatherToWalk(33,-13);
        weatherToWalk(17, 23);
        weatherToWalk(56, -15);
        weatherToWalk(27, -33);
        weatherToWalk(42, 30);
        System.out.println(weatherToWalk(generateRandomAge(), 23));
    }

    public static String weatherToWalk(int personAge, int temperature) {
        String canWalk;
        if ((personAge >= 20 && personAge <= 45) && (temperature >= -20 && temperature <= 30)) {
            canWalk = "Можно идти гулять";
            System.out.println(canWalk);
        } else if (personAge < 20 && (temperature >= 0 && temperature <= 28)) {
            canWalk = "Можно идти гулять";
            System.out.println(canWalk);
        } else if (personAge > 45 && (temperature >= -10 && temperature <= 25)) {
            canWalk = "Можно идти гулять";
            System.out.println(canWalk);
        } else {
            canWalk = "Оставайтесь дома";
            System.out.println(canWalk);
        }
        return canWalk;

    }
    public static int generateRandomAge (){
        int min = 1;
        int max = 90;
        int randomAge = (int)Math.floor(Math.random() * (max - min + 1) + min);
        return randomAge;
    }
}
