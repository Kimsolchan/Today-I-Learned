# 문자열 포매팅(Formatting) 과 f-string
## 문자열 포매팅
```python
"현재 온도는 20도입니다."
```

위 문장을 바꿔보자
```python
"현재 온도는 25도입니다."
```
위 두 문자열은 20이라는 숫자와 25라는 숫자만 다르고 모두 같다.

이렇게 **문자열 안에 특정한 값을 바꿔야 할 경우**가 있을 때

이것을 가능하게 해주는 것이 바로 **문자열 포매팅 기법**이다.

## 문자열 포매팅 따라 하기
### 숫자 바로 대입 : %d
```python
a = "I eat %d apples." % 5
print(a)

# 결과
I eat 5 apples.
```
문자열 안에 정수 5를 삽입하는 방법이다.

문자열 안에서 숫자를 넣고 싶은 자리에 ```%d : 문자열 포맷 코드``` 문자를 넣어 주고,

삽입할 숫자 5는 가장 뒤에 있는 % 문자 다음에 써 넣는다.

### 문자열 바로 대입 : %s
```python
a = "I eat %s apples." % "three"
print(a)

# 결과
I eat three apples.
```
문자열 안에 또 다른 문자열을 삽입하기 위해서 %d 가 아닌 ```%s```를 사용했다.

### 숫자 값을 나타내는 변수로 대입
```python
num = 10
a = "I eat %d apples." % num
print(a)

# 결과
I eat 10 apples.
```
숫자를 바로 대입하거나 숫자 값을 나타내는 변수를 대입하나 결과는 같다.

### 2개 이상의 값 넣기
```python
num = 8
day = "two"
a = "I ate %d apples. so I was sick for %s days." % (num, day)
print(a)

# 결과
I ate 8 apples. so I was sick for two days.
```
2개 이상의 값을 넣으려면 마지막 ```%``` 다음 

괄호 안에 ```콤마(,)```로 구분하여 각각의 값을 넣어 주면 된다.

신기한 점은 ```%s``` 포맷 코드다. 이 코드는 어떤 형태의 값이든 변환해 넣을 수 있다.
```python
a = "I have %s apples." % 5
b = "I have %s apples." % "two"
print(a)
print(b)

# 결과
I have 5 apples.
I have two apples.
```
```%s```는 자동으로 % 뒤에 있는값을 문자열로 바꾸기 때문이다.

### %%
포매팅 연산자 %d 와 %를 같이 쓸 때는 %%를 쓴다.
```python
e = "Error is %d%%" % 50
print(e)

# 결과
Error is 50%
```

## f-string(f 문자열 포매팅)
파이썬 3.6 버전부터는 f-string 기능을 사용할 수 있다.

파이썬 3.6 미만 버전에서는 사용할 수 없다.

다음과 같이 문자열 앞에 ```f 접두사```를 붙이면 f-string 기능을 사용할 수 없다.
```python
name = "Python"
age = 25
result = f"나의 이름은 {name} 입니다. 나이는 {age}살 입니다."
print(result)

# 결과
나의 이름은 Python 입니다. 나이는 25살 입니다.
```

또한 f-string는 표현식을 지원하기 때문에 다음과 같이 사용할 수 있다.
```python
name = "Python"
age = 25
result = f"나의 이름은 {name} 입니다. 나이는 {age + 1}살 입니다."
print(result)

# 결과
나의 이름은 Python 입니다. 나이는 26살 입니다.
```
**표현식** : 문자열 안에서 변수와 + , - 와 같은 수식을 함께 사용한 것
