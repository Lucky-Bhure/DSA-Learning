package TCS_Coding_Questions;


// Jack is always excited about sunday. It is favourite day, when he gets to play all day. And goes to cycling with his friends.
//  So every time when the months starts, he counts the number of sundays he will get to enjoy. Considering the month
//  can start with any day, be it Sunday, Monday.... Or so on.
//  Count the number of Sunday jack will get within n number of days.

// Example 1:
// Input: monday -> input String denoting the start of the month.
// 13 -> input integer denoting the number of days from the start of the month.
// Output :
// 2 -> number of days within 13 days.

// Explanation:
// The month start with mon(Monday). So, the upcoming sunday will arrive in next 6 days. And then next Sunday in next 7 days and so on.
// Now total number of days are 13. It means 6 days to first sunday and then remaining 7 days will end up in another
// sunday. Total 2 sundays may fall within 13 days.

public class Question7 {

    static int findNoOfSunday(String day, int noDays) {

        int N = 0;
        int start = -1;

        switch (day.toLowerCase()) {
            case "sunday": start = 0;
                break;
            case "monday": start = 1;
                break;
            case "tuesday": start = 3;
                break;
            case "wednesday": start = 4;
                break;
            case "thursday": start = 5;
                break;
            case "friday": start = 6;
                break;
            case "saturday": start = 7;
                break;
        }

        int firstSunday = (7 - start)% 7;

        if(firstSunday < noDays) {
            N = 1 + (noDays - firstSunday - 1) / 7;
        }

        return N;
    }

    public static void main(String[] args) {

        int noDays = 10;
        String day = "friday";

        int N = findNoOfSunday(day, noDays);

        System.out.print("There are "+ N+" sundays in "+ noDays+ " days.");

    }
}
