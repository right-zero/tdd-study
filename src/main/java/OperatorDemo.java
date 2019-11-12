import java.util.HashMap;
import java.util.Map;

public enum OperatorDemo {
    ADD("+"){
        @Override
        public double operate(double x, double y) {
            return x + y;
        }
    };


    OperatorDemo(String s) {
    }

    private String operator;
    abstract double operate(double x, double y);

    public static Map<String, OperatorDemo> operators() {
        Map<String, OperatorDemo> map = new HashMap<>();
        map.put("+", OperatorDemo.ADD);
        return map;
    }

}
