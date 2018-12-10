package com.williamjing.unionfind;

public class QuickFindUF {
    /**
     * array of the id of i.
     */
    private int[] id;

    /**
     * constructor of Quick-Find UnionFind
     *
     * @param N the amount of pairs
     */
    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    /**
     * @param p a point
     * @param q another point
     * @return true if two points are connected, and vice versa
     */
    public boolean isConnected(int p, int q) {
        return id[p] == id[q];
    }

    /**
     * Interpretation: p and q are connected iff(if and only if) they have the same id.
     *
     * @param p a point
     * @param q another point
     */
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        // change all entries with parent[p] to parent[q]
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid)
                id[i] = qid;
        }
    }

}
