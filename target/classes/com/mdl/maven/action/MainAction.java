package com.mdl.maven.action;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mdl.maven.model.UserInfo;
import com.mdl.maven.service.UserInfoService;

@Controller
@RequestMapping("/main")
public class MainAction {

	@Resource
	private UserInfoService userInfoService;
	
	@RequestMapping("/index")
	public String index(Model model,int uid) {
		System.out.println("----------------index.....");
		UserInfo userInfo=userInfoService.getUser(uid);
		model.addAttribute("userInfo", userInfo);
		System.out.println(userInfo.getUname());
		return "index";
	}

	
	
	
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserInfo user=(UserInfo) ac.getBean("userInfo");
		System.out.println(user.getUname());
	}

}
