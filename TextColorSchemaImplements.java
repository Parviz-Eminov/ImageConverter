package ru.netology.graphics.image;

public class TextColorSchemaImplements implements TextColorSchema {

    private final char[] symbols = {'#','$', '@', '%', '*', '+', '-', '\''};

    @Override
    public char convert(int color) {
        int index = (int) ((color / 255.0) * (symbols.length-1));
        return symbols[index];
    }
}
