package homework.books.storage;

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
            }
        }
    }


    public Author getAuthorByIndex(int authorIndex) {
        if (authorIndex >= 0 && authorIndex < size) {
            return array[authorIndex];
        }
        return null;
    }
}



