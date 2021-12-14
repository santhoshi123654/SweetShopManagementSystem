package com.workshop;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

	public class Application {
		
		final static int exitValue = 7;
		UserInterface userInterface = UserInterface.getInstance();
		Scanner sc = new Scanner(System.in);
		
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
			UserInterface userInterface =UserInterface.getInstance();
			SweetStore sweetStore = SweetStore.getInstance();
			
			switch(input) {
			
				case 1:
					addSweet();
					break;
					
				case 2:
					System.out.println("Enter the name you want to delete :");
					Scanner sc = new Scanner(System.in);
					String sweetName = sc.next();
					
					Sweet name = sweetStore.getSweet(sweetName);
					sweetStore.removeSweet(name);
					
				case 3:
					System.out.println("Enter the Sweet name you want to Update :");
					Scanner scanner = new Scanner(System.in);
					String sweetName1 = scanner.next();
					Sweet sweet = sweetStore.getSweet(sweetName1);
					updateSweet(sweet);
					
				case 4:
					userInterface.printAllSweet(sweetStore.getList());
					break;
				case 5:
					UserInterface userInterface1 = UserInterface.getInstance();
					userInterface1.printAllYellowSweet(sweetStore.getList());
					break;
				case 6:
					getOrder();
					
					break;
				case exitValue:
					int exit;
					break;
				}		
			
		}
		private void getOrder() {
				SweetStore sweetStore = SweetStore.getInstance();	
				Order order = new Order();
				Scanner sc= new Scanner(System.in);
				int quanity =0;
				System.out.println("Welcome to SweetShop");
				System.out.println("Enter your name :");
				String customerName = sc.next();
				System.out.println("Enter Your Mobile Number ");
				long mobileNumber = sc.nextLong();
				order.setMobileNumber(mobileNumber);
				System.out.println("Enter the Id:");
				String id = sc.next();
				order.setId(id);
				int price = 0;
				String sweetName = null;
				do {
					System.out.println("Enter the Sweet Name you want to order:");
					sweetName = sc.next();
					Sweet sweet = sweetStore.getSweet(sweetName);	
					if(sweetName.compareToIgnoreCase("quit")== 0) {
						break;
					}
					
					System.out.println("Enter the Quantity :");
					int quantity = sc.nextInt();
					price += sweet.getPrice()*quantity;

					Map<Sweet, Integer> orderMap = new HashMap<Sweet,Integer>();
					orderMap.put(sweet, quantity);
					order.setSweetQuantityMap(orderMap);
		
				}while(true);
				
				order.setTotalPrice(price);
				System.out.println(order);
	 }		

		private void addSweet() {
			SweetStore store = SweetStore.getInstance();
			Sweet sweet = new Sweet();
			System.out.println("Enter sweet name");
			sweet.name = sc.next();
			System.out.println("Enter color");
			setColour(sweet);
			System.out.println("Enter shape");
			setShape(sweet);
			System.out.println("Enter price");
			sweet.price = sc.nextInt();
			setIngredient(sweet);
			store.add(sweet);
		}

		private void setIngredient(Sweet sweet) {
			System.out.println("Enter the new Ingredients sweet\",\"");
			String newIngredients = sc.next();
			String[] ingredientArr = newIngredients.split(",");

			sweet.ingredient = Arrays.asList(ingredientArr);
		}
				
		private void updatePrice(Sweet sweet) {
			System.out.println("Enter Price");
			int newPrice = sc.nextInt();
			sweet.price = newPrice;
		}

		private void updateName(Sweet sweet) {
			System.out.println("Enter Name");
			String newName = sc.nextLine();
			sweet.name = newName;
		}

		public void setShape(Sweet sweet) {	
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter\n1.TRIANGLE \n2.CONE \n3.ROUND \n4.DIAMOND");
			int shape =scanner.nextInt();
			
			switch(shape) {
			
			case 1:
				sweet.shape = Sweet.Shape.TRIANGLE;
				break;
			case 2:
				sweet.shape = Sweet.Shape.CONE;
				break;
			case 3:
				sweet.shape = Sweet.Shape.ROUND;
				break;
			case 4:
				sweet.shape = Sweet.Shape.DIAMOND;
				break;
			}
			
		}
		
		public void setColour(Sweet sweet) {
			Scanner scanner =new Scanner(System.in);
			System.out.println("Enter\n1.RED \n2.YELLOW \n3.WHITE \n4.BROWN");
			int colour =scanner.nextInt();
			
			switch(colour) {
			
			case 1:
				sweet.colour = Sweet.Colour.RED;
				break;
			case 2:
				sweet.colour = Sweet.Colour.YELLOW;
				break;
			case 3:
				sweet.colour = Sweet.Colour.WHITE;
				break;
			case 4:
				sweet.colour = Sweet.Colour.BROWN;
				break;
			}
		}
		
//		public void updateSweetIngredients(Sweet sweet) {
//			Scanner scanner = new Scanner(System.in);
//			System.out.println("Enter the Ingredients to be Updated :");
//			String newIngredients = scanner.nextLine();
//			sweet.ingredient.clear();
//			String[] newIngredientsArr = newIngredients.split(" ");
//			sweet.ingredient = Arrays.asList(newIngredientsArr);
//		}
		
		public void updateSweet(Sweet sweet) {
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the thing what to be updated \n1.SweetName"
							+ " \n2.Colour \n3.Shape \n4.Price \n5.Ingredients");
			int change = scanner.nextInt();
			
			switch(change) {
				
			case 1:
				setShape(sweet);
				break;
			case 2:
				setColour(sweet);
				break;
			case 3:
				updateName(sweet);
				break;
			case 4:
				updatePrice(sweet);
				break;
			case 5:
				setIngredient(sweet);
				break;
	
			default:
				System.exit(0);
			}
			
		}
			
	}	

