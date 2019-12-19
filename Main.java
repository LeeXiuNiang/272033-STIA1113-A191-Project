import java.util.Scanner;

public class Main {
    static double nddTotal=0,sddTotal=0,pbTotal=0,peTotal=0;
    public static void main(String[] args) {
        choice();
    }

    public static void showMainMenu(){
        System.out.println("Welcome to Pos Laju Malaysia.");
        System.out.println("~~~~~~~~~~Main Menu~~~~~~~~~~");
        System.out.println("1. Next-Day Delivery");
        System.out.println("2. Same-Day Delivery");
        System.out.println("3. Prepaid Box & Envelope");
        System.out.println("4. Pos Ekspres");
        System.out.println("5. Receipt");
        System.out.println("0. Quit");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void choice(){
        Scanner input= new Scanner(System.in);
        int choice=-1;
        while(choice!=0) {
            showMainMenu();
            System.out.print("Please enter your choice: ");
            choice = input.nextInt();

            while(choice<0||choice>5) {
                System.out.println("Invalid selection");
                System.out.print("Please enter your choice: ");
                choice = input.nextInt();
            }

                if (choice == 1) {
                    nddTotal+=NextDayDelivery.output();
                } else if (choice == 2) {
                    sddTotal+=SameDayDelivery.output();
                } else if (choice == 3) {
                    pbTotal+=Prepaid_BoxEnvelope.output();
                } else if (choice == 4) {
                    peTotal+=PosEkspres.output();
                }else if(choice == 5){
                    Receipt.display(nddTotal,sddTotal,pbTotal,peTotal);
                }
        }
    }
}

