package ru.netology.graphics;

import ru.netology.graphics.image.TextColorSchemaImplements;
import ru.netology.graphics.image.TextGraphicsConverter;
import ru.netology.graphics.image.TextGraphicsConverterImplements;
import ru.netology.graphics.server.GServer;

import java.io.File;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        TextGraphicsConverter converter = new TextGraphicsConverterImplements();
        converter.setMaxWidth(100);
        converter.setMaxHeight(50);
        converter.setMaxRatio(2.0);
        converter.setTextColorSchema(new TextColorSchemaImplements());

        GServer server = new GServer(converter);
        server.start(); 

        String url = "https://raw.githubusercontent.com/netology-code/java-diplom/main/pics/simple-test.png";
        String imgTxt = converter.convert(url);
        System.out.println(imgTxt);
    }
}
