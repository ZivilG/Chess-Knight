package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Board b = new Board ();
        Scanner scanner=new Scanner (System.in);
        System.out.println("Iveskite zirgo koordinates sachmatu lentoje");
        String koord=scanner.next();
        b.fulfill(b.getNumber(koord),b.getLetter(koord));
        Knight knight=new Knight(b.getX(),b.getY());
        System.out.println("Galimi zirgo ejimai:");
        while (knight.IsNextMoveAvailable()){
            Point nextMove = knight.GetNextMove();
            System.out.print(b.returnKoord(nextMove) + " ");
        }
    }

}
