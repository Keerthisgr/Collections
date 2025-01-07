package com.xworkz.collection.generics.comparator;

import com.xworkz.collection.generics.customtype.Book;

import java.util.Comparator;

public class AuthorNameComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getAuthorName().compareTo(o2.getAuthorName());
    }
}
