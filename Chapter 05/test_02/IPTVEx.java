package test_02;

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}


class ColorTV extends TV {
	private int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	public void printProperty() {
		System.out.println(getSize() + "��ġ " + color +"�÷�");
		
	}
}

class IPTV extends ColorTV {
	String address;

	public IPTV(String address, int size, int color) {
		super(size, color);
		this.address = address;
	}

	public void printProperty() {
		System.out.print("���� IPTV�� " + address + " �ּ��� ");
		super.printProperty();
	}
}

public class IPTVEx {
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.2", 32, 2048);

		iptv.printProperty();
	}
}
