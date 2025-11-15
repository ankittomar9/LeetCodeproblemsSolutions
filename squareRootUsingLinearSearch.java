public class squareRootUsingLinearSearch {
    public static void main(String args[]){
        int x=4;
        mySqrt(x);
    }
   
    public static void mySqrt(int x) {
        if(x<2){
             System.out.println("Square root of 2 is 1. Something");
        }

        long i=1;
       int root=1;

       while(i*i<=x){
        root=(int)i;
        i++;
       }
        System.out.println(root);
        
    }
}
    

