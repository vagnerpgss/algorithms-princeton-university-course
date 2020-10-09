package br.com.vagnerpgss.princeton;

import java.util.Arrays;

/**
 * 
 * Improvement in the QuickUnion algorithm.
 * Avoid tall trees - This algorithm ensures that always the smaller tree goes below
 * The smallest tree is the one with fewer nodes.
 * 
 * Cost:
 * Initialize: N
 * Union: Log N
 * Find: Log N
 * 
 * @author vagner
 *
 */
public class WeightedQuickUnion implements UnionFind {

    private int[] id;
    private int[] sz;

	public WeightedQuickUnion(int n) {
		id = new int[n];
		for (int i=0; i < n; i++) {
			id[i] = i;
        }
        sz = new int[n];
		for (int i=0; i < n; i++) {
			sz[i] = 1;
		}
	}

	private int root (int i) {
		while (i != id[i]) {
			i = id[i];
		}
		return i;
	}

	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}

	public void union(int p, int q) {
		int i = root(p);
		int j = root(q);
        if (i == j) {
            return;
        }
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
        prettyPrintTheArray(p, q);
	}

	@Override
	public int find(int p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

    private void prettyPrintTheArray(int p, int q) {
        System.out.println("Union of: " + p + " and " + q + ": ");
        System.out.println(Arrays.toString(id));
    }
}