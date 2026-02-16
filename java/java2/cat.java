public class cat extends inheriteance {

    public cat(){
        super(4, 2, false);
    }

    public void  get(){
        System.out.println(legs);
        System.out.println(eyas);
        System.out.println(eet);
    }
    @Override
    public void eet(){
        super.eet();
        System.out.println("вмскас");
    }
    
}
