package blackjack;

import blackjack.interfaces.IDealer;

// Дилер
public class Dealer extends Player implements IDealer {

    /**
     * Конструктор, обращаемся к конструктору супер, класса.
     */
    public Dealer() {
        super("Крупье");
    }

    /**
     * Нужна ли еще карта.
     * @return
     */
    @Override
    public boolean isNeedAnotherCard() {

//        int points = countValues();
//        if (points < 17) {
//            return true;
//        }
//        return false;

        return countValues() < 17;
    }
}
