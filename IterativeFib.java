// fibonaci series in the dynamic way , iterative way (non recursive)

public class IterativeFib {
    public static void main(String args[]) {
     long pos = findFib(10);
    }
    
    public static long findFib(int position){
       if (position < 2 ) return position ;
        
        int sLast = 0 ; 
        int last = 1 ;
        int currentPos = 2 ;
        while (currentPos <= position){
            int temp = last ;
            last = sLast + last ;
            sLast = temp ;
            currentPos ++ ;
            System.out.println(last);
        }
        return last ; 
    }
}