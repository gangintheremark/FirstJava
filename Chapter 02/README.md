#### Scanner�� �̿��� Ű �Է�

> - nextLine()�� next() <br>
>   next()�� ������ ��ٸ� <br>
>   nextLine()�� <Enter>Ű�� �Է��� ��ٸ�

```c++
public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String str = s.next();   //"�ȳ��ϼ��� ���� 22�� �Դϴ�." �Է� ��
		String str2 = s.nextLine(); // "�ȳ��ϼ��� ���� 22�� �Դϴ�." �Է� ��

		System.out.println(str); // "�ȳ��ϼ���" ���
		System.out.println(str2); // "�ȳ��ϼ��� ���� 22�� �Դϴ�." ���

		s.close();
}
```
