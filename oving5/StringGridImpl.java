package oving5;

public class StringGridImpl implements StringGrid {

    private int rows;
    private int columnCount;
    // private ArrayList<String> grid = new ArrayList<>();
    private String[][] grid;

    public StringGridImpl(int rows, int columnCount) {
        this.rows = rows;
        this.columnCount = columnCount;
        grid = new String[rows][columnCount];

        // for (int i = 0; i < (rows * columnCount); i++) {
        // grid.add(null);
        // }

    }

    // public int calcindex(int rows, int column) {

    // return rows * (this.columnCount) + column;
    // }

    @Override
    public int getRowCount() {
        return this.rows;
    }

    @Override
    public int getColumnCount() {
        return this.columnCount;
    }

    @Override
    public String getElement(int row, int column) {

        return grid[row][column];
    }

    @Override
    public void setElement(int row, int column, String string) {
        grid[row][column] = string;
    }

    public static void main(String[] args) {
        StringGridImpl grid = new StringGridImpl(4, 5);
        System.out.println(grid.getElement(3, 2));
        grid.setElement(2, 3, "Hei");
        System.out.println(grid.getElement(2, 3));

    }

}
