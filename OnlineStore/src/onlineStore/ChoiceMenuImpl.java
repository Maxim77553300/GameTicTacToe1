package onlineStore;

import java.util.Scanner;

public class ChoiceMenuImpl implements ChoiceMenu {
    @Override
    public void choice()  {

        IOUserDataImpl ioUserData = new IOUserDataImpl();
        boolean flag = true;

        try(Scanner scanner = new Scanner(System.in)) {

            while (flag == true&& scanner.hasNext()) {

                String number = scanner.nextLine();


                switch (number) {
                    case "1":
                        System.out.println("Main menu");
                        ioUserData.entrance();
                        break;
                    case "2":
                        System.out.println("Show goods");
                        System.out.println(DataBase.getPhones());
                        break;
                    case "3":
                        System.out.println("Log in");
                        ioUserData.inputDataUser();
                        break;
                    case "4":
                        System.out.println("Exit");
                        scanner.close();
                        flag = false;

                        break;
                    default:
                        System.out.println("Error user");
                        break;
                }
            }
        } catch (Exception e){

           e.printStackTrace();

        }








    }

    @Override
    public void exit() {
     System.exit(1);
    }
}
