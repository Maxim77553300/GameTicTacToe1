package onlineStore;

import java.io.IOException;
import java.util.*;

public class IOUserDataImpl implements IOdata {

    private IOdata iOdata;

    public IOUserDataImpl(IOdata iOdata) {
        this.iOdata = iOdata;
    }

    public IOUserDataImpl() {

    }

    public IOdata getiOdata() {
        return iOdata;
    }

    public void setiOdata(IOdata iOdata) {
        this.iOdata = iOdata;
    }

    @Override
    public void entrance() {
        System.out.println("Hello, you are on the Best site of Belarus!! Make your choice,please!!");
        System.out.println("You are in Main menu");
        System.out.println("1 - Main menu ");
        System.out.println("2 - Show goods");
        System.out.println("3 - Log in");
        System.out.println("4 - Exit");
        ChoiceMenuImpl choiceMenu = new ChoiceMenuImpl();
        choiceMenu.choice();


    }

    @Override
    public void inputDataUser() {
        List<String> list = new ArrayList<>();
        String nickname = null;
        String password = null;

        System.out.println("Hello my friend!!");
        System.out.println("Enter your nickname please!");

        Scanner scanner = new Scanner(System.in);

        nickname = scanner.nextLine();

        System.out.println("Enter please number - your password");
        password = scanner.nextLine();

        if (nickname.equals("") || password.equals("")) {
            System.out.println("Error! Your login is not correct - press 3 for log in again!");
        } else if (nickname.equals("admin") && password.equals("111")) {
            ChoiceMenu admin = new Admin();
            System.out.println("Hello Admin!!, You are in working panel!!");
            System.out.println("Make your choice!\n 1 - Admin menu\n 2 - Delete/show goods\n 3 - Enter goods\n 4 - Exit\n 5 - Show list of users");
            admin.choice();
            DataBase.setUsers(nickname, password);


        } else {
            DataBase.setUsers(nickname, password);
        }


    }


    @Override
    public void outputDataUser() {

    }
}
