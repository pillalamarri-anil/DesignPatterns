package Facade;

import java.util.Arrays;
import java.util.HashMap;

public class Client {

    public static void main(String[] args) {



        HomeTheator homeTheator = new HomeTheator();
        homeTheator.watchMovie("Little Hearts");
        homeTheator.endMovie();
    }
}
