//https://www.geeksforgeeks.org/problems/count-odd-even/1
class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
         int even=0,odd=0;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]%2==0)
        {
        even++;
        }
        else
        {
            odd++;
        }
    }
    return new int[]{odd,even};
    }
}

//online compiler
class Count Odd and Even {
    public static void main(String[] args) {
        int n=5;
        int even=0;
        int odd=0;
        int[] arr={1,2,3,4,5};
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("Odd:"+odd);
        System.out.println("Even:"+even);
    }
}
