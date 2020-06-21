package ru.honorzor.finaltask1.entity;


public class BaseEntity<T> {
    private final String from;
    private final String to;
    private final T content;

    public BaseEntity(String from, String to, T content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }


    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public T getContent() {
        return content;
    }
}