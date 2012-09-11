package com.tcs.controller;

import java.util.HashMap;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tcs.model.Article;
import com.tcs.service.ArticleService;


//@RequestMapping("/articles")
@Controller
public class ArticleController {

	@Autowired
	private ArticleService articleService;

	@RequestMapping(value = "/saveArticle", method = RequestMethod.POST)
	public ModelAndView saveArticle(@ModelAttribute(" article") Article  article,
			BindingResult result) {
		 articleService.addArticle( article);
		return new ModelAndView("redirect:/articleList.html");
	}

	@RequestMapping( value = "/articleList", method = RequestMethod.GET)
	public ModelAndView listArticles() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("articles",  articleService.listArticles());

		return new ModelAndView("viewArticlesList", model);
	}

	@RequestMapping(value = "/addArticle", method = RequestMethod.GET)
	public ModelAndView addArticle(@ModelAttribute("article") Article article,
			BindingResult result) {
		return new ModelAndView("viewAddArticle");
	}

}