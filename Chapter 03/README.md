#### �迭

> - �迭 ���� �� []�� ũ�⸦ �����ϸ� �� ��

```c++
int Array[10]; // ������ ����

int Array[] = new int [5]; // 5���� ���� ���� �迭 ����
int size = Array.length;  // size�� 5
```

> - ������ �迭

```c++
int Array[][] = new int[2][5];  // 2�� 5���� ������ �迭 ����

int size1 = Array.length;  // 2���� �迭�� ���� ����, 2
int size2 = Array[0].length; // 0��° �࿡ �ִ� ���� ����, 5

int Array[][] = { {0,0,0}, {0,0,0}, {0,0,0} }; // 3x3�迭 �ʱ�ȭ
```

#### �ǽ�����

> - test_07

```c++
// 1���� 10 ���� ������ ���� ���� ����
int i = (int)(Math.random()*10 + 1);
```

> - test_14

```c++
// ���ڿ� �� ���� String Ŭ������ equals() �޼ҵ� �̿� �ڡڡ�
if(course[i].equals(name))
 ...
```
