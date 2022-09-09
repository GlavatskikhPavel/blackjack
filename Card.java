package blackjack;

import blackjack.interfaces.ICard;

// Карта
public class Card implements ICard {

    /**
     * Имя карты.
     */
    private String name;

    /**
     * Номинал карты.
     */
    private int value;

    /**
     * Конструктор
     * @param name имя карты.
     * @param value номинал карты.
     */
    public Card(String name, int value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Геттер для имени карты.
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Открыть одну карту.
     */
    @Override
    public void open() {
        System.out.println(name);
    }

    /**
     * Геттер для номинала карты.
     * @return
     */
    @Override
    public int getValue() {
        return value;
    }
}
