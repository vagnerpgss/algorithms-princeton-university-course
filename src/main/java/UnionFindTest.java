import br.com.vagnerpgss.princeton.WeightedQuickUnion;

public class UnionFindTest {
    
    public static void main(String[] args) {
        WeightedQuickUnion weightedQuickUnion = new WeightedQuickUnion(10);
        weightedQuickUnion.union(4, 3);
        weightedQuickUnion.union(3, 8);
        weightedQuickUnion.union(6, 5);
        weightedQuickUnion.union(9, 4);
        weightedQuickUnion.union(2, 1);
        weightedQuickUnion.union(5, 0);
        weightedQuickUnion.union(7, 2);
        weightedQuickUnion.union(6, 1);
        weightedQuickUnion.union(7, 3);
    }

}