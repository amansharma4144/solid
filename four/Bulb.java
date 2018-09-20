package four;

public class Bulb {
    private boolean status;

    public void on() {
        System.out.println("Bulb is on");
    }

    public void off() {
        System.out.println("Bulb is off");
    }
    public boolean getStatus(){
        return status;
    }
}
