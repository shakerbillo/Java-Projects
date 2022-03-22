package com.shaker;

public class Main {

    public static void main(String[] args) {
	 String VarFour = "this is private to main()";

    ScopeCheck scopeInstance = new ScopeCheck();
    scopeInstance.useInner();

//    ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//    System.out.println("varThree is not accessible here " + innerClass.VarThree);

    System.out.println("scopeInstance varOne is " + scopeInstance.getVarOne());
    System.out.println(VarFour);

    scopeInstance.timesTwo();
    System.out.println("**************************");
    ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
    innerClass.timesTwo();
}
}
