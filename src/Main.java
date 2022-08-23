class Emp
{
   static String compname;
    int eid;
    int salary;
    static String ceo;
    public void show(){
        System.out.println(compname+"  "+"  "+eid+"  "+"  "+salary+"  "+"  "+ceo);
    }
}
class statickeyword {
    public static void main(String[] args) {
        Emp thariq = new Emp();
        thariq.compname= "mathdisk";
        thariq.eid = 22;
        thariq.salary=4000;
        thariq.ceo="abdulkadhar";
        Emp roseena = new Emp();
        roseena.compname="mathdisk";
        roseena.eid=18;
        roseena.salary=5000;
        roseena.ceo="abdulkadhar";
        roseena.compname="provility";

        roseena.ceo="abduljabbar";
thariq.show();
roseena.show();

    }
}