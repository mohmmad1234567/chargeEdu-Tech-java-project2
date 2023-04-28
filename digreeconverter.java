# chargeEdu-Tech-java-project2
import java.util.Scanner;

public class digreeconverter{
    public static void main(String[] args) {
        Scanner Scan =new Scanner(System.in);
        System.out.println("Fahrenheit to celsius (1) or celsius to Fahrenheit (2)");
        int result = Scan.nextInt();
        if (result ==1){
            // calculate.fahrenheit to celsius
            System.out.println("you have chosen FAHRENHEIT to CELSIUS!");
            System.out.println("Enter Fahrenheit Value: ");
            double Value = Scan.nextDouble();
            double vlaueFinal = (Value - 32)* 5/9;
            System.out.println("Celsius is:");
            System.out.println(Math.round(vlaueFinal*10.0)/10.0);


        }else if (result == 2){
            //calculate celsius to fahernheit
            System.out.println("you have chosen CELSIUS to FAHERENHEIT");
            System.out.println("Enter Celsius value");
            double vlaue2 = Scan.nextDouble();
            double finalResul = vlaue2 * 1.8 +32; // it is formula to convert celsius to 
            System.out.println("Fahrenheit is: ");
            System.out.println(Math.round(finalResul *10.0 )/10.0);

        }else {
            // any number that is not 1 or 2
            System.out.println("Not valid choise"); 
        }
        
    }
}
