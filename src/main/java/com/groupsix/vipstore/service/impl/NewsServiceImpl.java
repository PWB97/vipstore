/**
 * PWB
 */
package com.groupsix.vipstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupsix.vipstore.dao.NewsMapper;
import com.groupsix.vipstore.pojo.News;
import com.groupsix.vipstore.service.NewsService;

@Service("newsService")
public class NewsServiceImpl implements NewsService {

	@Autowired
	private NewsMapper newsMapper;

	@Override
	public boolean addNews(String title, String content, String createTime) {
		
		if (newsMapper.addNews(title, content, createTime) != 0)
			return true;
		else return false;
	}

	@Override
	public List<News> showAllNews() {
		
		return newsMapper.selectAllNews();
	}

	@Override
	public News findNewsById(Integer newsId) {
		
		return newsMapper.selectNewsById(newsId);
	}

	@Override
	public boolean changeNewsById(Integer newsId, String title, String content) {
		
		if (newsMapper.changeNewsById(newsId, title, content) != 0)
			return true;
		else return false;
	}

	@Override
	public boolean deleteNewsById(Integer newsId) {
		
		if (newsMapper.deleteNewsById(newsId) != 0) 
			return true;
		else return false;
	}
	
	
}
