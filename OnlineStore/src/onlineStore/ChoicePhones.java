package onlineStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ChoicePhones {

    public static List<String> buyPhones(HashMap<String, Integer> map) {

        List<String> namesOfPhones = new ArrayList<>();
        IOdata iOdata = new IOUserDataImpl();
        boolean flag = true;

        try (Scanner scanner = new Scanner(System.in)) {
            while (flag == true) {
                String nameOfPhone = scanner.nextLine();
                DataBaseInt  dataBaseInt = new DataBaseImpl();
                if (nameOfPhone.equals("0")) {

                   dataBaseInt.deletePhones(nameOfPhone,map);
                    flag = false;
                    iOdata.entrance();

                } else if (!map.containsKey(nameOfPhone)) {
                    System.out.println("We don't have this model.Please try again \n For Exit in Main menu - press 0");
                    System.out.println(DataBase.getPhones());
                } else {
                    System.out.println("You have bought " + nameOfPhone + "\n For exit - press 0");

                    namesOfPhones.add(nameOfPhone);
                    dataBaseInt.deletePhones(nameOfPhone,map);
                }

            }
        }

        return namesOfPhones;
    }

}
