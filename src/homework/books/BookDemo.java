package homework.books;

import chapters.chapter9.A;
import homework.books.command.Commands;
import homework.books.exception.AuthorNotFoundException;
import homework.books.model.Author;
import homework.books.model.Book;
import homework.books.model.Gender;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;

import java.util.Scanner;

public class BookDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();

    private static String login;
    private static String password;

    public static void main(String[] args) throws AuthorNotFoundException {

        boolean run = true;
        while (run) {
            System.out.println(" Log in  ");
            String login = scanner.nextLine();
            System.out.println(" Password  ");
            String password = scanner.nextLine();
            if (!login.equals("admin") || !password.equals("123456")) {
                System.out.println(" Incorrect login and/or password ");
            } else {
                Commands.printCommands();
                int command;
                try {
                    command = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    command = -1;
                }
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

    }

    private static void addAuthor() {
        System.out.println("Please input Author name ");
        String name = scanner.nextLine();

        System.out.println("Please input Author surname. ");
        String surname = scanner.nextLine();

        System.out.println("Please input Author Email. ");
        String email = scanner.nextLine();

        System.out.println("Please input Author gender. ");
        try {
            Gender gender = Gender.valueOf(scanner.nextLine().toUpperCase());
            Author author = new Author(name, surname, email, gender);
            while (!isValid(gender)) {
                author.setGender(gender);
            }
            authorStorage.add(author);
            System.out.println("Thank you, Author was added !!! ");
        } catch (IllegalArgumentException e) {
            System.out.println("Please input correct gender: Male or Female. ");
        }
    }

    private static boolean isValid(Gender gender) {
        return gender.equals(Gender.FEMALE) || gender.equals(Gender.MALE);
    }


    private static void addBook() throws AuthorNotFoundException {
        if (authorStorage.getSize() == 0) {
            addAuthor();
        } else {
            authorStorage.print();
            System.out.println("Please choose author index  for add book. ");
            Author author;
            try {
                int authorIndex = Integer.parseInt(scanner.nextLine());
                author = authorStorage.getAuthorByIndex(authorIndex);

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
            } catch (AuthorNotFoundException e) {
                System.out.println("Doesn't found. Add new author ! ");
                addAuthor();
                addBook();
            } catch (NumberFormatException e) {
                System.out.println("Please input valid number or index. ");
            }
        }
    }

    private static Author getAuthorByIndex() throws AuthorNotFoundException {
        System.out.println("Please input author's index");
        int index = Integer.parseInt(scanner.nextLine());
        return authorStorage.getAuthorByIndex(index);
    }


    private static void printBooksByAuthorName() {
        System.out.println("Please input Author name of Book! ");
        String authorName = scanner.nextLine();
        authorStorage.booksByAuthorName(authorName);
    }


    private static void printBooksByGenre() {
        System.out.println("Please input the Genre of Book! ");
        String genre = scanner.nextLine();
        bookStorage.booksByGenre(genre);
    }

    private static void printBooksByPriceRange() {
        System.out.println("Please input price range for Books. ");
        String range = scanner.nextLine();
        String[] split = range.split(",");
        try {
            double min = Double.parseDouble(split[0]);
            double max = Double.parseDouble(split[1]);
            bookStorage.booksByPriceRange(min, max);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input!  Number only! ");
        }
    }
}