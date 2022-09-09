package blackjack;

import blackjack.interfaces.ICard;
import blackjack.interfaces.IPlayer;
import java.util.ArrayList;
import java.util.Scanner;

// Игрок
public class Player implements IPlayer {

    /**
     * Имя игрока
     */
    private String name;

    /**
     * Создание коллекции карт игроков.
     */
    private ArrayList<ICard> cards = new ArrayList<>();

    /**
     * Конструктор для имени
     * @param name
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * Геттер для имени.
     * @return
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Добавить игроку карту на руки.
     * @param card
     */
    @Override
    public void addCardToHand(ICard card) {
        cards.add(card);
    }

    /**
     * Нужна ли еще карта
     * @return
     */
    @Override
    public boolean isNeedAnotherCard() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Карты на руках:");
        openCards();
        System.out.println(getName() + ", нужна ли еще карта ?");
        String input = scanner.nextLine();

        if ("да".equalsIgnoreCase(input)){
            return true;
        }
        return false;

//        return "да".equalsIgnoreCase(input);
    }

    /**
     * Открыть ВСЕ ! карты .
     */
    @Override
    public void openCards() {
        for (ICard card: cards){
            card.open();
        }
    }

    /**
     * Подсчитать количество очков на руках.
     * @return
     */
    @Override
    public int countValues() {
        int points =0;
        for (ICard card: cards){
            points += card.getValue();
        }
        return points;
    }
}
