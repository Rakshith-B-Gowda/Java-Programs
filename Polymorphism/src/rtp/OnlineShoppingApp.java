package rtp;

class OnlineShoppingApp {
	void order() {
		System.out.println("Ordered products");
	}
}

class Amazon extends OnlineShoppingApp{
	@Override
	void order() {
		System.out.println("Ordering laptop from Amazon");
	}
}

class Flipkart extends OnlineShoppingApp{
	@Override
	void order() {
		System.out.println("Ordering mobile from Flipkart");
	}
}

class Myntra extends OnlineShoppingApp{
	@Override
	void order() {
		System.out.println("Ordering shoes from Myntra");
	}
}