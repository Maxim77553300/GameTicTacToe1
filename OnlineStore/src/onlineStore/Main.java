package onlineStore;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

//        UserService userService = new UserService("Stepan",new UserDaoImpl());
////        UserService userService = new UserService("Stepan",new UserDaoImpl());
//        userService.print();

        //  IOUserDataImpl user = new IOUserDataImpl();

        //user.entrance();


        DataBaseInt dataBaseInt = new DataBaseImpl();
        dataBaseInt.putPhonesTest();
        

        User user = new User(new IOUserDataImpl());
        user.entrance();

        System.out.println(DataBase.getUsers());
        System.out.println(DataBase.getPhones());

    }
}
