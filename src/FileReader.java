import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class FileReader {

    public static Object[][] readPayData(String fileName) throws IOException {
        String contents = Files.readString(Path.of(fileName), StandardCharsets.UTF_8);

        List<String> lines = List.of(contents.split("\n"));
        ArrayList<Object[]> payDataStr = new ArrayList<>();
        payDataStr = lines.stream()
                .skip(1)
                .map(line -> line.split(","))
                .map(Parser::parsePayData)
                .map(PayData::toObjectArray)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        return payDataStr.toArray(new Object[0][]);

    }
}
