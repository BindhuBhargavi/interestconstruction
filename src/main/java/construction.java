import java.util.Scanner;
public class construction
{
    Double cost=0.0;
    Scanner sc=new Scanner(System.in);
    Double display1() {
        System.out.format("\nEnter the material:\n");
        System.out.format("Standard:1\n");
        System.out.format("above Standard:2\n");
        System.out.format("High standard:3\n");
        int m = sc.nextInt();
        System.out.format("Enter the Area:\n");
        Double Area = sc.nextDouble();
        System.out.format("Enter the Fully automated or not:\n");
        System.out.format("1:yes\n");
        System.out.format("2:No\n");
        int fully = sc.nextInt();
        if (fully == 1) {
            if (m == 3) {
                cost = 2500 * Area;
                return cost;
            }

        } else {
            if (m == 1) {
                 cost = 1200 * Area;
                return cost;
            } else if (m == 2) {
                 cost = 1500 * Area;
                return cost;
            } else {
                 cost = 1800 * Area;
                return cost;
            }
        }

        return cost;
    }

}
