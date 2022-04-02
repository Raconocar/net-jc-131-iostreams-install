package training.netology;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static final String WORKDIR = "C:\\Users\\Stranger\\netology-prj-game";


    private static void logger(String log) {
        try (FileWriter writer = new FileWriter(WORKDIR+"\\Games\\temp\\temp.txt", true)) {
            writer.write(log);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            Files.createDirectory(Path.of(WORKDIR+"\\Games"));
            Files.createDirectory(Path.of(WORKDIR+"\\Games\\src"));
            Files.createDirectory(Path.of(WORKDIR+"\\Games\\res"));
            Files.createDirectory(Path.of(WORKDIR+"\\Games\\savegames"));
            Files.createDirectory(Path.of(WORKDIR+"\\Games\\temp"));


            Files.createDirectory(Path.of(WORKDIR+"\\Games\\src\\main"));
            Files.createDirectory(Path.of(WORKDIR+"\\Games\\src\\test"));

            Files.createDirectory(Path.of(WORKDIR+"\\Games\\res\\drawables"));
            Files.createDirectory(Path.of(WORKDIR+"\\Games\\res\\vectors"));
            Files.createDirectory(Path.of(WORKDIR+"\\Games\\res\\icons"));

            Files.createFile(Path.of(WORKDIR+"\\Games\\src\\main\\Main.java"));
            Files.createFile(Path.of(WORKDIR+"\\Games\\src\\main\\Utils.java"));

            Files.createFile(Path.of(WORKDIR+"\\Games\\temp\\temp.txt"));


        } catch (IOException e) {
            e.printStackTrace();
        }

        if (Files.exists(Path.of(WORKDIR+"\\Games")) &&
                Files.exists(Path.of(WORKDIR+"\\Games\\src")) &&
                Files.exists(Path.of(WORKDIR+"\\Games\\res")) &&
                Files.exists(Path.of(WORKDIR+"\\Games\\savegames")) &&
                Files.exists(Path.of(WORKDIR+"\\Games\\temp")) &&
                Files.exists(Path.of(WORKDIR+"\\Games\\src\\main")) &&
                Files.exists(Path.of(WORKDIR+"\\Games\\src\\test")) &&
                Files.exists(Path.of(WORKDIR+"\\Games\\res\\drawables")) &&
                Files.exists(Path.of(WORKDIR+"\\Games\\res\\vectors")) &&
                Files.exists(Path.of(WORKDIR+"\\Games\\res\\icons")) &&
                Files.exists(Path.of(WORKDIR+"\\Games\\src\\main\\Main.java")) &&
                Files.exists(Path.of(WORKDIR+"\\Games\\src\\main\\Utils.java")) &&
                Files.exists(Path.of(WORKDIR+"\\Games\\temp\\temp.txt")))
            logger("Instalation complete!");
        else logger("Instalation FAULT!");
    }

}
