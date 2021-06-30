package Prog;

public class Jump {

// slow code

    public static  boolean cannJump(int[] nums) {
    int reachable = 0;
    for (int i=0; i<nums.length; ++i) {
        if (i > reachable) return false;
        reachable = Math.max(reachable, i + nums[i]);
    }
    return true;
}

// fast code
public static boolean canJump(int[] nums) {
    int reachable = 0, len = nums.length;
    for (int i = 0; i < len && i <= reachable; i++) {
        reachable = Math.max(reachable, i + nums[i]);
        if (reachable >= len - 1) return true;   // terminate loop early to speed up
    }
    return false;

}


public static void main(String[] args) {
    
int []nums = {2,3,1,1,4};
//int []nums={3,2,1,0,4};
 boolean res=canJump(nums);
 System.out.println(res);


}
    
}
