package List;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new List();
		list.initList();
		
		Elment e1 = new Elment();
		e1.setValue(1);
		Elment e2 = new Elment();
		e2.setValue(2);
		Elment e3 = new Elment();
		e3.setValue(3);
		Elment e4 = new Elment();
		e4.setValue(4);
		list.ListInster(e1);
		list.ListInster(e2);
		list.ListInster(e3);
		list.ListInster(e4);
		
		Elment e5 = new Elment();
		e5.setValue(8);
		//list.clearList();
		
		list.ListInster(0, e5);
		System.out.println(list.getElement(0).getValue());
		//list.getSize();
		System.out.println(list.getSize());
		//list.ListDelete(2);
		//System.out.println(list.locateElment(8));
		
		list.showList();
	}

}
