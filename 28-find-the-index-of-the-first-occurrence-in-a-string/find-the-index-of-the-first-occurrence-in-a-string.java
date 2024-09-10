class Solution {
    public int strStr(String haystack, String needle) {
        char[] arr = haystack.toCharArray();
        char[] arr2 = needle.toCharArray();
        for(int i = 0; i< arr.length; i++){
            if(arr2[0] == arr[i]){
                int flag = 0;
                for(int j = 0; j< arr2.length; j++){
                    if(i+j >= arr.length){
                        flag = 1;
                        break;
                    }
                    if(arr2[j] !=arr[i+j]){
                        flag = 1;
                    }
                }
                if(flag == 0){
                    return i;
                }

            }
           
        } return -1;
    } 
}