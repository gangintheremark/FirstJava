#### 배열

> - 배열 선언 시 []에 크기를 지정하면 안 됨

```c++
int Array[10]; // 컴파일 오류

int Array[] = new int [5]; // 5개의 정수 공간 배열 생성
int size = Array.length;  // size는 5
```

> - 이차원 배열

```c++
int Array[][] = new int[2][5];  // 2행 5열의 이차원 배열 생성

int size1 = Array.length;  // 2차원 배열의 행의 개수, 2
int size2 = Array[0].length; // 0번째 행에 있는 열의 개수, 5

int Array[][] = { {0,0,0}, {0,0,0}, {0,0,0} }; // 3x3배열 초기화
```

#### 실습문제

> - test_07

```c++
// 1부터 10 까지 범위의 정수 랜덤 생성
int i = (int)(Math.random()*10 + 1);
```

> - test_14

```c++
// 문자열 비교 위해 String 클래스의 equals() 메소드 이용 ★★★
if(course[i].equals(name))
 ...
```
