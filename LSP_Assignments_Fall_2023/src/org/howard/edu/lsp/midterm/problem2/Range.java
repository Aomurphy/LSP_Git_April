package org.howard.edu.lsp.midterm.problem2;

public class Range {
    private int start;
    private int end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public boolean isValueInRange(int value) {
        return value >= start && value <= end;
    }

    public boolean doRangesOverlap(Range otherRange) {
        return this.start <= otherRange.end && this.end >= otherRange.start;
    }

    public int size() {
        return Math.abs(end - start) + 1;
    }

    public static void main(String[] args) {
        Range range1 = new Range(10, 20);
        Range range2 = new Range(15, 25);
        Range range3 = new Range(30, 40);

        System.out.println("Is 15 in range1? " + range1.isValueInRange(15));
        System.out.println("Do range1 and range2 overlap? " + range1.doRangesOverlap(range2));
        System.out.println("Size of range1: " + range1.size());

        System.out.println("Is 5 in range2? " + range2.isValueInRange(5));
        System.out.println("Do range2 and range3 overlap? " + range2.doRangesOverlap(range3));
        System.out.println("Size of range2: " + range2.size());
    }
}
