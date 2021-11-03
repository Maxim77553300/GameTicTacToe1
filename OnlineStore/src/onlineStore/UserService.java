package onlineStore;

public class UserService {

    private String name;
    private UserDao userDao;

    public UserService(String name, UserDao userDao) {
        this.name = name;
        this.userDao = userDao;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public UserDao getUserDao() {
//        return userDao;
//    }
//
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    public void print(){
        userDao.print();
    }
}
