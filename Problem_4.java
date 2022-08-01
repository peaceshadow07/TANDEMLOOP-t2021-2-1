import java.util.*;

class Problem_4{
    public static void main(String[] args) {
        // input object of Scanner class
        Scanner scan = new Scanner(System.in);

        // declare and inititalize Map to store count of number in list
        Map<Integer, Integer> dict = new HashMap<>();
        for(int i = 1; i < 10; i++){
            dict.put(i, 0);
        }
        // decalre N -> size of input array
        int N;
        // take input N
        N = scan.nextInt();
        // decalre input array to store input 
        int[] input = new int[N];
        // take input for array
        for(int i = 0; i < N; i++){
            input[i] = scan.nextInt();
        }

        // calculate frequency
        for(int divisor : dict.keySet()){
            // declare and initialize freq to store count of number
            int freq = 0;
            for(int element : input){
                // if element divisible by divisor increase it's count
                if((element % divisor) == 0){
                    freq++;
                }
            }
            // update freq for divisor
            dict.put(divisor, freq);
        }
    
        // output dict
        System.out.println(dict);

        // close scanner object
        scan.close();
    }
}