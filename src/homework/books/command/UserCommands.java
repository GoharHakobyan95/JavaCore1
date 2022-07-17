package homework.books.command;

public interface UserCommands extends Commands{

    static void printUserCommands() {
        System.out.println("Please input " + Commands.LOGOUT + " for logout ");
        System.out.println("Please input " + Commands.PRINT_ALL_BOOKS + " for print all books ");
        System.out.println("Please input " + Commands.PRINT_BOOKS_BY_AUTHOR_NAME + " for print books by author name ");
        System.out.println("Please input " + Commands.PRINT_BOOKS_BY_GENRE + " for print books by genre ");
        System.out.println("Please input " + Commands.PRINT_BOOKS_BY_PRICE_RANGE + " for print books by price range ");
    }
}

