class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String a ="";
        String b = "";
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                a = new StringBuffer(a).append(num_list[i]).toString();
            }else {
                b = new StringBuffer(b).append(num_list[i]).toString();
            }
        }
        answer = Integer.valueOf(a) + Integer.valueOf(b);
        return answer;
    }
}