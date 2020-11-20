package Homework2;

public class Telephone {
    private String nameModel;
    private String codeIMEI;
    private String numberVersion;
    private int memoryCapacity;
    private double screenInc;
    private String keyboardType;

    public Telephone() {

    }

    public Telephone(String nameModel, String codeIMEI, String numberVersion, int memoryCapacity, double screenInc) {
        this.nameModel = nameModel;
        this.codeIMEI = codeIMEI;
        this.numberVersion = numberVersion;
        this.memoryCapacity = memoryCapacity;
        this.screenInc = screenInc;

    }

    public String getNameModel() {
        return nameModel;
    }

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }

    public String getCodeIMEI() {
        return codeIMEI;
    }

    public void setCodeIMEI(String codeIMEI) {
        this.codeIMEI = codeIMEI;
    }

    public String getNumberVersion() {
        return numberVersion;
    }

    public void setNumberVersion(String numberVersion) {
        this.numberVersion = numberVersion;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(int memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public double getScreenInc() {
        return screenInc;
    }

    public void setScreenInc(double screenInc) {
        this.screenInc = screenInc;
    }

    public void getDeviceInfo() {
        System.out.println("Model: " + getNameModel() + "\n" +
                "IMEI Code: " + getCodeIMEI() + "\n" +
                "Version: " + getNumberVersion() + "\n" +
                "Memory Capacity: " + getMemoryCapacity() + "\n" +
                "Screen Size(inch): " + getScreenInc());
    }

}
