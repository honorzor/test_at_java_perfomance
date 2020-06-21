package ru.honorzor.finaltask1.entity;

public class MailMessage extends BaseEntity<String> {

    public MailMessage(String from, String to, String content) {
        super(from, to, content);
    }
}
