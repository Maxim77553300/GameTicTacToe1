package onlineStore;

import java.util.HashMap;
import java.util.List;

public interface DataBaseInt {

    boolean deletePhones(String name, HashMap<String, Integer> phones);

    void putPhonesTest();


    HashMap<String,Integer> getPhones();

    void setPhones(Phone phone);



}
