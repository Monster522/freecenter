package com.lin.active.mapper;

import com.lin.active.model.Car;
import com.lin.active.model.CarDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * Created by baozang Cotter on 2018/11/6.
 */
@Mapper(componentModel = "spring")
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Mapping(source = "yanse",target = "corlor")
    Car toCar(CarDto carDto);
}
