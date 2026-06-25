public class Exercise7FinancialForecast {


    static double calculate(double amount,double rate,int years) {


        if(years==0)
            return amount;


        return calculate(amount+(amount*rate),rate,years-1);
    }



    public static void main(String[] args) {


        double result=calculate(10000,0.1,3);


        System.out.println("Future Value = "+result);
    }
}