class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
           if(map.containsKey(c)){
            map.put(c,map.get(c)+1);
           }
           else{
            map.put(c,1);
           }
//            if(!map.containsKey(c)){
//     return false;
// }
        }
        for(int i = 0;i<t.length();i++){
            char d = t.charAt(i);
            if(!map.containsKey(d)){
                return false;
            }
            if(map.containsKey(d)){
                map.put(d,map.get(d)-1);
            }
            // else{
            //     map.put(d,1);
            // }
            if(map.get(d)<0){
                return false;
            }
            
        }

        return true;
        // char[] arr = t.toCharArray();
        // for(int i = 0;i<s.length();i++){
        //     boolean found = false;
        //     for(int j=0;j<arr.length;j++){
        //         if(s.charAt(i)==arr[j]){
        //             found=true;
        //            arr[j]='#';
        //            break;
        //         }
        //     }
        //     if(found!=true){
        //     return false;
        // }
        // }
        // return true;
    }
}
