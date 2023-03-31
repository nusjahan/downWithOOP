package company;

public class Employees {
        private String name;
        private int ID;



    public Employees (String name, int ID){
        this.name = name;
        this.ID = ID;

    }

        public void printBadge(){

            System.out.println(name);
            System.out.println(ID);
        }


}
