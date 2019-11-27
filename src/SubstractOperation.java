
public class SubstractOperation extends BinaryOperation {
	public SubstractOperation() {
		generateBinaryOperation("-");
	}
   public int calculate(int left, int right) {
      return left - right;
   }

}