package com.nsh.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nsh.domain.SampleDTO;

import lombok.extern.log4j.Log4j;

@Controller
/*
 * RequestMapping : 현재 클래스의 모든 메서드들의 기본적인 URL 경로를 설정
 * */
@RequestMapping("/sample/*")
@Log4j
public class SampleController {
	
	@RequestMapping("")
	public void basic() {
		log.info("베이직-------");
	}
	
	@RequestMapping(value = "/basic", method = {RequestMethod.GET, RequestMethod.POST})
	public void basicGet() {
		log.info("베이직 GET방식");
	}
	
	@GetMapping("/basiconlyget")
	public void basicGet2() {
		log.info("오로지 GET방식만");
	}
	
	/*
	 * DTO
	 * */
	@GetMapping("/sampledto")
	public String sampledto(SampleDTO dto) {
		log.info("" + dto);
		
		return "sampledto";
	}
	
	@GetMapping("/sampledto2")
	public String sampledto2(@RequestParam("name2") String name, @RequestParam("age2") int age) {
		log.info("name2: " + name);
		log.info("age2: " + age);
		
		return "sampledto2";
	}
	
	/*
	 * 리스트, 배열 처리
	 * */
	@GetMapping("/sampledtolist")
	public String sampledtolist(@RequestParam("ids") ArrayList<String> ids) {
		log.info("ids: " + ids);
		
		return "sampledtolist";
	}
	
	@GetMapping("/sampledtoarray")
	public String sampledtolist(@RequestParam("ids") String[] ids) {
		log.info("array ids: " + Arrays.toString(ids));
		
		return "sampledtoarray";
	}


}
