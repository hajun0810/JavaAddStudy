package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.NonFinal;

@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Data
@Setter
@Getter
@ToString
@EqualsAndHashCode

public class Student {
	
	@NonFinal
	private int studentCode;
	@NonNull
	private String name;
	private int studentYear;
	private int age;
	
}
