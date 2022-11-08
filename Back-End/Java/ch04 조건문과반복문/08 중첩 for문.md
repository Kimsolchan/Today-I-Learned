# 중첩 for문
- for문 안에 또 다른 for문을 포함시키는 것이 가능하며, 이것을 중첩 for문이라 부른다.
- 중첩 횟수는 거의 제한이 없다.

중첩 for문을 공부할때 가장 대표적인 방법이 '별찍기' 라고 한다.

## 별찍기
5행 5열의 별(*)을 찍기 위해선 어떻게 해야 할까?
```java
System.out.println("*****");
System.out.println("*****");
System.out.println("*****");
System.out.println("*****");
System.out.println("*****");
```
이렇게 쉽게 만들 수 있지만 만약 100행 100열의 별을 찍으라 할 경우 위 방법은 비효율적이다.

일반 for문을 사용하여 만들어 보았다.
```java
        for(int i=1; i<= 5; i++){
            System.out.println("*****");
        }
    }

        *****
        *****
        *****
        *****
        ***** 
```
여기서 반복되는 곳이 있다. 바로 ```System.out.println("*****");``` 이다.

```System.out.println("*****");``` for문으로 바꿔보았다.
```java
        for (int j = 1; j <= 5; j++) {
        System.out.print("*");
        }
        System.out.println();

        *****
```

같은 원리로 일반 for문으로 작성한 코드를 이전 for문에 넣으면 중첩 for문이 된다.
```java
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        *****
        *****
        *****
        *****
        *****        
```

## 삼각혐 만들기
중첩 for문을 공부하는 대표적인 예제가 더 있다. 바로 '삼각형 만들기'다.
- 목표
```java
*
**
***
****
*****
```

위에서 배운 것처럼 가로로 출력하려면 ```print``` 메서드로 출력을 한다.

- 아래의 for문은 '**'을 출력하고 줄바꿈을 한다.
```java
 for(int i=1; i<=3; i++){
            System.out.print("*"); // *** 출력
        }
        System.out.println(); // 줄바꿈 처리

***
```

- 아래와 같이 코드를 작성하면 원하는 결과를 얻는다.
```java
        for(int j=1; j<=1; j++){
            System.out.print("*");
        }
        System.out.println();
        
        for(int j=1; j<=2; j++){
            System.out.print("*");
        }
        System.out.println();
        
        for(int j=1; j<=3; j++){
            System.out.print("*");
        }
        System.out.println();
        
        for(int j=1; j<=4; j++){
            System.out.print("*");
        }
        System.out.println();
        
        for(int j=1; j<=5; j++){
            System.out.print("*");
        }
        System.out.println();
```
조건식의 숫자만 변할 뿐, 나머지 코드의 내용은 같다. 이럴 경우 한 문장의 조건식에 

숫자 대신 변수(i)를 사용하고, 위 코드를 i의 값이 

1 부터 5까지 증가하는 for문 안에 넣으면 된다.

```java
        for(int i=1; i<=5; i++){
           for(int j=1; j<=i; j++){
               System.out.print("*");
           }
            System.out.println();
        }

        *
        **
        ***
        ****
        *****
```