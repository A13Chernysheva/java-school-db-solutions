package radio_alarm;

public class RadioAlarm implements Radio, Alarm{

    @Override
    public void C() {
        System.out.println("Do C things");
    }

    @Override
    public void D() {
        System.out.println("Do D things");
    }

    @Override
    public void A() {
        System.out.println("Do A things");
    }

    @Override
    public void B() {
        System.out.println("Do B things");
    }

    public static void main(String[] args) {
        RadioAlarm radioAlarm = new RadioAlarm();
        radioAlarm.A();
        radioAlarm.B();
        radioAlarm.C();
        radioAlarm.D();
    }
}
