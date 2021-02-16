package com.myproject.myapp.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.myapp.controller.BoardController;
import com.myproject.myapp.dao.BoardDAO;
import com.myproject.myapp.model.BoardVO;

@Service
public class BoardManagerImpl implements BoardManager{
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	BoardDAO bDAO;
	
	public List<BoardVO> getAllBoardList() {
		return bDAO.getAllBoardList();
	}
}
