import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SpordiPaev {
    public static void main(String[] args) {
        SortableList<Sportlased> athletes;

        try {
            File dataFile = new File("athletes.txt");
            FileInputStream fileInput = new FileInputStream(dataFile);
            ObjectInputStream reader = new ObjectInputStream(fileInput);
            athletes = (SortableList<Sportlased>) reader.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            athletes = new SortableList<Sportlased>();
            athletes.add(new Sportlased("Mari Murakas", 4.5));
            athletes.add(new Sportlased("Peeter Mänd", 5));
            athletes.add(new Sportlased("Kaarel Karu", 4.3));
        }

//        Collections.sort(athletes);
        athletes.sort();

        for (Sportlased athlete : athletes) {
            System.out.println(athlete);
        }

        try {
            File dataFile = new File("athletes.txt");
            FileOutputStream fileOutput = new FileOutputStream(dataFile);
            ObjectOutputStream saver = new ObjectOutputStream(fileOutput);
            saver.writeObject(athletes);
            saver.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}