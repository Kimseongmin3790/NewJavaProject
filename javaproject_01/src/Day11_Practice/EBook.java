package Day11_Practice;

public class EBook extends Book{
	private double fileSize;
	
	public EBook () {
		super();
		this.fileSize = 0.0;
	}
	
	public EBook(String title, String author, double fileSize) {
		super(title, author);
		this.fileSize = fileSize;
	}
	
	@Override
	protected void setTitle(String title) {
		super.setTitle(title);
	}
	
	public void setFileSize(double fileSize) {
		this.fileSize = fileSize;
	}
	
	public void printInfo() {
		System.out.println(getTitle() + " - " + getAuthor() + ", 파일 크기: " + fileSize + "MB");
	}
}
