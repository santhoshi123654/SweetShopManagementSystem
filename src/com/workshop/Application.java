package com.workshop;

	import java.util.Scanner;

	public class Application {
		
		final static int exitValue = 7;
		UserInterface userInterface =new UserInterface();
		SweetStore sweetStore = new SweetStore();
		
		public static void main(String[] args) {
			System.out.println("Welcome to Sweet Shop");	
			Application app = new Application();
			while(true) {
				int input = app.userInterface.showUserMenu();
				app.handleUserSelection(input);
				
				if(input == exitValue) {
					break;
				}
			}
			System.out.println("Good Bye");
		}
		
		private void handleUserSelection(int input) { 
			UserInterface userInterface = new UserInterface();
			
			switch(input) {
				case 1:
					Laddu laddu = new Laddu();
					laddu.price = 200;
					Modak modak = new Modak();
					modak.price = 300;
					Mothichur mothichur = new Mothichur();
					mothichur.price = 600;
					Mothichur mothichur2 = new Mothichur();
					mothichur2.price = 400;
					KajuBarfi kajubarfi = new KajuBarfi();
					kajubarfi.price = 500;
				
					sweetStore.add(laddu);
					sweetStore.add(kajubarfi);
					sweetStore.add(mothichur);
					sweetStore.add(modak);
					sweetStore.add(mothichur);
					sweetStore.add(mothichur2);
					break;
				case 2:
					System.out.println("Enter the name you want to delete :");
					Scanner sc = new Scanner(System.in);
					String sweetName = sc.next();
					
					Sweet name = sweetStore.getSweet(sweetName);
					sweetStore.removeSweet(name);
				case 4:
					userInterface.printAllSweet(sweetStore.getList());
					break;
				case exitValue:
					int ext;
					break;
				}			
		}
	}
