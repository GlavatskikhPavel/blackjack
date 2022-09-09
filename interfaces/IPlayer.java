package blackjack.interfaces;

public interface IPlayer {                                      // игрок

    /**
     * взять карту в руки. Через интерфейсную ссылку что бы мы могли добавить другой тип карт.
     * @param card
     */
    void addCardToHand(ICard card);

    /**
     * Нужни ли еще карта.
     * @return
     */
    boolean isNeedAnotherCard();

    /**
     * Открыть свои карты.
     */
    void openCards ();

    /**
     * Подчитать сумму очков на руках.
     * @return
     */
    int countValues();

    /**
     * Геттер для имени игрока.
     * @return
     */
    String getName();
}
