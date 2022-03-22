public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        getDaysInMonth(2, 2020);

    }
    public static boolean isLeapYear(int year){
        if (year < 1 && year > 9999){
            return false;
        } else if (year % 4 == 0 && year % 100 != 0|| year % 400 == 0 ){
            return true;
        } else {
}    return false;
    }
    public static int getDaysInMonth(int month, int year){
        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                break;

        }

        if (month < 1 || month > 12){
            return -1;
        } else if (year < 1 || year > 9999) {
            return -1;
        }
        return month;
    }

}


