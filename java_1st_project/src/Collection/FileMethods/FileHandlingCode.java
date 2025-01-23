package Collection.FileMethods;

import java.io.File;

public class FileHandlingCode {
    public static void main(String[] args) throws Exception {
        boolean res;
        File f = new File("C:\\FREQUENCY TECHNOLOGY\\JavaFiles\\FileHandle.txt");
        if (f.exists() != true) {
            res = f.createNewFile();
            System.out.println("File is Created");

        } else {
            System.out.println("File already exits");
        }
        System.out.println("------------------");

        res = f.canExecute();
        if (res == true) {
            System.out.println("File has read permission");
        } else {
            System.out.println("File  does not have read permission");
        }

        System.out.println("------------------");

        f.deleteOnExit();
        System.out.println(f.getAbsolutePath());

        res = f.isAbsolute();
        if (res == true) {
            System.out.println("FIle path is absolute");
        } else {
            System.out.println("File path is not absolute");
        }

        System.out.println("------------------");
        File f1 = f.getAbsoluteFile();
        System.out.println(f1);
        System.out.println("------------------");

        System.out.println(f.getCanonicalPath());
        System.out.println("------------------");

        File f2 = f.getCanonicalFile();
        System.out.println(f2);
        System.out.println("------------------");
        System.out.println(f.getClass());
        System.out.println("------------------");

        long l = f.getFreeSpace();
        System.out.println("The file name is = " + l);

        System.out.println("-------------------");
        String name = f.getName();
        System.out.println("The file name is = " + name);
        System.out.println("------------------");

        String parent = f.getParent();
        System.out.println("The parent name is = " + parent);
        System.out.println("------------------");

        long totalSpace = f.getTotalSpace();
        System.out.println("the total usable space = " + totalSpace);
        System.out.println("------------------");

        long usableSpace = f.getUsableSpace();
        System.out.println("the total usable Space " + usableSpace);
        System.out.println("------------------");
        res = f.isDirectory();
        if (res == true) {
            System.out.println("The path contains directory");
        } else {
            System.out.println("The path Does not lead to directory");
        }
        System.out.println("-------------------------");

        res = f.isFile();
        if (res == true) {
            System.out.println("The path contain file");
        } else {
            System.out.println("The path does not contains file");
        }
        System.out.println("------------------");
        res = f.delete();
        if (res == true) {
            System.out.println("File has been deleted");
        } else {
            System.out.println("File has not been deleted");
        }
    }
}