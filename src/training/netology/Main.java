package training.netology;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static final String WORKDIR = "C:\\Users\\Stranger\\netology-prj-game";


    private static void logger(String log) {
        try (FileWriter writer = new FileWriter(WORKDIR + "\\Games\\temp\\temp.txt", true)) {
            writer.write(log);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static boolean exists(List<String> paths) {
        for (String path : paths
        ) {
            boolean b = Files.exists(Path.of(WORKDIR + path));
            if (!b) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        try {
            Files.createDirectory(Path.of(WORKDIR + "\\Games"));
            for (String name : Arrays.asList("src", "res", "savegames", "temp")
            ) {
                Files.createDirectory(Path.of(WORKDIR + "\\Games\\" + name));
            }
            for (String name : Arrays.asList("main", "test")
            ) {
                Files.createDirectory(Path.of(WORKDIR + "\\Games\\src\\" + name));
            }
            for (String name : Arrays.asList("Main.java", "Utils.java")
            ) {
                Files.createFile(Path.of(WORKDIR + "\\Games\\src\\main\\" + name));
            }
            for (String name : Arrays.asList("drawables", "vectors", "icons")
            ) {
                Files.createDirectory(Path.of(WORKDIR + "\\Games\\res\\" + name));
            }
            Files.createFile(Path.of(WORKDIR + "\\Games\\temp\\temp.txt"));


        } catch (IOException e) {
            e.printStackTrace();
        }

        if (exists(Arrays.asList(
                "\\Games",
                "\\Games\\src",
                "\\Games\\res",
                "\\Games\\savegames",
                "\\Games\\temp",
                "\\Games\\src\\main",
                "\\Games\\src\\test",
                "\\Games\\res\\drawables",
                "\\Games\\res\\vectors",
                "\\Games\\res\\icons",
                "\\Games\\src\\main\\Main.java",
                "\\Games\\src\\main\\Utils.java",
                "\\Games\\temp\\temp.txt")))
            logger("Instalation complete!");
        else logger("Instalation FAULT!");
    }


}
