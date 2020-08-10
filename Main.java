package java_homeworks;

class LambdaApp {

    public static void main(String[] args) {

        Operationable op = new Operationable() {

            public int calculate(int x, int y) {

                return x + y;
            }
        };
        int z = op.calculate(25, 29);
        System.out.println(z);
        Operationable operation2 = (int x, int y) -> x - y;
        Operationable operation3 = (int x, int y) -> x * y;
        System.out.println(operation2.calculate(12, 10));
        System.out.println(operation3.calculate(25, 6));
    }
}
interface Operationable {
    int calculate(int x, int y);
}