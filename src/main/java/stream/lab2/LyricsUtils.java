package stream.lab2;

import lombok.SneakyThrows;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class LyricsUtils {

    @SneakyThrows
    public static long countWordsSong() {
        return Files.lines(Paths.get("data/song.txt"))
                    .flatMap(line -> Arrays.stream(line.split("\\s+")))
                    .count();
    }

    public static void main(String[] args) {
        System.out.println(LyricsUtils.countWordsSong());
    }

}
