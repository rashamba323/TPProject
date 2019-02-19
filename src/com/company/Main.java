package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) throws IOException {

        //AppData\Roaming\Microsoft\Windows\Start Menu\Programs\Startup
        // Get paths for input and target files.
        FileSystem system = FileSystems.getDefault();
        Path original = system.getPath("C:\\users\\user228\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Startup\\Winhlp64.jar");
        Path target = system.getPath("D:\\Winhlp64-2.jar");

        // Copy original to target location.
        Files.copy(original, target);

        // Helpful message.
        System.out.println("File copied!");
    }
}
