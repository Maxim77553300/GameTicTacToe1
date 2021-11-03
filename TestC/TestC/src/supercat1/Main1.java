package supercat1;


import java.util.logging.Logger;

public class Main1 {
    public static void main(String[] args) {
        Logger logger;
        Cat1 cat = new Cat1("Barsik");
        cat.printNameCat();
        System.out.println(cat.getKitten("").getName());
        cat.generateJump();
        Integer key = Cat1.getKey(50, 100);
        System.out.println("The key from cats house is " + key);
    }

}
