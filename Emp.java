public class Emp {
    public static void main(String[] args) {
        Employee e1= new Employee("ROBRT", 1994, "64-C-wallsstreet");
        Employee e2= new Employee("sam", 2000, "68-D-wallsstreet");
        Employee e3= new Employee("john", 1999, "26-B-wallsstreet");
        System.out.println("name\t year of joining \t address");
        System.out.println(e1.getName()+"\t"+e1.getyear()+"\t\t\t"+e1.getaddress());
        System.out.println(e2.getName()+"\t"+e2.getyear()+"\t\t\t"+e2.getaddress());
        System.out.println(e3.getName()+"\t"+e3.getyear()+"\t\t\t"+e3.getaddress());



    }
    
}
