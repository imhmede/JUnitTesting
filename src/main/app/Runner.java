package src.main.app;

import src.view.View;
import src.controller.Controller;
import src.model.Model;

/**
 * This program utilizes quick sort and binary search algorithm to find if a given number is in 
 * an array. The program is designd with the Model View Controller design pattern - Passive Model.
 * @author  Essa Imhmed
 * Sep 26, 2023
 */
public class Runner {

	/**
	 * The main entry point of the program.
	 * @param command-line arguments.
	 */
	public static void main(String[] args) {

		Controller controller;
		Model model = new Model();
		View view = new View("View 1");
		controller = new Controller(model, view);
		view.setController(controller);
		view.sendMessage();
	}
}
