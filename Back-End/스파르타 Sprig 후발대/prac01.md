# 스파르타 Spring 후발대
자바 기본기를 다지고 배운 개념들을 복습하기 위해 후발대에 합류했다.
## prac01
### 화면에 출력하기
```java
/** 화면에 출력하기 : System.out.println(); **/

1) Hello World!
System.out.println("Hello World!");

2) 안녕 자바!
System.out.println("안녕 자바!");  // 첫 번째 방법
System.out.println("안녕\t자바!"); // 두 번째 방법        

3) 안녕
   자바!
System.out.println("안녕"); // 첫 번째 방법
System.out.println("자바!"); 

System.out.println("안녕\n자바!")

// result
Hello World!
        
안녕 자바!
안녕 자바!
        
안녕
자바!
        
안녕
자바!
```

### 변수(Variable)
- 변수(값을 담을 수 있는 저장공간)
  - 코드는 오른쪽의 값을 왼쪽에 담는다. 
- 변수의 선언방식
  - 자료향 변수명 = 값;  
```java
// 변수를 선언하면서 값 할당(변수의 초기화 방법중 하나)
int number = 3;
System.out.println(number);

String name = "Java";
System.out.println(name);

// result
3
Java
```

