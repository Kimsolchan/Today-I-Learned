# map, filter, lamdba 식
## map
- 리스트의 모든 원소를 조작할 수 있다.

map을 이용헤서 리스트를 조작해 보았다.

- 리스트 
```python
people = [
    {'name': '짱구', 'age': 20},
    {'name': '철수', 'age': 38},
    {'name': '유리', 'age': 7},
    {'name': '맹구', 'age': 17},
    {'name': '훈', 'age': 27},
]
```

- 조건 : map 을 사용하여 age > 20 이면 성인 , age < 20면 청소년 으로 바꾸기
```python
people = [
    {'name': '짱구', 'age': 20},
    {'name': '철수', 'age': 38},
    {'name': '유리', 'age': 7},
    {'name': '맹구', 'age': 17},
    {'name': '훈', 'age': 27}
]

def check_age(p):
    if p['age'] > 20:
        return ("성인")
    else:
        return ("청소년")

result = map(check_age, people)
print(list(result))

# 결과
['청소년', '성인', '청소년', '청소년', '성인']
```
- people 하나하나 확인하면서 check_age에 넣는다.
- 그 결과값을 다시 리스트로 묶는다.

## filter 내장함수
- 여러 개의 데이터로 부터 일부의 데이터만 추려낼 때 사용한다.
  - 여러 개의 데이터를 담고 있는 list or tuple을 대상으로 주로 사용하는 함수
  - 
### filter 기본문법
```python
filter(조건 함수, 순회 가능한 데이터)
```
```filter()```함수는 두 번째 인자로 넘어오는 데이터 중에서

첫 번째 인자로 넘어온 조건 함수를 만족하는 데이터만 반환한다.

### filter 사용 예시
- 리스트
```python
people = [
    {'name': '짱구', 'age': 20},
    {'name': '철수', 'age': 38},
    {'name': '유리', 'age': 7},
    {'name': '맹구', 'age': 17},
    {'name': '훈', 'age': 27}
]
```
```['age'']``` > 20 에 만족하는 ```['name']```을 구하는 함수를 먼저 만든다.

왜냐하면 filter() 함수는 함수를 인자로 받기 때문이다.

```python
def check_age(a):
    if a['age'] > 20:
        return a['name']
```

만든 함수를 첫 번째 인자로. 리스트를 두 번째 인자로 넣어서 filter 함수를 출력한다.
```python
for adult in filter(check_age, people):
    print(adult)

# 결과
{'name': 'carry', 'age': 38}
{'name': 'ben', 'age': 27}
{'name': 'bobby', 'age': 57}
{'name': 'red', 'age': 32}
{'name': 'queen', 'age': 25}
```

## lambda(람다) 식
lambda는 함수를 생성할 때 사용하는 예약어로 def와 동일한 역할을 한다.

주로 **함수를 간결하게 만들 때 사용한다.**

**def를 사용하지 않을 정도로 복잡하지 않거나 def를 사용할 수 없는 곳에 주로 쓰인다.**

### lambda 사용법
```python
lambda 매개변수1, 매개변수2, ...:매개변수를 사용한 표현식
```

### lambda 예시
```python
# 일반 함수
def add(a, b):
    result = a + b
    return result
print(add(5, 10))
# 결과
15

# lambda식
add = lambda a, b: a+b
result = add(5, 10)
print(result)
#결괴 
15
```