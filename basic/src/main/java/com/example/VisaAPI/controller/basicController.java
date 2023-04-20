package com.example.VisaAPI.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.VisaAPI.model.BasicModel;
import com.example.VisaAPI.service.BasicService;

import lombok.extern.slf4j.Slf4j;
@RestController
@Slf4j
public class basicController {
	@Resource
	BasicService basicService;

	@GetMapping()
	public ResponseEntity<List<BasicModel>> findbylistEntity (BasicModel basicModel){
		List<BasicModel> user = basicService.getuser(basicModel);
		return ResponseEntity.ok(user);
	}
	@PostMapping("/save")
	public ResponseEntity<List<BasicModel>> saveEntity (@RequestBody BasicModel basicModel){
		
		log.info("",basicModel);
		basicService.saveuser(basicModel);
		
		
		List<BasicModel> user = basicService.getuser(basicModel);
		return ResponseEntity.ok(user);
	}
	
	
	
//	 @PostMapping("/login")
//	   public  ResponseEntity<List<LoginModel>> findByUsername(@RequestBody LoginModel loginModel) {
//		 System.out.println(loginModel);
//		 //ユーザー情報をチャックします。
//		 List<LoginModel> user = loginService.findByUsername(loginModel);
//		 	if(user.size()>0) {
////		 		ユーザー名とパスワードが正しい
//		 		user.get(0).setPassword("ログインできました");
//			 		return ResponseEntity.ok(user);
//		 	}else {
////		 		ユーザー名とパスワードが正しくない
//				return ResponseEntity.ok(user);
//		 	}
//	    }
}

