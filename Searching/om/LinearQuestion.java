


public class LinearQuestion {
    public static void main(String[] args) {
        String name = "omraje";
        char target = 'r';

        boolean result = search(name, target);
        System.out.println(result);
    }

    static boolean search(String str, char target ){
        if(str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }

        return false;
    }
}
