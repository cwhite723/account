package com.hayan.Account.domain.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record CloseAccountRequestDto(
        @NotBlank(message = "사용자 이름은 필수 입력 항목입니다.")
        String memberName,

        @Pattern(regexp = "^\\d{10}$", message = "계좌번호 형식이 틀렸습니다.")
        @NotBlank(message = "계좌번호는 필수 입력 항목입니다.")
        String accountNumber
) { }
