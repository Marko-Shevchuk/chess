package com.demo.chess.mapper;

import com.demo.chess.domain.User;
import com.demo.chess.dto.UserDto;
import com.demo.chess.dto.UserResponseDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-23T06:09:54+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 19.0.2 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserResponseDto toResponseDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponseDto userResponseDto = new UserResponseDto();

        userResponseDto.setId( user.getId() );
        userResponseDto.setNickname( user.getNickname() );
        userResponseDto.setLastLogin( user.getLastLogin() );
        userResponseDto.setCasualRating( user.getCasualRating() );
        userResponseDto.setRankedRating( user.getRankedRating() );

        return userResponseDto;
    }

    @Override
    public UserDto toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( user.getId() );
        userDto.setNickname( user.getNickname() );
        userDto.setCreatorIp( user.getCreatorIp() );
        userDto.setCreationTime( user.getCreationTime() );
        userDto.setLastLogin( user.getLastLogin() );
        userDto.setCasualRating( user.getCasualRating() );
        userDto.setRankedRating( user.getRankedRating() );
        userDto.setBadScore( user.getBadScore() );

        return userDto;
    }
}
