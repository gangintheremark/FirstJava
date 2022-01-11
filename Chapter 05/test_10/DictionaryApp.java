package test_10;

abstract class PairMap {
	protected String keyArray[]; // key 들을 저장하는 배열
	protected String valueArray[]; // value 들을 저장하는 배열

	abstract String get(String key); // key 값을 가진 value 리턴. 없으면 null 리턴

	abstract void put(String key, String value); // key와 value값을 쌍으로 저장. 기존에 key가 있으면, 값을 value로 수정

	abstract String delete(String key); // key 값을 가진 아이템(value와 함께) 삭제. 삭제된 value 값 리턴

	abstract int length(); // 현재 저장된 아이템의 개수 리턴

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
		dic.put("황기태", "자바");
		dic.put("이재문", "파이썬");
		dic.put("이재문", "C++");

		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));

		dic.delete("황기태");
		System.out.println("황기태의 값은 " + dic.get("황기태"));
	
	}
}
