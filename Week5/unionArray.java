class Main {
    public static int unionArray(int []b,int[] res, int k){
        int m = b.length;
        for(int i=0;i<m;i++){
           int flag = 1;
           for(int j=0;j<k;j++){
               if(b[i]==res[j]){
                   flag = 0;
                   break;
               }
           }
           if(flag ==1){
               res[k]=b[i];
               k++;
           }
       }
       return k;
    }
    public static void main(String[] args) {
       int [] a = {3,4,5,6,6,7,7,7,8};
       int [] b = {4,5,5,8,9,9,10,19, 20};
       int n = a.length;
       int m = b.length;
       int k=0;
       int [] res = new int[n+m];
       k = unionArray(a,res,k);
       k = unionArray(b,res,k);
       
       for(int i=0;i<k;i++){
           System.out.print(res[i]);
           System.out.print(" ");
       } 
    }
}

//GFG
class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
         ArrayList<Integer> res = new ArrayList<>();

        // add elements from first array
        addUnique(a, res);

        // add elements from second array
        addUnique(b, res);

        return res;
    }

    static void addUnique(int[] arr, ArrayList<Integer> res) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;

            for (int j = 0; j < res.size(); j++) {
                if (arr[i] == res.get(j)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                res.add(arr[i]);
            }
        }
    }
}
