# 변수의 타입(Data type)
변수에 저장하는 값에 따라 변수의 타입이 결정된다.

변수의 타입은 ```기본형(Primitive type)``` 과 ```참조형(Reference type)``` 으로 나눠진다.

## 기본형(Primitive type)
자바에서 기본형은 8가지가 존재한다.

- 정수형(integer) : 정수 값의 데이터를 저장할 때 사용
  - byte : 이진데이터를 다룬다.
  - short : c언어와의 호환을 위해 추가되었다.
  - int
  - long(저장할 값이 20억이 넘는 경우 사용)


- 실수형(floating-point number) : 실수형 데이터를 저장할 때 사용
  - float
  - double


- 문자형(character) : 문자(단어 한 개)형 데이터를 저장할 때 사용
  - char


- 논리형(boolean) : 참(true) or 거짓(false) 중 하나의 값을 저장한다.
  - 논리형은 주로 조건식 , 논리적 계산에 사용된다. 
  - true(참)
  - false(거짓)

변수의 타입이 기본형인 경우 ```변수는 실제 값을 저장 한다.```

### 기본형의 종류와 범위를 표로 나타내면 다음과 같다.

![01](https://user-images.githubusercontent.com/108924832/211294234-cea13c42-a048-4d2f-85b4-1185d7995972.PNG)



## 참조형(Reference type)
참조형은 기본형을 제외한 나머지 타입이다.

- 예 : 문자열(String) , 시스템(System)등등...

### 기본형과 참조형의 차이
- 기본형 : 실제 값을 저장


- 참조형 : 객체의 위치를 알려주는 객체의 주소값을 저장
  - 객체의 주소값 : 메모리 주소(memory address)

자바에서 새로운 클래스를 정의하면 새로운 참조형이 하나 생성되는 것이다.

객체를 생성하고, 생성된 객체의 주소를 참조형 변수에 저장해서 객체를 다룰 수 있게 되는 것이며,

기본형 변수들은 타입에 따라서 크기가 다르지만, 모든 참조형 변수는 4 byte로 동일하다.

그래서 참조형이 가질수 있는 값의 범위를 

16진수로 표시하면 ```0 ~ ffffffff(에프 * 8)….``` 모두 8개의 f가 나오는데.

F는 16진수로 15를 의미하고, 하나의 f는 4bit 이므로 4 X 8 = 32이므로 32비트 즉 4바이트가 된다.

## 데이터 단위
변수의 타입을 공부하면서 데이터의 단위를 알아보고 싶어 정리했다.

### bit(비트)
비트는 데이터의 가장 작은 단위며, 1bit 로 표현할 수 있는 수는 0 과 1 이다.

비트가 8개 모이면 1byte가 된다. 1byte 는 2의 8제곱(256) 의 수를 표현할 수 있다.

### byte(바이트)
정수형인 byte는 1byte , 8bit 다. 8개의 자리 중에서 맨 왼쪽 한자리는 부호자리로 사용한다.

부호자리 값이 0이면 양수 , 1이면 음수다.

그래서 Byte로 표현할 수 있는 값의 범위는 -2의 7제곱(-255) 부터 2의 7제곱 -1(255) 이다.

-1을 하는 이유는 범위에 0이 포함되어 있기 때문이다.

8비트로는 256개의 숫자를 표현할 수 있는데

short 와 char은 둘다 2byte 라서 표현할 수 있는 값의 수가 2의 16제곱(65536) 개다.

char은 문자를 저장하기 위한 타입이지만 실제로는 문자의 코드인 숫자(정수)가 저장된다.

