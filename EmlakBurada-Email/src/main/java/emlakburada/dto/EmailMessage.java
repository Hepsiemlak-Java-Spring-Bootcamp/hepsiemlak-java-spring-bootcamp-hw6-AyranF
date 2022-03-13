package emlakburada.dto;

public class EmailMessage {

	private String email;
	private String password;
	private String digerseyler;
	private int id;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDigerseyler() {
		return digerseyler;
	}
	public void setDigerseyler(String digerseyler) {
		this.digerseyler = digerseyler;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "EmailMessage [email=" + email + ", password=" + password + ", digerseyler=" + digerseyler + ", id=" + id
				+ "]";
	}



}
