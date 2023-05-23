package com.demo.chess.mapper;

import com.demo.chess.domain.Lobby;
import com.demo.chess.domain.User;
import com.demo.chess.dto.LobbyCreateDto;
import com.demo.chess.dto.LobbyResponseDto;
import com.demo.chess.dto.UserResponseDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-23T06:09:54+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 19.0.2 (Oracle Corporation)"
)
@Component
public class LobbyMapperImpl implements LobbyMapper {

    @Override
    public LobbyResponseDto toDto(Lobby lobby) {
        if ( lobby == null ) {
            return null;
        }

        LobbyResponseDto lobbyResponseDto = new LobbyResponseDto();

        lobbyResponseDto.setHost( userToUserResponseDto( lobby.getHost() ) );
        lobbyResponseDto.setHostCasualRating( lobby.getHostCasualRating() );
        lobbyResponseDto.setHostRankedRating( lobby.getHostRankedRating() );
        lobbyResponseDto.setTimeTotal( lobby.getTimeTotal() );
        lobbyResponseDto.setTimeIncrement( lobby.getTimeIncrement() );
        lobbyResponseDto.setAffiliationDistribution( lobby.getAffiliationDistribution() );
        lobbyResponseDto.setCompetitive( lobby.isCompetitive() );
        lobbyResponseDto.setCreationTime( lobby.getCreationTime() );

        return lobbyResponseDto;
    }

    @Override
    public List<LobbyResponseDto> toDtoList(List<Lobby> lobbies) {
        if ( lobbies == null ) {
            return null;
        }

        List<LobbyResponseDto> list = new ArrayList<LobbyResponseDto>( lobbies.size() );
        for ( Lobby lobby : lobbies ) {
            list.add( toDto( lobby ) );
        }

        return list;
    }

    @Override
    public Lobby toEntity(LobbyCreateDto dto) {
        if ( dto == null ) {
            return null;
        }

        Lobby.LobbyBuilder lobby = Lobby.builder();

        lobby.timeTotal( dto.getTimeTotal() );
        lobby.timeIncrement( dto.getTimeIncrement() );
        lobby.affiliationDistribution( dto.getAffiliationDistribution() );
        lobby.competitive( dto.isCompetitive() );

        return lobby.build();
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
