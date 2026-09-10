class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] startTimeArr = startTime.split(":");
        String[] endTimeArr = endTime.split(":");

        int startTimeSeconds = 0;
        int endTimeSeconds = 0;

        startTimeSeconds = Integer.parseInt(startTimeArr[0]) * 60 * 60 + Integer.parseInt(startTimeArr[1]) * 60 + Integer.parseInt(startTimeArr[2]);
        endTimeSeconds = Integer.parseInt(endTimeArr[0]) * 60 * 60 + Integer.parseInt(endTimeArr[1]) * 60 + Integer.parseInt(endTimeArr[2]);

        return endTimeSeconds - startTimeSeconds;

    }
}