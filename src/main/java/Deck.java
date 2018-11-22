import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private ArrayList<Card> deck;

    public Deck() {
        this.deck = new ArrayList<>();
    }

    public int checkSize() {
        return this.deck.size();
    }

    public void populateDeck() {
        Card clubs;
        Card hearts;
        Card spades;
        Card diamonds;

        for (RankType rank : RankType.values()) {
            clubs = new Card(SuitType.CLUBS, rank);
            hearts = new Card(SuitType.HEARTS, rank);
            spades = new Card(SuitType.SPADES, rank);
            diamonds = new Card(SuitType.DIAMONDS, rank);
            this.deck.add(clubs);
            this.deck.add(hearts);
            this.deck.add(spades);
            this.deck.add(diamonds);
        }
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }


    public void shuffleDeck() {
        Collections.shuffle(this.deck);
    }

    public void dealCard(Player player){
        Card dealtCard = this.deck.remove(0);
        player.setCard(dealtCard);
        player.setHasCard(true);
    }

    public void addCard(Card card){
        this.deck.add(card);
    }

    public Player findWinner(Player player1, Player player2){
        if (player1.getCard().getValueFromEnum() > player2.getCard().getValueFromEnum()){
            return player1;
        } else {
            return player2;
        }
    }


}
