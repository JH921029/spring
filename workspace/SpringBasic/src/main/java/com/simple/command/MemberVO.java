package com.simple.command;

import java.util.ArrayList;

public class MemberVO {
	//1쪽
	private String id;
	private String addr;
	
	//M쪽
	private ArrayList<ScoreVO> list;

	public MemberVO() {
		super();
	}

	public MemberVO(String id, String addr, ArrayList<ScoreVO> list) {
		super();
		this.id = id;
		this.addr = addr;
		this.list = list;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public ArrayList<ScoreVO> getList() {
		return list;
	}

	public void setList(ArrayList<ScoreVO> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", addr=" + addr + ", list=" + list + "]";
	}
	
	
	
}
