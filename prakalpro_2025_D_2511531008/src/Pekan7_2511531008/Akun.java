package Pekan7_2511531008;

public class Akun {
	private String username;
    private String password;
    private String email;
    private int pinAngka;
   
    //setter
    public void setUsername(String username){
    	this.username = username;
    }
    public void setPassword(String password){
    	this.password = password;
    }
    public void setEmail(String email){
    	this.email = email;
    }
    public void setPinAngka(int pinAngka){
    	this.pinAngka = pinAngka;
    }
    
    //getter
    public String getUsername(){
    	return username;
    }
    public String getPasword(){
    	return password;
    }
    public String getemail(){
    	return email;
    }
    public int getPinAngka(){
    	return pinAngka;
    }
    
    // validasi pw dan email helper
    public boolean pwbetul() {
    	return password.length() >= 8;
    }
    public boolean emailbetul() {
    	return email.contains("@") && email.contains(".");
    }
	public static void main(String[] args) {
		
	}

}
