class Solution {

    // FAIL test cases : 
    // [-10,5]

    public void quickSort(int[] arr, int low, int high) {
        if(low>=high) {
            return ;
        }

        int start = low;
        int end = high;
        int mid = start+(end-start)/2;
        int pivot = arr[mid];

        while(start<=end) {
            while(arr[start] < pivot) {
                start++;
            }
            while(arr[end] > pivot) {
                end--;
            }
            if(start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        quickSort(arr,start,high);
        quickSort(arr,low,end);
    }

    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        quickSort(arr,0,arr.length-1);

        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start < n) {
            if(arr[start] <= 0) {
                int prod = arr[start] * 2;
                if(seen.contains(prod)) {
                    return true;
                }
            }
            seen.add(arr[start]);
            start++;
        }
        while (end >=0 ) {
            if(arr[end] > 0 ) {
                int prod = arr[end]*2;
                if(seen.contains(prod)) {
                    return true;
                }
            }
            seen.add(arr[end]) ;
            end--;
        }
        return false;
    }
    
}
