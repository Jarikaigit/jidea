import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // take input from users
        System.out.print("Anna pääoma (desimaalierottimena pilkku) : ");
        double principal = input.nextDouble();

        System.out.print("Anna vuosikorko (desimaalierottimena pilkku) : ");
        double rate = input.nextDouble();

        System.out.print("Anna vuosimäärä (desimaalierottimena pilkku) : ");
        double time = input.nextDouble();

        double interest = (principal * time * rate) / 100;

        System.out.println("Pääoma: " + principal);
        System.out.println("Vuosikorko: " + rate);
        System.out.println("Vuosimäärä: " + time);
        System.out.println("Korko vuodessa: " + interest/time + " korko kuukaudessa: " + interest/(12*time));

        input.close();
    }
}