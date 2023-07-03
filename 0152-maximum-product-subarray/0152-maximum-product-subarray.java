class Solution {
    public int maxProduct(int[] nums) {
        int product =1;
        int result = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            product = product*nums[i];
            result = Math.max(product, result);
            if(product==0){
                product =1;
            }
        }
        product =1;
        for(int i=nums.length-1; i>=0; i--){
            product = product*nums[i];
            result = Math.max(product , result);
            if(product==0){
                product =1;
            }
        }
        return result;
    }
}