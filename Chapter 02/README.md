#### Scanner�� �̿��� Ű �Է�

> - nextLine()�� next()
>   next()�� ������ ��ٸ�
>   nextLine()�� <Enter>Ű�� �Է��� ��ٸ�

```java
public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String str = s.next();   //"�ȳ��ϼ��� ���� 22�� �Դϴ�." �Է� ��
		String str2 = s.nextLine(); // "�ȳ��ϼ��� ���� 22�� �Դϴ�." �Է� ��

		System.out.println(str); // "�ȳ��ϼ���" ���
		System.out.println(str2); // "�ȳ��ϼ��� ���� 22�� �Դϴ�." ���

		s.close();
}
```
