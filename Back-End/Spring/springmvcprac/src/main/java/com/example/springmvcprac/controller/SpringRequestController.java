package com.example.springmvcprac.controller;

import com.example.springmvcprac.model.Animal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/request")

public class SpringRequestController {
    @GetMapping("/form/html")
    public String springForm() {
        return "spring-request-form"; // spring-request-form.html return 한다.
    }

    // @PathVariable
    // - 매핑의 URL 에 { } 로 들어가는 패스 변수(path variable)를 받는다(/star/{name}/age/{age})
    // - @Controller 는 URL 에서 파라미터에 해당하는 부분을 { }을 넣는 URI 템플릿을 사용할 수 있다.
    // - 패스 변수는 "/star/{name}/age/{age}"처럼 여러 개를 선언할 수도 있다.
    @GetMapping("/stat/{name}/age/{age}")
    @ResponseBody
    public String springRequestPath(@PathVariable String c, @PathVariable int d) {
        return String.format("Spring : @PathVariable.<br> name = %s, age = %d", c, d);
    }

    // 1. @GetMapping 을 이용한 @RequestParam
    // @RequestParam
    // @RequestParam String name, @RequestParam int age : 클라이언트에서 요청한 key 값
    // - return URL : localhost:8080/request/form/param?name=입력값&age=입력값(key, value 표현법)
    // - ?name=입력값&age=입력값 : 쿼리스트링(쿼리 방식으로 값을 보내면) @RequestParam 어노테이션을 사용해서 받아 올 수 있다.
    // - 게시판 등에서 페이지 및 검색 정보를 함께 전달하는 방식을 사용할 때 많이 사용한다.
    @GetMapping("/form/param")
    @ResponseBody
    public String springGetRequestParam(@RequestParam String name, @RequestParam int age) {
        return String.format("Hello, @RequestParam.<br> name = %s, age = %d", name, age);
    }

    // 2. @PostMapping 을 이용한 @RequestParam
    @PostMapping("/form/param")
    @ResponseBody
    public String springPostRequestParam(@RequestParam String name, @RequestParam int age) {
        return String.format("Spring : @RequestParam.<br> name = %s, age = %d", name, age);
    }

    // 1번과 2번의 차이점
    // - 전달되는 방식이 다르다.
    // -> 1번 : return URL : localhost:8080/request/form/param?name=입력값&age=입력값
    // -> 2번 : return URL : localhost:8080/request/form/param(개발자 도구 -> 네트워크 -> 페이로트를 보면 name 과 age 값이 들어가있다.)

    // @ModelAttribute
    // - 클라이언트에서 보내는 값이 다수(10, 20....)가 되면 이걸 모두 @RequestParam 으로 받기 힘들어진다.
    // -> 스프링에서는 이럴 경우 객체형식으로 받는다.(Animal animal)
    // - @ModelAttribute 를 사용할 때면 꼭 클래스(Animal)에 @Setter 어노테이션을 사용해야 한다.
    @PostMapping("/form/model")
    @ResponseBody
    public String springRequestBodyForm(@ModelAttribute Animal animal) {
        return String.format("Hello, @RequestBody.<br> (name = %s, age = %d) ", animal.getName(), animal.getAge());
    }

    // @RequestBody
    // - 개발자도구 -> 네트워크 -> 페이로드를 보면 값이 json 형식으로 넘어간다.
    // - 컨트롤러에 어노테이션을 추가해주면, JSON , key/value 방식, xml 등으로 송수신 할 수 있다.
    // - @RequestBody 어노테이션은 HTTP 요청의 body 내용을 자바 객체로 매핑하는 역할을 한다.
    @PostMapping("/form/json")
    @ResponseBody
    public String helloPostRequestJson(@RequestBody Animal animal) {
        return String.format("Hello, @RequestBody.<br> (name = %s, age = %d) ", animal.getName(), animal.getAge());
    }
}







