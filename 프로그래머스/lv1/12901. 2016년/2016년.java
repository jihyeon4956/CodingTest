class Solution {
    public String solution(int a, int b) {
        String dayWeek[] = {"THU","FRI","SAT","SUN","MON","TUE","WED"};  //요일판별
        int monthDay[] ={31,29,31,30,31,30,31,31,30,31,30,31};  //한달일수
        int day = 0;
        String answer = "";
        
    
            for(int i=0; i<a-1; i++) {             // 1월부터 입력한 전달까지만 
                day += monthDay[i];
            }

        return dayWeek[((day + b) % 7)];
    }
}