import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        System.out.print("Введите текст:");
        String str = new Scanner(System.in).nextLine();
        System.out.print("Выберите задание(1-4):");
        String choice = new Scanner(System.in).nextLine();
        while (choice != "0") {
            switch (choice) {
                case "1":
                    if (isIP(str)) {
                        System.out.println("Подходит");
                    } else {
                        System.out.println("Не подходит");
                    }
                    break;
                case "2":
                    if (isGUID(str)) {
                        System.out.println("Подходит");
                    } else {
                        System.out.println("Не подходит");
                    }
                    break;
                case "3":
                    if (isURL(str)) {
                        System.out.println("Подходит");
                    } else {
                        System.out.println("Не подходит");
                    }
                    break;
                case "4":
                    if (isPassword(str)) {
                        System.out.println("Подходит");
                    } else {
                        System.out.println("Не подходит");
                    }
                    break;
            }
            System.out.print("Введите текст:");
            str = new Scanner(System.in).nextLine();
            System.out.print("Выберите задание(1-4):");
            choice = new Scanner(System.in).nextLine();
        }
    }

    static boolean isIP(String s) {
        Pattern pat = Pattern.compile("^([1-9]?\\d|1\\d\\d|2[0-5][0-5])\\.([1-9]?\\d|1\\d\\d|2[0-5][0-5])\\.([1-9]?\\d|1\\d\\d|2[0-5][0-5])\\.([1-9]?\\d|1\\d\\d|2[0-5][0-5])$");
        Matcher m = pat.matcher(s);
        return m.matches();
    }

    static boolean isGUID(String s) {
        Pattern p = Pattern.compile("^(\\{([0-9a-fA-F]{8})\\-([0-9a-fA-F]{4})\\-([0-9a-fA-F]{4})\\-([0-9a-fA-F]{4})\\-([0-9a-fA-F]{12})\\})$|" +
                "^(([0-9a-fA-F]{8})\\-([0-9a-fA-F]{4})\\-([0-9a-fA-F]{4})\\-([0-9a-fA-F]{4})\\-([0-9a-fA-F]{12}))$");
        Matcher m = p.matcher(s);
        return m.matches();
    }

    static boolean isURL(String s) {
        Pattern p = Pattern.compile("^(https?://)?(www\\.)?([a-zA-Z][-a-zA-Z0-9]*[a-zA-Z]\\.)+[a-zA-Z]{2,}(:(6553[0-5]|655[0-2][0-9]|65[0-4][0-9][0-9]|6[0-4][0-9][0-9][0-9]|[1-5][0-9]?[0-9]?[0-9]?[0-9]?|[1-9][0-9]?[0-9]?[0-9]?))?(/[\\w-\\[\\].,;:!?&$@#%()*+=~']+)*/?$");
        Matcher m = p.matcher(s);
        return m.matches();
    }

    static boolean isPassword(String s) {
        Pattern p = Pattern.compile("^(?=\\w*[0-9])(?=\\w*[A-Z])(?=\\w*[a-z])\\w{8,}$");
        Matcher m = p.matcher(s);
        return m.matches();
    }
}
