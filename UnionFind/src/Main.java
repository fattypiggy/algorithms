import com.williamjing.unionfind.QuickFindUF;
import com.williamjing.unionfind.QuickUnionUF;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        String path = "resources/uf.txt";
        File file = new File(path);
        InputStreamReader reader;
        try {
            reader = new InputStreamReader(new FileInputStream(file));
            BufferedReader br = new BufferedReader(reader);
            String line;
            line = br.readLine();
            // the first line is the amount of pairs.
            int N = Integer.parseInt(line);
            // initialize the quick-find union find.
            QuickFindUF quickFindUF = new QuickFindUF(N);
            QuickUnionUF quickUnionUF = new QuickUnionUF(N);
            while ((line = br.readLine()) != null) {
                String[] buffer = line.split(" ");
                quickFindUF.union(Integer.parseInt(buffer[0]), Integer.parseInt(buffer[1]));
                quickUnionUF.union(Integer.parseInt(buffer[0]), Integer.parseInt(buffer[1]));
                System.out.println(line);
            }

            System.out.println("Quick Find - Union Find");
            System.out.println("6 & 7 is connected? " + quickFindUF.isConnected(6, 7));
            System.out.println("1 & 3 is connected? " + quickFindUF.isConnected(1, 3));
            System.out.println("2 & 5 is connected? " + quickFindUF.isConnected(2, 5));
            System.out.println("4 & 7 is connected? " + quickFindUF.isConnected(4, 7));
            System.out.println("3 & 8 is connected? " + quickFindUF.isConnected(3, 8));

            System.out.println("Quick Union - Union Find");
            System.out.println("6 & 7 is connected? " + quickUnionUF.isConnected(6, 7));
            System.out.println("1 & 3 is connected? " + quickUnionUF.isConnected(1, 3));
            System.out.println("2 & 5 is connected? " + quickUnionUF.isConnected(2, 5));
            System.out.println("4 & 7 is connected? " + quickUnionUF.isConnected(4, 7));
            System.out.println("3 & 8 is connected? " + quickUnionUF.isConnected(3, 8));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
