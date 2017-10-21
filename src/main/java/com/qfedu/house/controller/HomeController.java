package com.qfedu.house.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qfedu.house.util.CommonUtil;

@Controller
//所有页面直接进入
//@RequestMapping("/")
public class HomeController {
//	@Autowired
//	private UserService userService;
//	@RequestMapping(value="/home",method=RequestMethod.GET)

	//	这个是跳转到index.jsp页面发送过来的请求( 这个是怎么实现的？)
	//get和post请求都行的情况为
//	@RequestMapping(value={"/","/home"}，method=。。。。)
	@GetMapping({"/","/home"})
	public String ToIndex() {
		return "index";
	}
	
	//跳转登录页面
	@GetMapping("/toLogin")
	public String toLogin() {
		return "login";
	}
	
//	@GetMapping("/code")
//	public void getCode(HttpServletResponse resp,HttpSession session) throws IOException {
//		int CODE_LENGTH = 4;
//		String code=CommonUtil.generateCode(CODE_LENGTH);
//		session.setAttribute("code",code);
//		resp.setContentType("image/png");
//		BufferedImage codeImage = CommonUtil.generateCodeImage(code, 80,30);
//		ImageIO.write(codeImage, "PNG",resp.getOutputStream());
//	}
	@GetMapping(value="/code",produces="image/png")
	@ResponseBody
	public BufferedImage getCode(HttpSession session){
		int CODE_LENGTH = 4;
		String code=CommonUtil.generateCode(CODE_LENGTH);
		session.setAttribute("code",code);
		return CommonUtil.generateCodeImage(code, 80,30);
	}
	
//	跳转注册页面
	@GetMapping("/toReg")
	public String toReg() {
//		if (mav==null) {
//			mav=new ModelAndView();
//			mav.addObject("hint","");
//		}
//		if (mav.getViewName()==null) {
//			mav.setViewName("register");
//		}
		return "register";
	}
}
