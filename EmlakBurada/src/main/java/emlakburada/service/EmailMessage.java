package emlakburada.service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmailMessage {

	private String email;
	private String password;
	private String digerseyler;
	private int id;

}
