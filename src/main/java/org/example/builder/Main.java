package org.example.builder;

public class Main {

    public static void main(String[] args) {

        BookInfoBuilder builder = new BookInfoBuilderImpl();
        BookInfo bookInfo = builder.setAuthor("J.K. Rowling").setName("Harry Potter and the Philosopher's Stone")
                .setEdition(7).build();
        System.out.println(bookInfo.toString());
    }
}
