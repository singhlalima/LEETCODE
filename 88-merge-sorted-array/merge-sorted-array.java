class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            for(int t = 0 ; t<n;t++){
                nums1[t]=nums2[t];
            }
        }
        int ans[] = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;
        
        while ( i < m && j < n){
            if(nums1[i]<=nums2[j]){
                ans[k] = nums1[i];
                i++;k++;
            }
            else{
                ans[k] = nums2[j];
                j++;k++;
            }
        
        }
        while(i <m){
            ans[k] = nums1[i];
            i++;k++;
        }
        while(j<n){
            ans[k] = nums2[j];
            j++;k++;
        }

    for(int p = 0; p<ans.length;p++){
        nums1[p] = ans[p];
    }
        
    }
}