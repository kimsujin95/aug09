package com.sujin.web.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminDAO {

	Map<String, Object> adminLogin(Map<String, Object> map);

	List<Map<String, Object>> list();

	void noticeWrite(Map<String, Object> map);

	String content(int nno);

	int noticeHide(int nno);

	List<Map<String, Object>> setupBoardList();

	int multiBoardInsert(Map<String, Object> map);

	List<Map<String, Object>> memberList();

	int gradeChange(Map<String, String> map);

	List<Map<String, Object>> post(Map<String, Object> map);

	List<Map<String, Object>> boardList();

	String appendDetail(int mbno);

	String contentDetail(int mbno);
}
