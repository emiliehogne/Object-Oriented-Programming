package oving6.observable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StockIndex implements StockListener {
    private String name;
    private double indeks;
    List<Stock> stockList;

    public StockIndex(String str, Stock... stocks) {
        name = str;
        this.indeks = 0;
        this.stockList = new ArrayList<Stock>(Arrays.asList(stocks));

        for (Stock s : stocks) {
            s.addStockListener(this);
            this.indeks += s.getPrice();
        }
    }

    public void addStock(Stock stock) {
        if (!stockList.contains(stock)) {
            this.stockList.add(stock);
            stock.addStockListener(this);
            this.indeks += stock.getPrice();
        }

    }

    public void removeStock(Stock stock) {
        if (stockList.contains(stock)) {

            stock.removeStockListener(this);
            stockList.remove(stock);
            this.indeks -= stock.getPrice();
        }

    }

    public double getIndex() {
        return this.indeks;
    }

    @Override
    public void stockPriceChanged(Stock stock, double oldValue, double newValue) {
        this.indeks += newValue - oldValue;
    }

}
