package homework1c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Введите пожалуйста число");
        int a = scanner.nextInt();
        System.out.println("Укажите знак : + - * или /");
        String c = scanner1.nextLine();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();

        System.out.println("Ответ :");
        switch (c){
            case "+" :
                System.out.println(a+b);
                break;
            case "-" :
                System.out.println(a-b);
                break;
            case "*" :
                System.out.println(a*b);
                break;
            case "/" :
                System.out.println(a/b);
                break;
            default:
                System.out.println("Ошибка ввода");
        }

    }
}
