package ksmart36.mybatis.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ksmart36.mybatis.domain.Goods;
import ksmart36.mybatis.mapper.GoodsMapper;
import ksmart36.mybatis.service.GoodsService;

@Controller
public class GoodsController {
	@Autowired private GoodsService goodsservice;
	@Autowired private GoodsMapper goodsmapper;
	
	//modify Goods
	@GetMapping("/modifyGoods")
	public String modifyGoods() {
		
		return null;
	}
	
	//Add Goods
	@PostMapping("/addGoods")
	public String addGoods(Goods goods
							,@RequestParam(value="goodsName",required = false) String goodsName
							,@RequestParam(value="goodsPrice",required = false) String goodsPrice
							,@RequestParam(value="goodsSellerId",required = false) String goodsSellerId) {
		
		System.out.println(goods + "<--goodsList");
		System.out.println(goodsName + "<--goodsName goodsList");
		System.out.println(goodsSellerId + "<--goodsSellerId goodsList");
		
		return "redirect:/getGoodsList";
	}
	
	@GetMapping("/addGoods")
	public String addGoods(Model model) {
		model.addAttribute("title", "상품 등록");
		
		return "goods/addGoods";
	}
	
	//Get Goods List
	@GetMapping("/getGoodsList")
	public String getGoodsList(Model model, HttpSession session) {
		String loginId = (String) session.getAttribute("SID"); //다운 캐스팅 해줘야함. 오브젝트 형태라서.
		List<Goods>goodsList = goodsservice.getGoodsList();
		System.out.println(goodsList + "<--goodsList");
		
		model.addAttribute("goodsList", goodsList);
		model.addAttribute("title", "상품 목록 조회");
		//model.addAttribute();
		
		return "goods/goodsList";
	}
}
