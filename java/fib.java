public class fib{ 
        public static void main(String [] args)
        {
                int num = Integer.parseInt(args[0]);
                long startTime = System.nanoTime();
                System.out.println("" + fib(num));
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
