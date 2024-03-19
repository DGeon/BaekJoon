class Solution {
    public int[] solution(int l, int r) {

        String su ="";
        int su1=0;
        int count=0;
        for(int i=l; i<=r; i++){
            su = Integer.toString(i);
            int cnt =0;
            for(int j=0; j<su.length(); j++){
                if(su.charAt(j)=='5' || su.charAt(j)=='0'){
                    cnt++;
                    if(su.length() == cnt){
                        count++;
                    }
                }
            }
        }

        int cc=0;
        if(count==0){
            int[] answer = new int[1];
            answer[0]=-1;
            return answer;
        }else {
            int[] answer = new int[count];
            for (int i = l; i <= r; i++) {
                su = Integer.toString(i);
                int cnt = 0;
                for (int j = 0; j < su.length(); j++) {
                    if (su.charAt(j) == '5' || su.charAt(j) == '0') {
                        cnt++;
                        if (su.length() == cnt) {
                            for (int z = cc; z <= cc; z++) {
                                answer[cc] = Integer.valueOf(su);
                            }
                            cc++;
                        }
                    }
                }
            }
            return answer;
        }


    }
}
