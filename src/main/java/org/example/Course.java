package org.example;

import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString

public class Course {
    private int id;
    private String name;
    private String teacher;
    private List<Student> students;
}
