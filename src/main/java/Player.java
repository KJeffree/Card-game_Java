public class Player {
    private Boolean hasCard;
    private Card card;

    public Player() {
        this.card = null;
        this.hasCard = false;
    }

    public Card getCard() {
        return this.card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Boolean getHasCard() {
        return hasCard;
    }

    public void setHasCard(Boolean hasCard) {
        this.hasCard = hasCard;
    }
}
