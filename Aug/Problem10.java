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
        
    }
}