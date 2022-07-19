package dto;

public class Board {
    private int side;
    private char board[][];
    Board(int side)
    {
        this.side = side;
        board = new char[side][side];

    }
    public void initialiseBoard() {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                board[i][j] = ' ';
            }
        }
    }
    public void showBoard()
    {
        for(int i = 0; i < side; i++)
        {
            for(int j = 0; j < side; j++)
            {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public int getSide() {
        return side;
    }

    public char[][] getBoard() {
        return board;
    }
}
