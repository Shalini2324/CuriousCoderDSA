class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        int index=-1;
        for(int i=0;i<Math.min(last.length(),first.length());i++){
            if(last.charAt(i)!=first.charAt(i)){
                break;
            }
            index=i;
        }
        if(index==-1){
            return "";
        }
        else{
            return first.substring(0,index+1);
        }  
    }
}
