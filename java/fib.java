public class fib{ 
        public static void main(String [] args)
        {
                long startTime = System.nanoTime();
                System.out.println("" + fib(42));
                long endTime = System.nanoTime();
                System.out.println("This took: " + ((endTime - startTime )/ 1000000) +" milliseconds");
        }

        public static int fib(int n){
            if(n == 0 || n == 1){
                return 1;    
            }else{
                return fib(n - 2) + fib(n - 1);    
            }
        }
}