# do-while문
do-while문은 while문의 변형으로 조건식과 블럭{}의 순서를 바꿔 놓은 것이다.

그래서 while문과 반대로 블럭{}을 먼저 수행한 후에 조건식을 확인한다.

while문은 조건식에 따라 코드가 한번도 실행되지 않을 수 있지만 

do-while문은 한번은 무조건 실행된다.

## do-while문 기본 구조
```java
do{
    // 조건식의 연산결과가 참일 때 실행할 문장(한번은 무조건 실행됨)
        } while(조건식);
```

do-while문은 많이 사용하지는 않지만, 반복적으로 사용자로부터 입력을 받아 

결과를 처리해야할 상황에서 유용하게 사용된다.



## do-while문 예시
### 게임 : 컴퓨터와 같은 숫자 입력하기 
규칙
1. 사용자는 1 ~ 50 사이의 숫자를 생각하여 입력한다.
2. 컴퓨터가 정한 숫자와 사용자가 입력한 숫자가 같을 경우 게임에서 승리한다.

필요한 기능
1. 화면으로 부터 입력을 받아야 한다.(Scanner 기능)
2. 컴퓨터가 임의 수를 정할 수 있어야 한다.(Math.random())
3. do-while 문 + if문

코드
```java
package back_end.sparta_java.ch04_조건문과반복문.연습;

import java.util.Scanner; // Scanner를 사용하기 위해 불러왔다.

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Scanner 클래스의 객체를 생성한다.
        int num = 0, pc = 0, retry = 3;

        pc = (int) (Math.random() * 50) + 1; // 1 ~ 50 사이의 임의의 수를 저장한다.

        System.out.println("== Game Start! ==");
        System.out.println("규칙 : 컴퓨터가 고른 숫자와 같은 숫자를 입력하면 승리!");

        do {
            System.out.println("1 ~ 50 사이의 점수를 입력하세요 : ");
            num = scanner.nextInt(); // 정수를 입력받아서 변수 num에 저장한다.

            if (num <= 0 || num >= 100) {
                System.out.println("다시 입력하세요!");
            } else if (num > pc) {
                System.out.println("숫자를 작게 입력해보세요!");
            } else if (num < pc) {
                System.out.println("숫자를 크게 입력해보세요!");
            }
        } while (num != pc) ;
        System.out.println("정답입니다.");
    }
}

== Game Start! ==

규칙 : 컴퓨터가 고른 숫자와 같은 숫자를 입력하면 승리!
1 ~ 50 사이의 점수를 입력하세요 :
25
숫자를 작게 입력해보세요!
 1 ~ 50 사이의 점수를 입력하세요 :
20
숫자를 작게 입력해보세요!
1 ~ 50 사이의 점수를 입력하세요 :
15
숫자를 크게 입력해보세요!
1 ~ 50 사이의 점수를 입력하세요 :
18
숫자를 작게 입력해보세요!
1 ~ 50 사이의 점수를 입력하세요 :
17
숫자를 작게 입력해보세요!
1 ~ 50 사이의 점수를 입력하세요 :
16
정답입니다.
```
코드를 작성하면서 느낀점
- 정해진 횟수 안에 정답을 맞추지 못할 경우 코드가 종료되는 기능을 추가하고 싶다.
- Scanner 와 Math.Random 의 개념을 자세히 정리해야겠다.