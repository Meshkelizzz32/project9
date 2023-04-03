package project1;
import java.util.*;

public class Ex1 {
	public static void main(String[] args) {
List<String> a1=new ArrayList<String>();
List<String> a2=new LinkedList<String>();
for(int i=0;i<Countries.DATA.length;i++) {
	a1.add(Countries.DATA[i][0]);
	a2.add(Countries.DATA[i][1]);
}
Collections.sort(a1);
Collections.sort(a2);
System.out.println("Countries: "+a1);
System.out.println("Capitals: "+a2);
for(int i=0;i<2;i++) {
	Collections.shuffle(a1);
	Collections.shuffle(a2);
	System.out.println("Countries "+i+" : "+a1);
	System.out.println();
	System.out.println("Capitals: "+i+" : "+a2);
}
List<String> al2 = new ArrayList<String>();
List<String> ll2 = new LinkedList<String>();
for(int i = 0; i < 10; i++) {
	al2.add(Countries.DATA[i][0]);
	ll2.add(Countries.DATA[i][1]);
}
for(int i = 0; i < 5; i++) {
	Collections.shuffle(al2);
	Collections.shuffle(ll2);
	System.out.println("Countries " + i + ": " + al2);
	System.out.println("Capitals " + i + ": " + ll2);
	Collections.sort(al2);
	Collections.sort(ll2);
}

}
}