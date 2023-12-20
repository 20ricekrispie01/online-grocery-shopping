public class Customer
{
    private String name;
    private int age;
    private boolean isMember;

    public Customer(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.isMember = false;
    }

    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public boolean isMember() {
        return isMember;
    }
    
    public void setMember(boolean isMember) {
        this.isMember = isMember;
    }
}
