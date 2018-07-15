/**
 * PWB
 */
package com.groupsix.vipstore.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.groupsix.vipstore.pojo.News;

public interface NewsMapper {
	
	/**
	 * 添加新闻
	 * @param title
	 * @param content
	 * @param createTime
	 * @return
	 */
	public int addNews(@Param("title")String title, @Param("content")String content, @Param("createTime")String createTime);
	
	/**
	 * 遍历全部新闻
	 * @return
	 */
	public List<News> selectAllNews();
	
	/**
	 * 通过id查找
	 * @param newsId
	 * @return
	 */
	public News selectNewsById(@Param("newsId")Integer newsId);
	
	/**
	 * 通过id修改
	 * @param newsId
	 * @param title
	 * @param content
	 * @param createTime
	 * @return
	 */
	public int changeNewsById(@Param("newsId")Integer newsId, @Param("title")String title, @Param("content")String content);

	/**
	 * 通过id删除
	 * @param newsId
	 * @return
	 */
	public int deleteNewsById(@Param("newsId")Integer newsId);
}
