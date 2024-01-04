package strings;

public class bulider {
    public static void main(String[] args) {
    	StringBuilder sb=new StringBuilder();
    	sb.append(" hello");
    	sb.append(" class");
    	System.out.println(sb.toString());
    	sb.insert(6," builder");
    	System.out.println(sb.toString());
    	sb.replace(1, 6," every");
    	System.out.println(sb.toString());
    	sb.reverse();
    	System.out.println(sb.toString());
    }
}
