class Solution {
    public int subtractProductAndSum(int n) {
        int ans = 1;
        int sum = 0;
        int finalAns = 0;
        if(n >= 1 && n <= 100000){
            while(n != 0){
            int digit = n % 10;
            ans = ans * digit;
            sum = sum + digit;
            n = n / 10;
         }
       }else{
           return 0;
       }
        finalAns = ans - sum;
        
        return finalAns;
    }
}