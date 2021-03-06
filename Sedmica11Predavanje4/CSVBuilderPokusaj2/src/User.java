
public class User implements CSVInterface {
	private String name;
	private int age;
	private boolean isJavaProgrammer;

	public User() {
		this.name = "";
		this.age = -1;
		this.isJavaProgrammer = false;

	}

	private static final long serialVersionUID = -6470090944414208496L;

	public User(String name, int age, boolean isJavaProgrammer) {
		super();
		this.name = name;
		this.age = age;
		this.isJavaProgrammer = isJavaProgrammer;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (age != other.age)
			return false;
		if (isJavaProgrammer != other.isJavaProgrammer)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", isJavaProgrammer="
				+ isJavaProgrammer + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isJavaProgrammer() {
		return isJavaProgrammer;
	}

	public void setJavaProgrammer(boolean isJavaProgrammer) {
		this.isJavaProgrammer = isJavaProgrammer;
	}

	@Override
	public String objectToCsv() {
		String str = name + "," + age + "," + isJavaProgrammer;
		return str;
	}

	@Override
	public void csvToObject(String csv) {
		String[] parts = csv.split(", ");
		this.name = parts[0];
		this.age = Integer.parseInt(parts[1]);
		this.isJavaProgrammer = Boolean.parseBoolean(parts[2]);

	}

}
