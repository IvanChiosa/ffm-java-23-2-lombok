package org.example;


import lombok.Builder;
import lombok.Value;



@Builder
public record Teacher(int id, String name, String subject) {
}
