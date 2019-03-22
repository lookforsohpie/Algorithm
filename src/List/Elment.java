package List;

public class Elment {
	
	/**
	 * 
	 */
	private Elment  pre;
	public Elment getPre() {
		return pre;
	}
	public void setPre(Elment pre) {
		this.pre = pre;
	}
	public Elment getNext() {
		return next;
	}
	public void setNext(Elment next) {
		this.next = next;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	private Elment  next;
	private Integer value;
	
	
	
}
