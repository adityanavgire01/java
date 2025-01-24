public class FindUniqueNumber {
    
    public static int BruteForceFindUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if( i != j && arr[i] == arr[j]){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1,4,4,5,2, 5,10,3};
        int result = BruteForceFindUnique(arr);
        System.out.println(result);
    }
}