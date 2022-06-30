package homework.books;

import homework.books.command.Commands;
import homework.books.model.Author;
import homework.books.model.Book;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;

import java.util.Scanner;

public class BookDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            Commands.printCommands();
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case PRINT_BOOKS_BY_AUTHOR_NAME:
                    printBooksByAuthorName();
                    break;
                case PRINT_BOOKS_BY_GENRE:
                    printBooksByGenre();
                    break;
                case PRINT_BOOKS_BY_PRICE_RANGE:
                    printBooksByPriceRange();
                    break;
                default:
                    System.out.println("Invalid command, please try again. ");
                    break;
            }
        }
    }

    private static void addAuthor() {
        System.out.println("Please input Author name ");
        String name = scanner.nextLine();

        System.out.println("Please input Author surname. ");
        String surname = scanner.nextLine();

        System.out.println("Please input Author Email. ");
        String email = scanner.nextLine();

        System.out.println("Please input Author gender. ");
        String gender = scanner.nextLine();
        Author author = new Author(name, surname, email, gender);
        if (!author.getGender().equals("male") && !author.getGender().equals("female")) {
            System.out.println("Please input correct gender: male or female. ");
            addAuthor();
        } else {
            authorStorage.add(author);
            System.out.println("Thank you, Author was added !!! ");
        }
    }

    private static void addBook() {
        if (authorStorage.getSize() == 0) {
            System.out.println("Please add Author. ");
            addAuthor();
        } else {
            authorStorage.print();
            System.out.println("Please choose Author index. ");
            int authorIndex = Integer.parseInt(scanner.nextLine());
            Author author = authorStorage.getAuthorByIndex(authorIndex);
            if (author == null) {
                System.out.println("Please input correct index. ");
                addBook();
            } else {
                System.out.println("Please input Title of Book. ");
                String title = scanner.nextLine();
                System.out.println("Please input Price of Book. ");
                String priceStr = scanner.nextLine();
                System.out.println("Please input Count of Books. ");
                String countStr = scanner.nextLine();
                System.out.println("Please input Genre of Book. ");
                String genre = scanner.nextLine();

                double price = Double.parseDouble(priceStr);
                int count = Integer.parseInt(countStr);

                Book book = new Book(title, author, price, count, genre);
                bookStorage.add(book);
                System.out.println("Thank you, book was added !!! ");

            }
        }
    }

    private static void printBooksByAuthorName() {
        System.out.println("Please input Author name of Book. ");
        String authorName = scanner.nextLine();
        authorStorage.booksByAuthorName(authorName);
    }

    private static void printBooksByGenre() {
        System.out.println("Please input the Genre of Book. ");
        String genre = scanner.nextLine();
        bookStorage.booksByGenre(genre);
    }

    private static void printBooksByPriceRange() {
        System.out.println("Please input price range for Books. ");
        String range = scanner.nextLine();
        String[] split = range.split(",");
        double min = Double.parseDouble(split[0]);
        double max = Double.parseDouble(split[1]);
        bookStorage.booksByPriceRange(min, max);
    }

}