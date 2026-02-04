public class searchIn2d {
    public static void main(String[] args) {
        int [][] arr = {
            {4,5,6,3},
            {1,8,5},
            {7,9,},
            {33,44,55,97,1}
        };

        int target = 97;

        int ans = search(arr, target);
        System.out.println(ans);

    }

    static int search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] ==target) {
                    return arr[i][j];
                }
            }
        }
        return -1;
    }
}