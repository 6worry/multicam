package test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*@setter
@getter
@tostring*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestDTO {
	private String id;
	private String pass;
	private String name;
	private String addr;
	private String memo;

	public static void main(String[] args) {
		TestDTO dto = new TestDTO();
		dto.setAddr("서울");
	}
}