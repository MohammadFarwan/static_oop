public class Student {

    private int no;
    private String name;
    private String password;
    private boolean loggedIn;
    private static int count = 1;
    private static String collage = "IT";

    public Student(String name, String password) {
        this.no = count;
        this.name = name;
        this.password = password;
        count++;
    }

    public boolean logIn(int enteredNo, String enteredPassword) {
        if (enteredNo == no && enteredPassword.equals(password)) {
            loggedIn = true;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Student{" + "no=" + no + ", name=" + name + ", colloage =" + collage + '}';
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    public static String getCollage() {
        return collage;
    }

    public static void setCollage(String collage) {
        Student.collage = collage;
    }

    
}
