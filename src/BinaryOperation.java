import java.util.Random;
public abstract class BinaryOperation {
	private int upper = 100;
	private int lower = 0;
	private int left_Operand = 0;
	private int right_Operand = 0;
	private String operate = "+";
	private int value = 0;
	
	
	protected void generateBinaryOperation(String anOperator) {
		Random random = new Random();
		operate = anOperator;
		left_Operand = random.nextInt(upper+1);
		
		do {
			right_Operand = random.nextInt(upper+1);
			value = calculate(left_Operand, right_Operand);
		}while(!(checkingCalculation()));
	}
	
	public abstract int calculate(int left, int right);
	
	public boolean checkingCalculation() {
		if(value < lower)
			return false;
		else if(value > upper)
			return false;
		else
			return true;
	}

	public boolean equals(BinaryOperation binaryOperation) {
		if(binaryOperation.value == value) {//结果相等
			if(binaryOperation.right_Operand == right_Operand && binaryOperation.left_Operand == left_Operand)//左右操作数对应相等 
				return true;
			else if(binaryOperation.right_Operand == left_Operand && binaryOperation.left_Operand == right_Operand)//左右操作数交叉相等
				return true;
			else
				return false;
		}
		else
			return false;
	}

	public String toString() {
		return left_Operand + operate + right_Operand + "=";
	}
	public int getvalue() {
		return value;
	}
}