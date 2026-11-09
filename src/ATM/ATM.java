package ATM;

import java.util.*;

public class ATM {
    private final Map<Integer, Integer> banknotes;

    public ATM() {
        banknotes = new LinkedHashMap<>();

        banknotes.put(5000, 10);
        banknotes.put(1000, 1);
        banknotes.put(500, 10);
        banknotes.put(100, 10);
    }

    public boolean getBanknotes(int amount) {
        if (amount <= 0) {
            System.out.println("Некорректная сумма.");
            return false;
        }

        Map<Integer, Integer> remaining = new TreeMap<>((a, b) -> b - a);
        remaining.putAll(banknotes);

        Map<Integer, Integer> toGive = new LinkedHashMap<>();
        int rest = amount;

        for (int nominal : remaining.keySet()) {
            if (rest == 0) break;
            int canGive = Math.min(rest / nominal, remaining.get(nominal));
            if (canGive > 0) {
                toGive.put(nominal, canGive);
                rest -= canGive * nominal;
            }
        }

        if (rest != 0) {
            System.out.println("Невозможно выдать сумму " + amount + " доступными купюрами.");
            return false;
        }

        for (Map.Entry<Integer, Integer> entry : toGive.entrySet()) {
            int nominal = entry.getKey();
            int count = entry.getValue();
            banknotes.put(nominal, banknotes.get(nominal) - count);
            System.out.println("Выдано: " + count + " x " + nominal + " руб.");
        }

        System.out.println("Итого выдано: " + amount + " руб.");
        return true;

    }

    public void showBanknotes() {
        for (Map.Entry<Integer, Integer> entry : banknotes.entrySet()) {
            System.out.println("Номинал: " + entry.getKey() + ", Количество: " + entry.getValue());
        }
    }
}
