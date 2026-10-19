class Solution {

    public void quickSort(int[] arr,int low, int high) {

        // Bae Case :
        if(low >= high) {
            return; 
        }

        int start = low;
        int end = high;
        int mid = start + (end-start) / 2;
        int pivot = arr[mid];

        while(start <= end) {
            while(arr[start] < pivot) {
                start++;
            }
            while(arr[end]>pivot) {
                end--;
            }
            if(start<=end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        quickSort(arr,low,end);
        quickSort(arr,start,high);
    }

    public List<Integer> targetIndices(int[] arr, int target) {

        ArrayList<Integer> list = new ArrayList<>();

        int n = arr.length;
        quickSort(arr,0,n-1);

        for(int i = 0; i<n; i++) {
            if(arr[i]==target) {
                list.add(i);
            }
        }
        return list;
    }
}