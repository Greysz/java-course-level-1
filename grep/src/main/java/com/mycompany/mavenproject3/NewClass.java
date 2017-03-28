/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class NewClass {

    //private static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        //Scanner sc = new File();
        if (args.length > 1) {
            try {

                String word = "Smart[ао]";
                //String word = args[1];
                //Path file = Paths.get(args[0]);
                Path file = Paths.get("C:\\book.txt");
                Pattern p = Pattern.compile(".*" + word + ".*", Pattern.CASE_INSENSITIVE);
                int lines = 0;

                try {

                    BufferedReader a = Files.newBufferedReader(file);

                    StringBuilder sb = new StringBuilder();
                    String line = a.readLine();

                    while (line != null) {
                        ++lines;
                        if (p.matcher(line).matches()) {

                            sb.append(lines).append(":").append(line).append(System.lineSeparator());

                        }
                        line = a.readLine();
                    }
                    System.out.println(sb.toString());
                } catch (IOException x) {
                    // Какая то проблема
                    System.err.println(x);
                }

            } catch (Exception ex) {
                System.out.println(ex);
            }
        } else {
            System.out.println("Недостаточно аргументов.");
        }
    }

}
