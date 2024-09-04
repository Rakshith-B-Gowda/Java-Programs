package org;

class Country {
	String name;
	int population;
	
	Country(String name, int population) {
		this.name = name;
		this.population = population;
	}

	@Override
	public String toString() {
		return name+" has a population of "+population+" crores.";
	}
	
	public static void main(String[] args) {
		Country c1 = new Country("India", 140);
		Country c2 = new Country("USA", 40);
		Country c3 = new Country("Germany", 20);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
