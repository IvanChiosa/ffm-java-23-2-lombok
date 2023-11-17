package org.example;


import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString

public class Student {
    private int id;
    private String name;
    private  String address;
    private  char grade;

}
