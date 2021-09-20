import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(Task4(s))
        {
            System.out.println("Подходит");
        }
        else if (!Task4(s))
        {
            System.out.println("Не подходит");
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
        Pattern p = Pattern.compile("([0-9a-fA-F]{8})\\-([0-9a-fA-F]{4})\\-([0-9a-fA-F]{4})\\-([0-9a-fA-F]{4})\\-([0-9a-fA-F]{12})");
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
        Pattern p = Pattern.compile("[a-z]+[A-Z]+[0-9]+");
        Matcher m = p.matcher(s);
        return m.matches();
    }
}
