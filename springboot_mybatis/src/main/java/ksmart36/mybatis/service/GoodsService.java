package ksmart36.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import ksmart36.mybatis.domain.Goods;
import ksmart36.mybatis.mapper.GoodsMapper;

@Service
public class GoodsService {
	
@Autowired 
	private GoodsMapper goodsmapper; 	


	public List<Goods> getGoodsList(){
		
		List<Goods> goodsList = goodsmapper.getGoodsList();
		
		System.out.println(goodsList+"<--goodsList");
		if(goodsList != null) {
			for(int i=0; i<goodsList.size();i++) {
			}
		}
		return goodsList;	
	}
}