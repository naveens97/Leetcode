class Solution {
    public int calPoints(String[] arr) {
        Deque<Integer>stack=new ArrayDeque<>();
        for(String s:arr){
            if(s.equals("C")){
                stack.pop();
            }
            else if(s.equals("D")){
                stack.push(stack.peek()*2);
            }
            else if(s.equals("+")){
                int val=stack.pop();
                int val1=stack.peek()+val;
                stack.push(val);
                stack.push(val1);
            }
            else{
                int r=Integer.parseInt(s);
                stack.push(r);
            }
        }
        int sum=0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}