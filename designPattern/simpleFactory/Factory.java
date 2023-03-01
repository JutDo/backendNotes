package simpleFactory;

/**
 * 工厂
 *
 * @author plum
 * @date 2023/3/1 16:52
 */
public class Factory {
     public static Operate getOperator(String operate){
         Operate operat  = null;
      switch (operate){
          case "+" :
              operat=new Add();
              break;
          case "-":
              operat= new Jian();
              break;
          case "/":
              operat=new Chu();
              break;
          case "*":
              operat = new Chen();
              break;

      }
      return  operat;
    }

}
