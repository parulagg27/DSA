package dsa.mockInterviews;

/*
Given two times (in 24-hour format), one with missing digits marked as '?', and the other with no missing digits,
we want to replace all of the question marks in the first time by digits (0-9) in such a way as to obtain the time
closest to the second time. The earliest possible time is 00:00 and the latest valid time is 23:59.
A time X is closer to Y than Z if the difference between X and Y is smaller than the difference between Y and Z.

Examples:
Given givenTime = "2?:?8", and referenceTime = "23:57" the function should return "23:58".
 */
public class MissingTimeDigits {

    /**
     * @Time_complexity O(1) - 1440 cases
     * @Space_complexity O(1) - constant auxiliary space used
     */
    public String nearestTime(String givenTime, String referenceTime) {
        if (!givenTime.contains("?")) return givenTime;
        if (givenTime.contains("??:??")) return referenceTime;
        String hours = givenTime.substring(0,2);
        String minutes = givenTime.substring(3);
        int nearestTimeDiff = Integer.MAX_VALUE;
        int givenHours = ((referenceTime.charAt(0) - '0') * 10) + (referenceTime.charAt(1) - '0');
        int givenMinutes = ((referenceTime.charAt(3) - '0') * 10) + (referenceTime.charAt(4) - '0');
        int totalGivenTimeInMin = givenHours * 60 + givenMinutes;
        int nearestHour = 0;
        int nearestMin = 0;

        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                int[] minHour = new int[]{(hours.charAt(0) - '0'), (hours.charAt(1) - '0')};
                int[] minMinutes = new int[]{(minutes.charAt(0) - '0'), (minutes.charAt(1) - '0')};
                if (minHour[0] == '?') minHour[0] = i / 10;
                if (minHour[1] == '?') minHour[1] = i % 10;
                if (minMinutes[0] == '?') minMinutes[0] = j / 10;
                if (minMinutes[1] == '?') minMinutes[1] = j % 10;
                int possibleHr = minHour[0] * 10 + minHour[1];
                int possibleMin = minMinutes[0] * 10 + minMinutes[1];
                int totalTimeInMinutes = possibleHr * 60 + possibleMin;
                int timeDifference = totalGivenTimeInMin - totalTimeInMinutes;
                if (timeDifference < nearestTimeDiff) {
                    nearestTimeDiff = timeDifference;
                    nearestHour = possibleHr;
                    nearestMin = possibleMin;
                }
            }
        }
        return String.valueOf(nearestHour) + ':' + nearestMin;
    }
}
