package ksmart36.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart36.mybatis.domain.Goods;

@Mapper
public interface GoodsMapper {
	
	//Add Goods
	public int addGoods(Goods goods);
	
	//goodsList 조회
	public List<Goods> getGoodsList(); 
}
