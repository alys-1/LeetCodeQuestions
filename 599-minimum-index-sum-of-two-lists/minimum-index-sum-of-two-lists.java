class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> al = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i< list1.length; i++){
            for(int j = 0; j< list2.length; j++){
                if(list1[i].equals(list2[j])){
                    int sum = i+j;
                    if(min > sum){
                        al.clear();
                        al.add(list1[i]);
                        min = sum;
                    }else if(min == sum){
                        al.add(list1[i]);
                    }
                    
                }
            }
        }
        String[] arr = new String[al.size()];
        for(int i = 0; i< al.size(); i++){
            arr[i] = al.get(i);
        }
        return arr;
    }
}