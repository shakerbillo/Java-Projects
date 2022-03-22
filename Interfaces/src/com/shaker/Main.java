package com.shaker;

public class Main {

    public static void main(String[] args) {
	        ITelephone emmanuelsPhone;
            emmanuelsPhone = new DeskPhone(222222);
            emmanuelsPhone.powerOn();
            emmanuelsPhone.callPhone(222222);
            emmanuelsPhone.answer();

            emmanuelsPhone = new MobilePhone(333333);
            emmanuelsPhone.powerOn();
            emmanuelsPhone.callPhone(333333);
            emmanuelsPhone.answer();

    }
}
