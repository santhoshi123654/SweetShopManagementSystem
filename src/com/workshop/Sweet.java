package com.workshop;

import java.util.List;
import java.util.Objects;

public class Sweet {
	
	enum Shape {TRIANGLE, CONE, ROUND, DIAMOND}
	enum Colour {YELLOW, RED, WHITE,BROWN}
	
		Shape shape;
		Colour colour;	
		int price;
		List<String> ingredient;
		String name;
		
		@Override
		public String toString() {
			return "Sweet [shape=" + shape + ", colour=" + colour + ", price=" + price + ", ingredient=" + ingredient
					+ ", name=" + name + "]";
		}		
		
		public Shape getShape() {
			return shape;
		}

		public void setShape(Shape shape) {
			this.shape = shape;
		}

		public Colour getColour() {
			return colour;
		}

		public void setColour(Colour colour) {
			this.colour = colour;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public List<String> getIngredient() {
			return ingredient;
		}

		public void setIngredient(List<String> ingredient) {
			this.ingredient = ingredient;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		@Override
		public int hashCode() {
			return Objects.hash(colour, ingredient, name, price, shape);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Sweet other = (Sweet) obj;
			return Objects.equals(colour, other.colour) && Objects.equals(ingredient, other.ingredient)
					&& Objects.equals(name, other.name) && price == other.price && Objects.equals(shape, other.shape);
		}				
	}

