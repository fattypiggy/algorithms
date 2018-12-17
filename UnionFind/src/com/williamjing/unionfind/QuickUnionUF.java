package com.williamjing.unionfind;

public class QuickUnionUF {
    /**
     * array of the id of i.
     */
    private int[] id;

    /**
     * constructor of Quick-Union UnionFind
     *
     * @param N the amount of pairs
     */
    public QuickUnionUF(int N) {
        id = new int[N];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }
    }

    /**
     * Interpretation: p and q are connected iff(if and only if) they have the same root.
     *
     * @param p a point
     * @param q another point
     */
    public void union(int p, int q) {
        int pid = root(p);
        int qid = root(q);
        if (pid != qid) {
            id[pid] = qid;
        }
    }

    /**
     * @param p point p
     * @param q point q
     * @return true if two points are connected, and vice versa
     */
    public boolean isConnected(int p, int q) {
        return root(p) == root(q);
    }

    /**
     * @param p point p
     * @return the root of p
     */
    private int root(int p) {
        while (p != id[p]) {
            id[p] = id[id[p]]; // with path compression
            p = id[p];
        }
        return p;
    }
}
