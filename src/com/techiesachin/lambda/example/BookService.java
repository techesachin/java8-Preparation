
package com.techiesachin.lambda.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

    List<Book> getBooksInSort() {

        List<Book> books = new BookDAO().getBook();
     /*   Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });*/
        Collections.sort(books, (o1, o2) -> o2.getName().compareTo(o1.getName()));
        return books;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBooksInSort());
    }

}

/*class MyComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o2.getName().compareTo(o1.getName());
    }
}*/
