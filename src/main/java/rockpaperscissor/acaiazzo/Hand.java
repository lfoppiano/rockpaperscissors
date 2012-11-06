package rockpaperscissor.acaiazzo;

import javax.print.attribute.standard.PagesPerMinute;

/**
 * User: antoniocaiazzo
 */
public class Hand {

    public enum Moves  {
        ROCK,
        PAPER,
        SCISSOR
    }

    private Moves currentMove;

    public Moves getCurrentMove() {
        return currentMove;
    }

    public void setCurrentMove(Moves currentMove) {
        this.currentMove = currentMove;
    }

}
