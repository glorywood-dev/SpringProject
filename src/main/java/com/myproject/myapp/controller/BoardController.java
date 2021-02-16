package com.myproject.myapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myproject.myapp.model.BoardVO;
import com.myproject.myapp.service.BoardManager;

@Controller
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	BoardManager boardManager;
	
	@RequestMapping(value = "/getAllBoardList", method = RequestMethod.GET)
	public String getAllBoardList(Model model) {
		
		logger.info("Welcome home! The client locale is {}.", boardManager.getAllBoardList());
		
		for (int i = 0; i < boardManager.getAllBoardList().size(); i++) {
//			logger.info("Welcome home! The client locale is {}.", boardManager.getAllBoardList().get(0).getId());
//			logger.info("Welcome home! The client locale is {}.", boardManager.getAllBoardList().get(0).getfName());
//			logger.info("Welcome home! The client locale is {}.", boardManager.getAllBoardList().get(0).getlName());
		}
		model.addAttribute("boardLists", boardManager.getAllBoardList());
		
		return "boardList";
	}
}
