package com.fastcampus.practice.service;

import com.fastcampus.practice.logic.Sort;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class StringSortService {

    private final Sort<String> javaSort;

    public List<String> doSort(List<String> input) {
        return javaSort.sort(input);
    }
}
