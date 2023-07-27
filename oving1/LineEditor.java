package oving1;

import java.lang.StringBuilder;

public class LineEditor {
    private String text;
    private int insertionIndex;

    public LineEditor() {
        this.text = "";
        this.insertionIndex = 0;
    }

    public void left() {
        if (this.insertionIndex != 0) {
            this.insertionIndex -= 1;
        }

    }

    public void right() {
        if (insertionIndex <= this.text.length() - 1) {
            this.insertionIndex++;
        }

    }

    public void insertString(String s) {
        this.text = this.text.substring(0, insertionIndex) + s + this.text.substring(insertionIndex);
        this.insertionIndex = insertionIndex + s.length();

    }

    public void deleteLeft() {
        if (this.insertionIndex != 0) {
            StringBuilder sb = new StringBuilder(this.text);
            sb.deleteCharAt(insertionIndex - 1);
            this.text = sb.toString();
            this.insertionIndex--;
        }

    }

    public void deleteRight() {
        if (insertionIndex <= this.text.length() - 1) {
            StringBuilder sb = new StringBuilder(this.text);
            sb.deleteCharAt(insertionIndex);
            this.text = sb.toString();

        }

    }

    public String getText() {
        return this.text;
    }

    public void setText(String s) {
        this.text = s;
    }

    public int getInsertionIndex() {
        return this.insertionIndex;
    }

    public void setInsertionIndex(int s) {
        this.insertionIndex = s;
    }

    @Override
    public String toString() {
        return this.text.substring(0, insertionIndex) + "|" + this.text.substring(insertionIndex);

    }

    public static void main(String[] args) {
        LineEditor l = new LineEditor();
        l.setText("Hei");
        System.out.println(l);
        l.right();
        l.right();
        System.out.println(l);
        l.insertString(" Emilie!");

        System.out.println(l);
        // l.setInsertionIndex(5);
        // l.insertString(" Maiken ");
        // System.out.println(l);

    }

}
