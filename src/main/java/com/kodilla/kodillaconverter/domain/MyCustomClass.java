package com.kodilla.kodillaconverter.domain;

public class MyCustomClass {

    private final String author;
    private final String title;
    private final String year;

    public MyCustomClass(String field1, String field2, String field3) {
        author = field1;
        title = field2;
        year = field3;
    }

    @Override
    public String toString() {
        return "MyCustomClass{\n\t" +
                "author='" + author + '\'' +
                ", \n\ttitle='" + title + '\'' +
                ", \n\tyear='" + year + '\'' +
                '}';
    }
}
