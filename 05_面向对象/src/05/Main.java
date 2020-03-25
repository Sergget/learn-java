public class Main{
    public static void main(String[] args) {
        Income[] incomes = new Income[]{
            new Salary(6700),
            new ManuscriptFee(2000)
        };

        System.out.println(totalTax(incomes));
    }

    public static double totalTax(Income... incomes) {
        double total = 0;
        for (Income income: incomes) {
            total = total + income.getTax();
        }
        return total;
    }
}

class Income{
    protected double income;

    public Income(double income){
        this.income=income;
    }

    public double getTax(){
        return income*0.1;
    }
}

class Salary extends Income{
    @Override
    public double getTax(){
        if(income<=5000){
            return 0;
        }
        return (income-5000)*0.2;
    }

    public Salary(double income){
        super(income);
    }
}

class ManuscriptFee extends Income{
    @Override
    public double getTax(){
        if(income<4000&&income>0){
            return (income-800)*0.2*0.7;
        }else if(income>4000){
            return income*0.8*0.2*0.7;
        }else{
            return 0;
        }
    }

    public ManuscriptFee(double income){
        super(income);
    }
}