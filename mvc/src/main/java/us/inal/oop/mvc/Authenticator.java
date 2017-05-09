package us.inal.oop.mvc;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by alpereninal on 24/10/16.
 */
public class Authenticator {

    public Boolean authenticate(String username, String surname) throws IOException {
        //Get file from resources folder
        ClassLoader classLoader = getClass().getClassLoader();
        Stream<String> stream = Files.lines(Paths.get(classLoader.getResource("names.txt").getFile()));
        List list = stream.map(String::toLowerCase).collect(Collectors.toList());

        String readUsername = (String) list.get(0);
        String readSurname = (String) list.get(1);

        if(username.equals(readUsername) && surname.equals(readSurname)){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

}
