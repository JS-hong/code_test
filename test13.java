import java.util.*;
public class test13 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int count = 0;
        int ans = 1;
        
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
            System.out.print(prg + ":");

            for (int i=prg;i<100;i+=spe) {//작업 일수 구하는곳
                count++;
            }
            date = count;//요일 저장
            list.add(count);
            count = 0;
            //이제 조건을 걸어야 하는데

            for(int i=0;i<list.size();i++){
                if(list.get(i)>list.get(+1)){
                    //숫자 증가시키고 다음 list 가져오기
                }
                else{
                    //총 카운트를 리스트에 저장 그리고 카운트를 리셋 
                }
            }

        }
    }  
}
