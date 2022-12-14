# 조건문(if , elif)
## 제어문
제어문이란 프로그래밍 언어에서 실행순서를 변경시키거나 

또는 조건에 따라 실행해야 할 명령문을 제어하는데에 사용되는 구문이다. 

일반적으로 프로그램은 위에서 아래로 순차적으로 실행되지만, 

어떤 조건에 대해서만 실행해야 하는 경우나 특정 부분을 반복하여 실행해야 하는 경우 등이 있다.

python에서는 if, for, while문을 사용하여 흐름을 제어할 수 있다.

## if문
조건을 만족했을 때만 특정 코드를 실행하도록 하는 문법
- if문 기본 구조
```python
if 조건문:
    조건이 만족했을 때 실행할 문장1
    조건이 만족했을 때 실행할 문장2
    ...
else:
    조건의 연산결과가 거짓(false)일 경우 실행할 문장1
    조건의 연산결과가 거짓(false)일 경우 실행할 문장2
    ...
```
조건문을 테스트해서 참(true) 이면 if문 바로 다음 문장(if블록)들을 수행하고

조건문이 거짓이면 else문 다음 문장(else 블록)들을 수행하게 된다.

### if문 예시
조건 : 가지고 있는 돈이 3000원 이상일 경우 버스를 타고 , 그렇지 않으면 걸어 가라.
```python
money = 5000

if money >= 3000:
    print("버스를 타고 가라")
else:
    print("걸어 가라")    

버스를 타고 가라
```
파이썬에서는 어디까지 구문에 포함되는지를 들여쓰기로 구분하기 때문에

들여쓰기를 주의해야 한다.
```python
money = 5000

if money >= 3000:
print("버스를 타고 가라") # 들여쓰기를 지키지 않아 Error 발생
else:
    print("걸어 가라")

IndentationError: expected an indented block
```

## 다양한 조건을 판단하는 elif
if 와 else만으로는 다양한 조건을 판단하기 어렵다. 

아래와 같은 조건은 if 와 else 만으로 표현하기 힘들다.
```python
1. 주머니에 돈이 있으면 택시를 타라
2. 주머니에 돈은 없지만 카드가 있으면 택시를 타라.
3. 돈도 없고 카드도 없으면 걸어가라.
```
if 와 else 만으로 위 문장을 표현하려면 아래와 같다.

### if & else 만으로 표현한 코드
```python
poket = ["paper" , "cellphone"]

card = True

if "money" in poket:
    print("택시를 타고 가라.")
else:
    if card:
        print("택시를 타고 가라")
    else:
        print("걸어가라")

택시를 타고 가라
```
이해하기 어렵고, 가독성이 떨어지는 단점이 있다.

파이썬애서는 복잡함을 해결하기 위해 elif를 사용한다.

### elif을 사용하여 표현한 코드
```python
poket = ["paper" , "cellphone"]

card = True

if "money" in poket: # 주머니(poket)에 돈("money")이 있으면
    print("택시를 타고 가라") # 택시를 타고 가라 문장 출력
elif card:  # 주머니에 돈이 없고 , 카드가 있으면
    print("택시를 타고 가라") # 택시를 타고 가라 출력
else:    # 주머나에 돈도 없고 카드도 없으면
    print("걸어 가라")  # 걸어가라 출력

택시를 타고 가라
```
elif는 이전 조건문이 거짓일 때 실행된다. elif의 기본 구조는 아래와 같다.

### elif 기본 구조
```python
if 조건A:
    조건A의 연산결과가 참일때 실행되는 문장1
    조건A의 연산결과가 참일때 실행되는 문장2
    ...
elif 조건B:
     조건A가 거짓이고, 조건B의 연산결과가 참일때 실행되는 문장1
     조건A가 거짓이고, 조건B의 연산결과가 참일때 실행되는 문장2
     ...
else:
    위 조건이 모두 거짓일 경우 실행되는 문장1
    위 조건이 모두 거짓일 경우 실행되는 문장2
    ...
```
elif 문은 중복 사용이 가능하다.