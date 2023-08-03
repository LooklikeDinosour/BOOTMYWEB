package com.coding404.myweb.product.service;

import java.util.ArrayList;

import com.coding404.myweb.command.CategoryVO;
import com.coding404.myweb.command.ProductVO;
import com.coding404.myweb.util.Criteria;

public interface ProductService {
	
	public int productRegist(ProductVO vo); // 등록
	public ArrayList<ProductVO> getList(String writer, Criteria cri);//조희
	public int getTotal(String writer, Criteria cri); //전체게시글수
	
	public ProductVO getDetail(int prod_id); //상세 = pk 
	public int productUpdate(ProductVO vo); //수정
	public void productDelete(int prod_id); //삭제
	
	//카테고리처리
	public ArrayList<CategoryVO> getCategory(); // 처음 가져올때
	public ArrayList<CategoryVO> getCategoryChild(CategoryVO vo);// 2단 3단 가져오기
}
