package simpleFactory;

/**
 * 加法
 *
 * @author plum
 * @date 2023/3/1 16:49
 */
public class Add  extends Operate{
    @Override
    public double Operation(double a, double b) {
        return a+b;
    }
}
