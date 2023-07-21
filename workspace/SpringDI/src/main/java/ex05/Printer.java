package ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Printer {
	
	/*
	 * @Autowired
	 * -멤버변수, 생성자, setter 모두 사용
	 * -bean중에서 주입될 수있는 적합한 타입을 찾아서 자동 주입
	 * 
	 */
	
	
	@Autowired
	@Qualifier("document1")//빈 이름을 강제 연결한다.2ㅈ 
	private Document document;

	//기본생성자 꼭 있어야함
	public Printer() {
		super();
	}


	//생성자 주입 ok
	public Printer(Document document) {
		this.document = document;
	}
	

	//getter, setter 통한 주입 ok
	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}




}