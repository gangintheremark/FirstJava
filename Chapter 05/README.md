#### super()�� �̿��Ͽ� ��������� ���� Ŭ������ ������ ����

```java
class Point {
    private int x, y;
    public Point(int x, int y) {
        this.x =x; this.y = y;
    }
}
class ColorPoint extends Point {
    private String color;
    public ColorPoint(int x, int y, String color) {
        super(x,y);  // Point�� ������ Point(x,y) ȣ��
        this.color = color;
    }
}
```

#### �߻�Ŭ����

> - ���� : ���� Ŭ������ ����� ��� �߻� �޼ҵ带 ���� Ŭ�������� �������̵��Ͽ� ���� ������ �ڵ�� ����
> - ���� Ŭ������ ������ �޼ҵ带 ����ϰ� �˷��ִ� �������̽��� ����

#### �������̽�

> - ���� : implements Ű���带 ����Ͽ� �������̽��� ��� �߻� �޼ҵ带 ����

#### �߻�Ŭ������ �������̽� ��

> ������
>
> - ��ü�� ������ �� ����, ����� ���� ���� Ŭ�����θ� ���
> - Ŭ������ �������� �����ϱ� ���� ����

---

`test12`

ShapeŬ�������� public Shape next; �� �ƴ� private Shape next; �� �������� ���, <br>
void set(), Shape get() �Լ��� �߰���
