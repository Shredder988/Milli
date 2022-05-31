public class Main {
    public static void main(String[] args) {

        long amount = 5000; // стоимость билета
        long bonusMile = 20; // стоимость одной бонусной милли в рублях
        long numberMile = amount / bonusMile; //расчет количества бонусных милль
        System.out.println("Сколько боннусных милль мы получим, если:");
        System.out.println((amount) + "(руб) стоимость билета,");
        System.out.println((bonusMile) + "(руб) стоимость одной бонусной милли?");
        System.out.println("Решив простую алогарефмическую задачу мы получаем");
        System.out.println((numberMile) + "боннусных милль");
    }
}

