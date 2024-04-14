package dsa.tests.countRectangles;

public class CountRectangles {

    /**
     * @Time_complexity O((r^2) * (c^2))
     * @Space_complexity O(1)
     */
    public static int countABs(String[] board) {
        int maxRows = board.length;
        int maxCol = board[0].length();
        int validRectangles = 0;

        for (int height = 0; height < maxRows; height++) {
            for (int width = 0; width < maxCol; width++) {
                int numOfAs = 0;
                int numOfBs = 0;
                for (int r = 0; r <= height; r++) {
                    for (int c = 0; c <= width; c++) {
                        char character = board[r].charAt(c);
                        if (character == 'A') numOfAs++;
                        else if (character == 'B') numOfAs++;
                    }
                    if (numOfAs == numOfBs) validRectangles++;
                }
            }
        }
        return validRectangles;
    }
}
