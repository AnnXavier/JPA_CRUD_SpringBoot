package com.optum.sprboot.jpatest.controllers;

import com.optum.sprboot.jpatest.models.Block;
import com.optum.sprboot.jpatest.repositories.BlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/blocks")
public class BlockController {
    @Autowired
    private BlockRepository blockRepository;

    @GetMapping
    public List<Block> list(){
        return blockRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Block get(@PathVariable Integer id){
        return blockRepository.findById(id).orElse(new Block());
    }
}
