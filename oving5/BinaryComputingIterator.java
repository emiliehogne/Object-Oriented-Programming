package oving5;

import java.util.Iterator;
import java.util.function.BinaryOperator;

public class BinaryComputingIterator implements Iterator<Double> {
    Iterator<Double> iterator1, iterator2;
    Double default1, default2;
    BinaryOperator<Double> operator;

    public BinaryComputingIterator(Iterator<Double> iterator1, Iterator<Double> iterator2,
            BinaryOperator<Double> operator) {
        this.iterator1 = iterator1;
        this.iterator2 = iterator2;
        this.operator = operator;

    }

    public BinaryComputingIterator(Iterator<Double> iterator1, Iterator<Double> iterator2, Double default1,
            Double default2, BinaryOperator<Double> operator) {
        this.iterator1 = iterator1;
        this.iterator2 = iterator2;
        this.default1 = default1;
        this.default2 = default2;
        this.operator = operator;

    }

    @Override
    public boolean hasNext() {
        if (this.iterator1.hasNext() == false && this.iterator2.hasNext() == false) {
            return false;
        }

        else if (iterator1.hasNext() == true && iterator2.hasNext() == true) {
            return true;
        }

        else if (iterator1.hasNext() == true && iterator2.hasNext() == false && default2 != null) {
            return true;
        }

        else if (iterator2.hasNext() == true && iterator1.hasNext() == false && default1 != null) {
            return true;
        }

        else {
            return false;
        }
    }

    @Override
    public Double next() {

        if (this.iterator1.hasNext() && this.iterator2.hasNext()) {
            return this.operator.apply(this.iterator1.next(), this.iterator2.next());
        } else if (this.iterator1.hasNext() == false && this.iterator2.hasNext() == false) {
            return null;

        } else if (this.iterator1.hasNext() == true && this.iterator2.hasNext() == false && this.default2 != null) {
            return this.operator.apply(this.iterator1.next(), this.default2);
        }

        else if (this.iterator2.hasNext() == true && this.iterator1.hasNext() == false && this.default1 != null) {
            return this.operator.apply(this.default1, this.iterator2.next());

        } else
            return null;
    }

}
