package test_10;

abstract class PairMap {
	protected String keyArray[]; // key ���� �����ϴ� �迭
	protected String valueArray[]; // value ���� �����ϴ� �迭

	abstract String get(String key); // key ���� ���� value ����. ������ null ����

	abstract void put(String key, String value); // key�� value���� ������ ����. ������ key�� ������, ���� value�� ����

	abstract String delete(String key); // key ���� ���� ������(value�� �Բ�) ����. ������ value �� ����

	abstract int length(); // ���� ����� �������� ���� ����

}

class Dictionary extends PairMap {

	private int index;

	public Dictionary(int num) {
		this.keyArray = new String[num];
		this.valueArray = new String[num];
		this.index = 0;
	}

	@Override
	public String get(String key) {
		for (int i = 0; i < keyArray.length; i++) {
			if (keyArray[i].equals(key))
				return valueArray[i];
		}
		return null;
	}

	@Override
	public void put(String key, String value) {

		for (int i = 0; i < keyArray.length; i++) {
			if (keyArray[i] != null && keyArray[i].equals(key)) {
				valueArray[i] = value;
				return;
			}
		}
		keyArray[index] = key;
		valueArray[index] = value;
		index++;
	}

	@Override
	public String delete(String key) {
		for (int i = 0; i < keyArray.length; i++) {
			if (this.keyArray[i].equals(key)) {
				String tmp = valueArray[i];
				valueArray[i] = null;
				return tmp;
			}
		}
		return null;
	}

	@Override
	public int length() {
		return index;
	}
}

public class DictionaryApp {
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̽�");
		dic.put("���繮", "C++");

		System.out.println("���繮�� ���� " + dic.get("���繮"));
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));

		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
	
	}
}
