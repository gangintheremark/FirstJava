#### 생성자

> 생성자는 객체가 생성될 때 객체의 초기화를 위해 실행되는 메소드
>
> - 생성자의 이름은 클래스 이름과 동일
> - 생성자는 여러 개 오버로딩 가능
> - 생성자는 new를 통해 객체를 생성할 때 한 번만 호출
> - 생성자에 리턴 타입을 지정할 수 없음

```java
public class book {
    String title;
    String author;

    public Book(String t) {
        title = t;
        author = "작자미상";
    }

    public Book(String t, String a) {
        title = t;
        author = a;
    }

    public static void main(String[] args) {
        Book loveStory = new Book("춘향전");
        Book littlePrince = new Book("어린왕자", "생텍쥐페리");
    }
}
```

#### this

> this 사용 시 주의할 점 <br>
>
> - this()는 반드시 생성자 코드에서만 호출
> - this()는 반드시 같은 클래스 내 다른 생성자 호출 시 사용
> - this()는 반드시 생성자의 첫번째 문장이 되어야 함

#### 객체 배열

> - test_07
> - test_08

```java
Circle [] c;
c = new CirCle[5];  //  레퍼런스 배열 생성

for(int i=0;i<c.length;i++)  // 배열의 각 원소 객체 생성
    c[i] = new Circle(i);
```

클래스 여러개 생성 + 객체 배열 까지 섞으니 머리 아프다..
