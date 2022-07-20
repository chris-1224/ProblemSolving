
// Problem 14 -> DisjointSet

import java.util.HashSet;

public class Disjointsets {

    static boolean areDisjoint(int set1[], int set2[]) {

        HashSet<Integer> set = new HashSet<>();

        for (int i=0; i<set1.length; i++)
            set.add(set1[i]);

        for (int i=0; i<set2.length; i++)
            if (set.contains(set2[i]))
                return false;
        return true;
    }

    public static void main (String[] args) {
        int set1[] = {12, 34, 11, 9, 3};
        int set2[] = {7, 2, 1, 5};
        // set2[] = {2, 1, 3, 5} Check 1
        // set2[] = {7, 2, 1, 5} Check 2

        if (areDisjoint(set1, set2))
            System.out.println("Yes, Disjoint");
        else
            System.out.println("Not Disjoint ");
    }
}
