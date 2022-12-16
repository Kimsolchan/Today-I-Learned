package com.example.springmvcprac.controller;

import com.example.springmvcprac.model.Animal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Member;

// @Controller
// 컨트롤러 클래스에 @Controller 어노테이션을 작성한다. 해당 어노테이션이 적용된 클래스는 "Controller"임을 나타나고,
// bean 으로 등록되며 해당 클래스가 Controller 로 사용됨을 Spring Framework 에 알린다.
@Controller
// @RequestMapping
// 전체 URL 을 response(꼭 response 가 아니어도 된다.(규약에 의해 지정된 것)) 로 시작하게 설정함.
// 생략 가능한 어노태이션이며, 생략하면 메소드들의 파리미터 시작은 /response/ 로 시작해야 한다.
@RequestMapping("/response")
public class SpringPracResponseController {

    private static long visitCount = 0; // static 으로 방문자 수를 증가시켜주는 변수가 선언되어 있다.

    // @GetMapping : GET메서드(HTTP 메서드)로 조회하는 어노테이션
    // redirect
    // 메서드에서 처리가 끝나고 static 폴더에 있는 /springprac.html url을 한번더 요청하는 것(이 메서드는 url을 두 번 요청하는 셈이다.)
    // localhost:8080/response/spring.html 로 검색해도 static 폴더에 있는 /springprac.html url이 나온다.
    @GetMapping("/html/redirect")
    // @RequestMapping(method = RequestMethod.GET)
    public String htmlFile() {
        return "redirect:/springprac.html";
    }

    // "springprac" 문자열이 아니라 springprac 파일명을 뜻한다.
    @GetMapping("/html/templates")
    public String htmlTemplates() {
        return "springprac"; // "springprac" == /templates/springprac.html
    }

    // @ResponseBody : 리턴값을 텍스트 형태(문자열 : 문자열 , json 포멧 : json형식 ,  html포멧 : html)로 리턴하는 어노테이션
    @ResponseBody
    @GetMapping("/body/html")
    public String springStringHTML() {
        return "<DOCTYPE HTML>" +
                "<html>" +
                "<head><meta charset=\"UTF-8\"><title>By @ResponseBody</title></head>" +
                "<body> 이곳은 Spring prac 정적 웹 페이지</body>" +
                "</html>";
                // -> return : text ,
    }

    // 메서드 안에 매개변수로 Model(클래스명) model(변수명) 울 넣어주면 html이 리턴되면 model 의 넣어놓은 값도 사용 가능.
    @GetMapping("/html/dynamic")
    public String springHtmlFile(Model model) {
        visitCount++; // visitCount 값 1 증가
        model.addAttribute("visits", visitCount); // model 객체 안에 key, value 형식으로 데이터를 넣어줬다. / addAttribute : 변수안에 값을 넣어준다.
        return "spring-visit";                               // 데이터 :  visitCount++ 를 visitCount 변수에 할당시켰음
    }

    @ResponseBody
    @GetMapping("/json/string")
    public String springStringJson() {
        return "{\"name\":\"강아지\",\"age\":2}"; // String return
        // \ : 특수문자사용할때 필요함 (System.out.println("123"); -> 123 / System.out.println("\"123\""); -> "123")
    }

    @ResponseBody
    @GetMapping("/json/class")
    public Animal springJson() {
        return new Animal("사자", 3); // "/json/class" 라는 URL 로 요청을 받으면 Animal 클래스의 객체가 반환된다.
                                                // 초기값은 Animal 클래스의 생성자를 통해서 값을 주고 있다.
    }
}