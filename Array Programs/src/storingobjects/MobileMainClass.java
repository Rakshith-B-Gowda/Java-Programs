package storingobjects;

class MobileMainClass {
	
	public static void main(String[] args) {
		Mobile m1 = new Mobile("Apple", "15Pro", 125000.5);
		Mobile m2 = new Mobile("Samsung", "S24UltraMax", 150000.2);
		
		Mobile[] m = {m1, m2};
		
		for(int i=0; i<m.length; i++) {
			System.out.println("Brand: "+m[i].brand+", Model: "+m[i].modelNo+", Cost: "+m[i].cost);
			
		}
		
	}

}
