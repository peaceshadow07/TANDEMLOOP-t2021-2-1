import java.util.*;

class Problem_2{
    public static void main(String[] args) {
        // input object of Scanner class
        Scanner scan = new Scanner(System.in);

        // declare A of type integer
        int A;
        // take input for A
        A = scan.nextInt();

        // generate series 
        for(int  i = 1; i < (2 * A); i += 2){
            System.out.print(i +" ");
        }

        scan.close();
    }
}