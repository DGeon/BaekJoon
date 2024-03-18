class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = num_list[0];
        int add = num_list[0];
        for(int i=1; i<num_list.length; i++){
            mul *= num_list[i];
            add += num_list[i];

        }
        add = add*add;
        if(mul<add){
            answer = 1;
        }
        return answer;
    }
}