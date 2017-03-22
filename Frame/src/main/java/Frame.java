
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Frame {

    /**
     * @param args the command line arguments
     */
    private static Scanner reader = new Scanner(System.in);
    

    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner input = new Scanner(System.in);
        System.out.println("");
        //System.out.println("Ваша ФИО");

        printFrame();
    }

    public static void printFrame(/*String l, String f, String p*/) {
        Scanner input = new Scanner(System.in);
        String l,f,p;
        System.out.println("Ввод только латинецей");
        System.out.println("Фамилия ?");
        l = input.nextLine();
        System.out.println("Имя ?");
        f = input.nextLine();
        System.out.println("Отчество ?");
        p = input.nextLine();
        StringBuilder fio = new StringBuilder();
                fio.append(l).append(" ").append(f).append(" ").append(p);

        StringBuilder level = new StringBuilder();
        level.append("Курс: Java level 1");

        StringBuilder stud = new StringBuilder();
        stud.append("Студент");

        StringBuilder frame = new StringBuilder();

        if (fio.length() >= level.length()) {

            long ll = fio.length() - level.length();
            if (ll % 2 != 0) {
                level.insert(0, " ");
            }
            for (int i = 0; i < ll / 2; i++) {
                level.insert(0, " ");
                level.insert(level.length() - i, " ");
            }
            long ls = fio.length() - stud.length();
            if (ls % 2 != 0) {
                stud.insert(0, " ");
            }
            for (int i = 0; i < ls / 2; i++) {
                stud.insert(0, " ");
                stud.insert(stud.length() - i, " ");
            }

        } else {
            long ll = level.length() - fio.length();
            if (ll % 2 != 0) {
                fio.insert(0, " ");
            }
            for (int i = 0; i < ll / 2; i++) {
                fio.insert(0, " ");
                fio.insert(fio.length() - i, " ");
            }
            long ls = level.length() - stud.length();
            if (ls % 2 != 0) {
                stud.insert(0, " ");
            }
            for (int i = 0; i < ls / 2; i++) {
                stud.insert(0, " ");
                stud.insert(stud.length() - i, " ");
            }
        }

        level.insert(0, "*  ");
        level.insert(level.length(), "  *");
        fio.insert(0, "*  ");
        fio.insert(fio.length(), "  *");
        stud.insert(0, "*  ");
        stud.insert(stud.length(), "  *");
        for (int i = 0; i < fio.length(); i++) {
            frame.append("*");
        }
        System.out.println(frame.toString());
        System.out.println(level.toString());
        System.out.println(stud.toString());
        System.out.println(fio.toString());
        System.out.println(frame.toString());
    }

}
