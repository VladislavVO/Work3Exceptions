package src.Model;

public class BadPhoneException extends Exception {
    String inputString;

    public BadPhoneException(String inputString) {
        this.inputString = inputString;
    }

    @Override
    public String getMessage() {
        return "Не получилось преобразовать " + inputString + " в телефонный номер, (нужный формат телефона 10 цифр без разделителей 9001234567)\n";
    }
}