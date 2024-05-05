package itmo.newLab9;
import java.util.Objects;

public class User {

    private String name;

    public User (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int hashCode(){
        return Objects.hash(name);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        User user = (User) obj;
        return Objects.equals(name, user.name);
    }

}

