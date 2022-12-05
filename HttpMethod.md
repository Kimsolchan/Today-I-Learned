# Http Method 에 대해서
## 출처
https://velog.io/@yh20studio/CS-Http-Method-%EB%9E%80-GET-POST-PUT-DELETE

![HTTP METHOD](https://user-images.githubusercontent.com/108924832/205641032-d411e3e7-751f-4616-b73a-db9530a03705.PNG)

## GET / POST / PUT / DELETE
코딩을 하다 보면 서버와 클라이언트가 소통을 하기 위해서 보통 ```Http```를 이용하게 되어있다.

GET / POST / PUT / DELETE 등등...은 ```Http Method```라고 하는데

처음 들어보는 용어이므로 정리하였다. ```Http Method``` 에 대해 알아보자

## REST(Representational State Transfer)
Http Method에 대해 알기 위해서는 먼저 이해해야 하는 개념이라고 한다.

REST는 2000년도에 로이 필딩(Roy Fielding)의 박사학위 논문에서 최초로 소개되었다.

로이 필딩은 HTTP의 주요 저자 중 한 사람으로 그 당시 웹(HTTP)설계의 우서성에 비해

제대로 사용되지 못하는 현실을 보며 ```웹의 장점을 최대한 활용할 수 있는 아키텍쳐```로써

REST를 발표했다고 한다.

- 자원(Resource) -> URI
- 행위(Verb) -> HTTP Method
- 표현(Representations)

여기선 행위(REST를 지키면서 행위를 전달하는 방법)에 해당하는 HTTP Method 에 대해 정리한다.

## HTTP Method
크게 GET / POST / PUT / DELETE가 대표적이라고 한다.

일반적으로 ```CRUD``` 에서 다음과 같이 이용한다.

- 조회: GET : 서버로부터 데이터를 취득한다.
- 등록: POST : 서버에 데이터를 추가, 작성 등...의 역할
- 수정: PUT : 서버의 데이터를 갱신, 작성 등... 의 역할
- 삭제: DELETE : 서버의 데이터를 삭제한다.

그 밖에 4가지의 메소드가 더 존재한다.

- HEAD : 서버 리소스의 헤더(메타 데이터의 취득)
- OPTIONS : 리소스가 지원하고 있는 메소드의 취득
- PATCH : 리소스의 일부분을 수정한다.
- CONNECT: 프록시 동작의 터널 접속을 변경한다.

## 멱등성(Idempotence)
HTTP Method 에 대해 알아보면 나오는 용어다.

```멱등성``` 이란 **여러번 수행해도 결과가 같다.** 의미한다.

-> 호출로 인하여 데이터가 변형이 되지 않는다는 것을 의미한다.

### GET
GET 메소드는 주로 데이터를 읽거나(Read) 검색(Retrieve)할 때에 사용되는 메소드이다.

만약에 GET 요청이 성공적으로 일워진다면 ```XML``` or ```JSON``` 과 함께

200(OK) HTTP 등답 코드를 리턴한다. 에러가 발생하면 주로 ```404(Not found)``` 에러나

```400 (Bad request)``` 에러가 발생한다.
```
HTTP 명세에 의하면 GET 요청은 오로지 데이터를 읽을 때만 사용되고 수정할 때는 

사용하지 않는다.

GET 요청은 idempotent 하다.

같은 요청을 여러 번 하더라도 변함없이 항상 같은 응답을 받을 수 있다.

데이터를 변경하는 연산에 사용하면 안된다.
```

- 예시
```java
GET /user/1
```
데이터르 조회하는 것이기 때문에 요청시에 ```Body``` 값과 ```Content-Type``` 가 비워져있다.

조회할 데이터에 대한 정보는 ```URL```을 통해서 파라미터를 받고 있는 모습을 볼 수 있다.

데이터 조회에 성공한다면 Body 값에 데이터 값을 저장하여 성공 응답을 보낸다.

GET은 ```캐싱```이 가능하여 같은 데이터를 한번 더 조회할 경우, 저장한 값을 사용하여

조회 속도가 빨라진다.

### POST
```POST 메소드```는 주로 **새로운 리소스를 생성(create)**할 때 사용된다.

조금 더 구체적으로 POST는 하위 리소스(부모 리소스의 하위 리소스)들을 생성하는데 사용된다.

성공적으로 creation을 완료하면 ```201 (Created) HTTP 응답```을 반환한다.
```
POST 요청은 idempotent 하지 않다.

같은 POST 요청을 반복해서 했을 때 항상 같은 결과물이 나오는 것을 보장하지 않는다

두 개의 같은 POST 요청을 보내면 같은 정보를 담은 두 개의 다른 resource를 반환할 가능성이 높다.
```

- 예시
```java
POST /user
body : {date : "example"}
Content-Type : "application/json"
```
데이터를 생성하는 것이기 때문에 요청시에 Body 값과 Content-Type 값을 작성해야한다.

해당 예시는 ```JSON을 통해서 작성된 예시```이다.

URL을 통해서 데이터를 받지 않고, Body 값을 통해서 받는다.

데이터 조회에 성공한다면 Body 값에 저장한 데이터 값을 저장하여 성공 응답을 보낸다.

### PUT
```PUT```은 ```리소스를 생성 / 업데이트```하기 위해 서버로 데이터를 보내는 데 사용된다.
```
PUT 요청은 idempotent 한다.
        
동일한 PUT 요청을 여러 번 호출하면 항상 동일한 결과가 생성된다.
```

- 예시
```java
PUT /user/1
body : {date : "update example"}
Content-Type : "application/json"
```
데이터를 수정하는 것이기 때문에 요청시에 Body 값과 Content-Type 값을 작성해야한다.

해당 예시는 JSON을 통해서 작성된 예시이다.

URL을 통해서 어떠한 데이터를 수정할지 파라메터를 받는다.

그리고 수정할 데이터 값을 Body 값을 통해서 받는다.

데이터 조회에 성공한다면 Body 값에 저장한 데이터 값을 저장하여 성공 응답을 보낸다.

### DELETE
```DELETE 메서드```는 ```지정된 리소스를 삭제```한다.

- 예시
```java
DELETE /user/1
```
데이터를 삭제하는 것이기 때문에 요청시에 Body 값과 Content-Type 값이 비워져있다.

URL을 통해서 어떠한 데이터를 삭제할지 파라메터를 받는다.

데이터 삭제에 성공한다면 Body 값 없이 성공 응답만 보내게 된다.

## 정리
### POST방식이 GET방식보다 보안측면에서 더 좋은가?
GET과 비교하여 URL에 데이터의 정보가 들어 있지 않으므로 조금 더 안전하다고 볼 수 있다.

### GET방식이 POST방식보다 속도가 빠르다?
GET 방식은 캐싱을 하기 때문에 여러번 요청시 저장된 데이터를 활용하므로 조금 더 빠를 수 있다.

### POST vs PUT
POST와 PUT은 구분해서 사용해야한다.

POST는 새로운 데이터를 계속 생성하기 때문에 요청시마다 데이터를 생성하지만,

PUT은 사용자가 데이터를 지정하고 수정하는 것이기 때문에

같은 요청을 계속하더라도 데이터가 계속 생성되지는 않는다.

### PUT vs PATCH
정보를 수정할 수 있는 HTTP Method가 또 있다.

하지만 PUT이랑은 조금 다르다.

PUT은 지정한 데이터를 전부 수정하는 Method이지만

PATCH는 정보의 일부분이 변경되는 방법입니다.

그래서 PUT은 멱등하지만, PATCH는 멱등하다고 볼 수 없다.

