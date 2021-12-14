package com.workshop;

import java.util.Scanner;
import java.util.Set;

import com.workshop.Sweet.Colour;

public class UserInterface {
	private static UserInterface instance;
	
	private UserInterface() {
		
	}

	public static UserInterface getInstance() {
		if (instance == null) {
			instance = new UserInterface();
		}
		return instance;
	}

	public void printAllYellowSweet(Set<Sweet> sweetList) {
		sweetList.stream().filter(sweet -> (sweet.colour == Colour.YELLOW)).forEach(System.out::println);
	}

	public void printAllSweet(Set<Sweet> sweetList) {
//		for (int i = 0; i < sweetList.size(); i++) {
//			System.out.println(sweetList.get(i));
//		}
		sweetList.stream().forEach(sweet -> System.out.println(sweet));
	}

	public int showUserMenu() {
		 System.out.println("Enter \n1.Add sweet\n2.Remove sweet" + "\n3.Update sweet \n4.Print sweet \n5.Print all YellowSweets\n6.Sweet order \n7.Exit " + Application.exitValue);
		 Scanner sc = new Scanner(System.in);
		 int input = sc.nextInt();
		 return input;
  }
}
