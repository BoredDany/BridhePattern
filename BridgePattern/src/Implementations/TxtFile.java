package Implementations;

import Interfaces.SaveInfoInt;

public class TxtFile implements SaveInfoInt {
    @Override
    public void saveInfo(String data) {
        System.out.println("Saving info in txt file");
    }
}
