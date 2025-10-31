package tugasprakalpro;
public class tugasBelahketupat {
	
	static void cover(){
		int n=9;
		System.out.print("#");
	    for (int i = 1; i < 2 * n-1; i++) System.out.print("=");
	    System.out.println("#");
	}
    public static void main(String[] args) {
        int n = 4; // tinggi setengah belah ketupat

        // Bagian atas bingkai
        cover();

        // Bagian isi (belah ketupat)
        for (int i = 1; i <= n; i++) {
        	//garis tepi kiri
            System.out.print("|");
            
            for(int j = i; j < n; j++) {
            	System.out.print("  ");
            }
            System.out.print("<>");
            for(int k = 1; k < i; k++) {
            	System.out.print("....");
            }
            System.out.print("<>");
            for(int j = i; j < n; j++) {
            	System.out.print("  ");
            }
            System.out.println("|");
        }
        
        for (int i = 1; i <= n; i++) {
        	//garis tepi kiri
            System.out.print("|");
            
            for(int j = 1; j < i ; j++) {
            	System.out.print("  ");
            }
            System.out.print("<>");
            for(int k = 1; k < n-i+1; k++) {
            	System.out.print("....");
            }
            System.out.print("<>");
            for(int j = 1; j < i ; j++) {
            	System.out.print("  ");
            }
            System.out.println("|");
        }

        

        
        cover();
    }
}


