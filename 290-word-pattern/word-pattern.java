class Solution {
    public boolean wordPattern(String pattern, String s) {
        String arr[] = s.split("\\s+");
        if(pattern.length() != arr.length){
            return false;
        }
        HashMap<Character, String> hm = new HashMap<>(); 
        for(int i  = 0; i < pattern.length(); i++){
            // if the key already exists
            if(hm.containsKey(pattern.charAt(i))){
              String sa =   hm.get(pattern.charAt(i));
              if(!arr[i].equals(sa)){
                return false;
              }
            }
            // if the value already exists
            else if(hm.containsValue(arr[i])){
                    return false;
                
            }
            else{
                hm.put(pattern.charAt(i), arr[i]);
            }

        }
        return true;
    }
}