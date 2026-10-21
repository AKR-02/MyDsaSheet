package Arrays;

public class Majority_Element_I {
    public int majorityElement(int[] nums) {
        // int threshold = nums.length/2; 
        int element =  nums[0];
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                count = 1;
                element = nums[i];
            }else if(element == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return element;

        
        // Verify that the candidate appears more than half the time/verify if any candidates exists which appears more than n/2 times.
        // int cnt1 = 0;
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] == element) cnt1++;
        // }

        // if(cnt1 > threshold){
        //     return element;
        // }
        // return -1;
    }
}
