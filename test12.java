import java.util.*;

public class test12 {
    //큐 방식 한쪽 삽입 한쪽 삭제
    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        int answer = process(priorities, location);
        System.out.println(answer);
    }

    public static int process(int[] priorities, int location) {//{2, 1, 3, 2} 2 넘어옴
        Queue<Integer> queue = new LinkedList<>();

        for (int priority : priorities) {//데이터 넣고
            queue.offer(priority);
        }
        System.out.println(queue.size());
        int count = 0;
        while (!queue.isEmpty()) {
            boolean highPriority = false;
            int curProcess = queue.poll();
            for (int priority : queue) {
                if (priority > curProcess) {
                        highPriority = true;
                        break;
                }
            }

                if (highPriority) {
                    queue.offer(curProcess);

                    if (location == 0)
                        location = queue.size() - 1;
                    else 
                        location--;

                } 
                else {
                    count++;

                    if (location == 0)
                        return count;

                    location--;
                }
            
         }     
         return 0;
     }
}