package com.example.MapperDummy.controller;

import com.example.MapperDummy.mapper.DummyMapper;
import com.example.MapperDummy.model.Dummy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

//Using RestController would make this work also
//since it combines @Controller with @ResponseBody
@Controller
public class MapperDummyController {

    private DummyMapper dummyMapper;

    public MapperDummyController(DummyMapper dummyMapper) {
        this.dummyMapper = dummyMapper;
    }

    @GetMapping("/")
    public @ResponseBody List<Dummy> getAll() {
        return dummyMapper.findAll();
    }

}
