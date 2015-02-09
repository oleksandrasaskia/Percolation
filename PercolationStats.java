public class PercolationStats {
   public PercolationStats(int N, int T)     // perform T independent experiments on an N-by-N grid
   {
	  
   }
   public double mean()                      // sample mean of percolation threshold
   {
	   return 0;
   }
   public double stddev()                    // sample standard deviation of percolation threshold
   {
	   return 0;
   }
   public double confidenceLo()              // low  endpoint of 95% confidence interval
   {
	   return 0;
   }
   public double confidenceHi()              // high endpoint of 95% confidence interval
   {
	   return 0;
   }

   public static void main(String[] args)    // test client (described below)
   {
	   StdOut.println(" Hello");
    int N = StdIn.readInt();
    WeightedQuickUnionUF uf = new WeightedQuickUnionUF(N);
    while (!StdIn.isEmpty()) {
        int p = StdIn.readInt();
        int q = StdIn.readInt();
        if (uf.connected(p, q)) continue;
        uf.union(p, q);
        StdOut.println(p + " " + q);
    }
    StdOut.println(uf.count() + " components");
   }//main

}