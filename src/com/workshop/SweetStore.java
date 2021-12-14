package com.workshop;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SweetStore {
	private static SweetStore instance;
	private Set<Sweet> sweetList = new HashSet<>();
	
		private SweetStore() {
			
		}
		
		public static SweetStore getInstance() {
			if(instance == null) {
				instance = new SweetStore();
			}
			return instance;
		}

		public void add(Sweet sweet) {
			sweetList.add(sweet);
		}
		
		public Set getList() {
			return sweetList;
		}	
		
		public void removeSweet(Sweet sweet) {
			sweetList.remove(sweet);
		}
		
		public Sweet getSweet(String name) {
			for(Sweet sweet : sweetList) {
				
				if(sweet.name.equalsIgnoreCase(name)) {
					return sweet;
				}
			}
			return null;		 
		}	
	}
