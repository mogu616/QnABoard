package com.qnaboard.user.controller;


import com.qnaboard.user.dto.UserPatchDto;
import com.qnaboard.user.dto.UserPostDto;
import com.qnaboard.user.entity.User;
import com.qnaboard.user.mapper.UserMapper;
import org.mapstruct.control.MappingControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/qnaboard/users")
public class UserController {

    private final UserMapper mapper;

    public UserController(UserMapper userMapper) {
        this.mapper = userMapper;
    }

    @PostMapping
    public ResponseEntity postMember(@RequestBody UserPostDto requestBody) {
        User user = mapper.userPostDtoToUser(requestBody);


        return new ResponseEntity(mapper.userToUserResponseDto(user), HttpStatus.OK);
    }

    @PatchMapping("/{user-id}")
    public ResponseEntity patchMember(@PathVariable("user-id") long memberId,
                                      @RequestBody UserPatchDto requestBody) {


        return new ResponseEntity(mapper.userToUserResponseDto(), HttpStatus.OK);
    }
}
