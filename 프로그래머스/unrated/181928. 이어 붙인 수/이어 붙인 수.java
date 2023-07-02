class Solution {
       public int solution(int[] num_list) {
        StringBuilder oddBuilder = new StringBuilder();
        StringBuilder evenBuilder = new StringBuilder();

        for (int num : num_list) {
            if (num % 2 == 0) {
                evenBuilder.append(num);
            } else {
                oddBuilder.append(num);
            }
        }

        int oddSum = Integer.parseInt(oddBuilder.toString());
        int evenSum = Integer.parseInt(evenBuilder.toString());

        return oddSum + evenSum;
    }
}
