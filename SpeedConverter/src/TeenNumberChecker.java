public class TeenNumberChecker {
    public static boolean hasTeen(int ageOne, int ageTwo, int ageThree) {
        return isTeen(ageOne) || isTeen(ageTwo) || isTeen(ageThree);

    }


    public static boolean isTeen(int age) {
        return (age >= 13 && age <= 19);

    }
}


//public class exercise2 {
//    public static boolean hasTeen(int nr5, int nr2, int nr3){
//        if ( isTeen(nr5) || isTeen(nr2) || isTeen(nr3)) {
//            System.out.println("Congrats, your input number is within the range");
//            return true ;
//        }
//        System.out.println("Your input isn't within the range");
//        return false;
//    }
//
//    public static boolean isTeen(int nr1){
//        return (nr1 >= 13 && nr1 <= 19);
//    }
//}


//public class TeenNumberChecker {
//
//    public static boolean hasTeen (int age1, int age2, int age3) {
//
//        boolean teen = false;
//        boolean teen1  = false;
//        boolean teen2  = false;
//        boolean teen3  = false;
//
//        if (age1 >= 13 && age1 <=19)
//            teen1 = true; // if the first age is a teen then teen1 is true
//
//        if (age2 >= 13 && age2 <=19)
//            teen2 = true; // if the second age is a teen then teen2 is true
//
//        if (age3 >= 13 && age3 <=19)
//            teen3 = true; // if the third age is a teen then teen3 is true
//
//        if (teen1 || teen2 || teen3) {
//            teen = true; // if any of the three are true then teen is true
//        }
//        return teen;
//    }
//}