package Homework2;

public class Samsung extends Telephone implements CommonJobs {
    private final String brandName = "Samsung" ;
    private MechanicalKeyboard keyboard = new MechanicalKeyboard();


    Samsung(String nameModel, String codeIMEI, String numberVersion, int memoryCapacity, double screenInc ) {
        super(nameModel, codeIMEI, numberVersion, memoryCapacity, screenInc);
    }
    public void playMp3() {
        System.out.println("You can listen mp3 files with Samsung.");
    }
    public void shareFiles() {
        System.out.println("You can share your files with Samsung. \n");
    }

    @Override
    public void makeCall() {
        System.out.println("You can call someone with this phone.");
    }

    @Override
    public void sendSms() {
        System.out.println("You can send SMS message with this phone.");
    }

    @Override
    public void getDeviceInfo() {
        System.out.println("--- Phone Properties ---");
        System.out.println("Brand: " + brandName);
        super.getDeviceInfo();
        System.out.println("Keyboard: " +keyboard.getKeyboardType() + "\n");
    }
}
