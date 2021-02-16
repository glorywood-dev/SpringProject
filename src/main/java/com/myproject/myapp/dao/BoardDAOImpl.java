package com.myproject.myapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.myproject.myapp.controller.BoardController;
import com.myproject.myapp.model.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO{
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	public List<BoardVO> getAllBoardList(){
		List<BoardVO> boardLists = new ArrayList<BoardVO>();
		
		BoardVO bVo = new BoardVO();
		bVo.setId(1);
		bVo.setfName("K");
		bVo.setlName("SJ");
		
		boardLists.add(bVo);
		
		BoardVO bVo2 = new BoardVO();
		bVo2.setId(2);
		bVo2.setfName("S");
		bVo2.setlName("BI");
		
		boardLists.add(bVo2);
		
		return boardLists;
	}
}
