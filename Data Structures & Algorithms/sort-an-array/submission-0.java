class MergeSort{


    public void merge(int [] arr, int l,int mid,int h){

        int lh = mid - l + 1;
        int rh = h - mid;

        int [] L = new int[lh];
        int [] R = new int[rh];

        for(int i = 0; i < lh; i++){
            L[i] = arr[l + i];
        }

        for(int i = 0; i < rh; i++){
            R[i] = arr[mid + i + 1];
        }


        int i = 0, j = 0, k = l;

        while(i < lh && j < rh){

            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i < lh){
            arr[k] = L[i];
            i++;k++;
        }

        while(j < rh){
            arr[k] = R[j];
            j++;k++;
        }
    }

    public void mergeSort(int [] arr,int l, int h){
        if(l >= h) return;

        int mid = l + (h - l)/2;

        mergeSort(arr,l,mid);
        mergeSort(arr,mid + 1,h);
        merge(arr,l,mid,h);

    }
}


class Solution {
    public int[] sortArray(int[] nums) {

        MergeSort M = new MergeSort();
        M.mergeSort(nums,0,nums.length - 1);
        return nums;
    }
}