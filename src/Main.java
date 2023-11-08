import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Sweets> candies = new ArrayList<>();

        candies.add(new Sweets("Ananasas", 1, true, true));
        candies.add(new Sweets("Mentos", 10, false, false));
        candies.add(new Sweets("Mars", 2, true, true));
        candies.add(new Sweets("Twix", 2, true, false));
        while (true) {
            System.out.println();
            System.out.println("--------------");
            System.out.println("1. pamatyti saldainius");
            System.out.println("2. prideti saldaini");
            System.out.println("3. redaguoti saldaini");
            System.out.println("4. trinti saldaini");
            System.out.println("5. pamatyti ar turi gluteno");
            System.out.println("6. iseiti is programos");
            int result = sc.nextInt();
            sc.nextLine();
            switch (result) {
                case 1:
                    for (Sweets candy : candies) {
                        System.out.println(candy);
                    }
                    break;
                case 2:
                    Sweets candy = new Sweets();
                    System.out.println("Iveskite saldainiu pavadinima");
                    candy.setTitle(sc.nextLine().trim());
                    System.out.println("Iveskite saldainiu kieki pakuoteje");
                    candy.setUnits(sc.nextInt());
                    System.out.println("Iveskite ar saldainiai turi sokolado");
                    candy.setHasChocolate(sc.nextBoolean());
                    candies.add(candy);
                    sc.nextLine();
                    break;
                case 3:
                    System.out.println("Įveskite saldainio pavadinimą, kurį norite redaguoti:");
                    String editTitle = sc.nextLine();
                    for (Sweets candy3 : candies) {
                        if (candy3.getTitle().equalsIgnoreCase(editTitle)) {
                            System.out.println("Įveskite naują pavadinimą:");
                            candy3.setTitle(sc.nextLine());
                            System.out.println("Įveskite naują kiekį pakuotėje:");
                            candy3.setUnits(sc.nextInt());
                            System.out.println("Ar saldainiai turi sokolado?");
                            candy3.setHasChocolate(sc.nextBoolean());
                            System.out.println("Saldainio informacija pakeista.");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Įveskite saldainio pavadinimą, kurį norite ištrinti:");
                    String deleteTitle = sc.nextLine().trim();
                    for (Sweets candy2 : candies) {
                        if (candy2.getTitle().equalsIgnoreCase(deleteTitle)) {
                            candies.remove(candy2);
                            System.out.println("Saldainis ištrintas.");
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Įveskite saldainio pavadinimą, kad patikrintumėte, ar jis turi gluteno:");
                    String checkTitle = sc.nextLine();
                    boolean containsGluten = true;
                    for (Sweets candy3 : candies) {
                        if (candy3.getTitle().equalsIgnoreCase(checkTitle)) {
                            containsGluten = candy3.isHasGluten();
                            break;
                        }
                    }
                    if (containsGluten) {
                        System.out.println("Šis saldainis turi gluteno.");
                    } else {
                        System.out.println("Šis saldainis neturi gluteno.");
                    }
                    sc.nextLine();
                    break;
                case 6:
                    System.exit(1);
                    break;
                default:
                    System.out.println("nesupratau komandos, bandykite dar karta");


            }
        }
    }
}
        git config --global user.name "edvardas1996"
        git config --global user.email "edvardasmikulenas@gmail.com"
