#### ������

> �����ڴ� ��ü�� ������ �� ��ü�� �ʱ�ȭ�� ���� ����Ǵ� �޼ҵ�
>
> - �������� �̸��� Ŭ���� �̸��� ����
> - �����ڴ� ���� �� �����ε� ����
> - �����ڴ� new�� ���� ��ü�� ������ �� �� ���� ȣ��
> - �����ڿ� ���� Ÿ���� ������ �� ����

```java
public class book {
    String title;
    String author;

    public Book(String t) {
        title = t;
        author = "���ڹ̻�";
    }

    public Book(String t, String a) {
        title = t;
        author = a;
    }

    public static void main(String[] args) {
        Book loveStory = new Book("������");
        Book littlePrince = new Book("�����", "�������丮");
    }
}
```

#### this

> this ��� �� ������ �� <br>
>
> - this()�� �ݵ�� ������ �ڵ忡���� ȣ��
> - this()�� �ݵ�� ���� Ŭ���� �� �ٸ� ������ ȣ�� �� ���
> - this()�� �ݵ�� �������� ù��° ������ �Ǿ�� ��

#### ��ü �迭

> - test_07
> - test_08

```java
Circle [] c;
c = new CirCle[5];  //  ���۷��� �迭 ����

for(int i=0;i<c.length;i++)  // �迭�� �� ���� ��ü ����
    c[i] = new Circle(i);
```

Ŭ���� ������ ���� + ��ü �迭 ���� ������ �Ӹ� ������..
