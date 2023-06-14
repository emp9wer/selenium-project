package src.day26_statics.Restaurant;


    public class Chef{
        public String name;
        public int employeeID;
        public double hourlyRate;
        public boolean fullTime;

        public Chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
            this.name = name;
            this.employeeID = employeeID;
            this.hourlyRate = hourlyRate;
            this.fullTime = fullTime;
        }

        public void  makeOrder(){
            System.out.println(name+" is making an order");
        }
        public void  washDishes(){
            System.out.println(name+" is washing the dishes");
        }

        public Chef(String name) {
            this.name = name;
        }

        public Chef(String name, int employeeID) {
            this.name = name;
            this.employeeID = employeeID;
        }

        public Chef(String name, int employeeID, double hourlyRate) {
            this.name = name;
            this.employeeID = employeeID;
            this.hourlyRate = hourlyRate;
        }

        public String toString() {
            String ft ="";
            if(fullTime){
                ft+="Full Time";
            }else {
                ft+="Part Time";
            }
            return "Chef{" +
                    "name='" + name + '\'' +
                    ", employeeID=" + employeeID +
                    ", hourlyRate=" + hourlyRate +
                    ", Employment type = " + ft +
                    '}';
        }
    }

