package com;

interface GooglePay{
	void payAmount();
}

interface Uber extends GooglePay{
	void bookCab();
}
