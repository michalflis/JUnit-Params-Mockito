package javacollections;

public class OwnLinkedListNode {

	private String data;
	private OwnLinkedListNode nextNode;
    private OwnLinkedListNode previousNode;

	public OwnLinkedListNode(String data, OwnLinkedListNode nextNode, OwnLinkedListNode previousNode) {
		this.data = data;
		this.nextNode = nextNode;
        this.previousNode = previousNode;
	}

	public String getData() { return data; }
	public OwnLinkedListNode getNext() { return nextNode; }
    public OwnLinkedListNode getPrevious() { return previousNode; }
	public void setNext(OwnLinkedListNode nextNode) { this.nextNode = nextNode; }
    public void setPrevious(OwnLinkedListNode previousNode) { this.previousNode = previousNode; }
}





