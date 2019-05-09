package tudelft.numfinder;

public class NumFinderMain {

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();

        nf.find(new int[] {4, 25, 7, 9});
        PrintNF(nf);

        nf = new NumFinder();
        nf.find(new int[] {4, 3, 2, 1});
        PrintNF(nf);

        nf = new NumFinder();
        nf.find(new int[] {20});
        PrintNF(nf);

        nf = new NumFinder();
        nf.find(new int[] {-1, -1, -1, -1});
        PrintNF(nf);

        nf = new NumFinder();
        nf.find(null);
        PrintNF(nf);
    }

    private static void PrintNF(NumFinder nf) {
        System.out.println(nf.getLargest());
        System.out.println(nf.getSmallest());
    }
}
