package homework.books.command;

public interface Commands {
    int EXIT = 0;
    int ADD_BOOK = 1;
    int ADD_BOOK_BY_AUTHORS_INDEX = 2;
    int ADD_AUTHOR = 3;
    int PRINT_ALL_BOOKS = 4;
    int PRINT_BOOKS_BY_AUTHOR_NAME = 5;
    int PRINT_BOOKS_BY_GENRE = 6;
    int PRINT_BOOKS_BY_PRICE_RANGE = 7;

    static void printCommands() {
        System.out.println("Please input " + Commands.EXIT + " for exit ");
        System.out.println("Please input " + Commands.ADD_BOOK + " for add book ");
        System.out.println("Please input " + Commands.ADD_BOOK_BY_AUTHORS_INDEX + " for add book by Author ");
        System.out.println("Please input " + Commands.ADD_AUTHOR + " for add author");
        System.out.println("Please input " + Commands.PRINT_ALL_BOOKS + " for print all books ");
        System.out.println("Please input " + Commands.PRINT_BOOKS_BY_AUTHOR_NAME + " for print books by author name ");
        System.out.println("Please input " + Commands.PRINT_BOOKS_BY_GENRE + " for print books by genre ");
        System.out.println("Please input " + Commands.PRINT_BOOKS_BY_PRICE_RANGE + " for print books by price range ");
    }

}
