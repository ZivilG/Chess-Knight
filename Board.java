package com.company;

/**
 * Created by Zivile on 2017-01-04.
 */
public class Board {
    int width = 8;
    int height = 8;
    String area[][] = new String[height][width];
    String[] letters = {"A","B","C","D","E","F","G","H"};
    String[] numbers = {"1","2","3","4","5","6","7","8"};
    String letter;
    String number;
    int x;
    int y;


    void fulfill(String letter, String number) {
        for (int i = numbers.length-1; i >=0; i--) {
            for (int j = 0; j < width; j++) {
                area[i][j] = letters[j] + numbers[i];
                if (letters[j].equalsIgnoreCase(letter)) x = j;
            }
            if (numbers[i].equals(number)) y = i;
        }
    }

    String returnKoord (Point Coordinate) {
        String returnKoord = letters[Coordinate.x]+numbers[Coordinate.y];
        return returnKoord;
    }

    int getX (){return x;};

    int getY (){return y;};


    String getNumber (String koord)
    {
        number=koord.substring(0,1);
        return number;
    };

    String getLetter (String koord)
    {
        letter=koord.substring(1);
        return letter;
    };
}