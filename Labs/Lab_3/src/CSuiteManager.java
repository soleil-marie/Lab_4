public class CSuiteManager extends Manager {
    public int stockOptions;
    public double strikePrice;
    public String fancyTitle;
    public double marketPrice;
    public double totalMarketPrice;

    /**
     * Constructor 2 for CSuiteManager, with defaults
     * @param name String
     * @param age int
     * @param SSN String
     * @param passwd String
     * @param numSubordinates int
     */
    public CSuiteManager(String name, int age, String SSN, String passwd, int numSubordinates, String fancyTitle) {
        super(name, age, SSN, passwd, numSubordinates);
        this.stockOptions = 0;
        this.strikePrice = 1.00;
        this.fancyTitle = fancyTitle;

    }
    /**
     * Constructor 1 for CSuiteManager
     * @param name String
     * @param age int
     * @param SSN String
     * @param passwd String
     * @param numSubordinates int
     * @param stockOptions int
     * @param strikePrice double
     * @param fancyTitle String
     */
    public CSuiteManager(String name, int age, String SSN, String passwd, int numSubordinates, String fancyTitle,
                         int stockOptions, double strikePrice) {
        super(name, age, SSN, passwd, numSubordinates);
        this.stockOptions = stockOptions;
        this.strikePrice = strikePrice;
        this.fancyTitle = fancyTitle;
    }

    /**
     * getAllOptionsPrice()
     * @return price for exercising all options
     */
    public double getAllOptionsPrice() {
        return (this.stockOptions * this.strikePrice);
    }

    public void setStockOptions(int stockOptions) throws IllegalArgumentException{
        this.stockOptions = stockOptions;
        if (this.stockOptions < 0) {
            throw new IllegalArgumentException();
        }
    }

    public int getStockOptions() {
        return this.stockOptions;
    }

    /**
     *
     * @param marketPrice double
     * @return Capital gains after exercising all options
     */
    public double getCapitalGains(double marketPrice) {
        this.marketPrice = marketPrice;
        this.totalMarketPrice = this.marketPrice * this.stockOptions;
        return (this.totalMarketPrice - this.getAllOptionsPrice());
        }

    @Override
    public String toString() {
        return  "Position: CSuite Manager\n " +
                "Name: " + getName() + "\n"  +
                "Fancy Title: " + fancyTitle + "\n";
    }
}