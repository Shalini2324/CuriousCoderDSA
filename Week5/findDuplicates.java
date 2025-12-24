class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
         ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            int count = 1;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && j != i) {
                    count++;
                }
            }

            if (count > 1) {
                int flag = 1;

                for (int k = 0; k < res.size(); k++) {
                    if (res.get(k) == arr[i]) {
                        flag = 0;
                        break;
                    }
                }

                if (flag == 1) {
                    res.add(arr[i]);
                }
            }
        }

        return res;
    }
}
