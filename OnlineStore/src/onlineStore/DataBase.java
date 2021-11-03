package onlineStore;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.HashMap;
import java.util.List;

public class DataBase {

    private static HashMap<String, String> users = new HashMap<>();
    private static HashMap<String, Integer> phones = new HashMap<>();


    public static HashMap<String, String> getUsers() {

        return users;
    }

    public static void setUsers(String name, String password) {
        List<String> listOfPhones = null;


        if (users.containsKey(name) && !users.containsValue(password)) {
            System.out.println("Error!! This nickname is already in our DataBase!! Please, enter another name!!");
        } else if (users.containsKey(name) && users.containsValue(password)) {
            System.out.println("Dear " + name + "! You are in your personal account,you can buy phone! please make choice!");
            System.out.println("We have these phones in our store :" + DataBase.getPhones().toString());
            listOfPhones = ChoicePhones.buyPhones(phones);
        } else {
            users.put(name, password);
            System.out.println("You are in your account, your data was saved successfully");
            System.out.println("You can buy a phone. Please, make you choice : enter the model of phone ");
            System.out.println(DataBase.getPhones());
            listOfPhones = ChoicePhones.buyPhones(phones);


        }
    }


    public DataBase() {
    }


    public static HashMap<String, Integer> getPhones() {

        return phones;
    }

    public static void setPhones(Phone phone) {
        phones.put(phone.getName(), phone.getPrice());

    }




}
