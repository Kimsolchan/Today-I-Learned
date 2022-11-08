# for-each문
배열 or collection 처럼 어떤 것의 나열들이 있는 변수가 있을 때 

이것을 이용하여 반복문을 쉽게 짤 수 있는 형태다.

String 타입의 배열을 하나 만들어보았다.
```java
String[] fruits = {"apple", "grape", "peach"};
```

위 배열의 값들을 하나씩 출력을 하고 할 때(반복) for-each문을 사용하면 쉽게 사용할 수 있다.
```java
for(String fruit: fruits){
    System.out.println(fruit);
}

apple
grape
peach
```
String 배열 fruits에 있는 값을 하나씩 꺼내서 String타입의 fruit 변수에 할당하고 

한 번씩 출력하겠단 뜻.
