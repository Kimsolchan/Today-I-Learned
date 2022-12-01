# JVM 구조, 메모리와 코드의 흐름
### 목표
#### 1. JVM 구조를 파악
#### 2. Java 코드의 메모리 흐름
#### 3. 실습 코드를 통한 개념 정리 및 복습

### 확인사항
#### 1. Java 코드의 실행과정을 이애한다.
#### 2. JVM 구조 정리
#### 3. 코드와 메모리를 연관 지어 설명할 수 있어여 한다.

# JVM(Java Virtual Machine) 이해하기
## JVM이란
- 직역 : ```자바를 실행하기 위한 가상 머신(컴퓨터)```
- Virtual Machine(가상 머신(컴퓨터))
  - 실제 컴퓨터(하드웨어)가 아닌 소프트 웨어로 구성된 컴퓨터(컴퓨터 안에 컴퓨터)
```
자바로 작성된 애플리케이션(main 함수 하위에서 작동되는 모든 것) 은 
모두 가상 컴퓨터(JVM) 에서만 실행되기 떼문에 자바 애플리케이션이 
실행되기 위해서는 반드시 JVM이 필요하다.
```

## JVM에서 코드가 실행되는 과정
![JVM 동작 구조](https://user-images.githubusercontent.com/108924832/204783526-12654f51-9a3b-4128-a100-ba1bcc030f88.PNG)
```
1. App.java(소스 코드)를 작성한다.
2. 컴파일러는 자바 소스코드를 이용하여 클래스 파일을 생성한다. 
   -> 컴파일된 클래스 파일은 JVM이 인식할 수 있는 바이트 코드 파일
3. JVM은 클래스 파일의 바이트 코드를 해석하여 바이너리 코드(기계어)로 변환하고 프로그램을 수행한다.
4. App.java 수행 결과가 컴퓨터에 반영된다.   
```

변환된 ```bytecode```는 기계어가 아니라서 OS에서 바로 실행되지 않는다.

이때, ```VM```이 OS가 bytecode를 이해할 수 있도록 해석해준다.

따라서 Byte Code는 JVM 위에서 OS 상관없이 실행될 수 있는 것이다.

OS에 종속적이지 않고, Java 파일 하나만 만들면 어느 디바이스든 JVM 위에서 실행할 수 있다.

## 용어 정리
### **컴파일(Compiler)**
어떤 프로그래밍 언어로 쓰여진 소스 파일을 다른 프로그래밍 언어로 바꿔주는 과정

-> 위 과정을 자동으로 수행해주는 소프트웨어를 컴파일러라 부름

### **자바 컴파일러(Java compiler)**
JDK를 설치하면 bin 폴더애 존재하는 ```javac.exe(실행 파일)```를 말하며

JDK에 Java compiler가 포함되어 있다, 자바 컴파일러는 자바를 가지고 작성한

자바 소스 코드를 자바 가상 머신이 이해할 수 있는 바이트 코드로 변환한다.

### **바이트 코드(bytecode)**
자바 가성 머신이 이해할 수 있는 언어로 변환된 자바 소스 코드를 의미한다.

자바 컴파일러에 의해 변환되는 코드의 명령어 크기가 1바이트라서 바이트 코드가 불린다.

확장자는 ```.class``` 며, JVM만 설치되어 있으면 어디서든 실행 가능하다.

```OS에 독립적```이라 할 수 있는 이유는 예를 들어 C 프로그램은 바로 ```기계어```로 컴파일하므로

OS 운영체제에 맞게 컴파일 되어야 하는 번거로움이 있다.(```OS에 종속적이다```)

반면 Java 프로그램은 중간 단계 언어(```바이너리 코드(기계어)```)로 컴파일 하여 

JVM만 각 OS만 설치되어 있다면 OS에 상관없이 한 번만 컴파일하면 된다.

### **바이너리 코드**
컴퓨터가 인식할 수 있는 0과 1로 구성된 이진코드를 말한다.

### **기계어**
0 과 1로 이루어진 바이너 코드다

기게어가 이진코드로 이루어졌다고 해서 모든 이진코드가 기계어는 아니며

특정한 언어가 아니라 ```CPU가 이해하는 명령어 집합```이다(CPU 제조사마다 기계어가 다를 수 있음)
```
CPU가 이해하는 언어 : 바이너리 코드

JVM이 이해하는 코드 : 바이트 코드
```

## JDK 구조
### JDK(Java Development Kit)
JDK(Java Development Kit, 자바 개발 키트)

-> 자바 개발자들이 자바로 개발하는 데 사용되는 ```SDK 키트```를 ```JDK```라고 한다.

### JDK 구성 요소
![JDK 구조](https://user-images.githubusercontent.com/108924832/205002586-b0f5634f-7f78-405f-9d51-9d96a2192625.jpg)

- 자바 개발 시 빞요한 라이브러리들
- javac, javadoc 등의 개발 도구들
- 자바 프로그램을 실행시킬 ```JRE(Java Runtime Environment)```

## 용어정리
### SDK(Software Development Kit (소프트웨어 개발 키트)
- 하드웨어 플랫폼, 운영체제 또는 프로그래밍 언어 제작사가 제공하는 툴
  - 키트의 요소는 제작사마다 다르다.
  - SDK를 활용하여 애플리케이션을 개발할 수 있다.
- ex) : 안드로이드 스튜디오 등등 ....

오라클은 자바 11부터 JDK 만 제공한다고 한다.(https://docs.oracle.com/javase/8/docs/)

## JRE (Java Runtime Environment)
자바 프로그램을 실행(동작)시킬 떼 필요한 라이브러리 API를 함께 묶어서 배포되는 패키지다.

이외에도 자바 런타임 환경에서 사용하는 프로퍼티 세팅이나 리소스 파일(jar 파일)을 가지고 있다.

JRE는 기본적으로 JDK에 포함되어 있기 때문에 JDK를 설치하면 함께 설치된다.

기존에는 개별적으로 설치가 가능했지만 JDK11 버전부터는 따로 제공되지 않는다고 한다.

- Java로 프로그램을 직접 개발하려면? : JDK
- 컴파일된 JAVA 프로그램을 실행시키려면? : JRE

# 메모리와 실행 엔진

## JVM이 사용하는 메모리 영역

## JVM 구조
- 클래스 로더 서브시스템
  - .class 에서 바이트코드를 읽고 메모리에 저장.


- 메모리
  - 메소드 영역(Method Area)
  - 힙 영역(Heap) : 객체를 저장
  - 스택(Stack) : 스레드마다 런타임 스택을 만들고, 스택 프레임이라 부르는 블록을 쌓는다.


- Execution Engine(실행엔진)
  - JIT 컴파일러가 반복되는 코드를 재사용해서 속도를 높인다
  - GC : 더이상 참조되지 않는 객체를 모아서 정리한다.
```

```

- JNI(Java Native Interface)
  - C, C++, 어셈블리로 작성된 함수를 사용할 수 있는 방법 제공한다.
  - 자바에서 기본으로 제공되는 메서드에 native 키워드를 가 붙은 친구다


- Native Method Libraries(네이티브 메소드 라이브러리)
  - C, C++로 작성된 라이브러리.


- 그 밖에 
  - 오라클 JVM : https://www.oracle.com/webfolder/technetwork/tutorials/obe/java/gc01/index.html
  - JVM 더 자세히 알아보기 : https://dzone.com/articles/jvm-architecture-explained

## 클래스 로더와 static 영역
![클래스 로더와 static 영역](https://user-images.githubusercontent.com/108924832/205055535-da832bac-5ff9-44ec-ba70-1fb11a12800c.PNG)

## 클래스 로더 시스템

- Loading 
  -  클래스 로더가 .class 파일을 읽고 데이터를 ```Method Area``` 영역에 저장
  - 메소드 영역에 저장하는 데이터들
    - FQCN(Fully Qualified Class Name) : package를  포함한 Class이름( java.lang.String)
    - 클래스 | 인터페이스 | 이늄
    - 메소드와 변수


- Linking 
  - 참고(https://dzone.com/articles/jvm-architecture-explained)


- Initialization 
  - ```Static``` 붙은 친구들 초기화. static 블럭 실행 

### 실습 코드로 확인하기
```java
// class
public class Practice {
  public static String STATIC_MESSAGE = "나는 test입니다.";

  static {
    System.out.println("저는 로딩입니다."); // 1번
    System.out.println(STATIC_MESSAGE + "2"); // 2번
  }
}

// Main
public class Main {
  public static void main(String[] args) {
    String staticMessage = Practice.STATIC_MESSAGE;

    System.out.println("안녕?"); // 3번

    System.out.println(staticMessage); // 4번
  }
}

// result
저는 로딩입니다.
나는 test입니다.2
안녕?
나는 test입니다.
```
- 해석
```java
클래스 로더 시스템에 의해서 .class 파일이 Method 영역에 저장된다.

따라서 Main 함수를 실행하면 .class 파일 안에 코드가 먼저 실행되고

그 다음 Main 함수 안에 코드가 실행되는 것이다.
```

## 메모리 영역
![클래스 로더와 static 영역](https://user-images.githubusercontent.com/108924832/205083540-706b6215-7888-4917-9ccc-05b194baa273.PNG)


### 자세히 알아야 할 데이터 영역
- Method Area : 클래스 영역 or 스태틱 영역 이라 부른다.
- Stack 영역 : Thread 영역이라고 한다.
- 메모리를 이용하는 방식
  - **가장 간단하게 프로그램이 메모리를 사용하는 방식**
    ![가장 간단하게 프로그램이 메모리를 사용하는 방식](https://user-images.githubusercontent.com/108924832/205084914-71a82621-03a7-4e46-9130-3c77327ac6bf.PNG)

  - **데이터 저장 영역 세분화**
    ![데이터 저장 영역 세분화](https://user-images.githubusercontent.com/108924832/205085002-585b78a5-4678-4cc5-9c56-03457081cf54.PNG)

    스태틱(Static) 영역 : 클래스와 static...
   
    스택(Static) 영역 : 메서드들

    힙(Heap) 영역 : 객체(Instance)들

### ```main(String[] args)```
- Java 프로그램을 실행하기 위한 진입점. 프로그램에 이미 세팅되아있다.(조작 가능)
1. JRE는 psvm 메서드가 있는지 먼저 찾는다.
2. psvm 존재 == true → JRE 는 JVM 부팅
3. 부팅된 JVM은 바이트파일(.class) 실행
```
JVM 전처리 java.lang 패키지 로드 : 데이터 저장 영역의 Static 영역에 올린다.
→ System.out.println() 같은 메서드를 쓸 수 있게 되는 것.
```
#### java.lang 패키지에 뭐가 들어있는지 확인하자!

![데이터 저장 영역0](https://user-images.githubusercontent.com/108924832/205088716-f71e2da2-0987-4b24-95a1-dd36e1293c44.PNG)

4. 개발자가 작성한 클래스와 import package를 데이터 저장 영역의 Static 영역에 올린다.

![데이터 저장 영역](https://user-images.githubusercontent.com/108924832/205089012-319d62a8-1cf2-45c0-92cc-93bb35245624.PNG)

5. 데이터 저장 영역의 Stack 영역에 main() 스택 프레임이 올라간다.

![데이터 저장 영역2](https://user-images.githubusercontent.com/108924832/205089315-395f39b5-a04c-4006-9143-1936b895168e.PNG)

#### 자바의 기본 메서드

https://www.digitalocean.com/community/tutorials/public-static-void-main-string-args-java-main-method

## 추가로 공부한 개념들
### 실행 엔진 , GC(Garbage Garbage Collector(가비지 컬렉터))

### 실행 엔진
- 인터프리터(interpreter)
```
프로그래밍 언어의 소스 코드를 바로 실행하는 컴퓨터 프로그램 또는 환경을 말한다. 

원시 코드를 기계어로 번역하는 컴파일러와 대비된다.
```

- JIT(Just In Time) 컴파일러 : https://aboullaite.me/understanding-jit-compiler-just-in-time-compiler/
```
바이트코드(컴파일된 자바코드)를 컴퓨터 프로세서(CPU)로 직접 보낼 수 있는 
 
명령어(기계어)로 바꾸는 프로그램을 말한다.
 
JIT 컴팡일러에 의해서 인터프리터 언어보다 실행 속도가 느린 Java(컴파일러 언어)의 단점을 

완화시켜 주게 되었다. 
```

- Garbage Collector(가비지 컬렉터)
```
메모리 관리 방법 중에 하나로, 시스템에서 더이상 사용하지 않ㅎ는 동적으로 할당된 

메모리 블럭을 찾아 자동으로 다시 사용 가능한 자원으로 회수하는 것으로 시스템에서

가비지컬렉션을 수행하는 부분을 가비지 컬렉터라 부른다.

C언어는 프로그래머가 메모리를 할당한 뒤 수동으로 해제까지 스스로 해줘야 한다.

해제를 하지 않아 메모리 누수가 생기거나 해제됬던 메모리를 다시 사용하는 실수 등, 버그가 양산된다.

이러한 문제를 해결하기 위해 제시된 것이 가비지 컬렉션이다.
```
쉽게 정리된 블로그 : https://www.yalco.kr/04_garbage_collector/

자세히 알아보기 : https://velog.io/@recordsbeat/Garbage-Collector-%EC%A0%9C%EB%8C%80%EB%A1%9C-%EC%95%8C%EA%B8%B0

