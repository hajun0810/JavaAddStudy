package j15_스태틱.롯데월드;

public class lotte {

	private static lotte instance;
	
	private User[] userArray;
	private int autoCode;
	
	private lotte() {
		userArray = new User[10];
		autoCode = 20230000;
	}
	
	public static lotte getinstance() {
		if(instance == null) {
			instance = new lotte();
		}
		return instance;
	}
	
	public User produceUser (String name, int gender) {
		
		int userCode = ++autoCode;
		
		User user = User.builder()
				.name(name)
				.gender(gender)
				.userCode(userCode)
				.build();
		if(addUser(user)) {
			return user;
		}
		return null;
	}

	private boolean addUser(User user) {
		for(int i = 0; i<userArray.length;i++) {
			if(userArray[i] == null) {
				userArray[i] = user;
				System.out.println("입장완료");
				return true;
			}
		}
		System.out.println("입장 불가");
		return false;
	}

	public void cheakMale() {
		for(int i=0; i<userArray.length;i++) {
			if(userArray[i] == null) {
				continue;
			}
		
		if(userArray[i].getGender() == 0 ) {
			System.out.println(userArray.length+ " / "
								+userArray.length+ " / "+
								userArray.getClass());
		}}
	}
	public void cheakFemale() {
		for(int i=0; i<userArray.length;i++) {
			if(userArray[i] == null) {
				continue;
			}
		
	}
	
	
	}}

