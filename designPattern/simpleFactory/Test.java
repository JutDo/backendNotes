package simpleFactory;

/**
 * 测试
 *
 * @author plum
 * @date 2023/3/1 16:51
 */
class Test{
    public static void main(String[] args) {
        Operate operate = Factory.getOperator("/");
        double operation = operate.Operation(10, 20);
        System.out.println(operation);
    }
}