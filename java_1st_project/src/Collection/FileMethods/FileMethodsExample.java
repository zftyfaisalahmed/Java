package Collection.FileMethods;

import java.io.File;
import java.io.IOException;

public class FileMethodsExample {
    public static void main(String[] args) {
        try {
            // Creating a File object for a new file
            File file = new File("C:\\FREQUENCY TECHNOLOGY\\JavaFiles\\example.txt");

            // Check if the file exists
            if (!file.exists()) {
                // Create a new file
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                } else {
                    System.out.println("File creation failed.");
                }
            } else {
                System.out.println("File already exists.");
            }

            // Display file properties
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Is File: " + file.isFile());
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("File Length: " + file.length() + " bytes");

            // Creating a directory
            File dir = new File("C:\\FREQUENCY TECHNOLOGY\\JavaFiles\\example.txt");
            if (!dir.exists() && dir.mkdir()) {
                System.out.println("Directory created: " + dir.getName());
            }

            // Listing files in the current directory
            File currentDir = new File(".");
            String[] files = currentDir.list();
            System.out.println("Files and directories in current directory:");
            for (String filename : files) {
                System.out.println(filename);
            }

            // Deleting the created file
            // if (file.delete()) {
            // System.out.println("File deleted: " + file.getName());
            // }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
