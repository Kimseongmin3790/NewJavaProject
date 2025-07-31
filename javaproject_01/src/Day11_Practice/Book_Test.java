package Day11_Practice;

public class Book_Test {
	private String name;
	private String writer;
	private int price;
	
	Book_Test () {
//		this("제목 없음", "저자 미상", 0);
		this.name = "제목 없음";
		this.writer = "저자 미상";
		this.price = 0;
	}
	
	Book_Test (String name, String writer, int price) {
		this.name = name;
		this.writer = writer;
		this.price = price;
	}
	
	public void bookInfo() {
		System.out.println("책 제목: " + name + ", "
				+ "저자: " + writer + ", 가격: " + price + "원");
	}
	
	public void setInfo(String name, String writer, int price) {
		this.name = name;
		this.writer = writer;
		this.price = price;
	}
	
	public void discount(int price) {
		this.price -= price;
		if (price > this.price) {
			System.out.println("할인 금액이 너무 큽니다. 가격은 0으로 설정됩니다.");
			this.price = 0;
		}
	}

	public int getPrice() {
		return price;
	}
	
	
}
