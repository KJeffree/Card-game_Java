import static org.junit.Assert.*;
        import org.junit.*;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, RankType.TEN);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank() {
        assertEquals(RankType.TEN, card.getRank());
    }

    @Test
    public void queenHasValue10() {
        card = new Card(SuitType.CLUBS, RankType.QUEEN);
        assertEquals(10, card.getValueFromEnum());
    }

//    @Test
//    public void suitCanBeMisspelled() {
//        card = new Card("Heaarts");
//        assertEquals("Heaarts", card.getSuit());
//    }
//
//    @Test
//    public void suitCanBeBananas() {
//        card = new Card("Bananas");
//        assertEquals("Bananas", card.getSuit());
//    }
}