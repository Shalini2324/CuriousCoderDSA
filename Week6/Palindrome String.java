class Solution {
    boolean isPalindrome(String s) {
        // code here
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

//skip spaces,symbols and cases
class Solution {
    boolean isPalindrome(String s) {
        // code here
        int st = 0, ed = s.length() - 1;

        while (st < ed) {
            while (st < ed && !Character.isLetterOrDigit(s.charAt(st))) {
                st++;
            }
            while (st < ed && !Character.isLetterOrDigit(s.charAt(ed))) {
                ed--;
            }

            if (Character.toLowerCase(s.charAt(st)) != Character.toLowerCase(s.charAt(ed))) {
                return false;
            }
            st++;
            ed--;
        }
        return true;
    }
};
