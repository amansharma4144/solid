package four;

public class WallSwitch implements Switchable {

    boolean state;
    ElectricApplaince electricApplaince

    public WallSwitch(ElectricApplaince electricApplaince) {
        this.electricApplaince = electricApplaince;
    }

    @Override
    public void toggle() {
            //state=!state;
            if(state)
            {
                electricApplaince.off();
                state=false;
            }
            else
            {
                electricApplaince.on();
                state=true;
            }
    }
}
