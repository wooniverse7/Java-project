package list.linked.implement;

import java.util.ListIterator;

public class LinkedList {
	
    private Node head;	//ù��° ���
    private Node tail;	//������ ���
    private int size = 0;	//elem����
    //��ü�� ��ü�� �����ؼ� ����Ʈ ����
    private class Node{
        // data ���� �� ������� ����
        private Object data;
        private Node next;
        //������
        public Node(Object input) {
        //��尡 ���� data�� �������� �Ű����� input���� ����
            this.data = input;
            this.next = null;	//���� ��� ���� ��
        }
        // ����� ������ ���� ����ؼ� Ȯ���غ� �� �ִ� ���
        public String toString(){
            return String.valueOf(this.data);
        }
    }

	
    public void addFirst(Object input){
        // ���ο� ��� ����
        Node newNode = new Node(input);
        // ���ο� ����� ���� ���� �ص带 ����
        newNode.next = head;
        // ���� ���ο� ��带 ����
        head = newNode;
        size++;
        //��尡 �ϳ��� ��
        if(head.next == null){
            tail = head;
        }
    }
	
    public void addLast(Object input){
        Node newNode = new Node(input);
        // ����Ʈ�� ��尡 ���ٸ� ù��° ��带 �߰��ϴ� �޼ҵ带 ���
        if(size == 0){
            addFirst(input);
        } else {
            tail.next = newNode;//���� tail�� next�� ���� ����
            tail = newNode;	//��������带 tail�� ����
            size++;
        }
    }
	//node���� ���
    Node node(int index) {
        Node x = head;
        //index�� ��ȣ�� �����ϰ� �ݺ�
        for (int i = 0; i < index; i++)
            x = x.next;
        return x;//��尪 ����
    }
    //k��° index�� data����
    public void add(int k, Object input) {
    	if(k == 0) {
    		addFirst(input);
    	}else {
    		//���� ��带 �˱����� elem�� �˾Ƴ��� �޼ҵ� �̿�
    		Node temp1 = node(k-1);	//k=2 -> node(1) : ���� ���
    		Node temp2 = temp1.next;	//���� ���
    		//���ο� ��� ����
    		Node newNode = new Node(input);
    		temp1.next = newNode;//���� ��� temp1�� next�� ���θ��� ��带 ����Ű��
    		newNode.next = temp2;//���θ��� ��带 �� ��� temp2�� ����Ű��
    		size++;
    		if(newNode.next == null) {//����尡 �� �ڶ��
    			tail = newNode;
    		}
    	}

    }
    //index���
    public String toString() {
    	if(head == null) {
    		return "[]";
    	}
    	Node temp = head;
    	String str = "[";
    	while(temp.next != null) {
    		str += temp.data + ", ";
    		temp = temp.next; //temp����
    	}//��������� ���� temp.next�� null�̴�.
    	str += temp.data;
    	return str+"]";
    }
    //�ڹ��� �⺻���� �÷��� �����ӿ�ũ�� �����긦 ���� �� ������ ��尡 ���� �־��� ���� ��������
	public Object removeFrist() {
		Node temp = head;
		//head�� nextNode�� head�� ����
		head = head.next;
		//temp�� �����ϱ� �� node data�� ����
		Object returnData = temp.data;	//����
		temp = null;	//����
		size--;
		return returnData;//���ǽ��״� data ����
	}
	//Ư�� ��ġ �ε����� data ����
	public Object remove(int k) {
		if(k == 0) {
			return removeFrist();
		}
		Node temp = node(k-1);
		Node todoDeleted = temp.next;//�����ҷ��� ���
		temp.next = temp.next.next; //�� ��° ������ ��ũ
		Object returnData = todoDeleted.data;
		if(todoDeleted == tail) {
			tail = temp;	//�����ҷ��� ����� ���� ����̴�.
		}
		todoDeleted = null;
		size--;
		return returnData;
	}
	public Object removeLast() {
		//���������� size������ 1�� �� ���
		return remove(size-1);
	}
	//size�� ���� : int
	public int size() {
		//�߰� �������� size�� �����ؼ� �׳� size�� ���
		return size;	
	}
	//Ư�� ��ġ�� elem�� ��������
	public Object get(int k) {
		Node temp = node(k);
		return temp.data;
	}
	//Ư�� elem�� index�� ���
	public int indexOf(Object data) {
		Node temp = head;
		int index = 0;//ã�����ϴ� ���� ��ġ����
		//���� ã�����ϴ� ��尡 �´���
		while(temp.data != data) {
			temp = temp.next;
			index++;
			if(temp == null) {//���峡�� ��忡 ����
				return -1;
			}
		}
		return index;
	}
	//�ݺ���
	public ListIterator listIterator() {
		return new ListIterator();//���ο� listIterator��ü�� �ν��ͽ�ȭ ���� ����
		//listIterator�� ȣ�������� �ν��ͽ�ȭ�� Listiterator�� ���� i�� �� �۵�
	}
	class ListIterator{
		private Node next;
		private Node lastReturned;
		private int nextIndex;
	
		ListIterator(){
			next = head;//ù��° elem����
		}
		public Object next() {
			lastReturned = next;
			next = next.next;//next�� ����Ű�� ���� ���
			nextIndex++;//next�� ȣ��� ������ ��� ȣ��ƴ���
			return lastReturned.data;
		}
	}
	
}