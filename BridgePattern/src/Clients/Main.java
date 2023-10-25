package Clients;

import Abstractions.Implementations.SaveInfoInFile;
import Abstractions.SaveInfoAbst;
import Implementations.JsonFile;
import Implementations.TxtFile;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("With .txt");
        SaveInfoAbst saveInfoAbst = new SaveInfoInFile(new TxtFile());
        System.out.println("Write data to save: ");
        String data = input.next();
        saveInfoAbst.saveInfo(data);

        System.out.println("Now with .json");
        saveInfoAbst.setSaveInfoInt(new JsonFile());
        System.out.println("Write data to save: ");
        data = input.next();
        saveInfoAbst.saveInfo(data);
    }
}