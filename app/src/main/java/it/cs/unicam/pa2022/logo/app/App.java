/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package it.cs.unicam.pa2022.logo.app;

import it.cs.unicam.pa2022.logo.list.LinkedList;

import static it.cs.unicam.pa2022.logo.utilities.StringUtils.join;
import static it.cs.unicam.pa2022.logo.utilities.StringUtils.split;
import static it.cs.unicam.pa2022.logo.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }

    RGB colour = new RGB(255,255,255);
}