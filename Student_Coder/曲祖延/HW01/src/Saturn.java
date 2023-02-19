/**
 * @ClassName: Saturn
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/2/19 10:16
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */

import java.math.BigDecimal;

public class Saturn extends Currency {
    private String currencyName;
    private double totalFunds;

    public String getCurrencyName() {
        return currencyName;
    }

    public double getTotalFunds() {
        return totalFunds;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }


    public void setTotalFunds(double totalFunds) {
        this.totalFunds = totalFunds;
    }

    public Saturn() {
        super();
        this.currencyName = "SaturnSilver";
    }

    public Saturn(double totalFunds) {
        this.currencyName = "SaturnSilver";
        this.totalFunds = totalFunds;
    }

    @Override
    public double toEarthDollars(double amount) {
        // TODO Auto-generated method stub
        BigDecimal SATURNtoEARTHDollarBigDecimal = new BigDecimal(amount / SATURN_SILVER);
        double returnAmount = SATURNtoEARTHDollarBigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return returnAmount;
    }

    @Override
    public double fromEarthDollars(double EarthDollars) {
        // TODO Auto-generated method stub
        BigDecimal SATURNFROMEARTHBigDecimal = new BigDecimal(EarthDollars).multiply(new BigDecimal(SATURN_SILVER));
        double returnAmount = SATURNFROMEARTHBigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return returnAmount;
    }

    @Override
    public void exchange(Currency other, double amount) {
        // TODO Auto-generated method stub
        if (amount > this.getTotalFunds()) {

            System.out.println("Uh oh - " + this.currencyName + " only has an available balance of $" + this.getTotalFunds() + ", which is less than $" + amount + "?\n");
            return;
        }
        double earthDollars = this.toEarthDollars(amount);
        double newAmount = other.fromEarthDollars(earthDollars);
        this.setTotalFunds(new BigDecimal(this.getTotalFunds() - amount).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
        other.setTotalFunds(new BigDecimal(other.getTotalFunds() + newAmount).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
        System.out.println("Converting from " + this.currencyName + " to " + other.getCurrencyName() + " and initiating transfer... \n$" + amount + this.getCurrencyName() + "= $" + earthDollars + " EarthDollars = " + newAmount + " " + other.getCurrencyName() + "\n" + this.getClass().getSimpleName() + "  has a total of $" + this.getTotalFunds() +
                " " + this.getClass().getSimpleName() + "  \n" + other.getClass().getSimpleName() + " has a total of $" + other.getTotalFunds() + " " + other.getCurrencyName() + "\n");
    }


}
