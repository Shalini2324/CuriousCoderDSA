class Solution {
    int arraySum(int arr[]) {
        // code here
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
}

//online compiler
class Sum of Array{
    public static void main(String[] args) {
        int n=5;
        int sum=0;
        int[] arr={3,4,56,7,5};
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
