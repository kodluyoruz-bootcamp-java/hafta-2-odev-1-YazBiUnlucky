package Homework2;

public class Apple extends Telephone implements CommonJobs {
    private final String brandName = "Apple" ;
    private TouchKeyboard keyboard = new TouchKeyboard();


    Apple(String nameModel, String codeIMEI, String numberVersion, int memoryCapacity, double screenInc ) {
        super(nameModel, codeIMEI, numberVersion, memoryCapacity, screenInc);
    }
    public void faceTime() {
        System.out.println("You can make video calls with Apple. \n");
    }
    public void shareScreen() {
        System.out.println("You can share your screen with Apple.");
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
