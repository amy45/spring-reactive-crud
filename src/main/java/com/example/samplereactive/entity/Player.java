package com.example.samplereactive.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public
class Player implements Persistable<Integer> {
    @Id
    Integer id;
    String name;
    Integer age;


    @Override
    public boolean isNew() {
        return true;
    }
}
