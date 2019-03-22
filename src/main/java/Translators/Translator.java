package Translators;

public abstract class Translator {
    String Language;

    public abstract String getLanguage();

    public String translate () {
        return "Я переводчик с " + getLanguage();
    }
}
