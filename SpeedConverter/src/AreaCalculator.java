public class AreaCalculator {

    public static double area(double radius){
        if (radius < 0){
            return -1;
        }
         return radius * radius * Math.PI;
        }
        public static double area(double x, double y){
           if (x < 0 || y < 0){
               return -1;
           }
           return x*y;
        }
}


// or

//    public static double area (double radius) {
//        return (radius < 0) ? -1 : radius * radius * Math.PI;
//    }
//
//    public static double area (double x, double y) {
//        return (x < 0 || y < 0) ? -1 : x * y;
//    }
//}

// or

//    public static double area (double radius){
//        if(radius < 0){
//            return -1.0;
//        }
//        double r = radius;
//        double square = Math.pow(radius, 2);
//        double circleArea = square * Math.PI;
//        return circleArea;
//    }
//    public static double area (double x, double y){
//        if ((x < 0) || (y < 0)){
//            return -1.0;
//        }
//        double rectangleArea = x*y;
//        return rectangleArea;
//    }
//}

