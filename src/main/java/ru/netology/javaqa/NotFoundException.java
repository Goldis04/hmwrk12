package ru.netology.javaqa;

public class NotFoundException extends RuntimeException {
    public NotFoundException(int id) {
        super("товар с id = " + id + "не найден.");
    }
}
