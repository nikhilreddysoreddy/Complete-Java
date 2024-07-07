class A{
    String name;
    int price;

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + price;
        return result;
    }
    
    public String toString() {
        return "A [name=" + name + ", price=" + price + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        A other = (A) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
}


public class EqualsTostringHash {
    public static void main(String[] args) {
        A obj1=new A();
        obj1.name="onePlus";
        obj1.price=40000;

        A obj2=new A();
        obj2.name="onePlus";
        obj2.price=40000;

        System.out.println(obj1.equals(obj2));
        System.out.println(obj1);
        System.out.println(obj1.hashCode());
    }
}


// class A{
//     String name;
//     int price;

//     public String toString(){
//         return name+" : "+price;
//     }

//     public boolean equals(A that){
//         return this.name.equals(that.name)&&this.price==that.price;
//     }
// }



// public class EqualsTostringHash {
//     public static void main(String[] args) {
//         A obj1=new A();
//         obj1.name="onePlus";
//         obj1.price=40000;

//         A obj2=new A();
//         obj2.name="onePlus";
//         obj2.price=40000;

//         System.out.println(obj1.equals(obj2));
//         System.out.println(obj1);
//     }
// }
