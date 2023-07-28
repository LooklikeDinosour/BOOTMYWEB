package com.coding404.myweb.product.service;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.coding404.myweb.command.ProductVO;

@Mapper //이거 매퍼
public interface ProductMapper {
	
	public int productRegist(ProductVO vo);
	public ArrayList<ProductVO> getList(String writer);
	public ProductVO getDetail(int prod_id); //상세 = pk 
	public int productUpdate(ProductVO vo); // 수정
	public void productDelete(int prod_id); //삭제

}
