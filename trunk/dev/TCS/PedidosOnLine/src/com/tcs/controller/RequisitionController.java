package com.tcs.controller;

import java.io.IOException;
import java.util.Date;
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
import com.tcs.model.Requisition;
import com.tcs.model.RequisitionDetail;
import com.tcs.service.ArticleService;
import com.tcs.service.RequisitionService;


@Controller
@RequestMapping("/requisitions")
@Scope
public class RequisitionController {
	
	@Resource
	private RequisitionService requisitionService;
	
	@Resource
	private ArticleService articleService;
	
	
	@RequestMapping(value = "/addRequisition", method = RequestMethod.GET)
	public ModelAndView addRequisition(@ModelAttribute("requisition") Requisition requisition,
			BindingResult result) {
		return new ModelAndView("addRequisition");
	}
	
	@RequestMapping(value = "/saveRequisition", method = RequestMethod.POST)
	public ModelAndView saveRequisition(@ModelAttribute(" order") Requisition  requisition,
			BindingResult result) {
		requisition.setRequisitionDate(new Date());
		requisitionService.addRequisition( requisition);
		return new ModelAndView("viewAdmin");
	}
	
	
	@RequestMapping(value = "/listRequisition",method = RequestMethod.GET)
	public ModelAndView listRequisition() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("requisitions", requisitionService.listRequisition());
		return new ModelAndView("requisitionList", model);
	}
	
	
	@RequestMapping(value = "/addReqDetail", method = RequestMethod.GET)
	public ModelAndView addRequisitionDetail(@ModelAttribute("requisitiondetail") RequisitionDetail requisitionDetail,
			@ModelAttribute("requisition") Requisition requisition, @ModelAttribute("article") Article article, BindingResult result,
			HttpServletRequest request) {
		request.setAttribute("requisitions", requisitionService.listRequisition());
		request.setAttribute("articles", articleService.listArticles());
		return new ModelAndView("addRequisitionDetail");
	}
	
	@RequestMapping(value = "/saveRequisitionDetail", method = RequestMethod.POST)
	public ModelAndView saveRequisitionDetail(
			@ModelAttribute(" requisitiondetail") RequisitionDetail requisitionDetail, BindingResult result, HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int idReq=Integer.valueOf(request.getParameter("requisition"));
		int idArt=Integer.valueOf(request.getParameter("article"));
		requisitionDetail.setArticle(articleService.getArticle(idArt));
		requisitionDetail.setRequisition(requisitionService.getRequisition(idReq));
		requisitionDetail.setRequisitionDetailDate(new Date ());
		requisitionService.addRequisitionDetail(requisitionDetail);
		return new ModelAndView("viewAdmin");
	}
	
	
	@RequestMapping(value = "/listReqDetailByReq",method = RequestMethod.GET)
	public ModelAndView listReqDetailByReq(HttpServletRequest request) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("requisitionsDetail", requisitionService.listRequisitionDetailByReq(Integer.valueOf(request.getParameter("id")).intValue()));
		return new ModelAndView("reqDetailList", model);
	}
	

}
