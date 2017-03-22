
import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Patterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        Pattern fio = Pattern.compile("^[а-яА-ЯёЁЇїІіЄєҐґ'\\s-]*");
        Pattern mobile = Pattern.compile("[+]380[0-9]{2}[0-9]{7}");
        Pattern mail = Pattern.compile("^[-a-z0-9~!$%^&*_=+}{\\'?]+(\\.[-a-z0-9~!$%^&*_=+}{\\'?]+)*@([a-z0-9_][-a-z0-9_]*(\\.[-a-z0-9_]+)*\\.([a-z][a-z])|([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}))(:[0-9]{1,5})?$");
        System.out.println("Ведите ФИО (допускаются только буквы, дефис и пробел): ");
        String line = reader.nextLine();
        System.out.println("Ведите № телефона в формате +380ХХХХХХХХХ: ");
        String line2 = reader.nextLine();
        if (!mobile.matcher(line2).matches()) {
            System.out.println("№ телефона введен неправильно! Вы ввели: " + line2);
        } else {
            System.out.println("Вы ввели № телефона: " + line2);
        }
        System.out.println("Ведите валидный e-mail: ");
        String line3 = reader.nextLine();
        if (!mail.matcher(line3).matches()) {
            System.out.println("e-mail введен неправильно! Вы ввели: " + line3);
        } else {
            System.out.println("Вы ввели e-mail: " + line3);
        }

        if (!fio.matcher(line).matches()) {
            System.out.println("ФИО введено неправильно! Вы ввели: " + line);
        } else {
            System.out.println("Вы ввели ФИО : " + line);
        }
        if (!mobile.matcher(line2).matches()) {
            System.out.println("№ телефона введен неправильно! Вы ввели: " + line2);
        } else {
            System.out.println("Вы ввели № телефона: " + line2);
        }
        if (!mail.matcher(line3).matches()) {
            System.out.println("e-mail введен неправильно! Вы ввели: " + line3);
        } else {
            System.out.println("Вы ввели e-mail: " + line3);
        }
    }

}
