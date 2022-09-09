package blackjack.interfaces;

public interface ICard {                  // карта
    /**
     * Открыть карты.
     */
    void open();

    /**
     * Возвращает свой наминал.
     * @return
     */
    int getValue();
}
