class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num < 3) {
            return false;
        }
        ArrayList<Integer> list = new ArrayList<>();
        int n = (num/2)+1;
        for (int i = 1; i<=n; i++) {
            if(num%i==0) {
                list.add(i);
            }
        }
        int sum = 0;
        for(int i =0; i<list.size(); i++) {
            sum+=list.get(i);
        }
        return num == sum;
    }
}