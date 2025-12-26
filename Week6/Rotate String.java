class Solution {
    public boolean rotateString(String s, String goal) {
        int len=s.length();
        for(int i=1;i<=len;i++){
            String var=s.substring(i)+s.substring(0,i);
            if(var.equals(goal)){
                return true;
            }
        }
        return false; 
    }
}
