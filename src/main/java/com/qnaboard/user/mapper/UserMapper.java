package com.qnaboard.user.mapper;

import com.qnaboard.user.dto.UserPatchDto;
import com.qnaboard.user.dto.UserPostDto;
import com.qnaboard.user.dto.UserResponseDto;
import com.qnaboard.user.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    User userPostDtoToUser(UserPostDto userPostDto);
    User userPatchDtoToUser(UserPatchDto userPatchDto);
    UserResponseDto userToUserResponseDto(User user);
}
