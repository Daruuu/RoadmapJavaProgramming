package topic4_collections.exersCollection_01.hashset01;

import java.util.HashSet;

public class SacoBolas {
    private HashSet<Integer> bolas;

    public SacoBolas() {
        bolas = new HashSet<>();
        int i = 0;
        while (i <= 100) {
            bolas.add(i);
            System.out.printf("%d ", i);
            i++;
        }
    }

    public SacoBolas(HashSet<Integer> bolas) {
        this.bolas = bolas;
    }

    public HashSet<Integer> getBolas() {
        return bolas;
    }

    public void setBolas(HashSet<Integer> bolas) {
        this.bolas = bolas;
    }

    @Override
    public String toString() {
        return "SacoBolas{" +
                "bolas=" + bolas +
                '}';
    }
}
