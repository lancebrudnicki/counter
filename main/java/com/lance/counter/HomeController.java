package com.lance.counter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("count") == null) {			
			session.setAttribute("count", 0);
			
		}else {	
			int count = (int) session.getAttribute("count");
			count += 1;
			session.setAttribute("count", count);
		}
		return "index.jsp";
	}
	@RequestMapping("/counter")
	public String showCounter(HttpSession session, Model model) {
		Integer currentCount = (Integer) session.getAttribute("count");
		model.addAttribute("countToShow", currentCount);
		return "counter.jsp";
	}
	@RequestMapping("/add2")
	public String showCounter2(HttpSession session, Model model) {
		if(session.getAttribute("count") == null) {			
			session.setAttribute("count", 0);
			
		}else {	
			int count = (int) session.getAttribute("count");
			count += 2;
			session.setAttribute("count", count);
		}
		Integer currentCount = (Integer) session.getAttribute("count");
		model.addAttribute("countToShow", currentCount);
		return "counter.jsp";
	}
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.setAttribute("count", 0);
		return "index.jsp";
	}
}
