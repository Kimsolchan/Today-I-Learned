# Bool 자료형
## 불 자료형이란 
참(true) 과 거짓(fasle)을 나타내는 자료형

참과 거짓 2 가지 값만 가질 수 있다.
```python
a = True   # 참
b = False  # 거짓
```

True 나 False는 파이썬의 **예약어**로 true , false와 같이 사용하지 말고

첫 문자를 항상 대문자로 사용해야 한다.

```python
# 소문자로 쓰면 자료형으로 인식하지 않고 변수명이라 생각해 에러가 발생한다.
z = true   # name 'true' is not defined

# True/False는 변수명으로 쓸 수 없다.
True = 1
```

불 자료형은 보통 **비교 연선자** 의 결과로 나타내기 위해 사용한다.
```python
6 > 3      # True  크다
1 < 4      # False 작다
10 >= 5     # True  크거나 같다
5 <= 5     # True  작거나 같다
1 == 1     # False 같다
2 != 7     # True  같지 않다
```

또한 불 자료형은 **논리연산자** 를 이용할 수 있다.
```python
a = 2 > 4  # True
not a      # False    NOT 연산자로 참을 거짓으로, 거짓을 참으로 바꿔준다.

a and b    # False    AND 연산자로 모두 참이어야 참을 반환한다.
a or b     # True     OR 연산자로 둘 중 하나만 참이면 참이다.
```