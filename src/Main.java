public class Main {
    public static void main(String[] args) {
        int initBalance = 1100;
        int added = 3961;

        int bonus = 0;
        if (added > 1000); {
            bonus = added / 100;
        }
        //  int bonus2 = added > 1000 ? added / 100 : 0; - или можно так, но у меня почему-то это криво сработало - решил оставить вот так

        int total = initBalance + added + bonus;

        System.out.println("Ваш баланс: " + total + " рублей."); // с учетом бонусов
        System.out.println("----------------------------"); // для красоты
        System.out.println("Доступно бонусов: " + bonus + " рублей."); // общее кол-во бонусов
    }
}