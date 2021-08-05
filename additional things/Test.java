public class Test {


	String printTree(TwoThreeNode x) {
		if (x != null) {
		if (x.fourthMax != null) {
			System.out.println("["+x.fistMax() +" "+  x.secondMax() + " "+ x.thirdMax() +" "+ x.frouthMax()+"]");
			System.out.println(printTree(x.firstChild()) + " " + printTree(x.secondChild()) +" "+ printTree(x.thirdChild() + " "+ printTree(x.fourthChild)));
		}
		else if (x.thirdMax != null) {
                        System.out.println("["+x.fistMax() +" "+  x.secondMax() + " "+ x.thirdMax()+"]");
			System.out.println(printTree(x.firstChild()) + " " + printTree(x.secondChild()) +" "+ printTree(x.thirdChild()));
                }
		else if (x.secondMax != null) {
                        System.out.println("["+x.fistMax() +" "+  x.secondMax()+"]");
			System.out.println(printTree(x.firstChild()) + " " + printTree(x.secondChild()));
                }
		else {
			System.out.println("["+x.fistMax()+ "]");
			System.out.println(printTree(x.firstChild()));
		}
		
		
	}
	
	
	
	}














}
