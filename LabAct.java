import java.util.Scanner;


public class LabAct {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);


        char again = 'Y';
        int total_items = 0;
        double tBefore_discount = 0;
        double tDiscount = 0;
        double finalAmount = 0;

        while (again == 'Y' || again == 'y') {
            System.out.println("====== MENU =====");
            System.out.println("1 Burger     - $80.00");
            System.out.println("2 Pizza      - $120.00");
            System.out.println("3 Pasta      - $100.00");
            System.out.println("4 Sandwich   - $70.00");
            System.out.println("5 Milk Tea   - $90.00");


            System.out.println(" ");
            System.out.print("Enter item number: ");
            int item_num = input.nextInt();
            System.out.print("Enter quantity: ");
            int qty = input.nextInt();
            System.out.print( "Are you a student? (Y/N): ");
            char student = input.next().charAt(0);
            System.out.println(" ");

            double price = 0;

            if (item_num == 1) {
                price = 80.00;
            }else if (item_num == 2) {
                price = 120.00;
            }else if (item_num == 3) {
                price = 100.00;
            }else if (item_num == 4) {
                price = 70.00;
            }else if (item_num == 5) {
                price = 90.00;
            }

            if ((item_num < 1 || item_num > 5) || (qty < 1 || qty > 10)) {
                System.out.println("Invalid order! Please enter a valid item and quantity");
                continue;
            }

            double sub_total = price * qty;
            double sDiscount = 0;
            
            if ((student == 'Y' || student == 'y') && sub_total >= 500) {
                sDiscount = .15;
            }else if (student == 'Y' || student == 'y') {
                sDiscount = .10;
            }else if (sub_total >=500) {
                sDiscount = .05;
            }else {
                sDiscount = 0;
            }
            double discount = sub_total * sDiscount;
            double Ototal = sub_total - discount;
          
            total_items = total_items + qty;
            tBefore_discount = tBefore_discount + sub_total;
            tDiscount = tDiscount + discount;
            finalAmount = finalAmount + Ototal;


            System.out.println("Subtotal: $" + sub_total);
            System.out.println("Discount: $" + discount);
            System.out.println("Order Total: $" + Ototal);
            System.out.println(" ");
            System.out.print("Do you want to order again? (Y/N): ");
            again = input.next().toUpperCase().charAt(0);
            System.out.println(" ");
            }
            

             System.out.println("=====ORDER SUMMARY=====");
            System.out.println("Total items: " + total_items );
            System.out.println("Total before discount: $" + tBefore_discount );
            System.out.println("Total discount: $" + tDiscount);
            System.out.println("Final amount: $" + finalAmount);
            System.out.println("Thank you for ordering! ");

            input.close();





        }



    }

    
