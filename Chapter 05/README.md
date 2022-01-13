#### super()를 이용하여 명시적으로 슈퍼 클래스의 생성자 선택

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
        super(x,y);  // Point의 생성자 Point(x,y) 호출
        this.color = color;
    }
}
```

#### 추상클래스

> - 구현 : 슈퍼 클래스에 선언된 모든 추상 메소드를 서브 클래스에서 오버라이딩하여 실행 가능한 코드로 구현
> - 서브 클래스가 구현할 메소드를 명료하게 알려주는 인터페이스의 역할

#### 인터페이스

> - 구현 : implements 키워드를 사용하여 인터페이스의 모든 추상 메소드를 구현

#### 추상클래스와 인터페이스 비교

> 유사점
>
> - 객체를 생성할 수 없고, 상속을 위한 슈퍼 클래스로만 사용
> - 클래스의 다형성을 실현하기 위한 목적

---

`test12`

Shape클래스에서 public Shape next; 가 아닌 private Shape next; 로 선언했을 경우, <br>
void set(), Shape get() 함수가 추가됨
