package HomeWorkApp6;

import HomeWorkApp5.Employee;

public class lesson6 {

        private String fio;
        private String position;
        private String email;
        private String phone;
        private double salary;
        private int age;

       lesson6 (String fio, String position, String email, String phone, double salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

        static void lesss (Employee[] employees) {
        for (Employee employee : employees) {

            if (employee.getAge() > 40) {
                System.out.println(employee.toString());
            }
        }
    }

        public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
    }

