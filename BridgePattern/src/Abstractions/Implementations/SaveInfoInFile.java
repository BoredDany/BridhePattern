package Abstractions.Implementations;

import Abstractions.SaveInfoAbst;
import Interfaces.SaveInfoInt;

public class SaveInfoInFile extends SaveInfoAbst {
    public SaveInfoInFile(SaveInfoInt saveInfoInt) {
        super(saveInfoInt);
    }

    public void replaceInfoInFile(String current, String replace) {

    }
}
