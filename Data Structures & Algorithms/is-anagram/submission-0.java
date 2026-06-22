class Solution {
    public boolean isAnagram(String s, String t) {
        // Map<String,Integer> map = new Map<String,Integer>();
        // for(int count : s){
        //     map.add(count);
        // }
        // for(int count1:t){
        //     map.add(count1);
        // }
        // if()

        if(s.length() != t.length()){
            return false;
        }
        char[] arr = t.toCharArray();
        for(int i = 0;i<s.length();i++){
            boolean found = false;
            for(int j=0;j<arr.length;j++){
                if(s.charAt(i)==arr[j]){
                    found=true;
                   arr[j]='#';
                   break;
                }
            }
            if(found!=true){
            return false;
        }
        }
        return true;
    }
}
