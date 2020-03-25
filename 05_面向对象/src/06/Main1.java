public class Main1{
    public static void main(String[] args) {
        Income[] incomes=new Income[]{
            new Salary(8000),
            new ManuscriptFee(5000)
        };

        System.out.println(totalTax(incomes));
    }

    public static double totalTax(Income... incomes){
        double total=0;
        for (Income income : incomes) {
            total=total+income.getTax();
        }
        return total;
    }
}

abstract class Income{
    protected double income;

    abstract public double getTax();
    
    public Income(double income){
        this.income=income;
    }
}

class Salary extends Income{
    @Override
    public double getTax(){
        if(income>5000){
            return (income-5000)*0.2;
        }
        return 0;
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