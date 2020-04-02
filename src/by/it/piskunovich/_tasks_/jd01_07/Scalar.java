package by.it.piskunovich._tasks_.jd01_07;

public class Scalar extends AbstractVar {

    private double value;

    Scalar(double value) {
        this.value = value;
    }

    Scalar(String str) {
        this.value=Double.parseDouble(str);
    }
Scalar(Scalar scalar) {
        this.value=scalar.value;
}

    @Override
    public String toString() {
        return Double.toString(value);
    }
}
