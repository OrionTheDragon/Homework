package org.skypro.skyshop.exceptions;

public class BestResultNotFound extends Exception {
    public BestResultNotFound(String search) {
        super("Не найден подходящий результат для запроса: " + search);
    }
}
