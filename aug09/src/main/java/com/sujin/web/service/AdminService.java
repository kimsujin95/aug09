package com.sujin.web.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujin.web.dao.AdminDAO;

@Service
public class AdminService {
	
	@Autowired
	private AdminDAO adminDAO;

	public Map<String, Object> adminLogin(Map<String, Object> map) {
		return adminDAO.adminLogin(map);
	}

	public List<Map<String, Object>> list() {
		return adminDAO.list();
	}

	public void noticeWrite(Map<String, Object> map) {
		adminDAO.noticeWrite(map);
	}

	public String content(int nno) {
		return adminDAO.content(nno);
	}

	public int noticeHide(int nno) {
		return adminDAO.noticeHide(nno);
	}

	public List<Map<String, Object>> setupBoardList() {
		return adminDAO.setupBoardList();
	}

	public int multiBoardInsert(Map<String, Object> map) {
		return adminDAO.multiBoardInsert(map);
	}

	public List<Map<String, Object>> memberList() {
		return adminDAO.memberList();
	}

	public int gradeChange(Map<String, String> map) {
		return adminDAO.gradeChange(map);
	}

	public List<Map<String, Object>> post(Map<String, Object> map) {
		return adminDAO.post(map);
	}

	public List<Map<String, Object>> boardList() {
		return adminDAO.boardList();
	}

	public String appendDetail(int mbno) {
		return adminDAO.appendDetail(mbno);
	}

	public String contentDetail(int mbno) {
		return adminDAO.contentDetail(mbno);
	}

}
