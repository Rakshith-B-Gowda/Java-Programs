package com;

class Car extends Vehicle{
	
		@Override
		void start() {
			super.start();// Vehicle Started
			System.out.println("Car started!!");
			super.start();// Vehicle Started

		}
}
