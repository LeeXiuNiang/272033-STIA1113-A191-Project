import java.util.Scanner;

public class Prepaid_BoxEnvelope{
    public static double output() {
        double total=0;
        Scanner keyboard = new Scanner(System.in);
        String[] typeArray = {"Envelope S", "Envelope L", "Prepaid Box S", "Prepaid Box M", "Prepaid Box L"};
        String[] sizeArray = {"280mm x 200mm", "380mm x 320mm", "340mm x 250mm x 80mm", "340mm x 250mm x 150mm", "380mm x 320mm x 200mm"};
        double[] weightArray = {0.5, 1.0, 2.0, 5.0, 10.0};
        double[] priceArray = {7.31, 10.49, 13.78, 21.20, 31.80};
        double weight;
        int count = 1;
        int selection ; // random initial number only
        String cont;

        do{
            showTable(typeArray,sizeArray,weightArray,priceArray );
            do{
                selection = promptWeight();
            }while (selection==-1);

            displayOutput(count,selection,typeArray,weightArray,priceArray);
            count++;
            total +=priceArray[selection];

            do{
                System.out.println("\nDo you want to continue Prepaid Box & Envelope? (Y/N)");
                cont = keyboard.next();
            }while (cont.compareTo("Y") != 0 && cont.compareTo("y") != 0
                    && cont.compareTo("N") != 0 && cont.compareTo("n") != 0);
        }while (cont.compareTo("Y") == 0 || cont.compareTo("y") == 0);

        System.out.println(String.format("Total price of prepaid box :RM%.2f",total));

        return total;
    }

    public static void showTable(String[] typeArray, String[] sizeArray,double[] weightArray, double[] priceArray )
    {
        System.out.println(String.format("   %-17s %-23s %-15s %s", "Type", "Size", "MaxWeight(kg)", "Price"));
        for(int i=0; i<5; i++){
            System.out.println(String.format("%-2d.  %-15s %-28s %-10.1f %.2f", i+1, typeArray[i], sizeArray[i], weightArray[i], priceArray[i]));

        }
    }

    public static int promptWeight()
    {
        double weight;
        int selection=-1;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nPlease enter weight in kg:");
        weight = keyboard.nextDouble();
        if(weight <=0.0){
            System.out.println("Can't be zero or negative value. Please enter again.");
        }
        else if(weight >10.0){
            System.out.println("Max weight is 10.0kg. Please enter again.");
        }
        else{
            if(weight<= 0.5){
                selection = 0;
            }
            else if(weight <= 1){
                selection = 1;
            }
            else if (weight <= 2){
                selection = 2;
            }
            else if (weight <= 5){
                selection = 3;
            }
            else if (weight <= 10){
                selection = 4;
            }
        }

        return selection;
    }

    public static void displayOutput(int count,int selection,
                                     String[] typeArray, double[] weightArray,double[] priceArray) {
        System.out.println(String.format("\nNo: %d", count++));
        System.out.println(String.format("Type : %s", typeArray[selection]));
        System.out.println(String.format("Max Weight : %.1fkg", weightArray[selection]));
        System.out.println(String.format("Price :RM %.2f", priceArray[selection]));
    }
}
