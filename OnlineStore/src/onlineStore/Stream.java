package onlineStore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stream {

    public static String getStream() {
        String password = null;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){


            password = bufferedReader.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }
        return password;
    }

}