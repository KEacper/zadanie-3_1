public class Student {

  private String Name;
  private String Nazwisko;
  private int Age;
  private String Urodz;

  public Student(String name, String nazwisko, int age, String urodz) {
    Name = name;
    Nazwisko = nazwisko;
    Age = age;
    Urodz = urodz;
    
  }

  public String GetName() {return Name;}
  public String GetNazwisko() {return Nazwisko;}
  public int GetAge() {return Age;}
   public String GetBorn() {return Urodz;}

  public String ToString() {
    return Name + " " + Nazwisko + " " + Integer.toString(Age)+" "+Urodz;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4) 
      return new Student("Parse Error","Parse Error", -1,"Parse Error");
    return new Student(data[0], data[1], Integer.parseInt(data[2]),data[3]);
  }
}