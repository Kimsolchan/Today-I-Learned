# if-else if문
- if else : 두 가지 경우 중 하나가 수행되는 구조(if or else)
- if-else if : 한 문장에 여러 개의 조건식을 사용할 수 있으며 중복 사용 가능

## if-else if 기본구조
```
if(조건식A){
    조건식A의 연산결과가 참일 때 수행될 문장을 적는다
}else if(조건식B){
    조건식2의 연산결과가 참일 때 수행될 문장을 적는다
}else if(조건식C){
    조건식3의 연산결과가 참일 때 수행될 문장을 적는다
}else{
    마지막은 보통 else블럭으로 끝나며 else 블럭은 생략가능
    위에 어느 조건식도 만족하지 않을 경우 수행될 문장들을 적는다
}
```

### if-else if문 예시
```
int grade = 20;

        if(grade >= 90){
            System.out.println("성적 : A");
        }else if(grade >= 80){
            System.out.println("성적 : B");
        }else if(grade >= 70){
            System.out.println("성적 : C");
        }else if(grade >= 60){
            System.out.println("성적 : D");
        }else{
            System.out.println("성적 : F");
        }
    }
}

성적 : F
```