package programing;

public class Conce1 {
	public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
           int c=0;
           for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j]&&nums[i]==1){
                c++;
                count=Math.max(c,count);
            }
           }
        }
        return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n= {1,3,4,1,1,1};
		System.out.println(findMaxConsecutiveOnes(n));

	}

}
