package fileio;

import java.io.File;

public class PrintAllDirectory {
    public static void main(String[] args) {
        File dir = new File("src");
        if (dir.isDirectory()) {
            String[] dirList = dir.list();
            if (dirList != null) {
                for (String dirContent : dirList) {
                    System.out.println(dirContent);
                }
            }
        }
    }
}