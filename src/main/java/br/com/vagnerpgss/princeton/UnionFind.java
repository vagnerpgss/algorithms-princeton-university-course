package br.com.vagnerpgss.princeton;

public interface UnionFind {

	/**
	 * Add connection between p and q.
	 * @param p
	 * @param q
	 */
	void union(int p, int q);

	/**
	 * @param p
	 * @param q
	 * @return true if p and q are in the same component.
	 */
	boolean connected(int p, int q);

	/**
	 * @param p
	 * @return the largest element in the connected component containing p.
	 */
	int find(int p);

	/**
	 * @return the number of components
	 */
	int count();

}