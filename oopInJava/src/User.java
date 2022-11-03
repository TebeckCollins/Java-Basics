public class User {
	public String fName;
	public String lName;
	
	public void setNames(String fn, String ln) {
		fName = fn;
		lName = ln;
	}
	public String getNames() {
		return fName.toUpperCase() + " " + lName.toUpperCase();
	}
	@Override
	public String toString() {
		return fName + " " + lName;
	}
	

}
