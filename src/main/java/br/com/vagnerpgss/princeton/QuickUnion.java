package br.com.vagnerpgss.princeton;

/**
 * Lazy Approach
 * Second implementation for solving the dynamic connectivity problem, called Union-Find.
 * This algorithm is faster than QuickFind but also too slow.
 * 
 * Cost:
 * Initialize: N
 * Union: N
 * Find: N
 * 
 * @author vagner
 *
 */
public class QuickUnion implements UnionFind {

	private int[] id;

	public QuickUnion(int n) {
		id = new int[n];
		for (int i =0; i < n; i++) {
			id[i] = i;
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
		int pRoot = root(p);
		int qRoot = root(q);
		id[pRoot] = qRoot;
	}

	public int find(int p) {
		int maxComponent = p;
		while (p != id[p]) {
			if (maxComponent < id[p]) {
				maxComponent = id[p];
			}
			p = id[p];
		}
		if (maxComponent < id.length -1) {
			return find(maxComponent+1);
		}
		return maxComponent;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}