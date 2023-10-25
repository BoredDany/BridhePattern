package Implementations;

import Interfaces.SaveInfoInt;

public class TxtFile implements SaveInfoInt {
    @Override
    public void saveInfo(String data) {
        System.out.println("Saving info in txt file");
        FileWriter fileWriter = new FileWriter("file.txt");
        fileWriter.write(data);
        fileWriter.flush();
        fileWriter.close();
    }
}
