class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] flight : flights) {
            adj.get(flight[0]).add(new int[]{flight[1], flight[2]});
        }

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{src, 0});

        int[] minCost = new int[n];
        Arrays.fill(minCost, Integer.MAX_VALUE);
        minCost[src] = 0;

        int stops = 0;

        while (!q.isEmpty() && stops <= k) {
            int size = q.size();
            int[] tempCost = Arrays.copyOf(minCost, n); // To avoid premature updates

            while (size-- > 0) {
                int[] curr = q.poll();
                int currNode = curr[0], currPrice = curr[1];

                for (int[] neighbor : adj.get(currNode)) {
                    int neighborNode = neighbor[0], price = neighbor[1];
                    if (currPrice + price < tempCost[neighborNode]) {
                        tempCost[neighborNode] = currPrice + price;
                        q.offer(new int[]{neighborNode, tempCost[neighborNode]});
                    }
                }
            }

            minCost = tempCost;
            stops++;
        }

        return minCost[dst] == Integer.MAX_VALUE ? -1 : minCost[dst];
    }
}