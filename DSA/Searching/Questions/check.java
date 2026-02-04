public class check {
    public static void main(String[] args) {
        int[][] accounts = {
            {1,2,5},
            {2,3,4},
            {10,2}

        };
        int ans = maximumWealth(accounts);
        System.out.println();
    }

    public int maximumWealth(int[][] accounts) {
        int highest = 0;
        int sum = 0;
        for (int row = 0; row < accounts.length; row++) {
            
            for (int col = 0; col < accounts[row].length; col++){
                sum += accounts[row][col];
            }
            if(sum > highest){
                highest = sum;
            }
        }
        return highest;
    }
    
}
