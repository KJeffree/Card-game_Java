import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    Deck deck;
    Player player1;
    Player player2;
    Card card1;
    Card card2;


    @Before
    public void before(){
        deck = new Deck();
        player1 = new Player();
        player2 = new Player();
        card1 = new Card(SuitType.HEARTS, RankType.TEN);
        card2 = new Card(SuitType.SPADES, RankType.FIVE);
    }

    @Test
    public void canPopulateDeck() {
        deck.populateDeck();
        assertEquals(52, deck.checkSize());
    }

    @Test
    public void canShuffleDeck() {
        deck.populateDeck();
        deck.shuffleDeck();
        assertEquals(52, deck.checkSize());
    }

    @Test
    public void canDealCard(){
        deck.populateDeck();
        deck.dealCard(player1);
        assertEquals(51, deck.checkSize());
    }

    @Test
    public void canDealCardToPlayers(){
        deck.populateDeck();
        deck.dealCard(player1);
        assertEquals(true, player1.getHasCard());
    }

    @Test
    public void canCheckHighestDealtCard(){
        deck.addCard(card1);
        deck.addCard(card2);
        deck.dealCard(player1);
        deck.dealCard(player2);
        assertEquals(player1, deck.findWinner(player1, player2));
    }

}
