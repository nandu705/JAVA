class Cpu {
int price=15000;
class Processor{
int  cores=30;
String manufactures="xxx";
}

static class RAM{
int memory=16;
String manufactures="yyy";
}
}
public class Main{
public static void main(String[] args){
Cpu Obj=new Cpu();

Cpu.Processor Obj1=Obj.new Processor();
System.out.println("processor details");

System.out.println("no of cores= "+Obj1.cores);
System.out.println("manufactures= "+Obj1.manufactures);
Cpu.RAM Obj3=new Cpu.RAM();
System.out.println("RAM details");

System.out.println("no of cores= "+Obj3.memory);
System.out.println("manufactures= "+Obj3.manufactures);


}
}


 



