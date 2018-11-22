import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Player player;
    Card card;

    @Before
    public void before(){
        player = new Player();
        card = new Card(SuitType.HEARTS, RankType.FIVE);
    }

    @Test
    public void canGetCard() {
        player.setCard(card);
        assertEquals(card, player.getCard());
    }
}
