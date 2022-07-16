package classwork.testfolder.testfolder2;

import java.io.*;

public class FileReadAndWrite {
    private static final String FILE_PATH = "C:\\Users\\Noname\\IdeaProjects\\JavaCore1\\src\\classwork\\testfolder\\testfolder2\\textExample.txt";

    public static void main(String[] args) throws IOException {
        write();
        read();
    }

    public static void write() throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            bw.write("Hello from java\r\n");
            bw.write("Hello from java line2\r\n");
        }
    }

    public static void read()  {
        try (BufferedReader inputStream = new BufferedReader(new FileReader(FILE_PATH))) {
            String line = "";
            while ((line = inputStream.readLine()) != null) {
                System.out.println(line);
            }

            int c;
            int aCount = 0;
            while ((c = inputStream.read()) != -1) {
                char a = (char) c;
                if (a == 'a') {
                    aCount++;
                }
                System.out.println(a);
            }
            System.out.println("aCount: " + aCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}