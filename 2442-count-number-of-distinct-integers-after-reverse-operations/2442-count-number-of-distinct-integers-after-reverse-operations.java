class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
            int n=i;
            int rev=0;
            while(n!=0){
                int temp=n%10;
                rev=rev*10+temp;
                n/=10;
            }
            set.add(rev);
        }
        return set.size();
    }
}