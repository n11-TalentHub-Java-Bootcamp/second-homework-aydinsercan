package com.sercanaydin.springboot.converter;

import com.sercanaydin.springboot.dto.UserDto;
import com.sercanaydin.springboot.entity.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-12-21T00:40:04+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class UserConverterImpl implements UserConverter {

    @Override
    public List<UserDto> convertUserListToUserDtoList(List<User> userList) {
        if ( userList == null ) {
            return null;
        }

        List<UserDto> list = new ArrayList<UserDto>( userList.size() );
        for ( User user : userList ) {
            list.add( userToUserDto( user ) );
        }

        return list;
    }

    protected UserDto userToUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        Long id = null;
        String adi = null;
        String soyadi = null;
        String email = null;
        String telefon = null;
        String kullaniciAdi = null;

        id = user.getId();
        adi = user.getAdi();
        soyadi = user.getSoyadi();
        email = user.getEmail();
        telefon = user.getTelefon();
        kullaniciAdi = user.getKullaniciAdi();

        UserDto userDto = new UserDto( id, adi, soyadi, email, telefon, kullaniciAdi );

        return userDto;
    }
}
