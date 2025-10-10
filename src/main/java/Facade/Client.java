package Facade;

public class Client {

    public static void main(String[] args) {

        HomeTheator homeTheator = new HomeTheator();
        homeTheator.watchMovie("Little Hearts");
        homeTheator.endMovie();
    }
}
