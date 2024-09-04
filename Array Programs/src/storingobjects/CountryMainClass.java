package storingobjects;

class CountryMainClass {
	
	public static void main(String[] args) {
		Country c1 = new Country("India", 140);
		Country c2 = new Country("USA", 50);
		
		Country[] c = {c1, c2};
		
		for(int i=0;i<c.length;i++) {
			
			System.out.println("Population of "+c[i].name+" is "+c[i].population+" crores");
			
			
		}
	}
}
