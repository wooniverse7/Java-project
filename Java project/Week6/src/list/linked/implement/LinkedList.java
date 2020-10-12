package list.linked.implement;

import java.util.ListIterator;

public class LinkedList {
	
    private Node head;	//첫번째 노드
    private Node tail;	//마지막 노드
    private int size = 0;	//elem개수
    //객체와 객체를 연결해서 리스트 생성
    private class Node{
        // data 저장 및 다음노드 정보
        private Object data;
        private Node next;
        //생성자
        public Node(Object input) {
        //노드가 갖는 data를 생성자의 매개변수 input으로 전달
            this.data = input;
            this.next = null;	//다음 노드 아직 모름
        }
        // 노드의 내용을 쉽게 출력해서 확인해볼 수 있는 기능
        public String toString(){
            return String.valueOf(this.data);
        }
    }

	
    public void addFirst(Object input){
        // 새로운 노드 생성
        Node newNode = new Node(input);
        // 새로운 노드의 다음 노드로 해드를 지정
        newNode.next = head;
        // 헤드로 새로운 노드를 지정
        head = newNode;
        size++;
        //노드가 하나일 떄
        if(head.next == null){
            tail = head;
        }
    }
	
    public void addLast(Object input){
        Node newNode = new Node(input);
        // 리스트의 노드가 없다면 첫번째 노드를 추가하는 메소드를 사용
        if(size == 0){
            addFirst(input);
        } else {
            tail.next = newNode;//기존 tail의 next를 새로 만듬
            tail = newNode;	//마지막노드를 tail로 갱신
            size++;
        }
    }
	//node정보 출력
    Node node(int index) {
        Node x = head;
        //index의 번호와 동일하게 반복
        for (int i = 0; i < index; i++)
            x = x.next;
        return x;//헤드값 리턴
    }
    //k번째 index에 data삽입
    public void add(int k, Object input) {
    	if(k == 0) {
    		addFirst(input);
    	}else {
    		//앞의 노드를 알기위해 elem를 알아내는 메소드 이용
    		Node temp1 = node(k-1);	//k=2 -> node(1) : 뒤의 노드
    		Node temp2 = temp1.next;	//앞의 노드
    		//새로운 노드 생성
    		Node newNode = new Node(input);
    		temp1.next = newNode;//앞의 노드 temp1의 next를 새로만든 노드를 가르키게
    		newNode.next = temp2;//새로만든 노드를 뒷 노드 temp2를 가르키게
    		size++;
    		if(newNode.next == null) {//새노드가 맨 뒤라면
    			tail = newNode;
    		}
    	}

    }
    //index출력
    public String toString() {
    	if(head == null) {
    		return "[]";
    	}
    	Node temp = head;
    	String str = "[";
    	while(temp.next != null) {
    		str += temp.data + ", ";
    		temp = temp.next; //temp갱신
    	}//마지막노드 전에 temp.next가 null이다.
    	str += temp.data;
    	return str+"]";
    }
    //자바의 기본적인 컬렉션 프레임워크는 리무브를 했을 때 삭제된 노드가 갖고 있었던 값을 리턴해줌
	public Object removeFrist() {
		Node temp = head;
		//head의 nextNode를 head로 갱신
		head = head.next;
		//temp를 삭제하기 전 node data를 리턴
		Object returnData = temp.data;	//대피
		temp = null;	//삭제
		size--;
		return returnData;//대피시켰던 data 리턴
	}
	//특정 위치 인덱스의 data 삭제
	public Object remove(int k) {
		if(k == 0) {
			return removeFrist();
		}
		Node temp = node(k-1);
		Node todoDeleted = temp.next;//삭제할려는 노드
		temp.next = temp.next.next; //두 번째 앞으로 링크
		Object returnData = todoDeleted.data;
		if(todoDeleted == tail) {
			tail = temp;	//삭제할려는 노드의 이전 노드이다.
		}
		todoDeleted = null;
		size--;
		return returnData;
	}
	public Object removeLast() {
		//마지막노드는 size값에서 1을 뺀 노드
		return remove(size-1);
	}
	//size는 숫자 : int
	public int size() {
		//추가 삭제마다 size값 갱신해서 그냥 size만 출력
		return size;	
	}
	//특정 위치의 elem을 가져오기
	public Object get(int k) {
		Node temp = node(k);
		return temp.data;
	}
	//특정 elem의 index값 출력
	public int indexOf(Object data) {
		Node temp = head;
		int index = 0;//찾고자하는 값의 위치정보
		//내가 찾고자하는 노드가 맞는지
		while(temp.data != data) {
			temp = temp.next;
			index++;
			if(temp == null) {//가장끝의 노드에 도달
				return -1;
			}
		}
		return index;
	}
	//반복자
	public ListIterator listIterator() {
		return new ListIterator();//새로운 listIterator객체를 인스터스화 시켜 리턴
		//listIterator를 호출했을때 인스터스화된 Listiterator가 변수 i에 들어가 작동
	}
	class ListIterator{
		private Node next;
		private Node lastReturned;
		private int nextIndex;
	
		ListIterator(){
			next = head;//첫번째 elem지정
		}
		public Object next() {
			lastReturned = next;
			next = next.next;//next가 가르키는 다음 노드
			nextIndex++;//next가 호출될 때마다 몇번 호출됐는지
			return lastReturned.data;
		}
	}
	
}