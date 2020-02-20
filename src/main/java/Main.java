import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        sinterest si=new sinterest();
        construction c=new construction();
        System.out.format("Enter the principle\n");
        Double p = sc.nextDouble();
        System.out.format("Enter the rate\n");
        Double r = sc.nextDouble();
        System.out.format("Enter the time\n ");
        Double t = sc.nextDouble();
        si.display();
        Double s1=(p*r*t)/100;
        System.out.format("\nThe simple interest is:"+s1);
        System.out.format("\nEnter the principle \n");
        Double principle =sc.nextDouble();
        System.out.format("Enter the rate\n");
        Double rate= sc.nextDouble();
        System.out.format("number of times appiled:\n");
        Double n=sc.nextDouble();
        System.out.format("Enter the time \n");
        Double time= sc.nextDouble();
        si.display();
        Double c1=principle*(1+(rate/n));
        Double cp=Math.pow(c1,(n*time));
        System.out.format("\nThe simple interest is:"+cp);
        Double k=c.display1();
        System.out.format("\nThe estimated cost is:"+k);

    }
}
