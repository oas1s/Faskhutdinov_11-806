package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    List<File> getAllFiles(File f) {
        List<File> files = new ArrayList<>();
        if (f.isFile()) {
            files.add(f);
        } else {
            File[] allFilesFromFolder = f.listFiles();
            for (File element : allFilesFromFolder) {
                files.addAll(getAllFiles(element));
            }
        }
        return files;
    }
}
