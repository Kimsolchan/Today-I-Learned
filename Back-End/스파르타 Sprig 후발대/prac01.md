# 스파르타 Spring 후발대
자바 기본기를 다지고 배운 개념들을 복습하기 위해 후발대에 합류했다.
## prac01
```java
package back_end.java.prac_후발대;

import java.util.Scanner;

public class Prac01 {
    public static void main(String[] args) {
        /**  출력하기
         *   1) Hello World!
         *   2) 안녕 자바!
         *   3) 안녕
         *      자바!
         */
        System.out.println("Hello World!");

        System.out.println("안녕 자바!");
        System.out.println("안녕\t자바");

        System.out.println("안녕");
        System.out.println("자바!");
        System.out.println("안녕 \n자바!");

        /** 변수(Variable)
            - 변수 : 값을 담는 저장공간
            - 코드는 오른쪽의 값을 왼족에 담는다.
            - 변수의 선언방식
              - 자료형 변수명 = 값; //변수의 선언과 코드의 흐름 */

        // 정수형 변수선언 및 값 대입(변수의 초기화 중 하나)
        int number = 10;
        System.out.println("number : " + number);

        // 문자열 변수선언 및 값 대입
        String str = "Java";
        System.out.println("str : " + str);

        // 코드는 보통 위에서 아래로 읽는다. 변수의 값이 바뀌면 바뀐 변수값을 출력한다.
        int n1 = 1;
        System.out.println("변수 n1의 값 : " + n1);

        // 변수 n1의 값을 변경한다.
        n1 = 2;
        System.out.println("변수 n1의 값 : " + n1);

        /** 자바 기본자료형
            boolean(참 or 거짓) : 1바이트, 논리값(true => 참, false => 거짓)을 기억한다.
            byte               : 1바이트, 파일 전송 => 파일 다운로드
            char(문자형)        : 2바이트, 문자 1개 => 자바는 UniCode를 사용한다.
            short(정수형)       : 2바이트, -32768 ~ 32767 사이의 정수를 저장할 수 있다.
            int(정수형)         : 4바이트, -2147483648 ~ 2147483647 사이의 정수를 저장할 수 있다.
            long(정수형)        : 8바이트, -2의 63승 ~ 2의 63승 -1 사이의 정수를 저장할 수 있다.
            float(실수형)       : 4바이트, 소수점 아래로 6자리 정도를 표현한다.
            double(실수형)      : 8바이트, 소수점 아래로 16자리 정도를 표현한다. **/

        // 정수형 변수
        int a = 10;
        System.out.println("정수형 변수 a : " + a);

        // 실수형 변수(float 형은 값의끝에 F를 사용한다.)
        float b = 20.234F;
        System.out.println("실수형 변수 b : " + b);

        // 문자형 변수
        char c = 'c';
        System.out.println("문자형 변수 c : " + c);

        // 문자열 변수
        String str2 = "문자열";
        System.out.println("문자열 변수 str2 : " + str2);

        /** 자료형의 출력 범위 **/
        // 정수형의 최대 출력 범위
        System.out.println("정수형의 최대 출력 범위 : " + Integer.MAX_VALUE);

        // 정수형의 최소 출력 범위
        System.out.println("정수형의 최소 출력 범위 : " + Integer.MIN_VALUE);

        // 실수형의 최대 출력 범위
        System.out.println("실수형의 최대 출력 범위 : " + Float.MAX_VALUE);

        // 실수형의 최소 출력 범위
        System.out.println("실수형의 최소 출력 범위 : " + Float.MIN_VALUE);

        /** 산술 연산자 : +, -, *, /, % **/
        int num1 = 20;
        int num2 = 5;

        System.out.println("더하기 : " + (num1 + num2));
        System.out.println("빼기 : " + (num1 - num2));
        System.out.println("곱하기 : " + (num1 * num2));
        System.out.println("나누기(몫) : " + (num1 / num2));
        System.out.println("나누기(나머지) : " + (num1 % num2));

        /** num1 += num2 == num1 = num1 + num2 **/
        System.out.println("num1 += num2 : " + (num1 += num2));

        /** num1 -= num2 == num1 = num1 - num2 **/
        System.out.println("num1 -= num2 : " + (num1 -= num2));

        /** num1 /= num2 == num1 = num1 / num2 **/
        System.out.println("num1 /= num2 : " + (num1 /= num2));

        /** num1 %= num2 == num1 = num1 % num2 **/
        System.out.println("num1 %= num2 : " + (num1 %= num2));

        /** 상수(Constant)
            - 변수와 마찬가지로 값을 저장할 수 있는 공간 이지만
              변수와 달리 한번 값을 저장하면 다흔 값으로 변경할 수 없다.

            상수를 선언하는 방법
            final int FINAL_NUMBER = 100;
         **/

        /** 상수 선언 **/
        final int FINAL_NUMBER = 100;
        System.out.println("상수 FINAL_NUMBER : " + FINAL_NUMBER);

        // FINAL_NUMBER = 200; : Error

        /** 괸계 연산자 : 연산 결과는 참(true) or 거짓(false) **/
        boolean y = true;
        boolean n = false;
        System.out.println("y==n : " + (y==n));

        int age = 19;
        System.out.println("is adult : " + (age >19));

        System.out.println("id kid : " + (age <=19));


        /** Scanner
            - 자바에서 화면으로부터 데이터를 입력받는 기능을 제공하는 클래스
            - java.util 패키지 내에 존재하는 클래스로서 정수, 실수,문자열과 같은 기본저깅ㄴ 데이터 타입 입력을 받는다. **/

        // Scanner 클래스의 객체 sc 선언
         Scanner sc = new Scanner(System.in);

        // Scanner 사용 예시
        System.out.println("당신이 사는 도시는? : ");
        String city = sc.nextLine();
        System.out.println("사용자는 " + city + "에 살고 있습니다.");

        /** 퀴즈 1. 세 개의 숫자를 각각 변수로 선언하고 세 수의 총합을 출력하시오 **/
        int number1 = 10, number2 = 20, number3 = 30;
        System.out.println("세 수의 총 합 : " + (number1 + number2 + number3));

        /** 퀴즈 2. 스캐너를 통해 가로와 세로를 입력받아 사각형의 넓이를 구하시오 **/
        System.out.println("가로 : ");
        int width = sc.nextInt();
        System.out.println("세로 : ");
        int height = sc.nextInt();
        System.out.println("사각형의 넓이 : " + (width * height));

        /** 퀴즈 3. 스캐너를 통해 나이를 입력받아 내년 나이를 구하시오 **/
        System.out.println("나이 : ");
        int myAge = sc.nextInt();

        int nextAge = myAge + 1;
        System.out.println("내년 나이 : " + nextAge + "살");

        /** 퀴즈 4. 두수를 입력받아 몫과 나머지를 구하시오 **/
        System.out.println("첫 번째 수 : ");
        int firstNumber = sc.nextInt();
        System.out.println("두 번째 수 : ");
        int lastNumber = sc.nextInt();

        System.out.println("두 수의 몫 : " + (firstNumber / lastNumber));
        System.out.println("두 수의 나머지 : " + (firstNumber % lastNumber));
    }
}
```

