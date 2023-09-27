public class Main {
    public static void main(String[] args) {

        int amount = 13676; // стоимость билета
        int miles = 1; //количество миль
        boolean quantity = true;

        if (quantity) {
            miles = 1;
        }
        int bonus = amount / 20; //количество бонусных миль
        System.out.println("Начисленные мили: " + bonus); //вывод результата


    }
}