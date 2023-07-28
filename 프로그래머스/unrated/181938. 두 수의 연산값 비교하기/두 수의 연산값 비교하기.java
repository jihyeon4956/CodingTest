class Solution {
    public int solution(int a, int b) {
        int type1 = Integer.parseInt(a + ""+ b);
        int type2 = 2 * a * b;

        return type1 >= type2 ? type1 : type2;
    }
}