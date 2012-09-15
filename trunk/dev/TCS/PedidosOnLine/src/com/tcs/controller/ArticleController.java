package com.tcs.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tcs.model.Article;
import com.tcs.model.Brand;
import com.tcs.service.ArticleService;
import com.tcs.service.BrandService;

@Controller
@RequestMapping("articles")
@Scope
public class ArticleController {

	@Resource 
	private ArticleService articleService;

	
	@Resource 
	private BrandService brandService;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveArticle(
			@ModelAttribute(" article") Article article, BindingResult result, HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int i=Integer.valueOf(request.getParameter("articleBrand"));
		article.setArticleBrand(brandService.getBrand(i));
		articleService.addArticle(article);
		return new ModelAndView("redirect:/articles/list.html");
	}

	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public ModelAndView listArticles() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("articles", articleService.listArticles());

		return new ModelAndView("articlesList", model);
	}

	/*
	 * @RequestMapping(value = "/add", method = RequestMethod.GET) public
	 * ModelAndView addArticle(@ModelAttribute("article") Article article,
	 * BindingResult result, HttpServletRequest request) {
	 * request.setAttribute("brands", brandService.listBrands()); return new
	 * ModelAndView("addArticle"); }
	 */

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addArticle(@ModelAttribute("article") Article article,
			@ModelAttribute("brand") Brand brand, BindingResult result,
			HttpServletRequest request) {
		request.setAttribute("brands", brandService.listBrands());
		return new ModelAndView("addArticle");
	}
	
	@RequestMapping(value = "/listArticleByBrand",method = RequestMethod.GET)
	public ModelAndView listArticlesByBrand(HttpServletRequest request) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("articles", articleService.listArticlesByBrand(Integer.valueOf(request.getParameter("id")).intValue()));

		return new ModelAndView("articlesList", model);
	}

}