package Lab.Class;

public class BossOfFactory implements Object, Tax {
   private String name;
    private Double salary;

    @Override
    public String toString() {
        return "BossOfFactory{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }

    private Integer experience;

    public BossOfFactory(String name, Double salary, Integer experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    @Override
    public void print() {
    }

    @Override
    public Double taxCalc() {
        System.out.println("Зарплата после вычета налогов: ");
        double tax = salary - (salary / 5.8);
        double scale = Math.pow(10, 2);
        double result = Math.ceil(tax * scale) / scale;
        return result;
    }
}
