public class Receipt {

    public static void display(double nddTotal,double sddTotal, double pbTotal, double peTotal){
        double total=nddTotal+sddTotal+pbTotal+peTotal;
        String myFormat="%-25s%2s%8.2f\n";

        System.out.print("\nReceipt:\n");
        System.out.printf(myFormat,"Next Day Delivery: ","RM",nddTotal);
        System.out.printf(myFormat,"Same Day Delivery: ","RM",sddTotal);
        System.out.printf(myFormat,"Prepaid Box & Envelope: ","RM",pbTotal);
        System.out.printf(myFormat,"Pos Ekspres: ","RM",peTotal);
        System.out.println("------------------------------------");
        System.out.printf(myFormat,"Total Price: ","RM",total);
        System.out.println("------------------------------------");
        System.out.printf("\nThank You!\n\n");
    }
}
