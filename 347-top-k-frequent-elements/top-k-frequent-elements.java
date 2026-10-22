class Solution {

    public void swap(int[] arr,int start,int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public void quickSort(int[] value, int[] keys, int low, int high) {
        // Base Case :
        if(low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int mid = start+(end-start)/2;
        int pivot = value[mid];

        while(start <= end) {
            while(value[start] > pivot) {
                start++;
            }
            while (value[end] < pivot) {
                end--;
            }
            if(start <= end) {
                swap(value,start,end);
                swap(keys,start,end);
                start++;
                end--;
            }
        }
        
        quickSort(value,keys, start, high);
        quickSort(value,keys,low,end);
    }

    public int[] topKFrequent(int[] arr, int k) {
        int[] ans = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int val : arr) {
            map.put(val, map.getOrDefault(val,0)+1 );
        }
        // HashMap to Array :
        int size = map.size();
        int[] keys = new int[size];
        int[] value = new int[size];

        int i = 0;
        for (Map.Entry<Integer,Integer> e : map.entrySet()) {
            keys[i] = e.getKey();
            value[i] = e.getValue();
            i++;
        }

        quickSort(value,keys,0,value.length-1);

        for(int j=0; j<k; j++) {
            ans[j] = keys[j];
        }
        return ans;
    }
}