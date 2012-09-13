package com.tcs.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tcs.model.Article;
import com.tcs.model.Brand;
import com.tcs.service.BrandService;

@Controller
@RequestMapping("/brands")
@Scope
public class BrandController {
	
	@Resource
	private BrandService brandService;
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveBrand(@ModelAttribute(" brand") Brand  brand,
			BindingResult result) {
		brandService.addBrand( brand);
		return new ModelAndView("redirect:/brands.html");
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView listArticles() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("brands",  brandService.listBrands());
		return new ModelAndView("brandsList", model);
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addBrand(@ModelAttribute("brand") Brand brand,
			BindingResult result) {
		return new ModelAndView("addBrand");
	}

}
