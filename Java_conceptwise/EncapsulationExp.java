class Student{
    private String name;
    private int rno;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRno() {
        return rno;
    }
    public void setRno(int rno) {
        this.rno = rno;
    }

    

}





public class EncapsulationExp {
    public static void main(String[] args) {
        
        Student obj=new Student();
        Student obj1=new Student();

        obj.setName("nikhil");
        obj.setRno(74);

        obj1.setName("reddy");
        obj1.setRno(73);

        System.out.println(obj.getName()+" : "+obj.getRno());
        System.out.println(obj1.getName()+" : "+obj1.getRno());
    }
}
