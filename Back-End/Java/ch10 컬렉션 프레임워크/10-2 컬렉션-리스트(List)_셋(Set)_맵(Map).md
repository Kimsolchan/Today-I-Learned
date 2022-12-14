# 리스트(List)_셋(Set)_맵(Map)
## List(리스트)
순서가 있는 나열된 데이터를 표현한다.
- ```ArrayList```는 배열을 이용하여 데이터를 저장하는 List 인터페이스다.
```java
// Main
package back_end.java.컬렉션프레임워크.리스트_셋_맵;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // ArrayList는 사이즈가 존재한다.
        List<Integer> list = new ArrayList(10);
        // 리스트.add  : ArrayList에 값 한개씩 입력
        list.add(8);
        list.add(6);
        list.add(4);
        list.add(2);
        list.add(10);
        // [8, 6, 4, 2, 10]
        System.out.println(list);

        // Collections.sort(list) : 어레이 리스트 안에 요소값들이 오름차순으로 정렬 ㅡ 내림차순 존재
        Collections.sort(list);
        // [2, 4, 6, 8, 10]
        System.out.println(list);

        // 리스트.size() : arrayList의 크기 출력
        System.out.println(list.size());

        // 리스트.remove(index); : 인덱스 위치를 활용하여 해당 값 제거
        list.remove(4);
        System.out.println(list);

        for(int i = 0; i < list.size(); i++){
            // 리스트.get(i); : get을 이용하여 값 1개씩 출력
            System.out.println(list.get(i));
        }
        // for each문 : 오른쪽에 있는 배열에 인자를 하나씩 꺼내서 순서대로 확인.
        for (int current : list){
            System.out.println(current);
        }
    }
}

// 결과
[8, 6, 4, 2, 10]
[2, 4, 6, 8, 10]
 5
[2, 4, 6, 8]
2
4
6
8
2
4
6
8
```
- ArrayList.add  : ArrayList에 값 한개씩 입력
- ArrayList.remove(index); : 인덱스 위치를 활용하여 해당 값 제거
- ArrayList.size() : ArrayList의 크기를 구한다.
- ArrayList.get(index) : ArrayList의 원하는 index의 값이 리턴된다.

## Set(셋)
순서를 유지하지 않는 데이터의 집합. 데이터의 중복을 허용하지 않는다.
- ```HashSet``` : Set 인터페이스를 구현한 대표적인 컬렉션
```java
// Main
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Collection 의 자료형에는 primitive(기본형) 타입은 올 수 없다, primitive 타입에 해당하는 class 가 존재하니 그것을 사용할 것
        Set<Integer> integerSet = new HashSet<>();
        // 셋.add : 하나씩 값을 삽입한다.
        integerSet.add(1);
        integerSet.add(3);
        integerSet.add(8);
        integerSet.add(5);
        // 셋은 중복을 허용하지 않으며 순서를 지키지 않기 때문에 값이 순서대로 출력되지 않는다.
        System.out.println(integerSet);

        Set<String> stringsSet = new HashSet<>();
        stringsSet.add("Python");
        stringsSet.add("Java");
        stringsSet.add("Javascript");
        stringsSet.add("HTML");
        stringsSet.add("CSS");
        System.out.println(stringsSet);

        // 셋.remove : "Java"를 HashSet 에서 제거한다.
        stringsSet.remove("Java");
        System.out.println(stringsSet);

        ArrayList<String> target = new ArrayList<>();
        // ArrayList 값 추가 
        target.add("Seoul");
        target.add("New York");
        // ArrayList.removeAll() : 추가된 값 삭제.
        stringsSet.removeAll(target);
        System.out.println(stringsSet);

        // 셋.contains(); : 값이 HashSet에 포함되어 있으면 true, 그렇지 않으면 false 를 반환한다.
        System.out.println("Seoul 이 포함되었나? : " + stringsSet.contains("Seoul"));

        // .size() : HashSet 의 크기를 반환한다.
        System.out.println("현재 HashSet 의 크기는 : " + stringsSet.size() + "입니다.");

        // .clear(); : HashSet 의 모든 아이템을 삭제한다.
        stringsSet.clear();
        System.out.println(stringsSet);
    }
}

// 결과
[1, 3, 5, 8]
[Java, CSS, Javascript, HTML, Python]
[CSS, Javascript, HTML, Python]
[CSS, Javascript, HTML, Python]
Seoul 이 포함되었나? : false
현재 HashSet 의 크기는 : 4입니다.
[]
```
- HashSet.add() : HashSet에 값을 추가
- HashSet.remove() : HashSet에 해당 값 제거
- HashSet.size() : HashSet의 크기 구하기
- HashSet.contains() : HashSet에 값이 포함되어 있는지 확인하여 true or false 반환

## Map(맵)
- ```HashMap``` : 키(key)와 값(value)을 하나의 데이터로 저장하는 특징을 가진다.

이를 통해 ``` 해싱(hashing)``` 을 가능하게 하여 데이터를 검색하는데 뛰어난 성능을 보인다.
```java
// Main
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "apple");
        map.put(2, "grape");
        map.put(3, "berry");

        System.out.println(map);

        System.out.println("1st in map : " + map.get(1));

        map.remove(2);
        System.out.println(map);
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("apple"));

        map.clear();
        System.out.println(map);
    }
}

// 결과
{1=apple, 2=grape, 3=berry}
1st in map : apple
{1=apple, 3=berry}
false
true
{}
```
- HashMap.put(key,value) : HashMap 에 값을 추가하는 메소드
- HashMap.remove(key); : HashMap 에 값을 제거하는 메소드
- HashMap.clear(); : HashMap 안에 있는 모든 아이템을 제거하는 메소드
- HashMap.containsKey(key) : HashMap 안에 해당 key 가 있으면 true , 없으면 false 반환
- HashMap.containsValue(value) : HashMap 안에 해당 value가 있으면 true,없으면 false 반환
