package com.shaker;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
      Map<String, String> languages = new HashMap<>();
        if(languages.containsKey("Java")){
            System.out.println("Java already exists");
        }else {
            languages.put("Java", "a complied high level, object-oriented, platform independent language");
            System.out.println("Java added successfully");

      languages.put("Java", "a complied high level, object-oriented, platform independent language");
      languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
      languages.put("Algol", "an algorithmic language");
      languages.put("BASIC", "Beginners All Purpose Symbolic Instruction Code");
      languages.put("Lisp", "Okay I'm done");

        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        }else {
        languages.put("Java", "this course is about Java");
    }
            System.out.println("=========================================================");

//            languages.remove("Lisp");
            if(languages.remove("Algol", "an algorithmic language")){
                System.out.println("Algol removed");
            }else{
                System.out.println("Algol not removed, key/value pair not found");
            }
            if(languages.replace("Lisp", "Okay I'm done", "a functional programming language with imperative features ")){
                System.out.println("Lisp replaced");
            }else{
                System.out.println("Lisp will not be replaced");
            }
//            System.out.println(languages.replace("Scala", "this will not be replaced"));
        for(String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }
}
    }
}