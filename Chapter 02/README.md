#### Scanner�� �̿��� Ű �Է�

> - nextLine()�� next() <br><br>
>   next()�� ������ ��ٸ� <br>
>   nextLine()�� <Enter>Ű�� �Է��� ��ٸ�

```c++
public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String str = s.next();   //"�ȳ��ϼ��� �ݰ����ϴ�." �Է�
		String str2 = s.nextLine(); // "�ȳ��ϼ��� �ݰ����ϴ�." �Է�

		System.out.println(str); // "�ȳ��ϼ���" ���
		System.out.println(str2); // "�ȳ��ϼ��� �ݰ����ϴ�" ���
		s.close();
}
```
