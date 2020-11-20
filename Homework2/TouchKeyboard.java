package Homework2;

public class TouchKeyboard implements OEM{
    private final String keyboardType = "Touch Keyboard";

    @Override
    public String getKeyboardType() {
        return keyboardType;
    }
}
