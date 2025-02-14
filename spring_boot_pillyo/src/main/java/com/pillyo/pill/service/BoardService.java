package com.pillyo.pill.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.pillyo.pill.dao.IBoardDAO;
import com.pillyo.pill.dao.ICommentDAO;
import com.pillyo.pill.model.BoardVO;
import com.pillyo.pill.model.CommentVO;

@Service
public class BoardService implements IBoardService {
	@Autowired
	@Qualifier("IBoardDAO")
	IBoardDAO dao;
	
	@Autowired
	@Qualifier("ICommentDAO")
	ICommentDAO dao1;
	
	public ArrayList<BoardVO> listAllBoard() {
		// TODO Auto-generated method stub
		return dao.listAllBoard();
	}

	@Override
	public void insertboard(BoardVO vo) {
		// TODO Auto-generated method stub
		dao.insertboard(vo);
	}
	
	@Override
	public BoardVO boardDetailView(int boardNo) {
		return dao.boardDetailView(boardNo);
	}
	
	@Override
	public void updateBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		dao.updateBoard(vo);
	}
	
	@Override
	public void deleteBoard(int boardNo) {
		dao.deleteBoard(boardNo);
	}
	@Override
	public ArrayList<BoardVO> listAllBoardQna() {
		// TODO Auto-generated method stub
		return dao.listAllBoardQna();
	}
	@Override
	public ArrayList<BoardVO> listAllBoardQna2() {
		// TODO Auto-generated method stub
		return dao.listAllBoardQna2(); 
	}
	@Override
	public ArrayList<BoardVO> listAllBoardQna3() {
		// TODO Auto-generated method stub
		return dao.listAllBoardQna3();
	}
	@Override
	public ArrayList<BoardVO> listAllBoardQna4() {
		// TODO Auto-generated method stub
		return dao.listAllBoardQna4();
	}
	@Override
	public ArrayList<BoardVO> listAllBoardQna5() {
		// TODO Auto-generated method stub
		return dao.listAllBoardQna5();
	}
	@Override
	public void insertcomment(CommentVO vo) {
		// TODO Auto-generated method stub
		dao1.insertcomment(vo);
	}
	public void deleteComment(int commentNo) {
		// TODO Auto-generated method stub
		dao.deleteComment(commentNo);
	}
	
//	@Override
//	public static int boardListCnt() {
//		// TODO Auto-generated method stub
//		dao.boardListCnt();
//	}

	

//	public ArrayList<BoardVO> listAllBoard(HashMap<String, Object> map) {
//		// TODO Auto-generated method stub
//		return dao.listAllBoard(map);
//	}

	//관리자메뉴
	@Override
	public ArrayList<BoardVO> a_listAllBoard(){
		return dao.a_listAllBoard();
	}
	@Override
	public int board_ai() {
		return dao.board_ai();
	}
}
