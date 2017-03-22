
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class bigsmall {
    private static Scanner reader= new Scanner(System.in);
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int number;
        System.out.println("Введите число");
     number = (int) input.nextInt();

        decompose(number);
    }

    public static void decompose(int val) {

        StringBuilder s = new StringBuilder();
        
        for (int temp = val; temp > 0; temp /= 10) {
            s.insert(0, temp % 10);
        }
        
        if (s.length() > 0) {
            int[] a = new int[s.length()];
            for (int i = 0; i < a.length; i++) {
                a[i] = Character.getNumericValue(s.charAt(i));
                System.out.println(a[i]);
            }
            Arrays.sort(a);
            System.out.println("Меньшее число: " + a[0]);
            System.out.println("Большее число: " + a[a.length - 1]);
        } else {
            return;
        }

    }

}


