package com.williamjing.unionfind;

public class QuickUnionUF {
    private int[] id;

    public QuickUnionUF(int N) {
        id = new int[N];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }
    }

    public void union(int p, int q) {
        int pid = root(p);
        int qid = root(q);
        if (pid != qid) {
            id[pid] = qid;
        }
    }

    public boolean isConnected(int p, int q) {
        return root(p) == root(q);
    }

    private int root(int p) {
        while (p != id[p]) {
            p = id[p];
        }
        return p;
    }
}
