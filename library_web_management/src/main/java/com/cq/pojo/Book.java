package com.cq.pojo;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @JsonProperty("book_id")
    private Integer bookId;

    private String title;
    private String author;
    private String isbn;
    @JsonProperty("published_year")
    private int publishedYear;
    private String status;

}
