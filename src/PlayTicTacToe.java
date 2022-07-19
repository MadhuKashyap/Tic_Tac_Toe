import dto.Board;
import dto.Game;
import dto.Player;

import java.util.Queue;
import java.util.Scanner;

public class PlayTicTacToe {
    Game g ;
    Board b ;
    Queue<Player> q;
    PlayTicTacToe()
    {
        this.g = new Game();
        b = g.getB();
        q = g.getQ();
    }
    void playGame()
    {
        char board[][] = b.getBoard();
        Scanner ob = new Scanner(System.in);
        Player p = new Player();
        boolean draw = false;
        while(! g.checkCompleted())
        {
            p = q.poll();
            System.out.println("Player" + p.getName() + "enter your move");
            int x = ob.nextInt();
            int y = ob.nextInt();
            board[x][y] = p.getC();
            b.showBoard();
            q.offer(p);
            if(!g.checkCompleted() && g.isDraw())
            {
                draw = true;
                System.out.println("Game is draw");
                break;
            }
        }
        if(!draw)
        {
            g.declareWinner(p);
        }
    }
}
