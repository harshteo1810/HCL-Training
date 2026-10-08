package constructor;

public class ConsOver {
    String name;
    int roll_no;
    ConsOver(String name, int roll_no){
        this.name = name;  // this means current object & this.variable → current object's instance variable
        this.roll_no = roll_no;
    }
    public static void main(String[] args) {
        ConsOver obj = new ConsOver("harsh",82);
    }
}
