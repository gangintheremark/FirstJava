package test_03;
import java.util.Scanner;

abstract class Converter { // ������ ��ȭ�ϴ� �߻� Ŭ����
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	public void run() {
		Scanner s = new Scanner(System.in );
		System.out.println(getSrcString() + "�� " + getDestString() + "�� �ٲߴϴ�.");
		System.out.print(getSrcString()  + "�� �Է��ϼ��� >> ");
		double val = s.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ���: " + res + getDestString() + "�Դϴ�.");
		s.close();
	}
}

class Won2Dollar extends Converter {
	
	public Won2Dollar(double ratio) {
		this.ratio = ratio;
	}
	@Override
	protected double convert(double src) {
		return src/ratio;
	}
	
	@Override
	protected String getSrcString() {
		return "��";
	}
	
	@Override
	protected String getDestString() {
		return "�޷�";
	}
}

public class Won2DollarEx {
	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
	}
}