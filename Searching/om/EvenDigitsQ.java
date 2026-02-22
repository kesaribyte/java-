import javax.print.attribute.standard.NumberUpSupported;

public class EvenDigitsQ {
    public static void main(String[] args) {
        int[] num = {12,345,2,6,7896};
        System.out.println(findNumbers(num));
    }   
    
    
    static public int findNumbers(int[] nums) {

        int count = 0;
        for (int num : nums){
            if (even(num)){
                count++;
            }
        } 


        return count;

    }

   
    
    static boolean even(int num){
        int numbersofdigits = digits(num);
        if (numbersofdigits %2 == 0){
            return true;
        }
        return false;
    }

    static int digits(int num){

        if (num<0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        
        int count = 0;

        while(num> 0){
            count++;
            num = num /10; // num /=10
        }


        return count;
    }

}