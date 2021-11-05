import java.util.Random;

public class main {
    /**
     * Matt Dunn, 11-3-21
     * Simulation for frog problem
     * Vid Link: https://www.youtube.com/watch?v=ZLTyX4zL2Fc
     */

    //Public Constants
    static int NUM_PADS = 1000; // Must be >= 1
    static int NUM_RUNS = 100000000; // Must be > 0
    static int[] DATA = new int[NUM_RUNS];

    public static void main(String[] args) {
        Random rand = new Random();
        //Runs the test NUM_RUNS amount of times and stores results in DATA
        for(int i = 0; i < NUM_RUNS; i++){
            int padsTraversed = 0;
            int count = 0;
            while(padsTraversed < NUM_PADS){
                padsTraversed += rand.nextInt(NUM_PADS - padsTraversed) + 1;
                count++;
            }
            DATA[i] = count;
        }
        System.out.printf("Average number of jumps for %d pads: %f", NUM_PADS, averageArr(DATA));
    }

    public static double averageArr(int[] a){
        int total = 0;
        for(int i : a){
            total += i;
        }
        return (double)total / a.length;
    }
}
