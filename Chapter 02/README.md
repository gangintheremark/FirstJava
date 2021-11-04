#### Scanner를 이용한 키 입력

> - nextLine()과 next()
>   next()는 공백을 기다림
>   nextLine()은 <Enter>키의 입력을 기다림

```java
public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String str = s.next();   //"안녕하세요 저는 22살 입니다." 입력 시
		String str2 = s.nextLine(); // "안녕하세요 저는 22살 입니다." 입력 시

		System.out.println(str); // "안녕하세요" 출력
		System.out.println(str2); // "안녕하세요 저는 22살 입니다." 출력

		s.close();
}
```
