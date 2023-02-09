package org.example.builder;

public class BookInfoBuilderImpl implements BookInfoBuilder {
    private final int defaultEdition = 0;
    private final int defaultIndex = 1;

    private String author;
    private String name;
    private int edition = defaultEdition;
    private int index = defaultIndex;

    public BookInfoBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    public BookInfoBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public BookInfoBuilder setIndex(int index) {
        this.index = index;
        return this;
    }

    public BookInfoBuilder setEdition(int edition) {
        this.edition = edition;
        return this;
    }

    public BookInfo build() {

        if (author == null)
            throw new IllegalStateException("Author cannot be null");
        if (name == null)
            throw new IllegalStateException("Name cannot be null");

        return new BookInfo(author, name, edition, index);
    }
}
