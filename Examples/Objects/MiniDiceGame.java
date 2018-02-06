public class MiniDiceGame {
    public static void main(String[] args) {
        Die firstDie = new Die();
        Die secondDie = new Die(10);
        System.out.println(firstDie.toString());
        System.out.println(secondDie.toString());
        System.out.println(firstDie.roll());
        System.out.println(secondDie.roll());

        if (firstDie.getFaceUpSide() > secondDie.getFaceUpSide()) {
            System.out.println("First die wins!");
        } else if (firstDie.getFaceUpSide() < secondDie.getFaceUpSide()) {
            System.out.println("Second die wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
