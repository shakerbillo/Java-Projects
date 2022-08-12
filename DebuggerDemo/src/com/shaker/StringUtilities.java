package com.shaker;

public class StringUtilities {
    private StringBuilder sBuilder = new StringBuilder();
    private int charAdded = 0;

    public void addChar(StringBuilder sBuilder, char c){
        sBuilder.append(c);
        charAdded++;
    }

    public String upperAndPrefix(String str){
        String upper = str.toUpperCase();
        return "Prefix_" + upper;
    }
    public String addSuffix(String str){
        return str + "_Suffix";
    }
}
