import java.util.ArrayList;

class Solution {

    public int[] solution(int[] arr, int[] delete_list) {

        ArrayList <Integer> delete = new ArrayList();
        for (int i = 0; i < delete_list.length; i++) {
            delete.add(delete_list[i]);
        }

        ArrayList <Integer> list = new ArrayList();

        for (int i = 0; i < arr.length; i++) {
            if (!delete.contains(arr[i])) {
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}