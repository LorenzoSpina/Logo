/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package it.cs.unicam.pa2022.logo.utilities;

import it.cs.unicam.pa2022.logo.list.LinkedList;

class JoinUtils {
    public static String join(LinkedList source) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < source.size(); ++i) {
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(source.get(i));
        }

        return result.toString();
    }
}
