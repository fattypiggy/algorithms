package com.williamjing.unionfind;

public class WeightedQuickUnionUF {
    /**
     * array of the id of i.
     */
    private int[] id;

    /**
     * array of the size of a tree(id[i]).
     */
    private int[] sz;

    /**
     * constructor of Quick-Union UnionFind
     *
     * @param N the amount of pairs
     */
    public WeightedQuickUnionUF(int N) {
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    /**
     * Interpretation: p and q are connected iff(if and only if) they have the same root.
     * Weighting avoids tall trees.
     * Keep track of size of each tree(number of points).
     * Balance by linking root of smaller tree to root of larger tree.
     *
     * @param p a point
     * @param q another point
     */
    public void union(int p, int q) {
        int pid = root(p);
        int qid = root(q);

        if (pid == qid) {
            return;
        } else if (sz[pid] < sz[qid]) {
            id[pid] = qid;
            sz[qid] += sz[pid];
        } else {
            id[qid] = pid;
            sz[pid] += sz[qid];
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
            p = id[p];
        }
        return p;
    }
}
