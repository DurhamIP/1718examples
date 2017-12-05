
public class Cell
{
    private Piece content;
    
    public Cell(){
        content = Piece.BLANK;
    }
    
    public boolean isEmpty(){
        return content.equals(Piece.BLANK);
    }
    
    public void setPiece(Piece  piece){
        if(isEmpty()){
            content = piece;
        }
    }
    
    public Piece getPiece(){
        return content;
    }
    
    
}
