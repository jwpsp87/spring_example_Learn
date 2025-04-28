package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// HTML로 보내는 컨트롤러
@Controller		// ResponseBody가 있으면 안됨. @RestController X
public class Lesson01Ex02Controller {

	 // http://localhost:80/lesson01/ex03
	@RequestMapping("/lesson01/ex02")
	public String ex02() {
		 // return되는 String html의 경로이다.(@ResponseBody가 없을 때)
		
		 // /templates/lesson01/ex02.html
		 // 		  lesson01/ex02
		return "lesson01/ex02";		// response html view 경로
		
		
		
	}
	
}
