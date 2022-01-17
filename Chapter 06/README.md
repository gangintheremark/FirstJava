`test_01`

toString()과 equals() 메소드 오버라이딩

`test_06`

<Enter>키를 입력받기 위해 scanner.nextLine()호출

`test_07`

StringTokenizer 클래스의 countTokens()을 이용하여 한 라인을 읽고, 공백으로 분리된 어절 개수 count

```c++
   	StringTokenizer token = new StringTokenizer(str, " ");
	int n = token.countTokens();
```

`test_08`

String 클래스의 substring(int index) 이용 → index부터 시작하는 서브 스트링 리턴

```c++
str.substring(i) : i번째부터 시작하는 서브 스트링 리턴
str.substring(0,i) : 0부터 i번째까지의 서브스트링 리턴
```

`test_10`

클래스 객체 생성 후 생성자로 정의하는 거를 깜빡해서 오류났다 ㅠ
이런 기본적인거 주의하기

```c++
	static Person p1 = new Person();
	static Person p2 = new Person();
```
