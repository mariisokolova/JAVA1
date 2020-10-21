package hw_5;

public class main {
    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];

        empArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        empArray[1] = new Employee("Sergeev Serg", "Driver", "ivivan@mailbox.com", "892312312", 30000, 50);
        empArray[2] = new Employee("Lavrov Lavr", "Teacher", "ivivan@mailbox.com", "892312312", 30000, 40);
        empArray[3] = new Employee("Ipatov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 54);
        empArray[4] = new Employee("Makarov Makar", "Driver", "ivivan@mailbox.com", "892312312", 30000, 18);

        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].getAge() >= 40){
                empArray[i].info();
                System.out.println("--------------");
            }
        }

    }
}
