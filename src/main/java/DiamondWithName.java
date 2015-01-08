/**
 * Created by rcarreira on 1/8/15.
 */
public class DiamondWithName {
    public static void main(String[] args) {
        create(5, "Renata");
    }
    public static void create(int number, String name){
        Diamond diamond = new Diamond();

        createTop(number - 1);
        System.out.println(name);
        diamond.createReverseBottom(number - 1);
    }
    public static void createTop(int number){
        for (int i = 1; i < number * 2; i += 2) {
            for (int j = 1; j < (number - (i / 2) + 1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
