/**
 * @ClassName: Currency
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/2/19 08:22
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
abstract class Currency implements Exchangeable {
    private String currencyName;

    private double totalFunds;

    public Currency() {
        this.currencyName = "";
        this.totalFunds = 0;
    }

    public Currency(double totalFunds) {
        this.totalFunds = totalFunds;
    }

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

    public abstract double toEarthDollars(double amount);
    public abstract double fromEarthDollars(double EarthDollars);
}
