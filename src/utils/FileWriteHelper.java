package utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteHelper {

    public static void writeNewLine(String path, String inputMessage) throws IOException {
        File myFile = new File(path);
        FileWriter myWriter = new FileWriter(path, true);
        myWriter.write(inputMessage);
        myWriter.write("\n");
        myWriter.close();
    }
}
