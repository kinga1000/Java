package pl.itacademy;


class Person2{
    public static void main(String[] args) {
        Person Ania =new Person("Ania", "Kowalska", 01-01-1991);

        Ania.setLastName("Kowalska");
        System.out.println(Ania.getLastName());
    }
}


public class Person {
    private String FirstName;
          private String LastName;
            private int BirthDate;

            public Person ( String FirstName, String LastName, int BirthDate){
                this.FirstName=FirstName;
                this.LastName=LastName;
                this.BirthDate=BirthDate;



    }
    public void setLastName(String Kowalska){
                LastName=this.LastName;
    }


    public String getLastName(){
        return LastName;
    }

}
