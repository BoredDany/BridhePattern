package Abstractions;

import Interfaces.SaveInfoInt;

public abstract class SaveInfoAbst {
    private SaveInfoInt saveInfoInt;

    public SaveInfoAbst(SaveInfoInt saveInfoInt){
        this.saveInfoInt = saveInfoInt;
    }
    public SaveInfoInt getSaveInfoInt() {
        return this.saveInfoInt;
    }

    public void setSaveInfoInt(SaveInfoInt saveInfoInt) {
        this.saveInfoInt = saveInfoInt;
    }

    public void saveInfo(String data){
        saveInfoInt.saveInfo(data);
    }

}
