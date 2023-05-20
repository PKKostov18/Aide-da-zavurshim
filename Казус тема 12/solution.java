
/*Да се напише програма, която трябва да обработва информация за ученици в JSON вид. 
Създайте клас Student със свойства за:
•Id (int)- номер на ученика;
•Name (string)-име на ученика;
•Grades (decimal) среден успех на ученика;
•Birthday (DateTime) година на раждане на ученика;

Подзадачи:
•Преобразувайте класа Student към JSON;
• Преобразувайте класа JSON към Student:

Изберете подходяща външна библиотека, за работа с JSON, за реализиране на подзадачите.
*/



import com.google.gson.Gson; 
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {

int id;
String name;
double grades;
LocalDate birthday;

public Student (int id, String name, double grades, LocalDate birthday)
{
this.id = id;
this.name = name;
this.grades = grades;
this.birthday = birthday;
}
}


public class Main {
public static void main(String[] args) {
List<Student> list1 = new ArrayList<>();
list1.add(new Student (1, "Ivan", 4.5, LocalDate.of (2008, 12, 1))); 
list1.add(new Student (2, "Luke Skywalker", 5.5, LocalDate.of (2001,
5, 22)));
Gson gson = new Gson();
String json1 = gson.toJson(list1);
System.out.println(json1);
}
}