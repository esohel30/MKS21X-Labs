public class Kitty {
  private int age;
  private String name;

  public Kitty() {
    name = "mittens";
    age = 2;
  }

  public Kitty( String getName, int getAge) {
      name = getName;
      age = getAge;
  }

  public String toString(){
    return "The amazing " + name; 

    }
  public int getAge() {
      return age;
  }
  public String getName() {
      return name;
  }

  // four mutator methods
  public void changeName(String newName) {
      name = newName;
  }

  public void makeOlder() {
      age += 1;
  }
}
