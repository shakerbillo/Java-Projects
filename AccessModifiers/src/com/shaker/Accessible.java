package com.shaker;

 interface Accessible {             // visibility is set to package private
     int SOME_CONSTANT = 100;    // visibility is set to public
     public void methodA();  // visibility is set to public
     void methodB();         // visibility is set to public
     boolean nethodC();       // visibility is set to public // all interface methods automatically public

}
