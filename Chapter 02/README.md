#### Scanner를 이용한 키 입력

> - nextLine()과 next() <br><br>
>   next()는 공백을 기다림 <br>
>   nextLine()은 <Enter>키의 입력을 기다림

```c++
public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String str = s.next();   //"안녕하세요 반갑습니다." 입력
		String str2 = s.nextLine(); // "안녕하세요 반갑습니다." 입력

		System.out.println(str); // "안녕하세요" 출력
		System.out.println(str2); // "안녕하세요 반갑습니다" 출력
		s.close();
}
```
