package org.howard.edu.lsp.assignment4;
import java.util.ArrayList;
import java.util.List;

public class IntegerSet {
    private List<Integer> set;

    public IntegerSet() {
        set = new ArrayList<Integer>();
    }

    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    public void clear() {
        set.clear();
    }

    public boolean equals(Object o) {
            return this.set == o;
        
    }

    public boolean contains(int value) {
        return set.contains(value);
    }

    public int largest() throws IntegerSetException {
        if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        int max = set.get(0);
        for (int item : set) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

    public int smallest() throws IntegerSetException {
        if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        int min = set.get(0);
        for (int item : set) {
            if (item < min) {
                min = item;
            }
        }
        return min;
    }

    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            if (!set.contains(item)) {
                set.add(item);
            }
        }
    }

    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }
    public int length() {
        return set.size();
    }

    public void complement(IntegerSet intSetb) {
        List<Integer> complement = new ArrayList<>();
        for (int item : intSetb.set) {
            if (!set.contains(item)) {
                complement.add(item);
            }
        }
        set = complement;
    }

    public boolean isEmpty() {
        return set.isEmpty();
    }

    public String toString() {
        return set.toString();
    }
}
