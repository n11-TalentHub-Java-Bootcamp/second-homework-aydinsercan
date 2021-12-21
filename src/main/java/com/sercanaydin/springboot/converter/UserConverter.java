package com.sercanaydin.springboot.converter;


import com.sercanaydin.springboot.dto.UserDto;
import com.sercanaydin.springboot.entity.Kategori;
import com.sercanaydin.springboot.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserConverter {


    UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);
    List<UserDto> convertUserListToUserDtoList(List<User> userList);

    List<UserDto> convertAllUserListToUserDtoList(List<User> userList);

    Kategori convertUserDtoToUser(UserDto userDto);

}
