public class PosEkspress {

    public static void showMenu(){

        String myFormat = "%-17s%17s%17s%17s%17s\n";

        System.out.printf(myFormat,"Type","LG","LE(C5)","LD(B4)","LK");
        System.out.printf(myFormat,"Size","220mm x 110mm","229mm x 162mm","353mm x 250mm","340mm x 250mm");
        System.out.printf(myFormat,"Max Weight (gm)","100","250","500","1000");
        System.out.printf(myFormat,"Max Thickness","3mm","5mm","10mm","25mm");
        System.out.printf(myFormat,"Price (RM)","3.18","3.71","4.77","7.42");
    }

    public static double calculatePrice(){
        Scanner input= new Scanner(System.in);
        int weight=-1, quantity=0;
        while(weight<0 || weight>1000) {
            System.out.print("Please enter weight(mg): ");
            weight = input.nextInt();
        }
        while(quantity<1){
            System.out.print("Please enter quantity: ");
            quantity = input.nextInt();
        }

        double price=0;

        if(weight<=100){
            price = 3.18*quantity;
        }else if(weight<=250){
            price = 3.71*quantity;
        }else if(weight<=500){
            price = 4.77*quantity;
        }else{
            price = 7.42*quantity;
        }
        calculateTotalPrice(price);
        return price;
    }

    static double totalPrice=0;
    public static double calculateTotalPrice(double price){

        totalPrice+=price;
        return totalPrice;
    }

    public static double output(){
        Scanner input= new Scanner(System.in);

        showMenu();
        System.out.printf("Price: RM%.2f\n",calculatePrice());
        System.out.println("Press any number to continue, 0 to main page:");

        int choice = input.nextInt();

        while(choice!=0){
            showMenu();
            System.out.printf("Price: RM%.2f\n",calculatePrice());
            System.out.println("Press any number to continue, 0 to main page:");
            choice = input.nextInt();
        }
        System.out.printf("Total Price: RM%.2f\n\n",totalPrice);
        return totalPrice;
    }

}
