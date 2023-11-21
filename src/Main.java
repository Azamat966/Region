import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Виберите Страну:\n");

        Kyrgysztan kyrgysztan = Kyrgysztan.valueOf(scanner.nextLine());

        switch (kyrgysztan){
            case Batken: System.out.println(kyrgysztan.Batken);
            break;
            case DjalalAbad:
                System.out.println(kyrgysztan.DjalalAbad);
                break;
            case Osh:
                System.out.println(kyrgysztan.Osh);
                break;
            case Chuy:
                System.out.println(kyrgysztan.Chuy);
                break;
            case Naryn:
                System.out.println(kyrgysztan.Naryn);
                break;
            case Ysykkul:
                System.out.println(kyrgysztan.Ysykkul);
                break;
        }

    }
}