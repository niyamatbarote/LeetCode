class Solution {
    public int elevatorRequests(int n, int[] arr) {
        int time = 0;
        int currFloor = 0;
        int len = arr.length;

        for(int i = 0; i<len; i++) {
            int req = arr[i];
            time += Math.max(req , currFloor) - Math.min(req , currFloor);
            currFloor = req;
        }
        return time;
    }
}