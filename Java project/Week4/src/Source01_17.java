
class TV{
	boolean power;
	int channel;
	void power() {
		power = !power;}
	void channelUp() {
		++channel;}
	void channelDown() {
		--channel;
	}
}

class CaptionTv extends TV{
	boolean caption;
	void displayCaption(String text) {
		if(caption)
			System.out.println(text);
	}
}


public class Source01_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		ctv.caption = true;			//ĸ�Ǳ���� �Ҵ�.
		ctv.displayCaption("Hello, World");	//ĸ���� ȭ�鿡 �����ش�.
	}

}
