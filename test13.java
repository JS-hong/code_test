import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class test13 {
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] answer = {};
        
        //큐 방식 먼저 들어온게 완성시에 먼저 나가도록
        Queue<Integer> queue_prg = new LinkedList<>();
        Queue<Integer> queue_spe = new LinkedList<>();

        for(int rs : progresses){
            queue_prg.offer(rs);
        }
        for(int rs : speeds){
            queue_spe.offer(rs);
        }
        while(!queue_prg.isEmpty()){
            int date = 0;
            int prg = queue_prg.poll();//데이터 뽑기 
            int spe = queue_spe.poll();//데이터 뽑기
            System.out.println(prg +""+ spe);

            for (int i=0;i<100;i++) {//작업 일수 구하는곳
                
           }
        }

    }  
}