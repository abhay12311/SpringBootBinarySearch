package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class SearchController {

    @Autowired
    private BinarySearchService binarySearchService;

    @GetMapping("/binary-search")
    public ResponseEntity<?> binarySearch(
            @RequestParam("InputArray") int[] nums,
            @RequestParam("target") int target) {

        int result = binarySearchService.binarySearch(nums, target);
        return ResponseEntity.ok(Map.of(
                "InputArray", nums,
                "target", target,
                "Index", result
        ));
    }
}
