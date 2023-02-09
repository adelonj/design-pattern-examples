package org.example.builder;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookInfo {
    private final String author;
    private final String name;
    private final int edition;
    private final int index;

}
