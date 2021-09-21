import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions
{
    public static void main(String[] args)
    {
        System.out.print("Введите текст:");
        String s = new Scanner(System.in).nextLine();
        System.out.print("Выберите задание(1-4):");
        String choice = new Scanner(System.in).nextLine();
        while (choice != "0") {
            switch (choice) {
                case "1":
                    if (Task1(s)) {
                        System.out.println("Подходит");
                    } else {
                        System.out.println("Не подходит");
                    }
                    break;
                case "2":
                    if (Task2(s)) {
                        System.out.println("Подходит");
                    } else {
                        System.out.println("Не подходит");
                    }
                    break;
                case "3":
                    if (Task3(s)) {
                        System.out.println("Подходит");
                    } else {
                        System.out.println("Не подходит");
                    }
                    break;
                case "4":
                    if (Task4(s)) {
                        System.out.println("Подходит");
                    } else {
                        System.out.println("Не подходит");
                    }
                    break;
            }
            System.out.print("Введите текст:");
            s = new Scanner(System.in).nextLine();
            System.out.print("Выберите задание(1-4):");
            choice = new Scanner(System.in).nextLine();
        }
    }

    static boolean Task1(String s)
    {
        Pattern pat = Pattern.compile("(1?\\d?\\d|2[0-5][0-5])\\.(1?\\d?\\d|2[0-5][0-5])\\.(1?\\d?\\d|2[0-5][0-5])\\.(1?\\d?\\d|2[0-5][0-5])");
        Matcher m = pat.matcher(s);
        return m.matches();
    }

    static boolean Task2(String s)
    {
        Pattern p = Pattern.compile("\\{?([0-9a-fA-F]{8})\\-([0-9a-fA-F]{4})\\-([0-9a-fA-F]{4})\\-([0-9a-fA-F]{4})\\-([0-9a-fA-F]{12})\\}?");
        Matcher m = p.matcher(s);
        return m.matches();
    }
    static boolean Task3(String s)
    {
        Pattern p = Pattern.compile("(https?://)?(www\\.)?[^_-]([\\w&&[^_\\s]]{2,})[^_-]\\.[\\w]{1,}");
        Matcher m = p.matcher(s);
        return m.matches();
    }
    static boolean Task4(String s)
    {
        Pattern p = Pattern.compile("(?=\\w*[0-9])(?=\\w*[A-Z])(?=\\w*[a-z]).{8,}");
        Matcher m = p.matcher(s);
        return m.matches();
    }
}
