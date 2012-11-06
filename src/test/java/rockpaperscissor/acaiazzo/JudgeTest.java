package rockpaperscissor.acaiazzo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static rockpaperscissor.acaiazzo.Hand.Moves.*;


/**
 * User: antoniocaiazzo
 */
public class JudgeTest {

    private Judge judge;
    private Player tris;
    private Player tony;

    @Before
    public void setUp() {

        judge = new Judge();

        tris = new Player();
        tris.setName("Tris");
        tris.setHand(new Hand());
        tony = new Player();
        tony.setName("Tony");
        tony.setHand(new Hand());

    }

    @After
    public void tearDown() {

    }

    @Test
    public void testComparePlayer1Wins() {

        tris.getHand().setCurrentMove(LIZARD);
        tony.getHand().setCurrentMove(SPOCK);

        assert judge.compare(tris, tony) == 1;
    }

    @Test
    public void testComparePlayer2Wins() {

        tris.getHand().setCurrentMove(SCISSOR);
        tony.getHand().setCurrentMove(SPOCK);

        assert judge.compare(tris, tony) == -1;
    }

    @Test
    public void testCompareDraw() {

        tris.getHand().setCurrentMove(SPOCK);
        tony.getHand().setCurrentMove(SPOCK);

        assert judge.compare(tris, tony) == 0;
    }
}
