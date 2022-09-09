package blackjack.interfaces;

public interface IBlackJack {

    /**
     * Раздать две карты.
     */
    void dealThoCards();

    /**
     * Выдать дополнительную карту.
     */
    void addCardsToPlayers();

    /**
     * Определить победителя
     */
    void printWinner();

    /**
     * Добавить игрока в игру.
     * @param player
     */
    void addPlayerToGame(IPlayer player);
}
