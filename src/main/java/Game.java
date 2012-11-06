/**
 * User: antoniocaiazzo
 */
public class Game {

    private Player player1;
    private Player player2;
    private Judge judge;


    public void match(Player player1, Player player2) {

        int result = judge.compare(player1, player2);

        if (result > 0) {
            incPlayerScore(player1);
        } else if (result < 0) {
            incPlayerScore(player2);
        }

    }

    private void incPlayerScore(Player player) {

        player.setScore(player.getScore() + 1);

    }

    public Judge getJudge() {
        return judge;
    }

    public void setJudge(Judge judge) {
        this.judge = judge;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }
}
