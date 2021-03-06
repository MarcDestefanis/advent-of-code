package advent.of.code._2020.day_2;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class InputReader {

    public List<Input> readInputFile(String inputPath) {
        try {
            Path path = Paths.get(getClass()
                    .getClassLoader()
                    .getResource(inputPath).toURI());
            return Files.lines(path)
                    .map(Input::parseInput)
                    .collect(Collectors.toList());
        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException("Error reading the input file");
        }
    }
}
