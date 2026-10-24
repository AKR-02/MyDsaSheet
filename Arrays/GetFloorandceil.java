package Arrays;

public class GetFloorandceil {
    public int[] getFloorAndCeil(int[] nums, int x) {
       int floor = -1;
       int ceil = -1;
       int l = 0;
       int r = nums.length-1;
      
       while(l<=r)
       {
        int mid = l + (r-l)/2;
        if(nums[mid]==x)
        {
            floor = ceil = nums[mid];
            return new int[]{floor,ceil};
        }else if(nums[mid]>x)
        {
            ceil = nums[mid];
            r = mid -1;
        }else{
            floor = nums[mid];
            l = mid+1;
        }
       }
       return new int[]{floor,ceil};
    }
    public static void main(String[] args) {
        
    }
}
