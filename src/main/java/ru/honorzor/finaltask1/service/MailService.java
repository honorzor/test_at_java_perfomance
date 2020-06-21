package ru.honorzor.finaltask1.service;

import ru.honorzor.finaltask1.entity.BaseEntity;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<BaseEntity> {

    public final Map<String, List<T>> messageContainer = new HashMap<>() {
        @Override
        public List<T> get(Object key) {
            return super.getOrDefault(key, new LinkedList<T>());
        }
    };

    public final Map<String, List<T>> getMessageContainer() {
        return messageContainer;
    }


    @Override
    public void accept(BaseEntity msg) {
        if (!messageContainer.containsKey(msg.getTo())) {
            messageContainer.put(msg.getTo(), new ArrayList<>());
        }
        messageContainer.get(msg.getTo()).add((T) msg.getContent());
    }
}
