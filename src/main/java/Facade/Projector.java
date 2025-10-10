package Facade;

public class Projector {
    public void on(){
        System.out.println("Projector is on");
    }

    public void off(){
        System.out.println("Projector is off");
    }

    public void setInput(String input){
        System.out.println("Projector input set to " + input);
    }

    public void setVolume(int volume){
        System.out.println("Projector volume set to " + volume);
    }
}
