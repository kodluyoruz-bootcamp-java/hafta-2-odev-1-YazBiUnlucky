package Homework2;

public class Main {
    public static void main(String[] args) {

        Apple a12 =new Apple("IPhone X", "TR101010101010101", "X10", 64000, 5.85);

        a12.getDeviceInfo();
        a12.makeCall();
        a12.sendSms();
        a12.shareScreen();
        a12.faceTime();


        Samsung m21 = new Samsung("Galaxy M21", "TR212121212121212", "M21", 32000, 6.5 );

        m21.getDeviceInfo();
        m21.makeCall();
        m21.sendSms();
        m21.playMp3();
        m21.shareFiles();


    }
}
