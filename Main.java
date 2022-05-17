import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      Scanner skan = new Scanner(System.in);
      Service1 s = new Service1();
      int x=4;
      String imie;
      String nazwisko;
      int wiek;
      String urodz;
      System.out.println("Lista studentów");
      while(x!=0)
        {
          System.out.println("Wybierz funkcję: \n"+
                        "1. wprowadzanie studenta \n"+
                        "2. wypisanie listy studentów \n"+
                        "3. zamknięcie programu");
          x=skan.nextInt();
          switch(x)
            {
                case 1:
                {
                  Scanner skan1 = new Scanner(System.in);
                  System.out.println("Podaj imie: ");
                  imie=skan1.nextLine();
                  System.out.println("Podaj nazwisko: ");
                  nazwisko=skan1.nextLine();
                  System.out.println("Podaj wiek: ");
                  wiek=skan.nextInt();
                  System.out.println("Podaj datę urodzenia: ");
                  urodz=skan1.nextLine();
                  s.addStudent(new Student(imie, nazwisko, wiek, urodz));
                }break;
              case 2:
                { System.out.println("Wszyscy studenci w bazie: \n");
                   var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
      }
                }break;
              case 3:
                {
                  x=0;
                }break;
            }
            
        }
      
    } catch (IOException e) {

    }
  }
}