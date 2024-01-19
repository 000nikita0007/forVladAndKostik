package Lab.Class;

import Lab.Class.Enum.Category;
import Lab.Class.Enum.Post;

import java.util.Objects;

public class Tokar extends Worker {
    private Category category;

    public Tokar(String name, Post post, Integer age, Double salary, Category category) {
        super(name, post, age, salary);
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Tokar{" +
                "category=" + category +
                ", name='" + name + '\'' +
                ", post=" + post +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tokar tokar = (Tokar) o;
        return category == tokar.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), category);
    }

    @Override
    public Double taxCalc() {
        System.out.println("Зарплата после вычета налогов: ");
        double tax = salary - (salary / 6.5);
        double scale = Math.pow(10, 2);
        double result = Math.ceil(tax * scale) / scale;
        return result;
    }
}
