package br.com.vagnerpgss.princeton;

/**
 * First implementation of an algorithm for solving the dynamic connectivity problem, called Quick-find.
 * 
 * Cost:
 * Initialize: N
 * Union: N
 * Find: 1
 * 
 * Too slow.
 * Too expensive union method: Quadratic, takes N² array accesses to process sequence of N union commands on N objects.
 * 
 * @author vagner
 *
 */
public class QuickFind implements UnionFind {

	private int[] id;

	public QuickFind(int n) {
		id = new int[n];
		for (int i=0; i < n; i++) {
			id[i] = i;
		}
	}

	public boolean connected(int p, int q) {
		return id[p] == id[q];
	}

	public void union(int p, int q) {
		int pId = id[p];
		int qId = id[q];
		for (int i=0; i < id.length; i++) {
			if (id[i] == pId) {
				id[i] = qId;
			}
		}
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

}