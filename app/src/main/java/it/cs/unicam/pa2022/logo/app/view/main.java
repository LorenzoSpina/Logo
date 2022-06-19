package it.cs.unicam.pa2022.logo.app.view;

import it.cs.unicam.pa2022.logo.app.Controller.Controller;
import it.cs.unicam.pa2022.logo.app.Controller.DefaultController;
import it.cs.unicam.pa2022.logo.app.FilesHandler.FileLogoReader;

import java.util.List;

public class main {
    public static void main(String[] args) {

        Controller controller = new DefaultController();
        FileLogoReader fileReader = new FileLogoReader();
        System.out.println("Welcome in Logo! Please insert your file with Instructions and plane's length and height...");

         List<String> instructions = fileReader.readLines("");
         controller.executeAllInstructions(instructions);

        System.out.println("This is the final result!");

    }
}