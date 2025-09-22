import java.util.Scanner;

public class InvestmentCalculator {
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
        }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Input the investment amount: ");
            double investmentAmount = input.nextDouble();
            System.out.print("Input the rate of interest: ");
            double annualInterestRate = input.nextDouble();
            System.out.print("Input number of years: ");
            int years = input.nextInt();
            double monthlyInterestRate = annualInterestRate / 1200;
            System.out.println("Years FutureValue");
            for (int i = 1; i <= years; i++) {
                double futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, i);
                System.out.printf("%-10d%.2f\n", i, futureValue);
            }
        }
}