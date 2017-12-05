
public class Board
{
    // two dimensional array
    private Cell[][] cells;

    public Board(){
        cells = new Cell[3][3];
        
        // nested loop
        for(int row=0; row<3; row++){
            for (int col = 0 ; col<3; col++){
                cells[row][col] = new Cell();
            }   
        }
    }

    /*
    public boolean pieceWins( piece){
        
    }
*/
    public boolean hasRow(Piece piece, int row){

        for(int col = 0; col<3; col++){
            if(!cells[row][col].getPiece().equals(piece)){
                return false;
            }
        }
        return true;
    }
    /*
    
    public boolean isDraw(){

    }

    public boolean hasFinished(){

    }
     */
    public void makeMove(Piece piece, int row, int column){
        cells[row][column].setPiece(piece);
    }

    public void play(){

    }
}
