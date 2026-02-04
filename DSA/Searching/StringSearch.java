public class StringSearch {
    public static void main(String[] args) {
        String name = "Sonali";

        char target = 'z';

        System.out.println(search2(name, target));

    }

    static boolean search(String str, char target) {

        if(str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
                if (target == str.charAt(i)){
                    return true;
                }
            }
            return false;

        }


    static boolean search2(String str, char target) {
        System.out.println("search2");

        if(str.length() == 0) {
            return false;
        }

        for (char chr : str.toCharArray()){
            if (chr == target){
                return true;
            }
        }
        return false;

    }

}
    

