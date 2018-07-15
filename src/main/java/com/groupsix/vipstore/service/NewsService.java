/**
 * PWB
 */
package com.groupsix.vipstore.service;

import java.util.List;

import com.groupsix.vipstore.pojo.News;

public interface NewsService {

	public boolean addNews(String title, String content, String createTime);
	
	public List<News> showAllNews();
	
	public News findNewsById(Integer newsId);
	
	public boolean changeNewsById(Integer newsId, String title, String content);
	
	public boolean deleteNewsById(Integer newsId);
}
