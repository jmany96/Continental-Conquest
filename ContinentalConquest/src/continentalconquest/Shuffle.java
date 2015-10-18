/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package continentalconquest;

/**
 *
 * @author x13332576
 */
public class Shuffle {
    
    
    
    public static void shuffle(Object[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            // choose index uniformly in [i, N-1]
            int r = i + (int) (Math.random() * (N - i));
            Object swap = a[r];
            a[r] = a[i];
            a[i] = swap;
        }
    }   
}
