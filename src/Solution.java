import java.util.Scanner;

// Read inputs from System.in, Write outputs to System.out.
// Your class name has to be Solution

class Solution {

    public static void main(String args[]) {
        // new Solution_1().go();
        new Solution_2().go();
    }

}

class Solution_1 {
    int delta = Integer.MAX_VALUE;

    final void go() {
        final Scanner in = new Scanner(System.in);
        final int size = in.nextInt();
        final int[] horses = new int[size];
        //
        int nextHorse;
        int i = 0;
        while (i < size) {
            nextHorse = in.nextInt();
            delta(horses, nextHorse);
            horses[i++] = nextHorse;
        }
        //
        System.out.println(delta);
    }

    private final void delta(final int[] horses, final int nextHorse) {
        int deltaTmp;
        for (int horse : horses) {
            deltaTmp = Math.abs(horse - nextHorse);
            if (deltaTmp < delta) {
                delta = deltaTmp;
            }
        }
    }
}

class Solution_2 {
    final void go() {
        final Scanner in = new Scanner(System.in);
        final int size = in.nextInt();
        final int[] horses = new int[size];
        //
        int nextHorse;
        int i = 0;
        while (i < size) {
            nextHorse = in.nextInt();
            horses[i++] = nextHorse;
        }
        int delta = delta(horses);
        //
        System.out.println(delta);
    }

    private final int delta(final int[] horses) {
        int delta = Integer.MAX_VALUE;
        int deltaTmp, horse, nextHorse;
        for (int i = 0; i < horses.length; i++) {
            horse = horses[i];
            for (int j = i + 1; j < horses.length; j++) {
                nextHorse = horses[j];
                deltaTmp = Math.abs(horse - nextHorse);
                if (deltaTmp < delta) {
                    delta = deltaTmp;
                }
            }
        }
        return delta;
    }

}
