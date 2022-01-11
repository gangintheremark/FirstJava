package test_04;

import java.util.Scanner;

abstract class Converter { // 단위를 변화하는 추상 클래스
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;

	public void run() {
		Scanner s = new Scanner(System.in);
		System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
		System.out.print(getSrcString() + "을 입력하세요 >> ");
		double val = s.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: " + res + getDestString() + "입니다.");
		s.close();
	}
}

class Km2Mile extends Converter {
	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}
	
	@Override
	protected double convert(double src) {
		return src/ratio;
	}
	
	@Override
	protected String getSrcString() {
		return "Km";
	}
	
	@Override
	protected String getDestString() {
		return "mile";
	}
}

public class Km2MileEx {
	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}
}
