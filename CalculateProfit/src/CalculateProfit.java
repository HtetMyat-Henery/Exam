import java.util.Scanner;

public class CalculateProfit {
    public static void main(String[]args){

        int type=0;
        double price=0.0;
        double profit=0.0;

        Scanner input=new Scanner(System.in);
        System.out.print("Enter type: ");
        type = input.nextInt();
        System.out.print("Enter price: ");
        price = input.nextInt();

        if (type==0){
            if (price<20){
                profit = (price*10/100);
            }else if (price>=20 && price <=50){
                profit = (price*15/100);
            }else if (price>50){
                profit = (price*20/100);
            }
        }
        else if (type==1){
            if (price<5 || price>3){
                profit = (price*5/100);
            }else if (price>=5 && price<=3.00){
                profit = (price*10/100);
            }
        }
        System.out.println("profit: "+profit);
    }
}
