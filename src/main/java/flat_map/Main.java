package flat_map;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Reader reader;

        {
            try {
                reader = new FileReader("./data/song.txt");
                BufferedReader bufferedReader = new BufferedReader(reader);
                long lines = bufferedReader.lines().flatMap(line -> Arrays.stream(line.split(" ").clone())).count();
                System.out.println(lines);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

}
