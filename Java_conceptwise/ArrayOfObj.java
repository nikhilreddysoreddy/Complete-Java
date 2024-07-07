public class ArrayOfObj {
    String name;
    int rno;
    double marks;
    static String collage;
    public static void main(String[] args) {
        ArrayOfObj obj1=new ArrayOfObj();
        ArrayOfObj obj2=new ArrayOfObj();
        ArrayOfObj obj3=new ArrayOfObj();

        obj1.name="nikhil";
        obj1.rno=74;
        obj1.marks=85;
        ArrayOfObj.collage="vits";

        obj2.name="mahendra";
        obj2.rno=37;
        obj2.marks=76;
        // obj2.collage="vec";

        obj3.name="venky";
        obj3.rno=55;
        obj3.marks=68;
        // obj3.collage="vec";

        ArrayOfObj Students[]=new ArrayOfObj[3];
        Students[0]=obj1;
        Students[1]=obj2;
        Students[2]=obj3;

        for(int i=0;i<Students.length;i++){
            System.out.println("name : "+Students[i].name+" Roll no. : "+Students[i].rno+" marks : "+Students[i].marks+" collage : "+ArrayOfObj.collage);
        }

        

    }
}
