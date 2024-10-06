class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<Character,String> map=new HashMap<>();
        map.put('a',".-");
        map.put('b',"-...");
        map.put('c',"-.-.");
        map.put('d',"-..");
        map.put('e',".");
        map.put('f',"..-.");
        map.put('g',"--.");
        map.put('h',"....");
        map.put('i',"..");
        map.put('j',".---");
        map.put('k',"-.-");
        map.put('l',".-..");
        map.put('m',"--");
        map.put('n',"-.");
        map.put('o',"---");
        map.put('p',".--.");
        map.put('q',"--.-");
        map.put('r',".-.");
        map.put('s',"...");
        map.put('t',"-");
        map.put('u',"..-");
        map.put('v',"...-");
        map.put('w',".--");
        map.put('x',"-..-");
        map.put('y',"-.--");
        map.put('z',"--..");
        Set<String> set=new HashSet<>();
        char ch;
        StringBuilder word;
        for(String a:words){
            word=new StringBuilder();
            for(int i=0;i<a.length();i++){
               ch=a.charAt(i);
               word.append(map.get(ch));
            }
            set.add(word.toString());
        }
        return set.size();
    }
}