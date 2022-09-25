class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] newArray = new int[nums.length*2];
        
        for(int i=0; i<newArray.length; i++){
            if(i < nums.length){
                newArray[i] = nums[i];
            }else{
                 newArray[i] = nums[i- nums.length];
            }
        }
        return newArray;
    }
}