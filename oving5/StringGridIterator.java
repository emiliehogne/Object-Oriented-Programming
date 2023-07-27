package oving5;

import java.util.Iterator;

public class StringGridIterator implements Iterator<String> {

    private boolean rowMajor;
    private int row = 0;
    private int column = 0;
    private StringGrid grid;

    public StringGridIterator(StringGrid grid, boolean value) {
        this.rowMajor = value;
        this.grid = grid;
    }

    @Override
    public boolean hasNext() {
        if (rowMajor) {
            if (row < this.grid.getRowCount() - 1) {
                return true;
            } else if (column >= this.grid.getColumnCount()) {
                return false;
            } else
                return true;
        } else {
            if (row < this.grid.getRowCount()) {
                return true;
            } else if (column >= this.grid.getColumnCount() - 1) {
                return false;
            }
            return true;
        }

        // if ((this.row * this.column) >= grid.getColumnCount() * grid.getRowCount()) {
        // return true;
        // } else{
        // return false;
        // }

    }

    @Override
    public String next() {

        if (this.rowMajor) {
            if (column < grid.getColumnCount()) {
                int col = column;
                column++;
                return grid.getElement(row, col);
            } else {
                column = 1;
                row++;
                return grid.getElement(row, 0);
            }
        } else {
            if (row < grid.getRowCount()) {
                int r = row;
                row++;
                return grid.getElement(r, column);
            } else {
                row = 1;
                column++;
                return grid.getElement(0, column);
            }
        }

        // if (rowMajor == true) {
        // return grid.getElement(row, column)

        // }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

}
