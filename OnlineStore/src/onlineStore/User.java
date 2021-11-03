package onlineStore;

import java.util.ArrayList;
import java.util.Objects;

public class User {


    private IOdata iOdata;

    public User(IOdata iOdata) {
        this.iOdata = iOdata;
    }

    public void entrance(){
        iOdata.entrance();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(iOdata, user.iOdata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iOdata);
    }
}
