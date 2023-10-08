
import java.lang.*;

class HelloWorld {
    public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    
    largestPalindrome();
   
    long endTime = System.currentTimeMillis();
    long x= (endTime-startTime);
    System.out.print("Elapsed time "+ x + " ms");
    }
    public  static void  largestPalindrome() {
    int l1=0,l2=0;//*/, ans=0;
    for(int i=999 ; i> 900; i-- ){
    if(pcheck(i) ){
    
    if(pcheck(i) && l1==0 ){
    l1 = i;
    continue;
    }
    l2 = l1* i;
    System.out.println(l2);
    break;
    }
    
    }}
    
public static boolean pcheck( int n){
    int rev =0;
    int num = n;
    while (num > 0){
        int dig = num % 10;
        rev = rev * 10 + dig;
        num /=10 ;
    }
    if(n == rev){
    // System.out.println(rev + " is done.");
        return true;
    }else{
        return false;
    } 
}
}

