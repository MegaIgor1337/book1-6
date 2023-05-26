package org.example.task3;

import lombok.AllArgsConstructor;
import lombok.Setter;


@Setter
public class Bean {
    private Integer age;
    private String name;

    public void sayLalal() {
        System.out.println("Lalal");
    }
}
