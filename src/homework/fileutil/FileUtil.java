package homework.fileutil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        fileSearch();
        contentSearch();
        findLines();
        printSizeOfPackage();
        createFileWithContent();


    }
    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։

    static void fileSearch() throws IOException {
        System.out.println("Please input path.");
        String pathStr = scanner.nextLine();
        File path = new File(pathStr);
        if (!path.exists() || path.isFile()) {
            System.out.println("Directory path does not exists.");
        } else {
            System.out.println("Please input file name.");
            String fileName = scanner.nextLine();
            File myFile = new File(pathStr , fileName);
            System.out.println(myFile.exists());
            }
        }


    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() throws IOException {
        System.out.println("Please input path.");
        String pathStr = scanner.nextLine();
        File path = new File(pathStr);
        if (!path.exists() || path.isFile()) {
            System.out.println("Directory path does not exists.");
        } else {
            System.out.println("Please input keyword.");
            String keyword = scanner.nextLine();
            File file = new File(pathStr);
            File[] files = file.listFiles();
            for (File myFile : files) {
                if (myFile.isFile() && myFile.getName().endsWith(".txt")) {
                    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(myFile))) {
                        String check;
                        while ((check = bufferedReader.readLine()) != null) {
                            if (check.contains(keyword)) {
                                System.out.println(myFile.getName());
                                break;
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() throws IOException {
        System.out.println("Please input path.");
        String pathStr = scanner.nextLine();
        File path = new File(pathStr);
        if (!path.exists() || path.isFile()) {
            System.out.println("Directory path does not exists.");
        } else {
            System.out.println("Please input keyword.");
            String keyword = scanner.nextLine();
            File file = new File(pathStr);
            File[] files = file.listFiles();
            for (File myFile : files) {
                if (myFile.isFile() && myFile.getName().endsWith(".txt")) {
                    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(myFile))) {
                        String line = "";
                        int lineNumber = 1;
                        while ((line = bufferedReader.readLine()) != null) {
                            if (line.contains(keyword)) {
                                System.out.println(line + " line " + lineNumber);
                                break;
                            }
                            lineNumber++;
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("Please input folder path");
        String folderPath = scanner.nextLine();
        File file = new File(folderPath);
        if (file.exists() || file.isDirectory()) {
            double packageSize = 0;
            for (File listFiles : file.listFiles()) {
                packageSize += listFiles.length();
            }
            System.out.println("Size of folder: " + (packageSize / 1024 / 1024) + "mb");
        }
    }


    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() throws IOException {
        System.out.println("Please input path");
        String folderPath = scanner.nextLine();
        System.out.println("Please input file name");
        String fileName = scanner.nextLine();
        System.out.println("Please input content");
        String content = scanner.nextLine();
        File myFile = new File(folderPath);
        if (myFile.exists()) {
            String path = folderPath + "\\" + fileName;
            File file = new File(path);
            try (BufferedWriter contentWriter = new BufferedWriter(new FileWriter(file))) {
                contentWriter.write(content);
                System.out.println("File With Content was created.");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}




