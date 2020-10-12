package list.linked.implement;

public class Main {

	public static void main(String[] args) {
		LinkedList num = new LinkedList();
		
		num.addLast(30);	
		num.addLast(40);	
		num.addLast(50);
		num.addLast(60);
		num.addLast(70);
		num.add(1, 15);	//두번째 index에 15삽입
		num.addFirst(20);
		num.addFirst(10);
		
		System.out.println(num.removeFrist());
		//System.out.println(num.node(1));
		System.out.println(num);
		System.out.println(num.remove(3));
		System.out.println(num);
		System.out.println(num.size());
		System.out.println(num.get(5));
		
	}

}
