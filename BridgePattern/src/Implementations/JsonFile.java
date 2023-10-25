package Implementations;

import Interfaces.SaveInfoInt;

public class JsonFile implements SaveInfoInt {
    @Override
    public void saveInfo(String data) {
        System.out.println("Saving info in json file");
        FileWriter fileWriter = new FileWriter("file.json");
        fileWriter.write(data);
        fileWriter.flush();
        fileWriter.close();
    }
}
