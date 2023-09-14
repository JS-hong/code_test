//혼자서 하는 틱택토 clear
public class test8 {
    public static void main(String[] args) {
        String[] board = {"O.X", ".O.", "..X"};
        char[][] boardArr = new char[3][3];
        int o_count=0;
        int x_count=0;
        int mark_count = 0;
        int otictacto = 0;
        int xtictacto = 0;
        int answer = 10;
        //otictactoc 이 1일경우 홀수여야됨
        //xtictactoc 이 1일경우 짝수여야됨
        //근데 둘다 1일경우...? 에러 발생

        for(int i=0;i<3;i++){ //저 1줄배열을 2중구조로 변환 
            String str = board[i];
            boardArr[i] = str.toCharArray();
        }

        for (int n = 0; n < 3; n++) {//틱택토 조건 가로 
            if (boardArr[n][0] == 'O' && boardArr[n][1] == 'O' && boardArr[n][2] == 'O') {
                otictacto = 1;            
            }
            if (boardArr[n][0] == 'X' && boardArr[n][1] == 'X' && boardArr[n][2] == 'X') {
                xtictacto = 1;            
            }
        }

        for (int n = 0; n < 3; n++) {//틱택토 조건 세로 
            if (boardArr[0][n] == 'O' && boardArr[1][n] == 'O' && boardArr[2][n] == 'O') {
                otictacto = 1;            
            }
            if (boardArr[0][n] == 'X' && boardArr[1][n] == 'X' && boardArr[2][n] == 'X') {
                xtictacto = 1;            
            }
        }

        if ((boardArr[0][0] == 'O' && boardArr[1][1] == 'O' && boardArr[2][2] == 'O')
            || (boardArr[0][2] == 'O' && boardArr[1][1] == 'O' && boardArr[2][0]== 'O')) {
                otictacto = 1;
        }
        if ((boardArr[0][0] == 'X' && boardArr[1][1] == 'X' && boardArr[2][2] == 'X')
            || (boardArr[0][2] == 'X' && boardArr[1][1] == 'X' && boardArr[2][0]== 'X')) 
        {
                xtictacto = 1;
        }

        for (int n = 0; n < 3; n++) {
            for (int t = 0; t < 3; t++) {
                if (Character.toString(boardArr[n][t]).equals(".")) {
                    mark_count = mark_count + 1;
                } else if (Character.toString(boardArr[n][t]).equals("O")) {
                    o_count = o_count + 1;
                } else if (Character.toString(boardArr[n][t]).equals("X")){
                    x_count = x_count + 1;
                }
            }
        }

        //성립될 경우가 문제
        if(otictacto == 1 && (o_count+x_count)%2 == 0){ //홀수여야되는데 짝수다? 
            // 그럼 틀림
            answer = 0;
        }
        else if(xtictacto == 1 && (o_count+x_count)%2 == 1){//짝수여야되는데 홀수다?  
            //그럼 틀림
            answer = 0;
        }
        else if(otictacto == 1 && o_count<x_count){ 
            //틱택토가 됐을 때 x가 많은경우는 모두다 컷
            answer = 0;
        }
        else if(otictacto == 1 && o_count >= x_count+2){
            //틱택토가 성립이 됐을 때 x가 o랑 2개이상 차이날경우 전부다 컷
            answer = 0;
        }
        else if(xtictacto == 1 && otictacto == 1){  
            //마지막으로 둘다 틱택톡을 달성한경우
            answer = 0;
        }

        //이 2개면 끝남...
        else if(otictacto == 0 && o_count<x_count){ 
            //틱택토가 성립이 안됐을 때 x가 많은경우는 모두다 컷
            answer = 0;
        }
        else if(otictacto == 0 && o_count >= x_count+2){
            //틱택토가 성립이 안됐을 때 x가 o랑 2개이상 차이날경우 전부다 컷
            answer = 0;
        }
        else{
            answer = 1;
        }        
    }
}
