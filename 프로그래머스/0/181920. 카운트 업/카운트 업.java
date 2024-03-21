class Solution {
    public int[] solution(int start_num, int end_num) {
        int count=0;
        for(int i=start_num; i<end_num; i++){
            count++;
        }
        int[] answer = new int[count+1];
        for(int i=0; i<=count; i++){
            answer[i] = start_num;
            start_num++;
        }
        return answer;
    }
}
