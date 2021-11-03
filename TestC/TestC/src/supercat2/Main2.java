package supercat2;

public class Main2 {
    public static void main(String[] args) {
        // anonymous class
        MyOperation<Integer> myOperation = new MyOperation<Integer>() {
            @Override
            public Integer getResult(Integer value1, Integer value2) {
                return value1 + value2;
            }
        };
        System.out.println("Operation sum :" + myOperation.getResult(50, 55));

        // lambda
        MyOperation<String> concat = ((value1, value2) -> value1.concat(value2));
        System.out.println("Operation concat :" + concat.getResult("Kolia", "Gala"));
    }
}