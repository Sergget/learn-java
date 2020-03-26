public class Main2{
    public static void main(String[] args) {
        Income[] incomes=new Income[]{
            new Salary(16000),
            new ManuscriptFee(6000)
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

/**
 * Income
 */ 
interface Income_interface {
    double getTax();
}

class Income implements Income_interface{
    protected double income;

    public Income(double income){
        this.income=income;
    }

    @Override
    public double getTax() {
        return income*0.1;
    }
}

class Salary extends Income{
    public Salary(double income){
        super(income);
    }

    @Override
    public double getTax(){
        if(income>5000){
            return (income-5000)*0.2;
        }
        return 0;
    }
}

class ManuscriptFee extends Income{
    public ManuscriptFee(double income){
        super(income);
    }

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

}