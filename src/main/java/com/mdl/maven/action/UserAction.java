package com.mdl.maven.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mdl.maven.model.AuthUser;
import com.mdl.maven.service.UserInfoService;
/**
 * 
 * @ClassName: UserAction 
 * @Description: TODO(用户信息表) 
 * @author madonglin 
 * @date 2016年1月5日 下午2:17:03 
 * @since JDK 1.7 
 * @see
 */
@Controller
@RequestMapping("/user")
public class UserAction {

	@Resource
	private UserInfoService userInfoService;
	
	@RequestMapping("/toAdd")
	public String toAdd(Model model) {
	  return "/user/add";
	}

	@RequestMapping("/save")
	public String save(Model model,AuthUser user) {
	  return "redirect:/user/list";
	}
	
	@RequestMapping("/toUpdate")
	public String toUpdate(Model model,AuthUser user) {
	  return "/user/update";
	}
	
	@RequestMapping("/update")
	public String update(Model model,AuthUser user) {
	  return "redirect:/user/list";
	}
	
	@RequestMapping("/delete")
	public String delete(Model model,AuthUser user) {
	  return "redirect:/user/list";
	}
	
	@RequestMapping("/detail")
	public String index(Model model, Integer uid) {
		return "/user/detail";
	}
	
	@RequestMapping("/list")
	public String list(Model model, Integer uid) {
	  return "/user/list";
	}

	
}
