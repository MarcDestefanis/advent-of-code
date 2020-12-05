package advent.of.code._2020.day_5;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class InputReader {
    public List<String> readInputFile(String inputPath) {
        try {
            Path path = Paths.get(getClass()
                    .getClassLoader()
                    .getResource(inputPath).toURI());
            return Files.lines(path)
                    .collect(Collectors.toList());
        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException("Error reading the input file");
        }
    }
}
