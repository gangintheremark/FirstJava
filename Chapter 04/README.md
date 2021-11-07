#### this

> this 사용 시 주의할 점 <br>
>
> - this()는 반드시 생성자 코드에서만 호출
> - this()는 반드시 같은 클래스 내 다른 생성자 호출 시 사용
> - this()는 반드시 생성자의 첫번째 문장이 되어야 함

#### 객체 배열

> - test_07
> - test_08

```c++
Circle [] c;
c = new CirCle[5];  //  레퍼런스 배열 생성

for(int i=0;i<c.length;i++)  // 배열의 각 원소 객체 생성
    c[i] = new Circle(i);
```
