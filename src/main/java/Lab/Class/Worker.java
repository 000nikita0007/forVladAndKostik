package Lab.Class;

import Lab.Class.Enum.Post;

import java.util.Objects;

public  abstract class Worker implements Object, Tax {
   protected String name;
    protected Post post;
    protected Integer age;

    protected Double salary;

    public Worker(String name, Post post, Integer age, Double salary) {
        this.name = name;
        this.post = post;
        this.age = age;
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", post=" + post +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return Objects.equals(name, worker.name) && post == worker.post && Objects.equals(age, worker.age) && Objects.equals(salary, worker.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, post, age, salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public void print() {
    }


    @Override
    public abstract Double taxCalc();
}
