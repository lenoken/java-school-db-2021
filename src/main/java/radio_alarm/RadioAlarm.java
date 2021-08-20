package radio_alarm;

public class RadioAlarm implements Radio, Alarm{
    @Override
    public void c() {
        System.out.println("Method c is working");
    }

    @Override
    public void d() {
        System.out.println("Method d is working");
    }

    @Override
    public void a() {
        System.out.println("Method a is working");
    }

    @Override
    public void b() {
        System.out.println("Method b is working");
    }

    public static void main(String[] args) {
        RadioAlarm radioAlarm = new RadioAlarm();
        radioAlarm.a();
    }
}
