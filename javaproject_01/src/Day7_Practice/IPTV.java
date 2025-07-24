package Day7_Practice;

public class IPTV extends ColorTV{
	
	String ip;
	
	public IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}
	
	@Override
	void printProperty() {
		// TODO Auto-generated method stub
		System.out.print("나의 IPTV는 " + ip + " 주소의 ");
		super.printProperty();
	}
	
}
	
