package oving6.observable;

import java.util.ArrayList;
import java.util.Collection;

import javafx.print.Collation;

public class Stock {

    private String ticker;
    private double stockprice;
    private Collection<StockListener> stockListener = new ArrayList<>();

    Stock(String ticker, double stockprice) {
        this.ticker = ticker;
        this.stockprice = stockprice;
    }

    public void setPrice(double dbl) {
        if (dbl < 0 || dbl == 0) {
            throw new IllegalArgumentException();
        }

        else {
            stockListener.stream().forEach(listener -> listener.stockPriceChanged(this, this.stockprice, dbl));
            this.stockprice = dbl;

        }

    }

    public String getTicker() {
        return ticker;

    }

    public double getPrice() {
        return stockprice;

    }

    void addStockListener(StockListener stockListener) {
        this.stockListener.add(stockListener);

    }

    void removeStockListener(StockListener stockListener) {
        this.stockListener.remove(stockListener);

    }

}
