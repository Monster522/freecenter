package com.lin.active.mapper;

import com.lin.active.model.Car;
import com.lin.active.model.CarDto;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2018-12-04T16:27:52+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_181 (Oracle Corporation)"
)
@Component
public class CarMapperImpl implements CarMapper {

    @Override
    public Car toCar(CarDto carDto) {
        if ( carDto == null ) {
            return null;
        }

        Car car = new Car();

        car.setCorlor( carDto.getYanse() );
        car.setId( String.valueOf( carDto.getId() ) );
        car.setBrand( carDto.getBrand() );

        return car;
    }
}
