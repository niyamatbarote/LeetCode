class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int o = order.length;
        int f = friends.length;
        int[] ans = new int[f];
        int a = 0;

        for(int i = 0; i<o; i++) {
            for(int j = 0; j<f; j++) {
                if(order[i]==friends[j]) {
                    ans[a] = friends[j];
                    a++;
                }
            }
        }
        return ans;
    }
}