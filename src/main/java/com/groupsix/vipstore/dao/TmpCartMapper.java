/**
 * PWB
 * xxxInCart以区分本接口方法
 */
package com.groupsix.vipstore.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.groupsix.vipstore.pojo.TmpCart;

public interface TmpCartMapper {
	
	public List<TmpCart> selectTmpCartByUserId(@Param("userId")Integer userId);
	
	public int addProductInCart(@Param("userId")Integer userId, @Param("productId")Integer productId,@Param("quantity")Integer quantity);
	
	public int setProductNumberInCart(@Param("userId")Integer userId, 
										@Param("productId")Integer productId, 
										@Param("quantity")Integer quantity);
	
	public int deleteProductInCart(@Param("userId")Integer userId, @Param("productId")Integer productId);
}
