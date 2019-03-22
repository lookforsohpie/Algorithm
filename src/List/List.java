package List;

public class List {
	
	
	private int size;
	private Elment elment;
	
	public boolean isListEmpty() {
		if(elment.getNext()==null && elment.getValue()==null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void clearList() {
		elment.setPre(null);
		elment.setNext(null);
		elment.setValue(null);
		size=0;
	}
	
	public Elment getElement(int i) {
		if(i<=size) {
			Elment tmp = elment;
			for(int j=0;j<i;j++) {
				tmp = tmp.getNext();
			}
			return tmp;
		}
		return null;
		
	}
	
	public boolean locateElment(int value) {
		Elment tmp = elment; 
		do {
			if(tmp.getValue()==value) {
				return true;
			}
			tmp=tmp.getNext();
		} while (tmp.getNext()!=null);
		if(tmp.getValue()==value) {
			return true;
		}
		return false;
	}
	
	public void initList(int value) {
		this.size=1;
		this.elment = new Elment();
		elment.setPre(null);
		elment.setNext(null);
		elment.setValue(value);
		
	}
	public void initList() {
		this.size=1;
		this.elment = new Elment();
		elment.setPre(null);
		elment.setNext(null);
		elment.setValue(null);
	}
	public void ListInster(int i,Elment e) {
		if(i<=size) {
			Elment pre;
			Elment next;
			Elment tmp = elment;
			for(int j=0;j<i;j++) {
				tmp = tmp.getNext();
			}
			next = tmp.getNext();
			e.setPre(tmp);
			e.setNext(next);
			tmp.setNext(e);
			size=size+1;
		}
	}
	public void ListInster(Elment e) {
		if(isListEmpty()) {
			elment.setValue(e.getValue());
		}else {
			Elment tmp = elment;
			while (tmp.getNext()!=null) {
				tmp=tmp.getNext();
			}
			tmp.setNext(e);
			size=size+1;
			e.setPre(tmp);
			e.setNext(null);
		}
		
	}
	public void ListDelete(int i) {
		if(i<=size) {
			Elment pre;
			Elment next;
			Elment tmp = elment;
			for(int j=0;j<i;j++) {
				tmp = tmp.getNext();
			}
			pre = tmp.getPre();
			next = tmp.getNext();
			pre.setNext(next);
			next.setPre(pre);
			size=size-1;
		}
	}
	
	
	public int getSize() {
		return size;
	}

	public void showList() {
		if(isListEmpty()) {
			System.out.println("List is empty-----------------");
		}else {
			Elment tmp = elment;
			int i = 0;
			while (tmp.getNext()!=null) {
				int value = tmp.getValue();
				System.out.println("List 的    第"+i+"个元素的值为--" + value +"------");
				tmp=tmp.getNext();
				i++;
			} 
			System.out.println("List 的    第"+i+"个元素的值为--" + tmp.getValue() +"------");
		}
		
		
	}

	
}
