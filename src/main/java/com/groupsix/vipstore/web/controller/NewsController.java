package com.groupsix.vipstore.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.groupsix.vipstore.pojo.News;
import com.groupsix.vipstore.service.NewsService;

@Controller
public class NewsController {

	@Autowired
	private NewsService newsService;
	
	@RequestMapping(value="/showNews", method=RequestMethod.GET)
	public String showNews(Model model) {
		
		List<News> news = newsService.showAllNews();
		model.addAttribute("newsList", news);
		return "newsManager";
	}
	
	@RequestMapping(value="/infolist", method=RequestMethod.GET)
	public String showNewsList(Model model) {
		
		List<News> news = newsService.showAllNews();
		model.addAttribute("newsList", news);
		return "infolist";
	}
	
	@RequestMapping(value="/addNews", method=RequestMethod.POST)
	public String addNews(String title, String content, String createTime) {
		
		if (newsService.addNews(title, content, createTime) != false)
			return "success";
		else
			return "fail";
	}
	
	@RequestMapping(value="/deleteNews", method=RequestMethod.GET)
	public String deleteNews(String newsId) {
		
		if (newsService.deleteNewsById(Integer.parseInt(newsId)) != false)
			return "success";
		else
			return "fail";
	}
	
	@RequestMapping(value="/changeNews", method=RequestMethod.POST)
	public String changeNews(String newsId, String title, String content) {
		
		if (newsService.changeNewsById(Integer.parseInt(newsId), title, content) != false)
			return "success";
		else
			return "fail";
	}
	
	@RequestMapping(value="/infodetail", method=RequestMethod.GET)
	public String newsDetail(String newsId, Model model) {
		
		News news = newsService.findNewsById(Integer.parseInt(newsId));
		model.addAttribute("newsDetail", news);
		return "infodetail";
	}
}
