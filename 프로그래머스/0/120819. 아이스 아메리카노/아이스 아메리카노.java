class Solution {
    public int[] solution(int money) {
        int[] answer = {0,0};
        int total  = 0;
        int americano = 5500;
        total = money / americano;
        answer[0] = total;
        answer[1] = money - (total * americano) ;
        return answer;
    }
}