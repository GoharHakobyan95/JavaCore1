package classwork.testfolder;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FileExample {
  private   static String filePath = "C:\\Users\\Noname\\IdeaProjects\\JavaCore1\\src\\classwork\\testfolder\\hello.txt";
   private static String newFilePath = "C:\\Users\\Noname\\IdeaProjects\\JavaCore1\\src\\classwork\\testfolder\\hello3.txt";

    public static void main(String[] args) throws IOException {
        File myFile = new File(filePath);
        boolean b = myFile.renameTo(new File(newFilePath));
        System.out.println(b);
        System.out.println(myFile.exists());
        if (!myFile.exists()) {
            myFile.createNewFile();
            System.out.println(myFile.exists());
        }
//        System.out.println("isFile: " + myFile.isFile());
//        System.out.println("isDirectory: " + myFile.isDirectory());
//        if (myFile.isDirectory()) {
//            File[] files = myFile.listFiles();
//            for (File file : files) {
//                System.out.println(file.getName());
//            }
//        }
//
    }


}
