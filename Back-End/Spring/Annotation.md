# Annotation(어노테이션)
## 참고자료 

https://velog.io/@gillog/Spring-Annotation-%EC%A0%95%EB%A6%AC

https://velog.io/@leyuri/Spring-boot-JPA-%EC%96%B4%EB%85%B8%ED%85%8C%EC%9D%B4%EC%85%98-Entity-Table-Column-Id-Lombok
## Annotation
사전적 의미 : 주석

자바에서 ```Annotation```은 주석(Comment)처럼 사용하며 

특별한 의미, 기능을 수행하도록 하는 기술이다.
```
프로그램에게 추가적인 정보를 제공해주는 메타데이터 라고 할 수 있다.
```

## Annotation 의 용도
- ```컴파일러```에게 코드 작성 문법 에러를 체크하도록 정보를 제공한다.
- 소프트웨어 개발 툴이 빌드나 배치시 코드를 자동으로 생성할 수 있도록 정보를 제공한다.
- 런타임(실행)시 특정 기능을 실행하도록 정보를 제공한다.

## Annotation 사용순서
1. 어노테이션을 정의한다.
2. 클래스에 어노테이션을 배치한다.
3. 코드가 실행되는 중 ```Reflection```을 이용하여 추가 정보를 획득하여 기능을 실시한다.

## Annotation 종류
### @Column
@Column 어노테이션은 객체 필드와 DB 테이블 컬럼을 맵핑한다.

##### @Column의 속성
- name : 맵핑할 테이블의 컬럼 이름을 지정
- insertable : Entity 저장시 선언된 필드도 같이 저장
- updateable : 엔티티 수정시 이 필드를 함께 수정
- table : 지정한 필드를 다른 테이블에 맵핑
- nullable : NULL을 허용할지, 허용하지 않을지 결정
- unique : 제약조건을 걸 때 사용
- columnDefinition : DB 컬럼 정보를 직접적으로 지정할 때 사용
- length : varchar의 길이를 조정합니다. 기본값으로 255가 입력된다.
- precsion, scale
  - BigInteger, BigDecimal 타입에서 사용
  - 각각 소수점 포함 자리수, 소수의 자리수를 의미

### @NoArgsConstructor
파라미터가 없는 생성자를 자동으로 생성한다.

### @Entity
실제 DB의 테이블과 매칭될 Class 임을 명시한다.
```
테이블과 링크될 클래스임을 나타낸다.
```

### @RequestMapping
```@RequestMapping(value=”“)```과 같은 형태로 작성하며, 

### @GetMapping
```@RequestMapping(value=”“)```와 같은 형태로 작성하며, 

요청 들어온 URI의 요청과 Annotation value 값이 일치하면 

해당 클래스나 메소드가 실행된다. 

Controller 객체 안의 메서드와 클래스에 적용 가능하며, 아래와 같이 사용된다.

- Class 단위에 사용하면 하위 메소드에 모두 적용된다.

- 메소드에 적용되면 해당 메소드에서 지정한 방식으로 URI를 처리한다.

### @Id
해당 테이블의 ```PK 필드```를 나타낸다.

### @Repository
```DAO class```에서 사용되며 ```DataBase```에 접근하는 method를 가지고 있는 Class에서 사용된다.

### @Service
Service 레어이 클래스들에 사용되는 Annotation이다.

@Service 어노테이션을 사용함으로써 해당 클래스가 서비스 레이어 클래스라는 것을 명확하게 한다.

### @SpringBootApplication
```@Configuration``` , ```@EnableAutoConfiguration``` , ```@ComponentScan``` 3가지를 하나의

```Annotation```으로 합친 것이다.

### @Query
메서드의 이름과 상관없이 메서드에 추가한 어노테이션을 통해 원하는 처리가 가능하다.

### 

### @Table
```Entity Class```에 매핑할 테이블 정보를 알려준다.

```@Table(name = "USER")```

Annotation을 생략하면 Class 이름을 테이블 이름 정보로 매핑한다.



