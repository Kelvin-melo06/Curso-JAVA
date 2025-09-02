package aula_java2;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale idiomaPadrao = Locale.getDefault();
        System.out.println("Idioma do Sistema: " + idiomaPadrao.getDisplayLanguage());

        Toolkit sistema = Toolkit.getDefaultToolkit();
        Dimension screenSize = sistema.getScreenSize();
        System.out.println("Screen Size: " + screenSize);
    }
}
