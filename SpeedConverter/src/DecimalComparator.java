public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        int firstCheck = (int)(a * 1000);
        int secondCheck = (int)(b * 1000);
        if(a - b == 0){
            return true;
        } else

            return false;
    }
}


//    public static boolean areEqualByThreeDecimalPlaces(double myFirstDouble, double mySecondDouble){
//        int myFirstCheck = (int)(myFirstDouble * 1000);
//        int mySecondCheck = (int)(mySecondDouble * 1000);
//        if(myFirstCheck - mySecondCheck == 0){
//
//            return true;
//        } else
//
//            return false;
//
//    }
//
//
//}
