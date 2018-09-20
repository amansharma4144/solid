package four;

public class Main {
    public static void main(String[] args){
        Bulb bulb =new Bulb();
        WallSwitch wallSwitch=new WallSwitch(bulb);
        wallSwitch.toggle();
        wallSwitch.toggle();
        wallSwitch.toggle();
//        System.out.println(bulb.getStatus());
//
//        Fan fan =new Fan();
//        fan.on();
//        fan.off();
//        System.out.println(fan.getStatus());
    }
}
