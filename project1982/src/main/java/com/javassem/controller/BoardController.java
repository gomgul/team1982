package com.javassem.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javassem.domain.BoardVO;
import com.javassem.service.BoardService;

@Controller
@RequestMapping("user")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/{step.do}")
	public String test(@PathVariable String step){
		return "/user/" + step;
	}
	
	@RequestMapping("/saveBoard.do")
	public String insertBoard(BoardVO vo) throws IOException{
	    System.out.println(vo);
	    System.out.println(vo.getB_name());
		boardService.insertBoard(vo);
		return "redirect:userBoard.do";
	}
	
	// 게시판 목록 보기
	@RequestMapping("/getBoardList.do")
	public void select(String searchCondition, String searchKeyword, Model m){
		HashMap map = new HashMap();
		map.put("searchCondition", searchCondition);
		map.put("searchKeyword", searchKeyword);
		
		List<BoardVO> list = boardService.getBoardList(map);
		m.addAttribute("boardList", list);
	}
	
	// 해당 글보기
	@RequestMapping("/getBoard.do")
	public void getBoard(BoardVO vo, Model m){
		BoardVO result = boardService.getBoard(vo);
		m.addAttribute("board", result);
	}
	
	@RequestMapping("/deleteBoard.do")
	public String delectBoard(BoardVO vo){
		boardService.deleteBoard(vo);
		return "redirect:userBoard.do";
	}
	
	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo){
		boardService.updateBoard(vo);
		return "redirect:userBoard.do";
	}
}
