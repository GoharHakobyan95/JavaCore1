package homework.books.storage;

import homework.books.exception.AuthorNotFoundException;
import homework.books.model.Author;

public class AuthorStorage {
    private Author[] array = new Author[10];
    private int size = 0;

    public void add(Author author) {
        if (size == array.length) {
            extend();
        }
        array[size++] = author;
    }

    private void extend() {
        Author[] temp = new Author[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + "." + array[i] + " ");
        }
    }

    public int getSize() {
        return size;
    }


    public void booksByAuthorName(String author) {
        for (int i = 0; i < size; i++) {
            if (array[i].getName().equals(author)) {
                System.out.println(array[i]);
            } else {
                System.out.println("Please input correct name");
            }
        }
    }


    public Author getAuthorByIndex(int authorIndex) throws AuthorNotFoundException {
        if (authorIndex < 0 || authorIndex > size) {
            throw new AuthorNotFoundException();
        } else {
            if (array[authorIndex] == null) {
                throw new AuthorNotFoundException();
            }
            return array[authorIndex];
        }
    }
}



