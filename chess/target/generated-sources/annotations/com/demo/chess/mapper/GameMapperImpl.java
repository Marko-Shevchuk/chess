package com.demo.chess.mapper;

import com.demo.chess.domain.Game;
import com.demo.chess.domain.User;
import com.demo.chess.dto.GameResponseDto;
import com.demo.chess.dto.UserResponseDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-23T03:00:44+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 19.0.2 (Oracle Corporation)"
)
@Component
public class GameMapperImpl implements GameMapper {

    @Override
    public GameResponseDto toResponseDto(Game game) {
        if ( game == null ) {
            return null;
        }

        GameResponseDto gameResponseDto = new GameResponseDto();

        gameResponseDto.setId( game.getId() );
        gameResponseDto.setPlayerWhite( userToUserResponseDto( game.getPlayerWhite() ) );
        gameResponseDto.setPlayerBlack( userToUserResponseDto( game.getPlayerBlack() ) );
        gameResponseDto.setWhiteRating( game.getWhiteRating() );
        gameResponseDto.setBlackRating( game.getBlackRating() );
        gameResponseDto.setTimeTotal( game.getTimeTotal() );
        gameResponseDto.setTimeIncrement( game.getTimeIncrement() );
        gameResponseDto.setHistory( game.getHistory() );
        gameResponseDto.setResult( game.getResult() );
        gameResponseDto.setTerminationCause( game.getTerminationCause() );
        gameResponseDto.setCreationTime( game.getCreationTime() );

        return gameResponseDto;
    }

    @Override
    public List<GameResponseDto> toDtoList(List<Game> games) {
        if ( games == null ) {
            return null;
        }

        List<GameResponseDto> list = new ArrayList<GameResponseDto>( games.size() );
        for ( Game game : games ) {
            list.add( toResponseDto( game ) );
        }

        return list;
    }

    protected UserResponseDto userToUserResponseDto(User user) {
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
}
