package com.lin.active.utils;

import com.lin.active.mapper.CarMapper;
import com.lin.active.model.Car;
import com.lin.active.model.CarDto;

/**
 * Created by baozang Cotter on 2018/11/6.
 */
public class CarUtil {
    public static void main(String[] args){
        CarDto carDto = new CarDto();
        carDto.setId((long)1234455);
        carDto.setBrand("dongfeng");
        carDto.setYanse("black");

        Car car = CarMapper.INSTANCE.toCar(carDto);
        System.out.println(car.getId());
        System.out.println(car.getBrand());
        System.out.println(car.getCorlor());

    }
}
