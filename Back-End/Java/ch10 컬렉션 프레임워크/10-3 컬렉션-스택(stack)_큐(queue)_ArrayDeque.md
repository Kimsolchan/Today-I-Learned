# 스택(stack)_큐(queue)_ArrayDeque

## 스택(stack)
- 스택은 마지막에 저장한 데이터를 가장 먼저 꺼내는 **자료구조**다.
    - ``` LIFO(Last In First Out)```라고 한다.

### 스택 예시
- 웹브라우저의 앞페이지 이동 뒤페이지 이동
- 그릇 쌓기

아래 그림을 보면 먼저 삽입된 값인 17이 가장 아래로, 이후 삽입되는 값은 그 위에

쌓이기 시작한다. 이후 ```pop()```을 통해 값을 반환할 때도 

마지막에 삽입된 45가 가장 먼저 반환된다.

![01](https://user-images.githubusercontent.com/108924832/203293253-4569ab46-6740-4c7c-a25d-75a1dc83e58d.PNG)


```java
// Main
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        System.out.println(stack);

        // Stack의 가장 상단 값을 출력한다.(삭제는 하지 않습니다)
        System.out.println(stack.peek());
        // stack 가장 상단 값을 반환한다(삭제한다.)
        stack.pop();
        System.out.println(stack);
        // stack.size(); : stack의 크기를 반환한다
        System.out.println(stack.size());
        // stack 에 5라는 값이 있으면 true , 없으면 false 를 반환한다.
        System.out.println(stack.contains(5));
        // stack 이 비어있으면 true , 비어있지 않으면 false 를 반환한다.
        System.out.println(stack.empty());
        System.out.println(stack);
    }
}

// 결과
[1, 3, 5, 7]
7
[1, 3, 5]
3
true
false
[1, 3, 5]
```
- stack.push(value); : stack에 값 추가
- stack.peek(); : stack에 가장 상단 값을 출력(값을 삭제하진 않는다)
- stack.pop(); : stack에 가장 상단 값을 출력(값 삭제)
- stack.size(); : stack의 크기를 반환한다.
- stack.contains(value) : stack에 값이 있으면 true, 없으면 false 반환
- stack.empty(); : stack이 비어있으면 true, 비어있지 않으면 false를 출력한다.

## 큐(queue)
- 큐는 처음에 저장한 데이터를 가장 먼저 꺼내게 되는  **자료구조**다.
   - ```FIFO(First In First Out)``` 라고 한다.

### 큐 예시
- 은행 창구 줄서기
- 인쇄작업 대기목록

아래 그림을 통해 자세히 확인해보자. 큐는 양 쪽 끝의 통로가 뚫려있다 생각하면 된다.

```가장 먼저 들어온 Data```가 반환이 될때도 가장 먼저 반환되는 것이다.

큐는 **우선순위 큐**, **원형 우선순위 큐**, **원형 큐** 등 다양하게 존재한다.

![02](https://user-images.githubusercontent.com/108924832/203309041-f3b43abd-1a10-449b-b55e-7fb6d961aece.PNG)
```java
// Main
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // 데이터 구조 자체가 없기 때문에 구조가 비슷한 LinkedList 로 선언한다.
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
          queue.add(7);
        System.out.println(queue);
        // queue.poll(); : Queue에서 객체를 꺼내서 반환
        System.out.println(queue.poll());

        queue.add(11);
        queue.add(12);
        queue.add(9);

        System.out.println(queue);
        // queue.peek(); : Queue 에서 삭제 없이 요소를 반환한다.
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}

// 결과
[1, 3, 7]
1
[3, 7, 11, 12, 9]
3
[3, 7, 11, 12, 9]
```
- queue.add(value); : 큐에 값 추가
- queue.poll(); : Queue에서 객체를 꺼내서 반환(꺼낸 값은 삭제됨)
- queue.peek(); : Queue 에서 객체를 꺼내서 반환(꺼낸 값은 삭제되지 않음)

##  ArrayDeque
실무에서는 단순히 Stack, Queue 클래스 대신 ```ArrayDeque```를 많이 사용한다.

기본 Stack, Queue 의 기능을 모두 포함하면서도 서능이 더 좋기 때문이다.

### deque
앞서 정리한 큐(Queue)는 ```한쪽에서만 값이 삽입```되고

다른 한쪽에서는 값을 반환하는 자료구조였다.

하지만 ```deque```의 경우 ```양 끝에서 삽입과 반환이 가능```하다.

![03](https://user-images.githubusercontent.com/108924832/203335417-b7489af7-05c3-437c-9f2b-1c80d3cd9ce7.PNG)
- deque 예시
```java
// Main

// 결과
import java.util.Deque;

public class ArrayDeque {
  public static void main(String[] args) {
    // Integer 타입으로 Deque 선언
    Deque<Integer> deque = new java.util.ArrayDeque<Integer>();

    // addFirst() : Deque의 맨 앞에 데이터를 삽입한다. 용량을 초과하는 경우 Exception이 발생한다.
    deque.addFirst(10);
    deque.addFirst(20);
    deque.addFirst(30);
    deque.addFirst(40);
    System.out.println(deque); // [40, 30, 20, 10]

    // addLast() : Deque의 맨 뒤에 데이터를 삽입한다. 용량을 초과하는 경우 Exception이 발생한다.
    deque.addLast(0);
    System.out.println(deque); // [40, 30, 20, 10, 0]

    // offerFirst() : Deque의 맨 앞에 데이터를 삽입한다. 용량을 초과하는 경우 false를 리턴해준다.
    deque.offerFirst(50);
    System.out.println(deque);

    // offerLast() : Deque의 맨 뒤에 데이터를 삽입한다. 용량을 초과하는 경우 false를 리턴해준다.
    deque.offerLast(-1);
    System.out.println(deque); // [50, 40, 30, 20, 10, 0, -1]

    // size() 메서드 : Deque 안의 데이터의 갯수를 출력한다.
    System.out.println(deque.size()); // 7

    // removeFirst() : 첫번째 부터 순서대로 값을 제거하면서 그 값을 리턴한다 , deque가 비어있다면 Exception을 출력한다.
    System.out.println(deque.removeFirst());

    // removeLast() : 마지막 값을 제거하면서 그 값을 리턴 , deque가 비어있으면 Exception 리턴
    System.out.println(deque.removeLast());
    System.out.println(deque);
    System.out.println(deque.size()); // 5

    // pollFirst() : 첫번째 값을 반환 및 제거하면서 그 값을 리턴 , deque가 비어있다면 null을 리턴한다.
    System.out.println(deque.pollFirst());
    System.out.println(deque);
    System.out.println(deque.size()); // 4

    // pollLast() : 마지막 값을 반환 및 제거하면서 그 값을 리턴, deque가 비어있다면 null을 리턴한다.
    System.out.println(deque.pollLast());
    System.out.println(deque);
    System.out.println(deque.size()); // 3

    // peekFirst() : 첫번째 값을 반환, 값을 제거하지는 않는다.
    System.out.println(deque.peekFirst());

    // peekLast() : 마지막 값을 반환, 값을 제거하지는 않는다.
    System.out.println(deque.peekLast());
    System.out.println(deque.size()); // 3
  }
}

// 결과
[40, 30, 20, 10]
[40, 30, 20, 10, 0]
[50, 40, 30, 20, 10, 0]
[50, 40, 30, 20, 10, 0, -1]
7
50
-1
[40, 30, 20, 10, 0]
5
40
[30, 20, 10, 0]
4
0
[30, 20, 10]
3
30
10
3
```


