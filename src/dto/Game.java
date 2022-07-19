package dto;

import java.util.Queue;

public class Game {
    Board b ;
    Queue<Player> q;
    public Game(){}
    Game(Board b, Queue<Player> q)
    {
        this.b = b;
        this.q = q;
    }
    public boolean checkCompleted()
    {
        if(rowCrossed() || columnCrossed() || diagonalCrossed())
            return true;
        return false;
    }
     public boolean isDraw()
    {
        int SIDE = b.getSide();
        char board[][] = b.getBoard();
        for(int i = 0; i < SIDE ; i++)
        {
            for(int j = 0; j < SIDE; j++)
            {
                if(board[i][j] == ' ')
                    return false;
            }
        }
        return true;
    }
    boolean rowCrossed()
    {
        int SIDE = b.getSide();
        char board[][] = b.getBoard();
        for (int i=0; i<SIDE; i++)
        {
            if (board[i][0] == board[i][1] &&
                board[i][1] == board[i][2] &&
                board[i][0] != ' ')
                return (true);
        }
        return(false);
    }
    boolean columnCrossed()
    {
        int SIDE = b.getSide();
        char board[][] = b.getBoard();
        for (int i=0; i<SIDE; i++)
        {
            if (board[0][i] == board[1][i] &&
                board[1][i] == board[2][i] &&
                board[0][i] != ' ')
                return (true);
        }
        return(false);
    }
    boolean diagonalCrossed()
    {
        int SIDE = b.getSide();
        char board[][] = b.getBoard();
        if (board[0][0] == board[1][1] &&
            board[1][1] == board[2][2] &&
            board[0][0] != ' ')
            return(true);

        if (board[0][2] == board[1][1] &&
            board[1][1] == board[2][0] &&
            board[0][2] != ' ')
            return(true);

        return(false);
    }

    public void declareWinner(Player p)
    {
        System.out.println(p.getName() + "is the winner");
    }

    public Board getB() {
        return b;
    }

    public Queue<Player> getQ() {
        return q;
    }
}
