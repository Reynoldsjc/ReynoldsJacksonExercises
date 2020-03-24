import java.lang.Math;
import java.awt.Color;

public class ChessGame {

    private Board board;

    public ChessGame() {
        this.board = new Board();
    }

    public ChessGame(int height, int length) {
        this.board = new Board(height, length);
    }

    public void placeRook(int rank, int file) {

         for (int r = 1; r <= 10; r++) {
             for (int f = 1; f <= 3; f++) {
                 if ((r == rank || f == file) && !(r == rank && f == file)) {
                     board.getSquare(r, f).toggleHighlight();
                 }
             }
         }

        for (int r = 1; r <= 10; r++)
        {
            board.getSquare(r, file).toggleHighlight();
        }
        for (int f = 1; f <= 3; f++)
        {
            board.getSquare(rank, f).toggleHighlight();
        }
        // ♜
        board.getSquare(rank, file).setRook();
    }

    public void placeKnight(int rank, int file)
    {

        for (int r = 1; r <= 10; r++) {
            for (int f = 1; f <= 3; f++) {
                if ((Math.abs(rank - r) == 1 && Math.abs(file - f) == 2) || 
                    (Math.abs(rank - r) == 2 && Math.abs(file - f) == 1)) {
                    board.getSquare(r, f).toggleHighlight();
                }
            }
        }
        // ♘
        board.getSquare(rank, file).setKnight();
    }

    public void placeBishop(int rank, int file)
    {

        for (int r = 1; r <= 10; r++) {
            for (int f = 1; f <= 3; f++) {
                if (Math.abs(rank - r) == Math.abs(file - f) && !(file == f && rank == r))
                {
                    board.getSquare(r, f).toggleHighlight();
                }
            }
        }
        // ♗
        board.getSquare(rank, file).setBishop();
    }

    public void placeQueen(int rank, int file)
    {
        placeBishop(rank, file);
        placeRook(rank, file);
        // ♕
        board.getSquare(rank, file).setQueen();
    }

    public int makeBoard()
    {
        return board.makeBoard();
    }

    public void clearBoard()
    {
        board.clearBoard();
    }

    public static void main(String[] args)
    {
        ChessGame game = new ChessGame();
        System.out.println(game.makeBoard());
        System.out.println("");
        game.placeRook(1, 1);
        System.out.println(game.makeBoard());

        System.out.println("");
        game.clearBoard();
        game.placeKnight(10, 3);
        System.out.println(game.makeBoard());

        System.out.println("");
        game.clearBoard();
        game.placeBishop(2, 2);
        System.out.println(game.makeBoard());

        System.out.println("");
        game.clearBoard();
        game.placeQueen(4, 1);
        System.out.println(game.makeBoard());

        System.out.println("");
        game.clearBoard();
        System.out.println(game.makeBoard());


        ChessGame game2 = new ChessGame(10, 3);
        game2.makeBoard();
    }
}


// steps for creating a new piece
// 1) write function in ChessGame
// 2) update square possibilities
// 3) update clear board
// 4) update make board