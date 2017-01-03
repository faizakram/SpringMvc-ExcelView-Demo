package com.SpringMVC.ExcelDemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

 
 
@Controller
public class MainController {
 
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String viewHome() {
		return "home";
	}
 
	@RequestMapping(value = "/downloadExcel", method = RequestMethod.GET)
	public ModelAndView downloadExcel() { 
		List<PortClosure> list = new ArrayList<PortClosure>();
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		list.add(new PortClosure("10-Jan-11", "5:05", "10:05","5:00", "THICK FOG"));
		return new ModelAndView("excelView", "listBooks", list);
	}
}