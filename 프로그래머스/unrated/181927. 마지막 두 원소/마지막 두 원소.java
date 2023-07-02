class Solution {
    public int[] solution(int[] num_list) {
        int lastElement = num_list[num_list.length - 1];
        int secondLastElement = num_list[num_list.length - 2];

        if (lastElement > secondLastElement) {
            int diff = lastElement - secondLastElement;
            int[] newNumList = new int[num_list.length + 1];
            System.arraycopy(num_list, 0, newNumList, 0, num_list.length);
            newNumList[num_list.length] = diff;
            return newNumList;
        } else {
            int doubledLastElement = lastElement * 2;
            int[] newNumList = new int[num_list.length + 1];
            System.arraycopy(num_list, 0, newNumList, 0, num_list.length);
            newNumList[num_list.length] = doubledLastElement;
            return newNumList;
        }
    }
}