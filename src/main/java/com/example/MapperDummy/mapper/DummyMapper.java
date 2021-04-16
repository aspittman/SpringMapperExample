package com.example.MapperDummy.mapper;

import com.example.MapperDummy.model.Dummy;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface DummyMapper {

    @Select("select * from billionaires")
    List<Dummy> findAll();
}
