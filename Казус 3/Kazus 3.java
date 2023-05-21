
/* Реализирайте програма на JAVA, в която е  приложен клас Compute, който да има:  

private полета num (doublе тип) 

Методи : 

pow() - метод , който връща числото повдигнато на квадрат. 

sqrt() - метод , който връща корен квдратен от числото 

Дефинирайте параметризиран конструктор, който приема един параметър num и присвоява този параметър на съответното поле в класа. */

class Compute {

    private double num;


    public Compute(double num) {

        this.num = num;
    }

    public double pow(){
        return Math.pow(num, 2);
    }

    public double sqrt(){
        return Math.sqrt(num);
    }

}