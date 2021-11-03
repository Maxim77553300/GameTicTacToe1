package onlineStore;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DataBaseImpl implements DataBaseInt {

    @Override
    public boolean deletePhones(String name, HashMap<String, Integer> phones) {


        if (phones.containsKey(name)) {
            phones.remove(name);
            System.out.println("You have choose phone model " + name);
            return true;
        }


        return false;
    }


    @Override
    public void putPhonesTest() {
        //test
        Phone phone1 = new Phone("Nokia 3310", 100);
        Phone phone2 = new Phone("Nokia 3500", 150);
        Phone phone3 = new Phone("Simeins", 200);
        Phone phone4 = new Phone("Motorolla", 180);
        Phone phone5 = new Phone("Nokia 3300", 80);

        DataBase.setPhones(phone1);
        DataBase.setPhones(phone2);
        DataBase.setPhones(phone3);
        DataBase.setPhones(phone4);
        DataBase.setPhones(phone5);
        // System.out.println(DataBase.getPhones());
    }

    @Override
    public HashMap<String, Integer> getPhones() {
       return DataBase.getPhones();

    }

    @Override
    public void setPhones(Phone phone) {
        DataBase.setPhones(phone);
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
