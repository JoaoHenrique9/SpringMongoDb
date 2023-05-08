package com.springbootexemple.models;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Document("books")
@Data
public class Book {
    @Id
    public String id;

    @JsonProperty("name")
    public String name;

    @JsonProperty("price")
    public BigDecimal price;

    @JsonProperty("category")
    public String category;

    @JsonProperty("author")
    public String author;
}
