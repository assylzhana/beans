package com.bitlab.beans.services;

import com.bitlab.beans.models.Test;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class TaskService {

    public TaskService(){
        System.out.println("something from service");
    }

      static Long id = 3L;
    @Getter
    private List<Test> tests = new ArrayList<>();
    {
    tests.add(new Test(1L,"A",18));
    tests.add(new Test(2L,"B",19));
    }
    public Test details(Long id){
        return tests.stream()
                .filter(t -> Objects.equals(t.getId(),id))
                .findFirst()
                .orElse(null);
    }
}
