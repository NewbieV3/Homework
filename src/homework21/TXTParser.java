package homework21;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TXTParser {
    private String pathToFile;

    TXTParser(String pathToFile){
        this.pathToFile = pathToFile;
    }

    public String readTXTFile(){
        String text = "Nothing...";
        try {
            text = new String(Files.readAllBytes(Paths.get(this.pathToFile)), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}
