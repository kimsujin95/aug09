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

}
