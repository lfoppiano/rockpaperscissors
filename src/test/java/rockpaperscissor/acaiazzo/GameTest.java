package rockpaperscissor.acaiazzo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import rockpaperscissor.acaiazzo.Game;
import rockpaperscissor.acaiazzo.Hand;
import rockpaperscissor.acaiazzo.Judge;
import rockpaperscissor.acaiazzo.Player;

import static rockpaperscissor.acaiazzo.Hand.Moves.*;

/**
* User: antoniocaiazzo
*/
public class GameTest {

    private Game game;

    @Before
    public void setUp() {

        game = new Game();
        game.setJudge(new Judge());

        Player tris = new Player();
        tris.setName("Tris");
        tris.setHand(new Hand());
        game.setPlayer1(tris);

        Player tony = new Player();
        tony.setName("Tony");
        tony.setHand(new Hand());
        game.setPlayer1(tony);

    }

    @After
    public void tearDown() {

    }

    @Test
    public void testMatchPlayer1Wins() {

        game.getPlayer1().getHand().setCurrentMove(ROCK);
        game.getPlayer2().getHand().setCurrentMove(SCISSOR);

        game.match();

        assert game.getPlayer1().getScore() == 1;
        assert game.getPlayer2().getScore() == 0;

    }

    @Test
    public void testMatchPlayer2Wins() {

        game.getPlayer1().getHand().setCurrentMove(PAPER);
        game.getPlayer2().getHand().setCurrentMove(SCISSOR);

        game.match();

        assert game.getPlayer1().getScore() == 0;
        assert game.getPlayer2().getScore() == 1;

    }

    @Test
    public void testMatchDraw() {

        game.getPlayer1().getHand().setCurrentMove(SCISSOR);
        game.getPlayer2().getHand().setCurrentMove(SCISSOR);

        game.match();

        assert game.getPlayer1().getScore() == 0;
        assert game.getPlayer2().getScore() == 0;

    }
}
