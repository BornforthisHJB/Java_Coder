
import java.math.BigDecimal;

public class Mars extends Currency {

    private String currencyName;
    private double totalFunds;

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public void setTotalFunds(double totalFunds) {
        this.totalFunds = totalFunds;
    }


    public String getCurrencyName() {
        return currencyName;
    }

    public double getTotalFunds() {
        return totalFunds;
    }

    public Mars() {
        super();
    }


    public Mars(double totalFunds) {
        this.currencyName = "MarsMoney";
        this.totalFunds = totalFunds;
    }


    @Override
    public double toEarthDollars(double amount) {
        BigDecimal MARStoEARTHDollarBigDecimal = new BigDecimal(amount / MARS_MONEY);
        double returnAmount = MARStoEARTHDollarBigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return returnAmount;
    }

    @Override
    public double fromEarthDollars(double EarthDollars) {
        // TODO Auto-generated method stub
        BigDecimal MARSFROMEARTHBigDecimal = new BigDecimal(EarthDollars).multiply(new BigDecimal(MARS_MONEY));
        double returnAmount = MARSFROMEARTHBigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return returnAmount;
    }

    @Override
    public void exchange(Currency other, double amount) {

        if (amount > this.getTotalFunds()) {

            System.out.println("Uh oh - " + this.currencyName + " only has an available balance of $" + this.getTotalFunds() + ", which is less than $" + amount + "?\n");
            return;
        }
        double earthDollars = this.toEarthDollars(amount);
        double newAmount = other.fromEarthDollars(earthDollars);
        this.setTotalFunds(new BigDecimal(this.getTotalFunds() - amount).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
        other.setTotalFunds(new BigDecimal(other.getTotalFunds() + newAmount).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
        System.out.println("Converting from " + this.currencyName + " to " + other.getCurrencyName() + " and initiating transfer... \n$" + amount + this.getCurrencyName() + "= $" + earthDollars + " EarthDollars = " + newAmount + " " + other.getCurrencyName() + "\n" + this.getClass().getSimpleName() + "  has a total of $" + this.getTotalFunds() +
                " " + this.getCurrencyName() + "  \n" + other.getClass().getSimpleName() + " has a total of $" + other.getTotalFunds() + " " + other.getCurrencyName() + "\n");
//                " " + this.getClass().getSimpleName() + "  \n" + other.getClass().getSimpleName() + " has a total of $" + other.getTotalFunds() + " " + other.getCurrencyName() + "\n");
    }

}