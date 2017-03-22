/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.upper2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Upper2 {

    public static long pow(long l) {

        if (l == 1) {
            return 1;
        }
        if ((l & 1) == 1) {

            return 0;
        }

        return pow(l >> 1);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число больше 1: ");
        long input = in.nextLong();
        if (input >= 2) {
            System.out.print("Число " + input + ((pow(input) == 0) ? " не " : " ") + "является степенью 2");
        } else {
            System.out.println("Неверный ввод: " + input);
        }

    }

}
