package officehourspractice.day_13SocialMedia;

import java.util.ArrayList;
import java.util.List;
/*
• Overload the constructor to accept username, password, and the user’s name.
- If the name entered has any characters that are not letters from the alphabet, then the name is invalid. In this case print “invalid name” and assign the name value to be ‘no name’
• Overload the constructor to accept username, password, the user’s name, age and number of friends.
- Only store the age and number of friends into the variables if they are valid numbers. The age cannot be a negative number and the number of friends cannot be negative or more than 5000. If they are invalid print “Invalid (age/number of friends) and keep the values as the default of 0.
 */
public class FacebookUser extends SacialMedia {

    public String username;
    private String password;
    private String fullName;
    private int age;
    private  int numberOfFriends;
    private List<Post> allPost;

    static {
        platform="Facebook";
    }

    public FacebookUser(String username,String password){
        this.username=username;
        setPassword(password);
        personalUrl="Facebook.com/"+username;
        allPost=new ArrayList<>();
    }
    public FacebookUser(String username,String password,String fullName, int age,int numberOfFriends){
        this(username,password,fullName);
        setAge(age);
        setNumberOfFriends(numberOfFriends);
    }


    public FacebookUser(String username,String password,String fullName){
        this(username, password);
        setFullName(fullName);

    }







    @Override
    public void DirectMessage(SacialMedia receiver, String message) {
        System.out.println("sending message: "+((FacebookUser)receiver).getFullName());

    }

    @Override
    public void post(String body) {
        allPost.add(new Post(body));
    }

    @Override
    public void natification() {


    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.contains(username)){
            System.out.println("password should not contain username, default password set");
            this.password="default";
        }else {
            this.password = password;
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {

        boolean isvalidName=true;
        for (int i = 0; i <fullName.length() ; i++) {
            if (!Character.isLetter(fullName.charAt(i))||fullName.charAt(i)!=' '){
                System.out.println("Name is invalid");
                isvalidName=false;
            }

        }

        this.fullName=isvalidName? fullName:"No name";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>=13&&age<130){
            this.age = age;
        }else {
            System.out.println("This is invalid age");
        }

    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

     public void setNumberOfFriends(int numberOfFriends) {
        if (numberOfFriends>=0&&numberOfFriends<=5000){
            this.numberOfFriends = numberOfFriends;
        }else {
            System.out.println("invalid number of friends");
        }

    }

    public List<Post> getAllPost() {
        return allPost;
    }

    public void setAllPost(List<Post> allPost) {
        this.allPost = allPost;
    }

    @Override
    public String toString() {
        return "FacebookUser{" +
                "username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", numberOfFriends=" + numberOfFriends +
                ", personalUrl='" + personalUrl + '\'' +
                ", accountLength=" + accountLength +
                '}';
    }
}
