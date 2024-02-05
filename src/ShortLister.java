import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class ShortLister
{
    public static void main(String[] args)
    {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
        {
            File file = fileChooser.getSelectedFile();
            try {
                List<String> lines = Files.readAllLines(file.toPath());
                lines.forEach(line -> {
                    String[] words = line.split("\\s+");
                    Object[] shortWords = StaticFilter.collectAll(words, new ShortWordFilter());
                    for (Object word : shortWords) {
                        System.out.println(word);
                    }
                });
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
