import java.util.Scanner;

public class NextDayDelivery{
    static Scanner input =new Scanner(System.in);
    public static double output() {
        int choice;
        do{
            System.out.println("Do you want Next-Day Delivery?" + "\n" + "1 Yes" + "\n" + "2 No");
            choice = input.nextInt();

        }while(!validChoice(choice));
        menu(choice);

        return totalPrice;
    }
    static double totalPrice = 0;
    public static void menu(int choice) {
        double[] total = new double[10];

        int i = 0;

        System.out.println();


        while (choice == 1) {

            total[i] = validPackageType(choice);

            totalPrice = totalPrice + total[i];
            i++;


            System.out.println("Do you want more transactions?" + "\n" + "1 Yes" + "\n" + "2 No");
            choice = input.nextInt();

        }
        String nddPrice = String.format("%.2f", totalPrice);
        System.out.println("Total Next-Day Delivery Price = RM "+nddPrice);
    }
    public static boolean validChoice(int c) {

        if (c == 1 || c == 2) {
            return true;
        } else {
            System.out.println("Please enter valid choice 1 or 2.");
            return false;
        }
    }
    public static double validPackageType(int pt) {
        int packagetype;
        double total=0;

        if (pt == 1) {
            do {
                System.out.println("Enter your package type:" + "\n" + "1 Document(below 2kg)" + "\n" + "2 Parcel(above 2kg)");
                packagetype = input.nextInt();
                total = packageTypeSelect(packagetype);
            } while (!validChoice(packagetype));

        } else {

        }
        return total;
    }
    public static double packageTypeSelect(int ptChoice) {
        int dZone, pZone;
        double total=0;

        switch (ptChoice) {
            case 1:
                do {
                    System.out.println("Enter your document's zone:" + "\n" + "1 Zone 1" + "\n" + "2 Zone 2" + "\n" + "3 Zone 3" + "\n" + "4 Zone 4" + "\n" + "5 Zone 5");
                    dZone = input.nextInt();
                    total = dZoneSelect(dZone);
                } while (!validZone(dZone));

                break;

            case 2:
                do {
                    System.out.println("Enter your parcel's zone:" + "\n" + "1 Zone 1" + "\n" + "2 Zone 2" + "\n" + "3 Zone 3" + "\n" + "4 Zone 4" + "\n" + "5 Zone 5");
                    pZone = input.nextInt();
                    total = pZoneSelect(pZone);
                } while (!validZone(pZone));

                break;
        }
        return total;
    }
    public static boolean validZone(int z) {
        if (z >= 1 && z <= 5) {
            return true;
        } else {
            System.out.println("Please enter valid zone within 1-5.");
            return false;
        }
    }
    public static double dZoneSelect(int dz) {
        double total = 0;
        switch (dz) {
            case 1:
                total = dMethod(4.90, 0.80);
                break;
            case 2:
                total = dMethod(5.40, 1.00);
                break;
            case 3:
                total = dMethod(6.90, 1.50);
                break;
            case 4:
                total = dMethod(7.40, 1.50);
                break;
            case 5:
                total = dMethod(7.90, 2.00);
                break;
        }
        return total;
    }
    public static double pZoneSelect(int pz) {
        double total=0;
        switch (pz) {
            case 1:
                total = pMethod(10.50, 0.50);
                break;
            case 2:
                total = pMethod(16.00, 2.00);
                break;
            case 3:
                total = pMethod(21.00, 3.00);
                break;
            case 4:
                total = pMethod(26.00, 3.50);
                break;
            case 5:
                total = pMethod(31.00, 4.00);
                break;
        }
        return total;
    }
    public static boolean validDWeight(double dw) {
        if (dw > 0 && dw <= 2000) {
            return true;
        } else {
            System.out.println("Please enter valid document's weight below 2kg.");
            return false;
        }
    }
    public static boolean validPWeight(double pw) {
        if (pw >= 2.001) {
            return true;
        } else {
            System.out.println("Please enter valid parcel's weight above 2.001kg.");
            return false;
        }
    }
    public static double dMethod(double fdPrice, double sdPrice) {
        double dWeight, totalsdPrice, dPrice = 0;
        int i;

        do {
            System.out.println("Enter the document's weight in g: ");
            dWeight = input.nextDouble();
        } while (!validDWeight(dWeight));

        if (dWeight <= 500) {
            totalsdPrice = 0;
        } else {
            if (((dWeight / 1000) - 0.5) % 0.25 == 0) {
                i = (int) ((dWeight / 1000 - 0.5) / 0.25);
                totalsdPrice = i * sdPrice;

            } else {
                i = (int) ((dWeight / 1000 - 0.5) / 0.25);
                totalsdPrice = (i + 1) * sdPrice;
            }
        }

        dPrice = fdPrice + totalsdPrice;
        String documentPrice = String.format("%.2f", dPrice);
        System.out.println("Your Next-Day Delivery for document is RM " + documentPrice);

        return dPrice;
    }
    public static double pMethod(double fpPrice, double spPrice) {
        double pWeight, totalspPrice, pPrice = 0;
        int j;

        do {
            System.out.println("Enter the parcel's weight in kg: ");
            pWeight = input.nextDouble();
        } while (!validPWeight(pWeight));

        if (pWeight >= 2.001 && pWeight <= 2.5) {
            totalspPrice = 0;
        } else {
            if ((pWeight - 2.5) % 0.5 == 0) {
                j = (int) ((pWeight - 2.5) / 0.5);
                totalspPrice = j * spPrice;

            } else {
                j = (int) ((pWeight - 2.5) / 0.5);
                totalspPrice = (j + 1) * spPrice;
            }
        }

        pPrice = fpPrice + totalspPrice;
        String parcelPrice = String.format("%.2f", pPrice);
        System.out.println("Your Next-Day Delivery for parcel is RM " + parcelPrice);


        return pPrice;
    }
}
