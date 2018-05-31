package entity.changexchange.utils;

public class Offer {

    private final String poster_nickname;
    private final Currency buying;
    private final Currency selling;
    private final float amount;
    private final Airport airport;


    public Offer(String poster_nickname, Currency buying, Currency selling, float amount, Airport airport) {
        this.poster_nickname = poster_nickname;
        this.buying = buying;
        this.selling = selling;
        this.amount = amount;
        this.airport = airport;
    }

    public String getPoster_nickname() {
        return poster_nickname;
    }

    public Currency getBuying() {
        return buying;
    }

    public Currency getSelling() {
        return selling;
    }

    public float getAmount() {
        return amount;
    }

    public Airport getLocation() {
        return airport;
    }
}