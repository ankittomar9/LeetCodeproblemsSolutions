public class PalindromeNumber {

    public static void main(String args[]){
        int x=121;
        int original_number=x;
        int reversed_number=0;

        while(x!=0){
            int digit=x%10;
            reversed_number=reversed_number*10+digit;

            x=x/10;

        }

        if(reversed_number==original_number){
            System.out.println("Number is palindromic");
        }else{
            System.out.println("number is not a palindrome");
        }


    }
    
}
