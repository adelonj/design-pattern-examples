package org.example.builder;

public interface BookInfoBuilder {
    BookInfo build();
    BookInfoBuilder setAuthor(String author);
    BookInfoBuilder setName(String name);
    BookInfoBuilder setEdition(int edition);
    BookInfoBuilder setIndex(int index);

}
