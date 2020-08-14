public class Problem10{
    public boolean isValidSudoku(char[][] board) {
        //Create & Initialize data
        HashMap<Integer,Integer> [] rows = new HashMap[9];
        HashMap<Integer,Integer> [] cols = new HashMap[9];
        HashMap<Integer,Integer> [] boxes = new HashMap[9];

        for(int i=0;i<9;i++){
            rows[i] = new HashMap<Integer,Integer>();
            cols[i] = new HashMap<Integer,Integer>();
            boxes[i] = new HashMap<Integer,Integer>();
        }

        //Validate the board
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                char num = board[i][j];
                if(num != '.'){
                    int n = (int) num;
                    int boxIndex = 3 * (i/3) + (j/3);
                    
                    //Keep the cell value
                    rows[i].put(n,rows[i].getOrDefault(n,0)+1);
                    cols[j].put(n,cols[j].getOrDefault(n,0)+1);
                    boxes[boxIndex].put(n,boxes[boxIndex].getOrDefault(n,0)+1);

                    //Check if value already exists
                    if(rows[i].get(n)>1 || cols[j].get(n)>1 || boxes[boxIndex].get(n)>1){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}