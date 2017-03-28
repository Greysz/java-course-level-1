
import java.util.Random;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Tstek {
    

    public static void main(String[] args) {
        try {
            CStek<Integer> ss = new CStek<>();
            Random randInteger = new Random();
            for (int i = 0; i < 40; i++) {
                ss.push(randInteger.nextInt(250));
            }
            ss.print();
            for (int i = 0; i < 25; i++) {
                System.out.println("Move element: " + ss.pop());
            }
            System.out.println("Current length: " + ss.length());
            ss.trimToSize();
            ss.print();
            System.out.println("Current length: " + ss.length());

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}

