public class multidimensionsArray {
    public static void main(String[] args){
        int[][] twoDimArray = {
            {0, 0, 0}, // first array of ints
            {0, 0, 0}, // second array of ints
            {0, 0, 0}  // third array of ints
        };

        int[][] twoDimArray1 = new int[2][10];
        for (int i = 0; i < twoDimArray1.length; i++) {
            for (int j = 0; j < twoDimArray1[i].length; j++) {
                twoDimArray1[i][j] = 1;
            }
        }
        for (int i = 0; i < twoDimArray1.length; i++) {
            System.out.println(Arrays.toString(twoDimArray1[i]));
       }
        // [1, 1, 1, 1, 1, 1, 1, 1, 1, 1]
        // [1, 1, 1, 1, 1, 1, 1, 1, 1, 1]
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j]++;
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
        // 2 2 2 2 2 2 2 2 2 2 
        // 2 2 2 2 2 2 2 2 2 2


        // multi
        int[][][] threeDimArray = new int[2][3][4];

        int element = 0;

        for (int i = 0; i < threeDimArray.length; i++) {
            for (int j = 0; j < threeDimArray[i].length; j++) {
                for (int k = 0; k < threeDimArray[i][j].length; k++) {
                    threeDimArray[i][j][k] = element;
                }
                element++;
            }
        }
    }
}
