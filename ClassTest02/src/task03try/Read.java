package task03try;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read {
    public static FileReader reader;

    static {
        try {
            reader = new FileReader("text1.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static FileWriter writer;

    static {
        try {
            writer = new FileWriter("text2.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    char symbol;
    private boolean isReaded;

    public Read() throws IOException {
    }

    public boolean isReaded() {
        return isReaded;
    }

    public boolean isWrited() {
        return !isReaded;
    }

    public void ReadOneSymbol() throws IOException {
        if (reader.read() == -1){
            throw new IOException("End of file");
        }
         else {
            char symbol = (char) reader.read();
            isReaded = true;
        }
    }

    public void Write() throws IOException {
        writer.write(symbol);
        isReaded = false;
    }
}