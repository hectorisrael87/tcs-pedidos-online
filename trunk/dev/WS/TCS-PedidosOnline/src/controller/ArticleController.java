package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.ArticleService;
import service.ArticleServiceImpl;

@Controller
public class ArticleController {

	ArticleService articleService = new ArticleServiceImpl();
	
	@RequestMapping("/listArts.html")
	public ModelAndView handleRequests(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		return new ModelAndView("listArticles", "listArticle", articleService.listArticles());
	}
	


	/*@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveArticle(@ModelAttribute(" article") Article  article,
			BindingResult result) {
		 articleService.addArticle( article);
		return new ModelAndView("redirect:/articles.html");
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView listArticles() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("articles",  articleService.listArticles());

		return new ModelAndView("articlesList", model);
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addArticle(@ModelAttribute("article") Article article,
			BindingResult result) {
		return new ModelAndView("addArticle");
	}*/
	
	
	
}
