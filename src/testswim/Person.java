
package testswim;

public class Person {
    
    String name;
    int age;
    public static int personCount;
    
    Person(){
        personCount++;
    }
    
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    
    
}
