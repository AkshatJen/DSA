// fibonacci series using dynamic programming , memoization 

public class MemoizationFib{
    
    final static int MAX = 100 ;
    final static int NIL = -1 ;
    
    int lookup [] = new int[MAX];
    
    void _initialize(){
        for (int i = 0 ; i < MAX ; i++){
            lookup[i] = NIL ;
        }
    }
        
    int fibonacci(int fib){
        if(lookup[fib] == NIL){
            if(fib <= 1) {
                lookup[fib] = fib ;
            }
            else {
                lookup[fib] = fibonacci(fib-1) + fibonacci(fib-2);
            }
            
        }
        return lookup[fib];
        
    } 
    
    public static void main(String args[]) {
      MyClass my = new MyClass();
        my.start();
        
    }
    
    public void start(){
        
        _initialize();
        System.out.println(fibonacci(47));
        
    }
}