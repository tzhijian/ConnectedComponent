import java.util.Arrays;

public class ConnectedComponent {

    public static void main(String[] args) {

        int img[][] = new int[6][6];
        int tempArr[][] = new int[6][6];
        int num = 0;

        img[1][1] = 1;
        img[3][1] = 1;
        img[2][2] = 1;
        img[4][2] = 1;
        img[1][3] = 1;
        img[3][3] = 1;
        img[2][4] = 1;
        img[4][4] = 1;

        // img[0] = vertical
        // img[1] = horizontal
        for (int row = 0 ; row < img[0].length ; row++) {
            for (int col = 0 ; col < img[1].length ; col++) {
                int pixelValue = img[row][col];
                if (pixelValue == 1) {
                    if (tempArr[row-1][col] != 0) {
                        tempArr[row][col] = tempArr[row-1][col];
                    } else if (tempArr[row][col-1] != 0) {
                        tempArr[row][col] = tempArr[row][col-1];
                    } else if (tempArr[row-1][col] == 0) {
                        num = num + 1;
                        tempArr[row][col] = num;
                    } else {
                        num = num + 1;
                        tempArr[row][col] = num;
                    }
                } else {
                    tempArr[row][col] = 0;
                }
            }
        }
        for (int[] row : tempArr) {
            for (int x : row) {
                System.out.print(x);
                System.out.print("\t");
            }
            System.out.println();
        }

        System.out.println(num);
    }
}