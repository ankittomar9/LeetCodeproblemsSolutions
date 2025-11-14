public class String_First_Occurence {
    public static void main(String args[]){
        String haystack="sadwordsad"; 
        int h=haystack.length();
        String needle="sad";    
        int n=needle.length();

        // 10 17 9 15 14 19 25 8 4 20 
        if(n==0){
            System.out.println("Needle is not present");
        }

       
        for(int i=0;i<h-n;i++){  // sadwordsad
             boolean match=true;

            for(int j=0;j<n;j++){  // sad
                if(haystack.charAt(i+j)!=needle.charAt(j)){  //i=0+0  0   i=0+1  j=1 i+2 j=2  i+3 j=3
                    match=false;
                    break;
                }
            }
              if(match){
            System.out.println("Needle is found in haystack");  
            return;              
            }
        }
          System.out.println(" No needle is in  haystack");    
          



    }
    
}

/*/
28. Find the Index of the First Occurrence in a String

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.

Use indexOf to compare two object in substring

*/
