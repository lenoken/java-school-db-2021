package stream.lab2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class LyricsUtils {

    public static long countWordsSong() {
        try {
            return Files.lines(Paths.get("data/song.txt"))
                    .flatMap(line -> Arrays.stream(line.split("\\s+")))
                    .count();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(LyricsUtils.countWordsSong());
    }

}
