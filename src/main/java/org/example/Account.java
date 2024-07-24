package org.example;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name.length() < 3 || name.length() > 19) {
            return false;
        }
        if (name.indexOf(' ') == -1) {
            return false;
        }
        if (name.startsWith(" ") || name.endsWith(" ")) {
            return false;
        }
        return true;

        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
    }

}
