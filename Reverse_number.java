public class  Reverse_number {
    public static void main(String args[]){
        int x=123;
        long reversed_number=0;
        while(x!=0){
            long digit=x%10;
            reversed_number=reversed_number*10+digit;
            x=x/10;
        }
        
    if(reversed_number>Integer.MAX_VALUE ||  reversed_number<Integer.MIN_VALUE){ // this placement i very important
        System.out.println("Overflow condition");
    }
        System.out.println(reversed_number);
    }
}
    

