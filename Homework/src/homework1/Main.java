package homework1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String s = scanner.next();
        if(s.length()<1){
            System.out.println("Error");
        } else {
        char c = s.charAt(3);
            System.out.println(c);
        }

//        String a = null;
//        try {
//            a = scanner.nextLine();
//        } catch (Exception e){
//            e.printStackTrace();
//        }


// Вариант 1-------------------------------------------------------------------------------------
//        if(a.equals(a.toLowerCase(Locale.ROOT))){
//            System.out.println(a.toUpperCase(Locale.ROOT));
//        }
//Вариант 2-----------------------------------------------------------------------------------------
//        System.out.println(a.toUpperCase(Locale.ROOT));
        // Вариант 3--------------------------------------------------------------------------------

//        if(a.toLowerCase(Locale.ROOT)){
//            System.out.println(a.toUpperCase(Locale.ROOT));
//            else {
//                System.out.println("Ошибка.Введите маленькую букву");
//            }
//        }
        //Вариант 4-------------------------------------------------------
//        if(a.equals("а")){
//            System.out.println("A");
//        }
//        else if(a.equals("б")){
//            System.out.println("Б");
//        }
//        else if(a.equals("в")){
//            System.out.println("В");
//        }
//        else if(a.equals("г")){
//            System.out.println("Г");
//        }else if(a.equals("д")){
//            System.out.println("Д");
//        }else if(a.equals("е")){
//            System.out.println("Е");
//        }else if(a.equals("ж")){
//            System.out.println("Ж");
//        }else if(a.equals("з")){
//            System.out.println("З");
//        }else if(a.equals("и")){
//            System.out.println("И");
//        }else if(a.equals("к")){
//            System.out.println("К");
//        }else if(a.equals("л")){
//            System.out.println("Л");
//        }else if(a.equals("м")){
//            System.out.println("М");
//        }else if(a.equals("н")){
//            System.out.println("Н");
//        }else if(a.equals("ё")){
//            System.out.println("Ё");
//        }else if(a.equals("е")){
//            System.out.println("Е");
//        }else if(a.equals("п")){
//            System.out.println("П");
//        }else if(a.equals("р")){
//            System.out.println("Р");
//        }else if(a.equals("с")){
//            System.out.println("С");
//        }else if(a.equals("т")){
//            System.out.println("Т");
//        }else if(a.equals("у")){
//            System.out.println("У");
//        }else if(a.equals("ф")){
//            System.out.println("Ф");
//        }else if(a.equals("х")){
//            System.out.println("Х");
//        }else if(a.equals("ц")){
//            System.out.println("Ц");
//        }else if(a.equals("ч")){
//            System.out.println("Ч");
//        }else if(a.equals("ш")){
//            System.out.println("Ш");
//        }else if(a.equals("щ")){
//            System.out.println("Щ");
//        }else if(a.equals("ъ")){
//            System.out.println("Ъ");
//        }else if(a.equals("ы")){
//            System.out.println("Ы");
//        }else if(a.equals("ь")){
//            System.out.println("Ь");
//        }else if(a.equals("э")){
//            System.out.println("Э");
//        }else if(a.equals("ю")){
//            System.out.println("Ю");
//        }else if(a.equals("я")){
//            System.out.println("Я");
//        }else if(a.equals("б")){
//            System.out.println("Б");}
//        else {
//            System.out.println("Ошибка ввода");}
        //Вариант 5----------------------------------

//        switch (a) {
//            case "а" -> System.out.println("А");
//            case "б" -> System.out.println("Б");
//            case "в" -> System.out.println("В");
//            case "г" -> System.out.println("Г");
//            case "д" -> System.out.println("Д");
//            case "е" -> System.out.println("Е");
//            case "ё" -> System.out.println("Ё");
//            case "ж" -> System.out.println("Ж");
//            case "з" -> System.out.println("З");
//            case "и" -> System.out.println("И");
//            case "к" -> System.out.println("К");
//            case "л" -> System.out.println("Л");
//            case "м" -> System.out.println("М");
//            case "н" -> System.out.println("Н");
//            case "о" -> System.out.println("О");
//            case "п" -> System.out.println("П");
//            case "р" -> System.out.println("Р");
//            case "с" -> System.out.println("С");
//            case "т" -> System.out.println("Т");
//            case "у" -> System.out.println("У");
//            case "ф" -> System.out.println("Ф");
//            case "х" -> System.out.println("Х");
//            case "ц" -> System.out.println("Ц");
//            case "ч" -> System.out.println("Ч");
//            case "ш" -> System.out.println("Ш");
//            case "щ" -> System.out.println("Щ");
//            case "ъ" -> System.out.println("Ъ");
//            case "ы" -> System.out.println("Ы");
//            case "ь" -> System.out.println("Ь");
//            case "э" -> System.out.println("Э");
//            case "ю" -> System.out.println("Ю");
//            case "я" -> System.out.println("Я");
//           default -> System.out.println("Ошибка ввода");
//        }
        // Вариант-6----------------------------------------------------------------------
//        switch (a){
//            case "а" :
//                System.out.println("А");
//                break;
//            case "б" :
//                System.out.println("Б");
//                break;
//            case "г":
//                System.out.println("Г");
//                break;
//            case "д":
//                System.out.println("Д");
//                break;
//            default:
//                System.out.println("Ошибка");
//
//        }
        }
}
