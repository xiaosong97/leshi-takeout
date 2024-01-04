package com.ekkosong.leshitakeout.controller;

import com.ekkosong.leshitakeout.common.ResultCode;
import com.ekkosong.leshitakeout.common.ResultVo;
import com.ekkosong.leshitakeout.dto.UserDto;
import com.ekkosong.leshitakeout.vo.UserLoginVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@Slf4j
public class EmployeeController {
    @PostMapping("/login")
    public ResultVo login(@Validated @RequestBody UserDto userDto) {
        log.info("userDto is {}", userDto);
        if (userDto.getPassword().equals("123456")) {
            return new ResultVo(new UserLoginVo(1L, "admin", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9"));
        }
        return new ResultVo(ResultCode.FAILED);
    }
}
