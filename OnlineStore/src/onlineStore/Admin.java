package onlineStore;

import java.util.Scanner;

public class Admin implements ChoiceMenu{

    @Override
    public void choice() {

        boolean flag = true;

        try(Scanner scanner = new Scanner(System.in)) {


            IOUserDataImpl ioUserData = new IOUserDataImpl();

            while (flag == true&& scanner.hasNext()) {
                String number = scanner.nextLine();
                DataBaseInt dataBase = new DataBaseImpl();

                switch (number) {
                    case "1":
                        System.out.println("Admin menu");
                        System.out.println("Make your choice!\n 1 - Admin menu\n 2 - Delete/show goods\n 3 - Enter goods\n 4 - Exit\n 5 - Show list of users");
                        break;
                    case "2":
                        System.out.println("Delete goods,press 4 for exit");
                        System.out.println(DataBase.getPhones());
                        number = scanner.nextLine();
                        if(number.equals("4")){
                            ioUserData.entrance();
                        } else {
                        dataBase.deletePhones(number,dataBase.getPhones());
                        break; }
                    case "3":
                        System.out.println("Enter new Goods");
                        System.out.println("Enter name of model Phone :");
                        String name = scanner.nextLine();
                        System.out.println("Enter price of the phone :");
                        Integer price = scanner.nextInt();
                        dataBase.setPhones(new Phone(name,price));
                        System.out.println("This model we added to store successfully");
                        break;
                    case "4":
                        System.out.println("Exit site");
                        flag = false;
                        new Admin().exit();
                        break;
                    case "5":
                        System.out.println("Show list of users");
                        System.out.println(DataBase.getUsers());
                    default:

                        System.out.println("Error admin");
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
